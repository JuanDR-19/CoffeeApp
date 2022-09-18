package com.example.Controladores;


import com.example.Modelo.Archivos;
import com.example.Modelo.Usuario;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class RegistrarCotroller {

    @FXML
    private Button botonFinR;

    @FXML
    private TextField usuarioTextR;

    @FXML
    private ImageView imagenregistro;

    @FXML
    private ImageView imagenregistro2;

    @FXML
    private TextField passTextR;

    @FXML
    private Button volver;

    List<Usuario> usuarios = new ArrayList<Usuario>();


    @FXML
    void finalizarRegistro(ActionEvent event) {

        Usuario usuario = new Usuario();
        usuario.setUserName(usuarioTextR.getText());
        usuario.setPassword(passTextR.getText());
        if(!usuarios.stream().anyMatch(p -> p.getUserName().equalsIgnoreCase(usuario.getUserName()))){
            usuarios.add(usuario);
            usuarioTextR.setText("");
            passTextR.setText("");
            Archivos.guardarListaUArchivos(usuarios);
        }else{
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("El usuario ya existe");
            alert.show();
        }

    }

    @FXML
    void volverinicio(ActionEvent event) {
        Stage volverInicioS =  (Stage) volver.getScene().getWindow();
        volverInicioS.close();
    }

}
