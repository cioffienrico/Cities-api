package com.github.cioffienrico.citiesapi.countries;

import com.github.cioffienrico.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {

}
