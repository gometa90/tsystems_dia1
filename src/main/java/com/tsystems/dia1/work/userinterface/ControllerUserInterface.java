package com.tsystems.dia1.work.userinterface;

import com.tsystems.dia1.work.domain.CityEntity;
import com.tsystems.dia1.work.domain.CountryEntity;
import com.tsystems.dia1.work.domain.CountryLanguageEntity;

public class ControllerUserInterface {

    public void printCity(CityEntity city) {

	System.out.println(city);
    }

    public void printCountry(CountryEntity country) {

	System.out.println(country);
    }

    public void printCountryLanguage(CountryLanguageEntity countryLanguage) {

	System.out.println(countryLanguage);
    }
}
