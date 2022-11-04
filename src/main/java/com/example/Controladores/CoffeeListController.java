package com.example.Controladores;

import com.example.Interfaces.AccederCafes;
import com.example.Modelo.Acceder.AccesoCafes;
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

    //List<Cafes> cafesList = new ArrayList<Cafes>();

    @FXML
    void AnadirCafe() {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("AnadirCafes.fxml"));
        try {
            Parent root = loader.load();
            Scene sceneReg = new Scene(root);
            Stage stageReg = new Stage();
            stageReg.initModality(Modality.APPLICATION_MODAL);
            stageReg.setScene(sceneReg);
            stageReg.setResizable(false);
            stageReg.showAndWait();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void regresarInicio() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("CoffeeApp.fxml"));
        try {
            Parent root = loader.load();
            Scene sceneReg = new Scene(root);
            Stage stageReg = new Stage();
            stageReg.setScene(sceneReg);
            stageReg.setResizable(false);
            stageReg.show();
            Stage myStage = (Stage) this.botonVolver.getScene().getWindow();
            myStage.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
