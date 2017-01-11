package com.tsystems.dia1.work.services;

import com.tsystems.dia1.work.domain.CountryEntity;
import com.tsystems.dia1.work.repository.CountryRepository;

public class GetCountryByCodeService {

    private final CountryRepository countryRepository = null;// Construir
    // después

    public CountryEntity getCountryByCode(String countryCode) throws RepositoryConnectionException {

	CountryEntity countryToReturn = countryRepository.findByCode(countryCode);

	return countryToReturn;
    }
}
