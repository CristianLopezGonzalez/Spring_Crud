package proyecto_crud_v1.domain.ports.input;

import org.springframework.scheduling.config.Task;

public interface CreateTasskUserCase {

    Task crearTarea(Task tarea);

}