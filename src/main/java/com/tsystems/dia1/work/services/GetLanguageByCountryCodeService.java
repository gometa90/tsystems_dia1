package com.tsystems.dia1.work.services;

import java.util.Optional;

import com.tsystems.dia1.work.dominio.CountryLanguageEntity;
import com.tsystems.dia1.work.repository.CountryLanguageRepository;
import com.tsystems.dia1.work.repository.imp.MysqlCountryLanguageRepository;

public class GetLanguageByCountryCodeService {

    private final CountryLanguageRepository languageRepository = new MysqlCountryLanguageRepository();

    public CountryLanguageEntity getLanguageByCountryCode(String countryCode) throws RepositoryConnectionException {

	Optional<CountryLanguageEntity> optionalCountryLanguages = languageRepository.findByCountryCode(countryCode);

	if (optionalCountryLanguages.isPresent()) {
	    return optionalCountryLanguages.get();
	} else {
	    throw new ElementNotFoundException("No existe lengua en un país con ese countrycode" + " " + countryCode);
	}
    }
}
