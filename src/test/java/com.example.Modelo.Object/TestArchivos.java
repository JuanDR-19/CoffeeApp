package com.example.Preubas;

import com.example.Modelo.Object.Archivos;
import com.example.Modelo.Object.UsuarioFactory;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class TestArchivos {

    List<UsuarioFactory> usuarioFactories;
    List<UsuarioFactory> usuarioFactories2;


    @Test
    public void TestArchivos(){

        usuarioFactories.add(new UsuarioFactory("aaa", "bbb"));

        Archivos.guardarListaUArchivos(usuarioFactories);
        Archivos.llenarListaUsuario(usuarioFactories2);

        assertEquals("aaa", usuarioFactories2.get(0).getUserName() );

    }


}
