package com.example.Modelo.Crear;

import com.example.Interfaces.CrearCafes;
import com.example.Modelo.Object.Archivos;
import com.example.Modelo.Object.Cafes;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Objects;

public class CrearCafe implements CrearCafes{

   public void AnadirCafe(ActionEvent event, TextField nameField, TextField PrecioField, TextField MarcaField, TextField SaborField, TextField CuerpoField, TextField AromaField, List<Cafes> cafesList) throws FileNotFoundException {
        Cafes cafes = new Cafes();
        if(!Objects.equals(nameField.getText(), "") && !Objects.equals(PrecioField.getText(), "") &&
                !Objects.equals(MarcaField.getText(), "") && !Objects.equals(SaborField.getText(),"") &&
                !Objects.equals(CuerpoField.getText(),"") && !Objects.equals(AromaField.getText(),"")){

            Archivos.llenarListaCafes(cafesList);
            cafes.setMarca(MarcaField.getText());
            cafes.setName(nameField.getText());
            cafes.setPrecio(PrecioField.getText());

            cafes.setSabores(SaborField.getText());
            cafes.setCuerpo(CuerpoField.getText());
            cafes.setAromas(AromaField.getText());
            //Archivos.llenarListaUsuario(cafesList);

            if(cafesList.stream().noneMatch(p -> p.getName().equalsIgnoreCase(cafes.getName()))){
                cafesList.add(cafes);
                MarcaField.setText("");
                nameField.setText("");
                PrecioField.setText("");
                SaborField.setText("");
                CuerpoField.setText("");
                AromaField.setText("");
                Archivos.guardarListaCArchivos(cafesList);
            }else{
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Fallo al crear un cafe");
                alert.setHeaderText("No se pudo crear el cafe");
                alert.setContentText("el cafe que intenta registrar ya se encuentra dentro del sistema");
                alert.setResizable(true);
                alert.showAndWait();
            }
        }else{
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Fallo al crear un cafe");
            alert.setHeaderText("No se pudo crear el cafe");
            alert.setContentText("Por favor ingrese todos los campos");
            alert.setResizable(true);
            alert.showAndWait();
        }

    }
}
