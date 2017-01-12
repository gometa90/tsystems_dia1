package com.tsystems.dia1.work.repository;

import java.util.List;
import java.util.Optional;

import com.tsystems.dia1.work.domain.CountryEntity;
import com.tsystems.dia1.work.services.RepositoryConnectionException;

public interface CountryRepository {

    // acceso a datos e impresión de datos por pantalla//
    // Refactoring, en data repository solo quiero obtener los datos
    List<CountryEntity> findByNameStartWith(String startWith) throws RepositoryConnectionException;

    Optional<CountryEntity> findByCode(String code) throws RepositoryConnectionException;

}