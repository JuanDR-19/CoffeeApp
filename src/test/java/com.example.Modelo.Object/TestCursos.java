package com.example.Modelo.Object;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestCursos {

    @Test
    public void TestCursos(){

        Cursos a = new Cursos();
        a.setNombre("aaa");
        assertEquals("aaa", a.getNombre());

    }

}
