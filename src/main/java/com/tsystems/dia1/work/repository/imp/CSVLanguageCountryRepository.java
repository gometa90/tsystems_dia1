package com.tsystems.dia1.work.repository.imp;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Optional;

import com.tsystems.dia1.work.converter.CountryLanguageMapper;
import com.tsystems.dia1.work.domain.CountryLanguageEntity;
import com.tsystems.dia1.work.repository.CountryLanguageRepository;
import com.tsystems.dia1.work.services.RepositoryConnectionException;

import au.com.bytecode.opencsv.CSVReader;

public class CSVLanguageCountryRepository implements CountryLanguageRepository {

    private static final char COLUMN_DELIMITER_CHAR = ';';
    private static final String CITY_FILE_NAME = "countrylanguage.csv";
    private final CountryLanguageMapper mapper = new CountryLanguageMapper();

    @Override
    public Optional<CountryLanguageEntity> findByCountryCode(String countryCode) throws RepositoryConnectionException {

	CSVReader reader = null;
	try {
	    reader = new CSVReader(new FileReader(CITY_FILE_NAME), COLUMN_DELIMITER_CHAR);

	    String[] nextLine;
	    while ((nextLine = reader.readNext()) != null) {
		if (nextLine[0].equals(countryCode)) {
		    return Optional.of(mapper.toCountryLanguage(nextLine));
		}
	    }
	} catch (FileNotFoundException fileNotFoundException) {
	    throw new RepositoryConnectionException("El archivo no se ha encontrado", fileNotFoundException);
	} catch (IOException ioException) {
	    throw new RepositoryConnectionException("Error en entrada salida", ioException);
	} finally {
	    try {
		reader.close();
	    } catch (IOException ioException) {
		throw new RepositoryConnectionException("Error en el cierre del reader", ioException);
	    }
	}
	return Optional.empty();
    }

}
