package com.tsystems.dia1.work.repository;

import java.io.IOException;
import java.nio.file.FileSystemNotFoundException;
import java.util.List;
import java.util.Optional;

import com.tsystems.dia1.work.domain.CityEntity;

public interface CityRepository {

    // acceso a datos e impresión de datos por pantalla//
    // Refactoring, en data repository solo quiero obtener los datos
    List<CityEntity> findByNameStartWith(String startWith) throws IOException, FileSystemNotFoundException;

    Optional<CityEntity> findById(String id) throws IOException;

}