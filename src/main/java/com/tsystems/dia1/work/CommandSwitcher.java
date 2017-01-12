package com.tsystems.dia1.work;

import java.util.List;

import com.tsystems.dia1.work.dominio.CityEntity;
import com.tsystems.dia1.work.dominio.CountryEntity;
import com.tsystems.dia1.work.dominio.CountryLanguageEntity;
import com.tsystems.dia1.work.services.GetCityByIdService;
import com.tsystems.dia1.work.services.GetCityNameStartWithService;
import com.tsystems.dia1.work.services.GetCountryByCodeService;
import com.tsystems.dia1.work.services.GetCountryByNameStartWithService;
import com.tsystems.dia1.work.services.GetLanguageByCountryCodeService;
import com.tsystems.dia1.work.services.RepositoryConnectionException;
import com.tsystems.dia1.work.userinterface.ControllerUserInterface;

public class CommandSwitcher {

    private final static GetCityByIdService getCityByIdService = new GetCityByIdService();
    private final static GetCityNameStartWithService getCityNameStartWithService = new GetCityNameStartWithService();
    private final static GetCountryByCodeService getCountryByCodeService = new GetCountryByCodeService();
    private final static GetCountryByNameStartWithService getCountryBynamewStartWithService = new GetCountryByNameStartWithService();
    private final static GetLanguageByCountryCodeService getLanguageByCountryCodeService = new GetLanguageByCountryCodeService();
    private final static ControllerUserInterface controllerUserInterface = new ControllerUserInterface();

    public void executeCommand(String[] commands) throws RepositoryConnectionException {

	if (commands[0].equals("city") && (commands[1].equals("id"))) {
	    CityEntity city = getCityByIdService.getCityById(commands[2]);
	    controllerUserInterface.printCity(city);
	} else if (commands[0].equals("city") && (commands[1].equals("name"))) {
	    List<CityEntity> cityList = getCityNameStartWithService.getCityNameStartWith(commands[2]);
	    for (CityEntity city : cityList) {
		controllerUserInterface.printCity(city);
	    }
	} else if (commands[0].equals("country") && (commands[1].equals("code"))) {
	    CountryEntity country = getCountryByCodeService.getCountryByCode(commands[2]);
	    controllerUserInterface.printCountry(country);
	} else if (commands[0].equals("country") && (commands[1].equals("name"))) {
	    List<CountryEntity> countryList = getCountryBynamewStartWithService.getCountryByNameStartWith(commands[2]);
	    for (CountryEntity country : countryList) {
		controllerUserInterface.printCountry(country);
	    }
	} else if (commands[0].equals("language") && (commands[1].equals("code"))) {
	    CountryLanguageEntity language = getLanguageByCountryCodeService.getLanguageByCountryCode(commands[2]);
	    controllerUserInterface.printCountryLanguage(language);
	}
    }

}
