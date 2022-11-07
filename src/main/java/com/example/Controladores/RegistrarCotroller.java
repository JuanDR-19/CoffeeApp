package com.example.Controladores;
import com.example.Interfaces.CrearUsuarios;
import com.example.Modelo.Crear.CrearUsuario;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import java.io.FileNotFoundException;
import java.io.IOException;

public class RegistrarCotroller {

    private final boolean barista=false;

    @FXML
    private CheckBox BaristaButton;

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


    public void registros(ActionEvent event, PasswordField passTextR, TextField usuarioTextR, CheckBox BaristaButton ) throws FileNotFoundException {
        CrearUsuarios a = new CrearUsuario();
        a.finalizarRegistro( event,  passTextR,  usuarioTextR , BaristaButton );
    }
    @FXML
    public void registro(ActionEvent event) throws FileNotFoundException {
        registros(event, passTextR, usuarioTextR, BaristaButton);
    }

    @FXML
    public void volverinicio(ActionEvent event) {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
        try {
            Parent root = loader.load();
            Scene sceneReg = new Scene(root);
            Stage stageReg = new Stage();
            stageReg.setScene(sceneReg);
            stageReg.setResizable(false);
            stageReg.show();
            Stage myStage = (Stage) this.volver.getScene().getWindow();
            myStage.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
