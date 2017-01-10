package imp;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.FileSystemNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import Repository.CityRepository;
import au.com.bytecode.opencsv.CSVReader;

public class CSVCityRepository implements CityRepository {

    private static final char COLUMN_DELIMITER_CHAR = ';';
    private static final String CITY_FILE_NAME = "city.csv";

    @Override
    public List<String[]> findByNameStartWith(String startWith) throws IOException, FileSystemNotFoundException {
	List<String[]> linesToReturn = new ArrayList<>();

	final CSVReader reader = new CSVReader(new FileReader(CITY_FILE_NAME), COLUMN_DELIMITER_CHAR);

	String[] nextLine;
	while ((nextLine = reader.readNext()) != null) {
	    // nextLine[] is an array of values from the line
	    if (nextLine[1].startsWith(startWith)) {
		linesToReturn.add(nextLine);
	    }
	}

	return linesToReturn;
    }

    @Override
    public Optional<String[]> findById(String id) throws IOException {
	// TODO Auto-generated method stub
	final CSVReader reader = new CSVReader(new FileReader(CITY_FILE_NAME), COLUMN_DELIMITER_CHAR);
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
