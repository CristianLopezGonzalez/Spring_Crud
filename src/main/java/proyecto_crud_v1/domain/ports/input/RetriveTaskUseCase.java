package proyecto_crud_v1.domain.ports.input;

import java.util.List;
import java.util.Optional;

import org.springframework.scheduling.config.Task;

public interface RetriveTaskUseCase {

    Optional<Task> obtenerTarea(Long id);
    List<Task> obtenerTodasLasTareas();
}
