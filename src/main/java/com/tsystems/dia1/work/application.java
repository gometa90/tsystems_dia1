package com.tsystems.dia1.work;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

import Repository.DataRepository;
import UserInterface.ControllerUserInterface;
import au.com.bytecode.opencsv.CSVReader;

public class application {

    // listar por filtros de nombre
    // obtener por id

    private static CSVReader reader;

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
	    Optional<String[]> optionalLine = DataRepository.findById(cityfile, args[2]);
	    // Programación en lambda, que es solo codificación comprimida
	    // line.ifPresent(value ->
	    // ControllerUserInterface.printLine(value));
	    if (optionalLine.isPresent()) {
		ControllerUserInterface.printLine(optionalLine.get());
	    }

	    break;

	case "name":
	    List<String[]> lines = DataRepository.findByNameStartWith(cityfile, args[2]);
	    for (String[] line : lines) {
		ControllerUserInterface.printLine(line);
	    }
	    break;

	default:
	    throw new IllegalArgumentException("Argumento 2 invalido");
	}

	try {
	    reader = new CSVReader(new FileReader(cityfile), ';');
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

}
