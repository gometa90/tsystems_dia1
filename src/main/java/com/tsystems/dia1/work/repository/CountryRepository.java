package com.tsystems.dia1.work.repository;

import java.util.List;
import java.util.Optional;

import com.tsystems.dia1.work.services.RepositoryConnectionException;

public interface CountryRepository {

    // acceso a datos e impresión de datos por pantalla//
    // Refactoring, en data repository solo quiero obtener los datos
    List<String[]> findByNameStartWith(String startWith) throws RepositoryConnectionException;

    Optional<String[]> findByCode(String code) throws RepositoryConnectionException;

}