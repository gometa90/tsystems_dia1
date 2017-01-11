package com.tsystems.dia1.work.services;

import java.util.Optional;

import com.tsystems.dia1.work.domain.CountryLanguageEntity;
import com.tsystems.dia1.work.repository.imp.CSVLanguageCountryRepository;

public class GetLanguageByCountryCodeService {

    private final CSVLanguageCountryRepository languageRepository = new CSVLanguageCountryRepository();

    public CountryLanguageEntity getLanguageByCountryCode(String countryCode) throws RepositoryConnectionException {

	Optional<CountryLanguageEntity> optionalCountryLanguages = languageRepository.findByCountryCode(countryCode);

	if (optionalCountryLanguages.isPresent()) {
	    return optionalCountryLanguages.get();
	} else {
	    throw new ElementNotFoundException("No existe lengua en un país con ese countrycode" + " " + countryCode);
	}
    }
}
