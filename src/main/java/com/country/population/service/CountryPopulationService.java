package com.country.population.service;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.country.population.model.CountryDetails;
import com.country.population.util.CountryPopulationDataUtil;

@Service
public class CountryPopulationService {
	
	
	public CountryDetails fetchCountryDetails(String name) {
		
		Map<String,CountryDetails> countryMap = CountryPopulationDataUtil.fetchCountryDetails();
		
		return countryMap.get(name);
	}

}
