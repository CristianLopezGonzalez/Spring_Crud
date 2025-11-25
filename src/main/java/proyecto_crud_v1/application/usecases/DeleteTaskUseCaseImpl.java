package proyecto_crud_v1.application.usecases;

import proyecto_crud_v1.domain.ports.input.DeleteTaskUseCase;
import proyecto_crud_v1.domain.ports.output.TaskRepositoryPort;

public class DeleteTaskUseCaseImpl implements DeleteTaskUseCase{

    private final TaskRepositoryPort taskRepositoryPort;

    public DeleteTaskUseCaseImpl(TaskRepositoryPort taskRepositoryPort) {
        this.taskRepositoryPort = taskRepositoryPort;
    }

    @Override
    public boolean eliminarTarea(Long id) {
        return taskRepositoryPort.deleteById(id);
    }

    

}
