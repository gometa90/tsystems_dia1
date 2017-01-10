package com.tsystems.dia1.work.converter;

import com.tsystems.dia1.work.domain.CityEntity;

public class CityMapper {

    private static final int ID_COLUMN_NUMBER = 0;
    private static final int NAME_COLUMN_NUMBER = 1;
    private static final int COUNTRY_CODE_COLUMN_NUMBER = 2;
    private static final int DISTRICT_COLUMN_NUMBER = 3;
    private static final int POPULATION_COLUMN_NUMBER = 4;

    public CityEntity toCity(String[] nextLine) {

	return CityEntity.builder()//
		.id(Long.parseLong(nextLine[ID_COLUMN_NUMBER]))//
		.name(nextLine[NAME_COLUMN_NUMBER])//
		.countryCode(nextLine[COUNTRY_CODE_COLUMN_NUMBER])//
		.district(nextLine[DISTRICT_COLUMN_NUMBER])//
		.population(Long.parseLong(nextLine[POPULATION_COLUMN_NUMBER])).build();
    }

}
