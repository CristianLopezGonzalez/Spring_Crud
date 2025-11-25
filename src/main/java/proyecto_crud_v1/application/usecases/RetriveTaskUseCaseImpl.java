package proyecto_crud_v1.application.usecases;

import java.util.List;
import java.util.Optional;

import org.springframework.scheduling.config.Task;

import proyecto_crud_v1.domain.ports.input.RetriveTaskUseCase;
import proyecto_crud_v1.domain.ports.output.TaskRepositoryPort;

public class RetriveTaskUseCaseImpl implements RetriveTaskUseCase{

    private final TaskRepositoryPort taskRepositoryPort;

    public RetriveTaskUseCaseImpl(TaskRepositoryPort taskRepositoryPort) {
        this.taskRepositoryPort = taskRepositoryPort;
    }

    @Override
    public Optional<Task> obtenerTarea(Long id) {
        return taskRepositoryPort.findById(id);
    }

    @Override
    public List<Task> obtenerTodasLasTareas() {
        return taskRepositoryPort.findAll();
    }

    

}
