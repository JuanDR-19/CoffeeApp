package com.example.Interfaces;

import javafx.event.ActionEvent;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.FileNotFoundException;

public interface CrearUsuarios {

    void finalizarRegistro(ActionEvent event, PasswordField passTextR, TextField usuarioTextR, CheckBox baristaButton) throws FileNotFoundException;

}
