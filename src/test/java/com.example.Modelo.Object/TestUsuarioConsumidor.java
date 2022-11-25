package com.example.Modelo.Object;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TestUsuarioConsumidor {

    @Test
    public void TestConsumidor(){
        UsuarioConsumidor a = new UsuarioConsumidor();
        Cafes b = new Cafes();
        List<Cafes> cafesFavoritos = new ArrayList<>();
        b.setName("aaa");
        cafesFavoritos.add(b);
        a.setCafesFavoritos(cafesFavoritos);
        assertEquals( b.getName(), a.getCafesFavoritos().get(0).getName());

    }



}
