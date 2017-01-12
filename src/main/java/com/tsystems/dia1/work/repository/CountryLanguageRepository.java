package com.tsystems.dia1.work.repository;

import java.util.Optional;

import com.tsystems.dia1.work.dominio.CountryLanguageEntity;
import com.tsystems.dia1.work.services.RepositoryConnectionException;

public interface CountryLanguageRepository {

    // acceso a datos e impresión de datos por pantalla//
    // Refactoring, en data repository solo quiero obtener los datos

    Optional<CountryLanguageEntity> findByCountryCode(String id) throws RepositoryConnectionException;

}