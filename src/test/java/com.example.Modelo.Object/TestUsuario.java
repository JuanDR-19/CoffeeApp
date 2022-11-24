package com.example.Preubas;

import com.example.Modelo.Object.UsuarioBarista;
import com.example.Modelo.Object.UsuarioFactory;
import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class TestUsuario {


    @Test
    public void usuarioBaris(){
        UsuarioFactory a = new UsuarioFactory();
        a.setUserName("Andy");
        assertEquals("Andy", a.getUserName());
    }

}
