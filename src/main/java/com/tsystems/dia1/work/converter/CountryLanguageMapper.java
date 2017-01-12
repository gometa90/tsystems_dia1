package com.tsystems.dia1.work.converter;

import com.tsystems.dia1.work.domain.CountryLanguageEntity;

public class CountryLanguageMapper {

    private static final int COUNTRY_CODE_COLUMN_NUMBER = 0;
    private static final int LANGUAGE_COLUMN_NUMBER = 1;
    private static final int ISOFFICIAL_COLUMN_NUMBER = 2;
    private static final int PRECENTAGE_COLUMN_NUMBER = 3;

    public CountryLanguageEntity toCountryLanguage(String[] nextLine) {

	boolean isOfficial = true;
	if (nextLine[ISOFFICIAL_COLUMN_NUMBER].equals("F")) {
	    isOfficial = false;
	}

	return CountryLanguageEntity.builder()//
		.countryCode(nextLine[COUNTRY_CODE_COLUMN_NUMBER])//
		.language(nextLine[LANGUAGE_COLUMN_NUMBER])//
		.isOfficial(isOfficial)//
		.percentage(Long.parseLong(nextLine[PRECENTAGE_COLUMN_NUMBER]))//
		.build();
    }
}
