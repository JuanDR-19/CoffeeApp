package com.example.Controladores;

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

public class CoffeeAppController {

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
        Stage CerrarSesionx =  (Stage) cerrarSesion.getScene().getWindow();
        CerrarSesionx.close();
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
            stageReg.initModality(Modality.APPLICATION_MODAL);
            stageReg.setScene(sceneReg);
            stageReg.showAndWait();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
