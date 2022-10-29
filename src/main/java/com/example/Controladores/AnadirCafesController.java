package com.example.Controladores;
import com.example.Modelo.Archivos;
import com.example.Modelo.Cafes;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

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

    List <Cafes> cafesList = new ArrayList<>();
    @FXML
    void AnadirCafe(ActionEvent event) {
        Cafes cafes = new Cafes();
        if(!Objects.equals(nameField.getText(), "") && !Objects.equals(PrecioField.getText(), "") &&
                !Objects.equals(MarcaField.getText(), "") && !Objects.equals(SaborField.getText(),"") &&
                   !Objects.equals(CuerpoField.getText(),"") && !Objects.equals(AromaField.getText(),"")){

            cafes.setMarca(MarcaField.getText());
            cafes.setName(nameField.getText());
            cafes.setPrecio(PrecioField.getText());

            cafes.setSabores(SaborField.getText());
            cafes.setCuerpo(CuerpoField.getText());
            cafes.setAromas(AromaField.getText());
            //Archivos.llenarListaUsuario(cafesList);

            if(cafesList.stream().noneMatch(p -> p.getName().equalsIgnoreCase(cafes.getName()))){
                cafesList.add(cafes);
                MarcaField.setText("");
                nameField.setText("");
                PrecioField.setText("");
                SaborField.setText("");
                CuerpoField.setText("");
                AromaField.setText("");
                Archivos.guardarListaCArchivos(cafesList);
            }else{
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Fallo al crear un cafe");
                alert.setHeaderText("No se pudo crear el cafe");
                alert.setContentText("el cafe que intenta registrar ya se encuentra dentro del sistema");
                alert.setResizable(true);
                alert.showAndWait();
            }
        }else{
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Fallo al crear un cafe");
            alert.setHeaderText("No se pudo crear el cafe");
            alert.setContentText("Por favor ingrese todos los campos");
            alert.setResizable(true);
            alert.showAndWait();
        }

    }
}
