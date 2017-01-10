package com.tsystems.dia1.work.repository;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.FileSystemNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import au.com.bytecode.opencsv.CSVReader;

//acceso a datos
public class CSVDataRepository implements DataRepository {

    private CSVReader reader;

    // acceso a datos e impresión de datos por pantalla//
    // Refactoring, en data repository solo quiero obtener los datos
    /*
     * (non-Javadoc)
     * 
     * @see Repository.DataRepository#findByNameStartWith(java.io.File,
     * java.lang.String)
     */
    @Override
    public List<String[]> findByNameStartWith(final File filename, final String startWith)
	    throws IOException, FileSystemNotFoundException {

	List<String[]> linesToReturn = new ArrayList<>();

	reader = new CSVReader(new FileReader(filename), ';');
	String[] nextLine;

	while ((nextLine = reader.readNext()) != null) {
	    // nextLine[] is an array of values from the line
	    if (nextLine[1].startsWith(startWith)) {
		linesToReturn.add(nextLine);
	    }
	}

	return linesToReturn;
    }

    /*
     * (non-Javadoc)
     * 
     * @see Repository.DataRepository#findById(java.io.File, java.lang.String)
     */
    @Override
    public Optional<String[]> findById(final File filename, final String id) throws IOException {
	// TODO Auto-generated method stub
	final CSVReader reader = new CSVReader(new FileReader(filename), ';');
	String[] nextLine;

	while ((nextLine = reader.readNext()) != null) {
	    // nextLine[] is an array of values from the line
	    if (nextLine[0].equals(id)) {
		return Optional.of(nextLine);
	    }
	}
	return Optional.empty();
    }
}
