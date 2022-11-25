package com.example.Controladores;

import com.example.Interfaces.CrearCafes;
import com.example.Modelo.Crear.CrearCafe;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.FileNotFoundException;

public class AnadirCafesController {

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

    @FXML
    private Button Salir;

    public void annadirCafe(ActionEvent event, TextField nameField, TextField PrecioField, TextField MarcaField, TextField SaborField, TextField CuerpoField, TextField AromaField) throws FileNotFoundException {
        CrearCafes a = new CrearCafe();
        a.AnadirCafe(event, nameField, PrecioField, MarcaField, SaborField, CuerpoField, AromaField);
    }

    @FXML
    public void annadirCafesBoot(ActionEvent event) throws FileNotFoundException {
        annadirCafe(event, nameField, PrecioField, MarcaField, SaborField, CuerpoField, AromaField);
    }

    @FXML
    public void salir(ActionEvent event){
        Stage stage = (Stage) this.Salir.getScene().getWindow();
        stage.close();
    }

}
