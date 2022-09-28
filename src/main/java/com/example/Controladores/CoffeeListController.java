package com.example.Controladores;

import com.example.Modelo.Cafes;
import com.example.Modelo.Usuario;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.image.ImageView;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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

    List<Cafes> cafesList = new ArrayList<Cafes>();

    @FXML
    void AnadirCafe(ActionEvent event) {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("AnadirCafes.fxml"));
        try {
            Parent root = loader.load();
            AnadirCafesController cont = loader.getController();
            Scene sceneReg = new Scene(root);
            Stage stageReg = new Stage();
            cafesList = cont.cafesList;
            stageReg.initModality(Modality.APPLICATION_MODAL);
            stageReg.setScene(sceneReg);
            stageReg.showAndWait();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void regresarInicio(ActionEvent event) {
        Stage volverInicioS =  (Stage) botonVolver.getScene().getWindow();
        volverInicioS.close();
    }

}
