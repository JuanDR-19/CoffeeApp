package com.example.Modelo.Object;

import com.example.Interfaces.AccederCafes;
import com.example.Interfaces.AccederUsuarios;
import com.example.Modelo.Acceder.AccesoCafes;
import com.example.Modelo.Acceder.AccesoUsuarios;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class TestAccesoUsuarios {

    @Test
    public void testAccesoU(){

        List<UsuarioFactory> usuarioFList = new ArrayList<>();
        UsuarioFactory usuario = new UsuarioFactory();
        usuario.setUserName("aaa");
        AccederUsuarios a = new AccesoUsuarios();
        usuarioFList.add(usuario);
        a.setUsuarioFactoryList(usuarioFList);
        assertEquals("aaa", a.getUsuarioFactoryList().get(0).getUserName());


    }

}
