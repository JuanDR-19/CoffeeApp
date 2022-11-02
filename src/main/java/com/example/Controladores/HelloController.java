package com.example.Controladores;

import com.example.Interfaces.AccederCafes;
import com.example.Interfaces.AccederUsuarios;
import com.example.Modelo.Acceder.AccesoCafes;
import com.example.Modelo.Acceder.AccesoUsuarios;
import com.example.Modelo.Object.Archivos;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Objects;

public class HelloController {

    @FXML
    private PasswordField password;

    @FXML
    private TextField user;


    private final AccederUsuarios asuarios = new AccesoUsuarios();


    public HelloController() throws FileNotFoundException {
        AccederCafes bcafes = new AccesoCafes();
        Archivos.llenarListaCafes(bcafes.getCafesList());
    }


    @FXML
    void iniciarsesion() {
        Archivos.llenarListaUsuario(asuarios.getUsuarioFactoryList());
        if(!Objects.equals(user.getText(), "") && !Objects.equals(password.getText(), "")){
            if(asuarios.getUsuarioFactoryList().stream().anyMatch(p -> p.getUserName().equalsIgnoreCase(user.getText()
            )&& p.getPassword().equalsIgnoreCase(password.getText()))){
                FXMLLoader loader = new FXMLLoader(getClass().getResource("CoffeeApp.fxml"));
                try {
                    Parent root = loader.load();
                    Scene sceneReg = new Scene(root);
                    Stage stageReg = new Stage();
                    stageReg.initModality(Modality.APPLICATION_MODAL);
                    stageReg.setScene(sceneReg);
                    stageReg.show();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }else{
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Fallo al iniciar sesion");
                alert.setHeaderText("No se pudo iniciar sesion");
                alert.setContentText("Usuario o contraseña incorrecto");
                alert.setResizable(true);
                alert.showAndWait();
            }
        }else{
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Fallo al iniciar sesion");
            alert.setHeaderText("No se pudo iniciar sesion");
            alert.setContentText("No ingresó usuario o contraseña");
            alert.setResizable(true);
            alert.showAndWait();
        }
    }

    @FXML
    void registrarse() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Registrar.fxml"));
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
