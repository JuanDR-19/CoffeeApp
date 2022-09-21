package com.example.Controladores;
import com.example.Modelo.cafes;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

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

    @FXML
    void AnadirCafe(ActionEvent event) {
        String nombre= nameField.getText();
        String marca= MarcaField.getText();
        String precio= PrecioField.getText();
        cafes nuevo= new cafes(nombre,marca,precio);
    }

}
