package com.example.Controladores;
import com.example.Interfaces.AccederCafes;
import com.example.Interfaces.CrearCafes;
import com.example.Interfaces.CrearUsuarios;
import com.example.Modelo.Acceder.AccesoCafes;
import com.example.Modelo.Crear.CrearCafe;
import com.example.Modelo.Crear.CrearUsuario;
import com.example.Modelo.Object.Archivos;
import com.example.Modelo.Object.Cafes;
import com.example.Modelo.Object.UsuarioFactory;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class AnadirCafesController {

    @FXML
    private Button AnadirCafe;

    @FXML
    private TextField AromaField;

    @FXML
    private TextField CuerpoField;

    @FXML
    private TextField MarcaField;

    @FXML
    private TextField PrecioField;

    @FXML
    private TextField SaborField;

    @FXML
    private TextField nameField;


    public void annadirCafe(ActionEvent event, TextField nameField, TextField PrecioField, TextField MarcaField, TextField SaborField, TextField CuerpoField, TextField AromaField) throws FileNotFoundException {
        CrearCafes a = new CrearCafe();
        a.AnadirCafe( event, nameField, PrecioField,  MarcaField,  SaborField,  CuerpoField,  AromaField);
    }

    @FXML
    public void annadirCafesBoot(ActionEvent event) throws FileNotFoundException {

        annadirCafe(event, nameField, PrecioField,  MarcaField,  SaborField,  CuerpoField,  AromaField);

    }


}
