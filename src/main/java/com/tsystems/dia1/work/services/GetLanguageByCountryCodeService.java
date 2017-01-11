package com.tsystems.dia1.work.services;

import java.util.Optional;

import com.tsystems.dia1.work.domain.CountryLanguageEntity;
import com.tsystems.dia1.work.repository.imp.CSVLanguageCountryRepository;

public class GetLanguageByCountryCodeService {

    private final CSVLanguageCountryRepository languageRepository = new CSVLanguageCountryRepository();

    public Optional<CountryLanguageEntity> getLanguageByCountryCode(String countryCode)
	    throws RepositoryConnectionException {

	Optional<CountryLanguageEntity> countryLanguagesToReturn = languageRepository.findByCountryCode(countryCode);

	return countryLanguagesToReturn;
    }
}
