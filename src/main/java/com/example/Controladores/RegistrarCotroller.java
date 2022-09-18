package com.example.Controladores;


import com.example.Modelo.Archivos;
import com.example.Modelo.Usuario;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class RegistrarCotroller{

    @FXML
    private Button botonFinR;

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

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    List<Usuario> usuarios = new ArrayList<Usuario>();


    @FXML
    void finalizarRegistro(ActionEvent event) throws FileNotFoundException {

        Usuario usuario = new Usuario();
        usuario.setUserName(usuarioTextR.getText());
        usuario.setPassword(passTextR.getText());
        Archivos.llenarListaUsuario(usuarios);
        if(usuarios.stream().noneMatch(p -> p.getUserName().equalsIgnoreCase(usuario.getUserName()))){
            usuarios.add(usuario);
            usuarioTextR.setText("");
            passTextR.setText("");
            Archivos.guardarListaUArchivos(usuarios);
        }else{
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Fallo al crear un usuario");
            alert.setHeaderText("No se pudo crear el usuario");
            alert.setContentText("el usuario que intenta registrar ya se encuentra dentro del sistema");
            alert.setResizable(true);
            alert.showAndWait();
        }

    }

    @FXML
    void volverinicio(ActionEvent event) {
        Stage volverInicioS =  (Stage) volver.getScene().getWindow();
        volverInicioS.close();
    }

}
