package com.tsystems.dia1.work.services;

import java.util.List;

import com.tsystems.dia1.work.domain.CountryEntity;
import com.tsystems.dia1.work.repository.CountryRepository;
import com.tsystems.dia1.work.repository.imp.HibernateCountryRepository;

public class GetCountryByNameStartWithService {

    private final CountryRepository countryRepository = new HibernateCountryRepository();

    public List<CountryEntity> getCountryByNameStartWith(String countryPrefix) throws RepositoryConnectionException {

	List<CountryEntity> countriesToreturn = countryRepository.findByNameStartWith(countryPrefix);

	return countriesToreturn;
    }
}
