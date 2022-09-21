package com.example.Controladores;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class CoffeeListController {

    @FXML
    private Button AnadirBoton;

    @FXML
    private ListView<?> ListaCafes;

    @FXML
    private Button botonVolver;

    @FXML
    private ImageView cafe1;

    @FXML
    private ImageView cafe2;

    @FXML
    void AnadirCafe(ActionEvent event) {

    }

    @FXML
    void regresarInicio(ActionEvent event) {
        Stage volverInicioS =  (Stage) botonVolver.getScene().getWindow();
        volverInicioS.close();
    }

}
