package proyecto_crud_v1.domain.ports.input;

import java.util.Optional;

import org.springframework.scheduling.config.Task;

public interface UpdateTaskUseCase {

    Optional<Task>actualizarTarea(Long id,Task nuevosValores);
}
