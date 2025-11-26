package proyecto_crud_v1.application.usecases;



import proyecto_crud_v1.domain.models.Tasks;
import proyecto_crud_v1.domain.ports.input.CreateTasskUserCase;
import proyecto_crud_v1.domain.ports.output.TaskRepositoryPort;

public class CreateTaskUseCaseImpl implements CreateTasskUserCase{

    private final TaskRepositoryPort taskrepositoryPort;

    public CreateTaskUseCaseImpl(TaskRepositoryPort taskrepositoryPort) {
        this.taskrepositoryPort = taskrepositoryPort;
    }

    @Override
    public Tasks crearTarea(Tasks tarea) {
        return taskrepositoryPort.save(tarea);
    }

}
