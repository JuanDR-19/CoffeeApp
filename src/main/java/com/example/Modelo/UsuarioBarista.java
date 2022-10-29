package com.example.Modelo;

import java.util.ArrayList;
import java.util.List;

public class UsuarioBarista extends UsuarioFactory{
    private List<Metodos> metodosPreferidos= new ArrayList<>();
    private List<Cursos> cursos= new ArrayList<>();

    public UsuarioBarista(String user, String pass, List<Metodos> metodosPreferidos, List<Cursos> cursos) {
        super(user, pass);
        this.metodosPreferidos = metodosPreferidos;
        this.cursos = cursos;
    }

    public UsuarioBarista(List<Metodos> metodosPreferidos, List<Cursos> cursos) {
        this.metodosPreferidos = metodosPreferidos;
        this.cursos = cursos;
    }

    public UsuarioBarista(String user, String pass) { //constructor de baristas sin informacion
        super(user, pass);
        this.metodosPreferidos =null;
        this.cursos = null;
    }

    public void agregarCurso(Cursos nuevoCurso){
        this.cursos.add(nuevoCurso);
    }

    public void agregarMetodoPreferido(Metodos nuevoMetodo){
        this.metodosPreferidos.add(nuevoMetodo);
    }

    public List<Metodos> getMetodosPreferidos() {
        return metodosPreferidos;
    }

    public void setMetodosPreferidos(List<Metodos> metodosPreferidos) {
        this.metodosPreferidos = metodosPreferidos;
    }

    public List<Cursos> getCursos() {
        return cursos;
    }

    public void setCursos(List<Cursos> cursos) {
        this.cursos = cursos;
    }
}
