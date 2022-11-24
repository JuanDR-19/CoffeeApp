package com.example.Modelo.Object;

import com.example.Modelo.Object.Archivos;
import com.example.Modelo.Object.UsuarioFactory;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class TestArchivos {
    @Test
    public void TestArchivos(){
        List<UsuarioFactory> usuarioFactoriesn = new ArrayList<>();
        List<UsuarioFactory> usuarioFactoriesn2 = new ArrayList<>();
        usuarioFactoriesn.add(new UsuarioFactory("aaa", "bbb"));
        Archivos.guardarListaUArchivos(usuarioFactoriesn);
        Archivos.llenarListaUsuario(usuarioFactoriesn2);
        assertEquals("aaa", usuarioFactoriesn2.get(0).getUserName() );
    }
}
