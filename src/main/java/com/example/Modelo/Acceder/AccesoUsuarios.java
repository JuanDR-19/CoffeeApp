package com.example.Modelo.Acceder;

import com.example.Interfaces.AccederUsuarios;
import com.example.Modelo.Object.UsuarioFactory;

import java.util.ArrayList;
import java.util.List;

public class AccesoUsuarios implements AccederUsuarios {

    List<UsuarioFactory> usuarioFactoryList = new ArrayList<>();

    public List<UsuarioFactory> getUsuarioFactoryList() {
        return usuarioFactoryList;
    }

    public void setUsuarioFactoryList(List<UsuarioFactory> usuarioFactoryList) {
        this.usuarioFactoryList = usuarioFactoryList;
    }
}
