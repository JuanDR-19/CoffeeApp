package com.example.Modelo.Object;

import java.util.Date;

public class Cursos {
    private String nombre ="";
    private Date fechaInicio;
    private Date fechaFinalizacion;

    public Cursos(String nombre, Date fechaInicio, Date fechaFinalizacion) { //si o si debe de tener estos valores siempre
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFinalizacion = fechaFinalizacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFinalizacion() {
        return fechaFinalizacion;
    }

    public void setFechaFinalizacion(Date fechaFinalizacion) {
        this.fechaFinalizacion = fechaFinalizacion;
    }
}
