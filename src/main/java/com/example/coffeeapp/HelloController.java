package com.example.coffeeapp;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {

    @FXML
    private Button inicioSesion;

    @FXML
    private PasswordField password;

    @FXML
    private Button registro;

    @FXML
    private TextField user;

    @FXML
    void iniciarsesion(ActionEvent event) {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("CoffeeApp.fxml"));
        try {
            Parent root = loader.load();
            registrarCotroller cont = loader.getController();
            Scene sceneReg = new Scene(root);
            Stage stageReg = new Stage();
            stageReg.initModality(Modality.APPLICATION_MODAL);
            stageReg.setScene(sceneReg);
            stageReg.showAndWait();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void registrarse(ActionEvent event) {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Registrar.fxml"));
        try {
            Parent root = loader.load();
            registrarCotroller cont = loader.getController();
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
