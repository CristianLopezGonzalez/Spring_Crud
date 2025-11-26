package proyecto_crud_v1.infrastructure.entities;

import java.time.LocalDateTime;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import proyecto_crud_v1.domain.models.Tasks;

@Entity
public class TaskEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    private String titulo;
    private String descripcion;
    private LocalDateTime diaCreacion;
    private boolean completada;

    public TaskEntity() {
    }

    public TaskEntity(long id, String titulo, String descripcion, LocalDateTime diaCreacion, boolean completada) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.diaCreacion = diaCreacion;
        this.completada = completada;
    }

    public static TaskEntity fromDomainModel(Tasks tasks){
        return new TaskEntity(tasks.getId(),tasks.getTitulo(),tasks.getDescripcion(),tasks.getDiaCreacion(),tasks.isCompletada());
    }

    public Tasks toDomainModel(){
        return new Tasks(id,titulo,descripcion,diaCreacion,completada);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDateTime getDiaCreacion() {
        return diaCreacion;
    }

    public void setDiaCreacion(LocalDateTime diaCreacion) {
        this.diaCreacion = diaCreacion;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }

    


}
