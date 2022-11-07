package com.example.Controladores;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

public class InicioBaristaController {

    @FXML
    private Button botonrecetas;

    @FXML
    private ImageView inicio1;

    @FXML
    private Button cerrarSesion;

    @FXML
    private ListView<?> listaPreparaciones;

    @FXML
    private Button metodos;

    @FXML
    private ImageView metodosimg;

    @FXML
    private ImageView recetasimg;

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
            Stage myStage = (Stage) this.cerrarSesion.getScene().getWindow();
            myStage.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    @FXML
    void accesoMetodos(ActionEvent event) {
        //crear el ingreso a las opciones de los metodos
    }

    @FXML
    void ingresoRecetas(ActionEvent event) {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("Cafes.fxml"));
        try {
            Parent root = loader.load();
            Scene sceneReg = new Scene(root);
            Stage stageReg = new Stage();
            stageReg.setScene(sceneReg);
            stageReg.setResizable(false);
            stageReg.show();
            Stage myStage = (Stage) this.botonrecetas.getScene().getWindow();
            myStage.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
