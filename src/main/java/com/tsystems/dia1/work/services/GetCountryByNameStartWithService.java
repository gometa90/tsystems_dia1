package com.tsystems.dia1.work.services;

import java.util.List;

import com.tsystems.dia1.work.domain.CountryEntity;
import com.tsystems.dia1.work.repository.CountryRepository;

public class GetCountryByNameStartWithService {

    private final CountryRepository countryRepository = null;// Construir
							     // después

    public List<CountryEntity> getCountryByNameStartWith(String countryPrefix) throws RepositoryConnectionException {

	List<CountryEntity> countriesToreturn = countryRepository.findByNameStartWith(countryPrefix);

	return countriesToreturn;
    }
}
