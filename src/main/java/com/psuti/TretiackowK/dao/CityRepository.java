package com.psuti.TretiackowK.dao;

import com.psuti.TretiackowK.entities.City;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CityRepository extends JpaRepository<City, UUID> {

}
