package com.tsystems.dia1.work.repository.imp;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.tsystems.dia1.work.converter.CountryLanguageMapper;
import com.tsystems.dia1.work.domain.CountryLanguageEntity;
import com.tsystems.dia1.work.repository.CountryLanguageRepository;

import au.com.bytecode.opencsv.CSVReader;

public class CSVLanguageCountryRepository implements CountryLanguageRepository {

    private static final char COLUMN_DELIMITER_CHAR = ';';
    private static final String CITY_FILE_NAME = "countrylanguage.csv";
    private final CountryLanguageMapper mapper = new CountryLanguageMapper();

    @Override
    public Optional<CountryLanguageEntity> findByCountryCode(String countryCode) throws IOException {

	List<CountryLanguageEntity> languageCountryToReturn = new ArrayList<>();

	final CSVReader reader = new CSVReader(new FileReader(CITY_FILE_NAME), COLUMN_DELIMITER_CHAR);

	String[] nextLine;
	while ((nextLine = reader.readNext()) != null) {
	    if (nextLine[0].equals(countryCode)) {
		return Optional.of(mapper.toCountryLanguage(nextLine));
	    }
	}
	return null;
    }

}
