package Repository;

import java.io.IOException;
import java.util.Optional;

public interface CountryLanguageRepository {

    // acceso a datos e impresión de datos por pantalla//
    // Refactoring, en data repository solo quiero obtener los datos

    Optional<String[]> findByCountryCode(String id) throws IOException;

}