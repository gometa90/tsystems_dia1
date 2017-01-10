package com.tsystems.dia1.work.repository;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystemNotFoundException;
import java.util.List;
import java.util.Optional;

public interface DataRepository {

    // acceso a datos e impresión de datos por pantalla//
    // Refactoring, en data repository solo quiero obtener los datos
    List<String[]> findByNameStartWith(File filename, String startWith) throws IOException, FileSystemNotFoundException;

    Optional<String[]> findById(File filename, String id) throws IOException;

}