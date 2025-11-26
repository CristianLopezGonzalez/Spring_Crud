package proyecto_crud_v1.domain.ports.output;

import java.util.List;
import java.util.Optional;



import proyecto_crud_v1.domain.models.Tasks;

public interface TaskRepositoryPort {
    Tasks save(Tasks tasks);
    Optional<Tasks> findById(Long id);
    List<Tasks>findAll();
    Optional<Tasks>update(Tasks tarea);
    boolean deleteById(Long id);
}
