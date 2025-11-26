package proyecto_crud_v1.domain.ports.input;



import proyecto_crud_v1.domain.models.Tasks;

public interface CreateTasskUserCase {

    Tasks crearTarea(Tasks tarea);

}