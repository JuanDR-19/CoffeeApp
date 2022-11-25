package com.example.Modelo.Object;

public class Metodos {

    private String nombre;

    public Metodos() {
    }

    public Metodos(String nombre) { //no puede existir un constructor vacio
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
