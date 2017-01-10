package Repository;

import java.io.IOException;
import java.nio.file.FileSystemNotFoundException;
import java.util.List;
import java.util.Optional;

public interface CityRepository {

    // acceso a datos e impresión de datos por pantalla//
    // Refactoring, en data repository solo quiero obtener los datos
    List<String[]> findByNameStartWith(String startWith) throws IOException, FileSystemNotFoundException;

    Optional<String[]> findById(String id) throws IOException;

}