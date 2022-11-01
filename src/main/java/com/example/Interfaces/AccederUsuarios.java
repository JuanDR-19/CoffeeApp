package com.example.Interfaces;

import com.example.Modelo.Object.UsuarioFactory;

import java.util.List;

public interface AccederUsuarios {
    List<UsuarioFactory> getUsuarioFactoryList();

    void setUsuarioFactoryList(List<UsuarioFactory> usuarioFactoryList);
}
