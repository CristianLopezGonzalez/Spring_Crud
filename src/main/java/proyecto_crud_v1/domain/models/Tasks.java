package proyecto_crud_v1.domain.models;

import java.time.LocalDateTime;

public class Tasks {

    private long id;
    private String titulo;
    private String descripcion;
    private LocalDateTime diaCreacion;
    private boolean completada;

    

    public Tasks(long id, String titulo, String descripcion, LocalDateTime diaCreacion, boolean completada) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.diaCreacion = diaCreacion;
        this.completada = completada;
    }

    public Tasks(){

    }

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public LocalDateTime getDiaCreacion() {
        return diaCreacion;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setDiaCreacion(LocalDateTime diaCreacion) {
        this.diaCreacion = diaCreacion;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }

    

    

}
