package com.tsystems.dia1.work.services;

import java.util.List;

import com.tsystems.dia1.work.dominio.CityEntity;
import com.tsystems.dia1.work.repository.CityRepository;
import com.tsystems.dia1.work.repository.imp.CSVCityRepository;

public class GetCityNameStartWithService {

    private final CityRepository cityRepository = new CSVCityRepository();

    public List<CityEntity> getCityNameStartWith(final String namePrefix) throws RepositoryConnectionException {

	List<CityEntity> citiesToReturn = cityRepository.findByNameStartWith(namePrefix);
	return citiesToReturn;

    }
}
