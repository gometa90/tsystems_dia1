package com.tsystems.dia1.work.repository.imp;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.tsystems.dia1.work.converter.CityMapper;
import com.tsystems.dia1.work.domain.CityEntity;
import com.tsystems.dia1.work.repository.CityRepository;
import com.tsystems.dia1.work.services.RepositoryConnectionException;

import au.com.bytecode.opencsv.CSVReader;

public class CSVCityRepository implements CityRepository {

    private static final char COLUMN_DELIMITER_CHAR = ';';
    private static final String CITY_FILE_NAME = "city.csv";
    private final CityMapper mapper = new CityMapper();

    @Override
    public List<CityEntity> findByNameStartWith(String startWith) throws RepositoryConnectionException {

	List<CityEntity> cityToReturn = new ArrayList<>();

	CSVReader reader = null;
	try {
	    reader = new CSVReader(new FileReader(CITY_FILE_NAME), COLUMN_DELIMITER_CHAR);
	    String[] nextLine;
	    while ((nextLine = reader.readNext()) != null) {
		if (nextLine[1].startsWith(startWith)) {
		    cityToReturn.add(mapper.toCity(nextLine));
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
	return cityToReturn;
    }

    @Override
    public Optional<CityEntity> findById(String id) throws RepositoryConnectionException {

	CSVReader reader = null;
	try {
	    reader = new CSVReader(new FileReader(CITY_FILE_NAME), COLUMN_DELIMITER_CHAR);
	    String[] nextLine;

	    while ((nextLine = reader.readNext()) != null) {
		if (nextLine[0].equals(id)) {
		    return Optional.of(mapper.toCity(nextLine));
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
