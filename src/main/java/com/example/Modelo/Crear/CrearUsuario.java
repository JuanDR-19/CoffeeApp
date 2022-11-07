package com.example.Modelo.Crear;

import com.example.Interfaces.AccederUsuarios;
import com.example.Interfaces.CrearUsuarios;
import com.example.Modelo.Acceder.AccesoUsuarios;
import com.example.Modelo.Object.Archivos;
import com.example.Modelo.Object.UsuarioBarista;
import com.example.Modelo.Object.UsuarioConsumidor;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import java.util.Objects;

public class CrearUsuario implements CrearUsuarios {


    public void finalizarRegistro(ActionEvent event, PasswordField passTextR, TextField usuarioTextR, CheckBox BaristaButton)  {
        String pass= passTextR.getText();
        String usr= usuarioTextR.getText();
        boolean barista;
        barista = BaristaButton.isSelected(); // verificar si es o no barista
        AccederUsuarios b = new AccesoUsuarios();
        if(!Objects.equals(usr, "") && !Objects.equals(pass, "")){
            Archivos.llenarListaUsuario(b.getUsuarioFactoryList());
            if(barista) {
                UsuarioBarista nuevoBarista= new UsuarioBarista(usr,pass);
                if(b.getUsuarioFactoryList().stream().noneMatch(p -> p.getUserName().equalsIgnoreCase(nuevoBarista.getUserName()))){
                    b.getUsuarioFactoryList().add(nuevoBarista);
                    usuarioTextR.setText("");
                    passTextR.setText("");
                    Archivos.guardarListaUArchivos(b.getUsuarioFactoryList());
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
                if(b.getUsuarioFactoryList().stream().noneMatch(p -> p.getUserName().equalsIgnoreCase(nuevoConsumidor.getUserName()))){
                    b.getUsuarioFactoryList().add(nuevoConsumidor);
                    usuarioTextR.setText("");
                    passTextR.setText("");
                    Archivos.guardarListaUArchivos(b.getUsuarioFactoryList());
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
