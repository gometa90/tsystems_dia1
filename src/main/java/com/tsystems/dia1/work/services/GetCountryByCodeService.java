package com.tsystems.dia1.work.services;

import java.util.Optional;

import com.tsystems.dia1.work.dominio.CountryEntity;
import com.tsystems.dia1.work.repository.CountryRepository;
import com.tsystems.dia1.work.repository.imp.HibernateCountryRepository;

public class GetCountryByCodeService {

    private final CountryRepository countryRepository = new HibernateCountryRepository();

    public CountryEntity getCountryByCode(String countryCode) throws RepositoryConnectionException {

	Optional<CountryEntity> countryToReturn = countryRepository.findByCode(countryCode);

	return countryToReturn.get();
    }
}
