package proyecto_crud_v1.domain.ports.input;

import java.util.List;
import java.util.Optional;



import proyecto_crud_v1.domain.models.Tasks;

public interface RetriveTaskUseCase {

    Optional<Tasks> obtenerTarea(Long id);
    List<Tasks> obtenerTodasLasTareas();
}
