package com.example.Modelo.Object;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class TestMetodos {

    @Test
    public void testMetodos(){

        Metodos a = new Metodos();
        a.setNombre("lll");
        assertEquals("lll", a.getNombre());


    }

}
