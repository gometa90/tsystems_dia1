package com.tsystems.dia1.work;

import java.io.File;
import java.io.FileReader;

import au.com.bytecode.opencsv.CSVReader;

public class application {

    public static void main(String args[]) {
	try {

	    ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
	    File cityfile = new File(systemClassLoader.getResource("city.csv").getFile());

	    CSVReader reader = new CSVReader(new FileReader(cityfile), ';');
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
