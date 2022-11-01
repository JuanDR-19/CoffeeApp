package com.example.Interfaces;

import com.example.Modelo.Object.UsuarioFactory;
import javafx.event.ActionEvent;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.FileNotFoundException;
import java.util.List;

public interface CrearUsuarios {

    void finalizarRegistro(ActionEvent event, PasswordField passTextR, TextField usuarioTextR, boolean barista) throws FileNotFoundException;

}
