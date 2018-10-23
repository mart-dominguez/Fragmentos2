package ar.edu.utn.frsf.isi.dam.fragmentos2;

/**
 * Created by martdominguez on 05/10/17.
 */

public class Tarea {
    String titulo;
    Boolean hecha;
    Integer prioridad;

    public Tarea() {
    }

    public Tarea(String titulo, Boolean hecha, Integer prioridad) {
        this.titulo = titulo;
        this.hecha = hecha;
        this.prioridad = prioridad;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Boolean getHecha() {
        return hecha;
    }

    public void setHecha(Boolean hecha) {
        this.hecha = hecha;
    }

    public Integer getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(Integer prioridad) {
        this.prioridad = prioridad;
    }
}
