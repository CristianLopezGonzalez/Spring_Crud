package proyecto_crud_v1.application.services;

import java.util.List;
import java.util.Optional;

import org.springframework.scheduling.config.Task;

import proyecto_crud_v1.domain.models.AdditionalTasksInfo;
import proyecto_crud_v1.domain.ports.input.CreateTasskUserCase;
import proyecto_crud_v1.domain.ports.input.DeleteTaskUseCase;
import proyecto_crud_v1.domain.ports.input.GetAdditionalTaskInfoUseCase;
import proyecto_crud_v1.domain.ports.input.RetriveTaskUseCase;
import proyecto_crud_v1.domain.ports.input.UpdateTaskUseCase;

public class TaskService implements CreateTasskUserCase, DeleteTaskUseCase, GetAdditionalTaskInfoUseCase,
        RetriveTaskUseCase, UpdateTaskUseCase {

    private final CreateTasskUserCase createTasskUserCase;
    private final DeleteTaskUseCase deleteTaskUseCase;
    private final GetAdditionalTaskInfoUseCase additionalTaskInfoUseCase;
    private final RetriveTaskUseCase retriveTaskUseCase;
    private final UpdateTaskUseCase updateTaskUseCase;

    public TaskService(CreateTasskUserCase createTasskUserCase, DeleteTaskUseCase deleteTaskUseCase,GetAdditionalTaskInfoUseCase additionalTaskInfoUseCase, RetriveTaskUseCase retriveTaskUseCase,    UpdateTaskUseCase updateTaskUseCase) {
        this.createTasskUserCase = createTasskUserCase;
        this.deleteTaskUseCase = deleteTaskUseCase;
        this.additionalTaskInfoUseCase = additionalTaskInfoUseCase;
        this.retriveTaskUseCase = retriveTaskUseCase;
        this.updateTaskUseCase = updateTaskUseCase;
    }

    @Override
    public Task crearTarea(Task tarea) {
        return createTasskUserCase.crearTarea(tarea);
    }

    @Override
    public Optional<Task> actualizarTarea(Long id, Task nuevosValores) {
        return updateTaskUseCase.actualizarTarea(id, nuevosValores);
    }

    @Override
    public Optional<Task> obtenerTarea(Long id) {
        return retriveTaskUseCase.obtenerTarea(id);
    }

    @Override
    public List<Task> obtenerTodasLasTareas() {
        return retriveTaskUseCase.obtenerTodasLasTareas();
    }

    @Override
    public AdditionalTasksInfo informacionAdicional(Long id) {
        return additionalTaskInfoUseCase.informacionAdicional(id);
    }

    @Override
    public boolean eliminarTarea(Long id) {
        return deleteTaskUseCase.eliminarTarea(id);
    }

    

}
