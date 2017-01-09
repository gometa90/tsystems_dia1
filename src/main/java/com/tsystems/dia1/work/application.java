package com.tsystems.dia1.work;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.FileSystemNotFoundException;

import au.com.bytecode.opencsv.CSVReader;

public class application {

    // listar por filtros de nombre
    // obtener por id

    public static void main(final String args[]) throws IOException {

	final ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
	File cityfile = null;
	if (args.length < 1) {
	    throw new IllegalArgumentException("Al menos debe introducir un argumento");
	}

	switch (args[0]) {

	case "ciudad":
	    cityfile = ResourceUtils.getResourceByName("city.csv");
	    break;

	case "pais":
	    cityfile = ResourceUtils.getResourceByName("country.csv");
	    break;

	case "lengua":
	    cityfile = ResourceUtils.getResourceByName("countrylanguage.csv");
	    break;

	default:
	    throw new IllegalArgumentException("Argumento 1 invalido");
	}

	switch (args[1]) {
	case "id":
	    findById(cityfile, args[2]);
	    break;

	case "name":
	    findByNameStartWith(cityfile, args[2]);
	    break;
	default:
	    throw new IllegalArgumentException("Argumento 2 invalido");
	}

	try {
	    final CSVReader reader = new CSVReader(new FileReader(cityfile), ';');
	    String[] nextLine;

	    while ((nextLine = reader.readNext()) != null) {
		// nextLine[] is an array of values from the line
		System.out.println(nextLine[0] + " " + nextLine[1] + " etc...");
	    }

	} catch (Exception e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}

    }

    private static void findByNameStartWith(final File filename, final String startWith)
	    throws IOException, FileSystemNotFoundException {
	// TODO Auto-generated method stub
	final CSVReader reader = new CSVReader(new FileReader(filename), ';');
	String[] nextLine;

	while ((nextLine = reader.readNext()) != null) {
	    // nextLine[] is an array of values from the line
	    if (nextLine[1].startsWith(startWith)) {
		System.out.println(nextLine[0] + " " + nextLine[1] + " etc...");
	    }
	}
    }

    private static void findById(final File filename, final String id) throws IOException {
	// TODO Auto-generated method stub
	final CSVReader reader = new CSVReader(new FileReader(filename), ';');
	String[] nextLine;

	while ((nextLine = reader.readNext()) != null) {
	    // nextLine[] is an array of values from the line
	    if (nextLine[0].equals(id)) {
		System.out.println(nextLine[0] + " " + nextLine[1] + " etc...");
	    }
	}
    }

}
