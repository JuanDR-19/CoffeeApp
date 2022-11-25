package com.example.Modelo.Object;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class TestArchivos {
    @Test
    public void TestArchivos() throws FileNotFoundException {
        List<UsuarioFactory> usuarioFactoriesn = new ArrayList<>();
        List<UsuarioFactory> usuarioFactoriesn2 = new ArrayList<>();
        usuarioFactoriesn.add(new UsuarioFactory("aaa", "bbb"));
        Archivos.guardarListaUArchivos(usuarioFactoriesn);
        Archivos.llenarListaUsuario(usuarioFactoriesn2);
        assertEquals("aaa", usuarioFactoriesn2.get(0).getUserName() );

        List<Cafes> cafesList = new ArrayList<>();
        List<Cafes> cafesList1 = new ArrayList<>();
        cafesList.add(new Cafes("aaa", "bbb"));
        Archivos.guardarListaCArchivos(cafesList);
        Archivos.llenarListaCafes(cafesList1);
        assertEquals("aaa", cafesList1.get(0).getName() );



    }
}
