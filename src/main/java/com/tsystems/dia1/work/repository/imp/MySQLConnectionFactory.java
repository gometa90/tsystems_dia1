package com.tsystems.dia1.work.repository.imp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.tsystems.dia1.work.services.RepositoryConnectionException;

public class MySQLConnectionFactory {

    private static final String ULR = "jdbc:mysql://192.168.1.30:3306/world?serverTimezone=UTC";
    private static final String USUARIO = "curso";
    private static final String CLAVE = "curso";

    // Solo quiero una instancia de la conexion a la DB, luego utilizo un
    // singleton
    private static Connection mysqlConnection = null;

    public Connection getInstance() throws RepositoryConnectionException {
	if (mysqlConnection == null) {
	    mysqlConnection = connect();
	}
	return mysqlConnection;
    }// Esto es un factory

    public static Connection connect() throws RepositoryConnectionException {
	try {
	    Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();

	} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e1) {
	    throw new RepositoryConnectionException("Error al cargar el drive", e1);
	}
	try {
	    return DriverManager.getConnection(ULR, USUARIO, CLAVE);
	} catch (SQLException e) {
	    throw new RepositoryConnectionException("Error al conectarme al servidor", e);

	}
    }
}
