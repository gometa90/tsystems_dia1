package com.tsystems.dia1.work;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import au.com.bytecode.opencsv.CSVReader;

public class application {

    public static void main(final String args[]) throws IOException {

	final ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
	File cityfile = null;
	if (args.length < 1) {
	    throw new IllegalArgumentException("Al menos debe introducir un argumento");
	}

	switch (args[0]) {

	case "ciudad":
	    cityfile = new File(systemClassLoader.getResource("city.csv").getFile());
	    break;

	case "pais":
	    cityfile = new File(systemClassLoader.getResource("country.csv").getFile());
	    break;

	case "lengua":
	    cityfile = new File(systemClassLoader.getResource("countrylanguage.csv").getFile());
	    break;

	default:
	    throw new IllegalArgumentException("Al menos debe introducir un argumento");
	}

	final CSVReader reader = new CSVReader(new FileReader(cityfile), ';');
	String[] nextLine;

	while ((nextLine = reader.readNext()) != null) {
	    // nextLine[] is an array of values from the line
	    System.out.println(nextLine[0] + " " + nextLine[1] + " etc...");
	}
	// try {
	//
	// final ClassLoader systemClassLoader =
	// ClassLoader.getSystemClassLoader();
	// final File cityfile = new
	// File(systemClassLoader.getResource("city.csv").getFile());
	//
	// final CSVReader reader = new CSVReader(new FileReader(cityfile),
	// ';');
	// String[] nextLine;
	//
	// while ((nextLine = reader.readNext()) != null) {
	// // nextLine[] is an array of values from the line
	// System.out.println(nextLine[0] + " " + nextLine[1] + " etc...");
	// }
	// } catch (Exception e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }

    }
}
