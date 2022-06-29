package com.country.population.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.country.population.model.CountryDetails;
import com.country.population.service.CountryPopulationService;

@RestController
@RequestMapping("/country/api")
public class CountryPopulationController {
	
	@Autowired
	private CountryPopulationService service;
	
	@GetMapping("/fetch/population/{name}")
	public CountryDetails getCountryDetails(@PathVariable("name")String countryName) {
		
		return service.fetchCountryDetails(countryName);
		
	}

}
