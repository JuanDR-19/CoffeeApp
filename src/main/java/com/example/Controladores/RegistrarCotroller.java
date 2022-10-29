package com.example.Controladores;


import com.example.Modelo.Archivos;
import com.example.Modelo.UsuarioBarista;
import com.example.Modelo.UsuarioConsumidor;
import com.example.Modelo.UsuarioFactory;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class RegistrarCotroller{

    private boolean barista=false;

    @FXML
    private CheckBox BaristaButton;

    @FXML
    private Button botonFinR;

    @FXML
    private CheckBox consumidorButton;

    @FXML
    private TextField usuarioTextR;

    @FXML
    private ImageView imagenregistro;

    @FXML
    private ImageView imagenregistro2;

    @FXML
    private PasswordField passTextR;

    @FXML
    private Button volver;

    @FXML
    void crearUsuarioBarista(ActionEvent event) {
        this.barista=true;
    }

    @FXML
    void crearUsuarioConsumidor(ActionEvent event) {
        this.barista=false;
    }

    public List<UsuarioFactory> getUsuarios() {
        return usuarioFactories;
    }

    List<UsuarioFactory> usuarioFactories = new ArrayList<UsuarioFactory>();


    @FXML
    public void finalizarRegistro(ActionEvent event) throws FileNotFoundException {
        String pass= passTextR.getText();
        String usr= usuarioTextR.getText();

        if(!Objects.equals(usr, "") && !Objects.equals(pass, "")){

            Archivos.llenarListaUsuario(usuarioFactories);
            if(this.barista) {
                UsuarioBarista nuevoBarista= new UsuarioBarista(usr,pass);
                if(usuarioFactories.stream().noneMatch(p -> p.getUserName().equalsIgnoreCase(nuevoBarista.getUserName()))){
                    usuarioFactories.add(nuevoBarista);
                    usuarioTextR.setText("");
                    passTextR.setText("");
                    Archivos.guardarListaUArchivos(usuarioFactories);
                }else{
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Fallo al crear un usuario");
                    alert.setHeaderText("No se pudo crear el usuario");
                    alert.setContentText("el usuario que intenta registrar ya se encuentra dentro del sistema");
                    alert.setResizable(true);
                    alert.showAndWait();
                }
            }else{
                UsuarioConsumidor nuevoConsumidor= new UsuarioConsumidor(usr,pass);
                if(usuarioFactories.stream().noneMatch(p -> p.getUserName().equalsIgnoreCase(nuevoConsumidor.getUserName()))){
                    usuarioFactories.add(nuevoConsumidor);
                    usuarioTextR.setText("");
                    passTextR.setText("");
                    Archivos.guardarListaUArchivos(usuarioFactories);
                }else{
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Fallo al crear un usuario");
                    alert.setHeaderText("No se pudo crear el usuario");
                    alert.setContentText("el usuario que intenta registrar ya se encuentra dentro del sistema");
                    alert.setResizable(true);
                    alert.showAndWait();
                }
            }
        }else{
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Fallo al crear un usuario");
            alert.setHeaderText("No se pudo crear el usuario");
            alert.setContentText("No ingresó contraseña o usuario");
            alert.setResizable(true);
            alert.showAndWait();
        }

    }

    @FXML
    public void volverinicio(ActionEvent event) {
        Stage volverInicioS =  (Stage) volver.getScene().getWindow();
        volverInicioS.close();
    }

}
