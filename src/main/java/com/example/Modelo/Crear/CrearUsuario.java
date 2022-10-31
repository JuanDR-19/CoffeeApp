package com.example.Modelo.Crear;

import com.example.Interfaces.CrearUsuarios;
import com.example.Modelo.Object.Archivos;
import com.example.Modelo.Object.UsuarioBarista;
import com.example.Modelo.Object.UsuarioConsumidor;
import com.example.Modelo.Object.UsuarioFactory;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Objects;

public class CrearUsuario implements CrearUsuarios {


    public void finalizarRegistro(ActionEvent event, PasswordField passTextR, TextField usuarioTextR, List<UsuarioFactory>  usuarioFactories , boolean barista) throws FileNotFoundException {
        String pass= passTextR.getText();
        String usr= usuarioTextR.getText();

        if(!Objects.equals(usr, "") && !Objects.equals(pass, "")){

            Archivos.llenarListaUsuario(usuarioFactories);
            if(barista) {
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

}
