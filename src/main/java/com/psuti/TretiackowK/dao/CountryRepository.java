package com.psuti.TretiackowK.dao;

import com.psuti.TretiackowK.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CountryRepository extends JpaRepository<Country, UUID> {

}