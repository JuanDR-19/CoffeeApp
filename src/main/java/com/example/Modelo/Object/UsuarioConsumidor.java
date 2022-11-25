package com.example.Modelo.Object;

import java.util.ArrayList;
import java.util.List;

public class UsuarioConsumidor extends UsuarioFactory {
    private List<Cafes> cafesFavoritos = new ArrayList<>();

    public UsuarioConsumidor() {
    }

    public UsuarioConsumidor(String user, String pass, List<Cafes> cafesFavoritos) {
        super(user, pass, "Consumidor");
        this.cafesFavoritos = cafesFavoritos;
    }

    public UsuarioConsumidor(List<Cafes> cafesFavoritos) {
        this.cafesFavoritos = cafesFavoritos;
    }

    public UsuarioConsumidor(String user, String pass) { //usuario sin cafes favoritos
        super(user, pass, "Consumidor");
        this.cafesFavoritos = null;
    }

    public List<Cafes> getCafesFavoritos() {
        return cafesFavoritos;
    }

    public void setCafesFavoritos(List<Cafes> cafesFavoritos) {
        this.cafesFavoritos = cafesFavoritos;
    }
}
