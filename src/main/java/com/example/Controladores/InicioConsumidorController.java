package com.example.Controladores;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

public class InicioConsumidorController {

    @FXML
    private Button CerrarSesion;

    @FXML
    private ImageView ImagenCafe;

    @FXML
    private TableView<?> RecetasTable;

    @FXML
    void CerrarSesion(ActionEvent event) {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
        try {
            Parent root = loader.load();
            Scene sceneReg = new Scene(root);
            Stage stageReg = new Stage();
            stageReg.setScene(sceneReg);
            stageReg.setResizable(false);
            stageReg.show();
            Stage myStage = (Stage) this.CerrarSesion.getScene().getWindow();
            myStage.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
