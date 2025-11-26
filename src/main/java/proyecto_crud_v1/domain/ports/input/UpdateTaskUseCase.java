package proyecto_crud_v1.domain.ports.input;

import java.util.Optional;

import proyecto_crud_v1.domain.models.Tasks;

public interface UpdateTaskUseCase {

    Optional<Tasks>actualizarTarea(Long id,Tasks nuevosValores);
}
