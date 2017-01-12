package com.tsystems.dia1.work;

import com.tsystems.dia1.work.domain.CountryEntity;
import com.tsystems.dia1.work.domain.HibernateCityEntity;
import com.tsystems.dia1.work.services.GetCountryByCodeService;
import com.tsystems.dia1.work.services.RepositoryConnectionException;

public class PruebaPerezoso {

    public static void main(String[] args) throws RepositoryConnectionException {
	CountryEntity country = new GetCountryByCodeService().getCountryByCode("USA");
	System.out.println("Las ciudades de USA son:");
	for (HibernateCityEntity city : country.getCities()) {
	    System.out.println(city);
	}

    }
}
