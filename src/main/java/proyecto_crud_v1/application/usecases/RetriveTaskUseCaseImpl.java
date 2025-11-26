package proyecto_crud_v1.application.usecases;

import java.util.List;
import java.util.Optional;


import proyecto_crud_v1.domain.models.Tasks;
import proyecto_crud_v1.domain.ports.input.RetriveTaskUseCase;
import proyecto_crud_v1.domain.ports.output.TaskRepositoryPort;

public class RetriveTaskUseCaseImpl implements RetriveTaskUseCase{

    private final TaskRepositoryPort taskRepositoryPort;

    public RetriveTaskUseCaseImpl(TaskRepositoryPort taskRepositoryPort) {
        this.taskRepositoryPort = taskRepositoryPort;
    }

    @Override
    public Optional<Tasks> obtenerTarea(Long id) {
        return taskRepositoryPort.findById(id);
    }

    @Override
    public List<Tasks> obtenerTodasLasTareas() {
        return taskRepositoryPort.findAll();
    }

    

}
