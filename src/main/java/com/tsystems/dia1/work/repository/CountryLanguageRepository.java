package com.tsystems.dia1.work.repository;

import java.io.IOException;
import java.util.Optional;

import com.tsystems.dia1.work.domain.CountryLanguageEntity;

public interface CountryLanguageRepository {

    // acceso a datos e impresión de datos por pantalla//
    // Refactoring, en data repository solo quiero obtener los datos

    Optional<CountryLanguageEntity> findByCountryCode(String id) throws IOException;

}