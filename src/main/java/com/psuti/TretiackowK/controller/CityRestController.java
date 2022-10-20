package com.psuti.TretiackowK.controller;

import com.psuti.TretiackowK.dao.CityRepository;
import com.psuti.TretiackowK.dao.CountryRepository;
import com.psuti.TretiackowK.entities.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityExistsException;
import java.util.List;
import java.util.UUID;

@RequestMapping("/cities")
@RestController
public class CityRestController {
    private final CityRepository cityRepository;
    @Autowired
    public CityRestController(CityRepository cityRepository){
        this.cityRepository = cityRepository;
    }
    @GetMapping
    public List<City> getAll(){
        return cityRepository.findAll();
    }
    @GetMapping("/{id}")
    public City getById(@PathVariable("id") UUID id){
        return cityRepository.findById(id).get();
    }
    @PutMapping
    public City update(@RequestBody City city){
        if(cityRepository.existsById(city.getId())){
            return cityRepository.save(city);
        }
        throw new EntityExistsException("City with id:'"+ city.getId() +"' doesn't exists");
    }
    @PostMapping
    public City create(@RequestBody City city){
        UUID id = city.getId();
        if(id !=null){
            if(cityRepository.existsById(city.getId())){
                throw new EntityExistsException("City already exists");
            }
        }
        return cityRepository.save(city);
    }
    @DeleteMapping("/{id}")
    public void remove(@PathVariable("id") UUID id){
        cityRepository.deleteById(id);
    }
}