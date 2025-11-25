package proyecto_crud_v1.application.usecases;

import org.springframework.scheduling.config.Task;

import proyecto_crud_v1.domain.ports.input.CreateTasskUserCase;
import proyecto_crud_v1.domain.ports.output.TaskRepositoryPort;

public class CreateTaskUseCaseImpl implements CreateTasskUserCase{

    private final TaskRepositoryPort taskrepositoryPort;

    public CreateTaskUseCaseImpl(TaskRepositoryPort taskrepositoryPort) {
        this.taskrepositoryPort = taskrepositoryPort;
    }

    @Override
    public Task crearTarea(Task tarea) {
        return taskrepositoryPort.save(tarea);
    }

}
