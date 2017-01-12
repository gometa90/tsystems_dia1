package com.tsystems.dia1.work.repository;

import java.util.List;
import java.util.Optional;

import com.tsystems.dia1.work.dominio.CityEntity;
import com.tsystems.dia1.work.services.RepositoryConnectionException;

public interface CityRepository {

    // acceso a datos e impresión de datos por pantalla//
    // Refactoring, en data repository solo quiero obtener los datos
    List<CityEntity> findByNameStartWith(String startWith) throws RepositoryConnectionException;

    Optional<CityEntity> findById(String id) throws RepositoryConnectionException;

}