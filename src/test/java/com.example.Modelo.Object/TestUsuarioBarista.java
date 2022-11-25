package com.example.Modelo.Object;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TestUsuarioBarista {

    @Test
    public void TestUBarista(){
        UsuarioBarista a = new UsuarioBarista();
        Metodos b = new Metodos("aaa");
        List<Metodos> metodosPreferidos = new ArrayList<>();
        metodosPreferidos.add(b);
        a.setMetodosPreferidos(metodosPreferidos);
        assertEquals( b.getNombre(), a.getMetodosPreferidos().get(0).getNombre());

    }


}
