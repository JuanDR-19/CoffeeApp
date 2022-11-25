package com.example.Modelo.Object;

import com.example.Modelo.Object.UsuarioBarista;
import com.example.Modelo.Object.UsuarioFactory;
import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class TestUsuario {


    @Test
    public void usuario(){
        UsuarioFactory a = new UsuarioFactory();
        a.setUserName("Andy");
        assertEquals("Andy", a.getUserName());

        a.setTipo("Aaaa");
        assertEquals("Aaaa", a.getTipo());

        a.setPassword("ooo");
        assertEquals("ooo", a.getPassword());


    }

}
