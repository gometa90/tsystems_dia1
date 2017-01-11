package com.tsystems.dia1.work.services;

import java.util.Optional;

import com.tsystems.dia1.work.domain.CityEntity;
import com.tsystems.dia1.work.repository.CityRepository;
import com.tsystems.dia1.work.repository.imp.CSVCityRepository;

public class GetCityByIdService {

    private final CityRepository cityRepository = new CSVCityRepository();

    public CityEntity getCityById(final String cityId) throws RepositoryConnectionException {

	Optional<CityEntity> optionalCity = cityRepository.findById(cityId);

	if (optionalCity.isPresent()) {
	    return optionalCity.get();
	} else {
	    throw new ElementNotFoundException("No existe ciduad con el id" + " " + cityId);
	}
    }

}