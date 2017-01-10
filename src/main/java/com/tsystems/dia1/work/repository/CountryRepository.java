package com.tsystems.dia1.work.repository;

import java.io.IOException;
import java.nio.file.FileSystemNotFoundException;
import java.util.List;
import java.util.Optional;

public interface CountryRepository {

    // acceso a datos e impresión de datos por pantalla//
    // Refactoring, en data repository solo quiero obtener los datos
    List<String[]> findByNameStartWith(String startWith) throws IOException, FileSystemNotFoundException;

    Optional<String[]> findByCode(String code) throws IOException;

}