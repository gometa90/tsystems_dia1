package com.tsystems.dia1.work.repository.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

import com.tsystems.dia1.work.domain.CountryLanguageEntity;
import com.tsystems.dia1.work.repository.CountryLanguageRepository;
import com.tsystems.dia1.work.services.RepositoryConnectionException;

public class MysqlCountryLanguageRepository implements CountryLanguageRepository {

    private final MySQLConnectionFactory connectionFactory = new MySQLConnectionFactory();

    @Override
    public Optional<CountryLanguageEntity> findByCountryCode(String countryCode) throws RepositoryConnectionException {
	Connection connection = connectionFactory.getInstance();

	try {
	    PreparedStatement preparedStatement = connection.prepareStatement(
		    "SELECT CountryCode,Language,IsOfficial,Percentage FROM countrylanguage WHERE CountryCode = ?");
	    preparedStatement.setString(1, countryCode);

	    ResultSet resultSet = preparedStatement.executeQuery();
	    if (resultSet.next()) {

		CountryLanguageEntity countryLanguage = CountryLanguageEntity.builder()//
			.countryCode(resultSet.getString("CountryCode"))//
			.language(resultSet.getString("Language"))//
			.isOfficial(toBoolean(resultSet.getString("IsOfficial")))//
			.percentage(resultSet.getDouble("Percentage"))//
			.build();

		return Optional.of(countryLanguage);
	    }
	    return Optional.empty();
	} catch (SQLException e) {

	    throw new RepositoryConnectionException("Error al conectar al servidor", e);
	}
    }

    private boolean toBoolean(String isOfficialString) {
	boolean isOfficial = true;
	if (isOfficialString.equals("F")) {
	    isOfficial = false;
	}
	return isOfficial;
    }

}
