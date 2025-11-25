package proyecto_crud_v1.domain.ports.output;

import java.util.List;
import java.util.Optional;

import org.springframework.scheduling.config.Task;

public interface TaskRepositoryPort {
    Task save(Task tarea);
    Optional<Task> findById(Long id);
    List<Task>findAll();
    Optional<Task>update(Task tarea);
    boolean deleteById(Long id);
}
