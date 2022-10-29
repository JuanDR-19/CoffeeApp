package com.example.Controladores;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class InicioConsumidorController {

    @FXML
    private Button CerrarSesion;

    @FXML
    private ImageView ImagenCafe;

    @FXML
    private TableView<?> RecetasTable;

    @FXML
    void CerrarSesion(ActionEvent event) {
        Stage CerrarSesionx =  (Stage) CerrarSesion.getScene().getWindow();
        CerrarSesionx.close();
    }

}
