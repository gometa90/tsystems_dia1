package com.tsystems.dia1.work.repository.imp;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.tsystems.dia1.work.converter.CountryMapper;
import com.tsystems.dia1.work.dominio.CountryEntity;
import com.tsystems.dia1.work.repository.CountryRepository;
import com.tsystems.dia1.work.services.RepositoryConnectionException;

import au.com.bytecode.opencsv.CSVReader;

public class CSVCountryRepository implements CountryRepository {

    private static final char COLUMN_DELIMITER_CHAR = ';';
    private static final String CITY_FILE_NAME = "country.csv";
    private final CountryMapper mapper = new CountryMapper();// cambiar por
    // countrymapper CREAR

    @Override
    public List<CountryEntity> findByNameStartWith(String startWith) throws RepositoryConnectionException {

	List<CountryEntity> countriesToReturn = new ArrayList<>();

	CSVReader reader = null;
	try {
	    reader = new CSVReader(new FileReader(CITY_FILE_NAME), COLUMN_DELIMITER_CHAR);
	    String[] nextLine;
	    while ((nextLine = reader.readNext()) != null) {
		if (nextLine[1].startsWith(startWith)) {
		    countriesToReturn.add(mapper.toCountry(nextLine));
		}
	    }
	} catch (FileNotFoundException fileNotFoundException) {
	    throw new RepositoryConnectionException("El archivo no se ha encontrado", fileNotFoundException);
	} catch (IOException ioException) {
	    throw new RepositoryConnectionException("Error en entrada salida", ioException);
	} finally {
	    try {
		if (reader != null) {
		    reader.close();
		}
	    } catch (IOException ioException) {
		throw new RepositoryConnectionException("Error en el cierre del reader", ioException);
	    }
	}
	return countriesToReturn;
    }

    @Override
    public Optional<CountryEntity> findByCode(String code) throws RepositoryConnectionException {
	// TODO Auto-generated method stub
	return null;
    }

}
