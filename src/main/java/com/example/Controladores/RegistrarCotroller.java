package com.example.Controladores;


import com.example.Interfaces.CrearUsuarios;
import com.example.Modelo.Crear.CrearUsuario;
import com.example.Modelo.Object.UsuarioFactory;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class RegistrarCotroller {

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

    public void registros(ActionEvent event, PasswordField passTextR, TextField usuarioTextR, List<UsuarioFactory>  usuarioFactories , boolean barista) throws FileNotFoundException {
        CrearUsuarios a = new CrearUsuario();
        a.finalizarRegistro( event,  passTextR,  usuarioTextR,  usuarioFactories ,  barista);
    }
    @FXML
    public void registro(ActionEvent event) throws FileNotFoundException {
        registros(event, passTextR, usuarioTextR, usuarioFactories, barista);
    }

    @FXML
    public void volverinicio(ActionEvent event) {
        Stage volverInicioS =  (Stage) volver.getScene().getWindow();
        volverInicioS.close();
    }


}
