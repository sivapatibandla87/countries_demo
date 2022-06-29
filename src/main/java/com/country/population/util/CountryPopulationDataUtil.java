package com.country.population.util;

import java.util.HashMap;
import java.util.Map;

import com.country.population.model.CountryDetails;

public class CountryPopulationDataUtil {
	
	public static Map<String,CountryDetails> fetchCountryDetails(){
		
		Map<String,CountryDetails> countryPopulationMap = new HashMap<>();
		
		countryPopulationMap.put("USA", new CountryDetails("USA", new Long(231423568), new Long(224567890)));
		countryPopulationMap.put("UK", new CountryDetails("UK", new Long(31423569), new Long(24567897)));
		countryPopulationMap.put("INDIA", new CountryDetails("INDIA", new Long(631423569), new Long(654567893)));
		
		return countryPopulationMap;
	}

}
