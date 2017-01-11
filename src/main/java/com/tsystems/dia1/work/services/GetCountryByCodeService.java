package com.tsystems.dia1.work.services;

import java.util.Optional;

import com.tsystems.dia1.work.domain.CountryEntity;
import com.tsystems.dia1.work.repository.CountryRepository;

public class GetCountryByCodeService {

    private final CountryRepository countryRepository = null;// Construir
    // después

    public Optional<CountryEntity> getCountryByNameStartWith(String countryCode) throws RepositoryConnectionException {

	Optional<CountryEntity> countryToReturn = countryRepository.findByCode(countryCode);

	return countryToReturn;
    }
}
