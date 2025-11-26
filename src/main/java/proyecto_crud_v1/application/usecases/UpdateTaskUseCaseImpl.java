package proyecto_crud_v1.application.usecases;

import java.util.Optional;



import proyecto_crud_v1.domain.models.Tasks;
import proyecto_crud_v1.domain.ports.input.UpdateTaskUseCase;
import proyecto_crud_v1.domain.ports.output.TaskRepositoryPort;

public class UpdateTaskUseCaseImpl implements UpdateTaskUseCase {

    private final TaskRepositoryPort repositoryPort;

    public UpdateTaskUseCaseImpl(TaskRepositoryPort repositoryPort) {
        this.repositoryPort = repositoryPort;
    }

    @Override
    public Optional<Tasks> actualizarTarea(Long id, Tasks nuevosValores) {
        return repositoryPort.update(nuevosValores); 
    }

}
