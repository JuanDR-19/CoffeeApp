package com.example.Modelo.Crear;

import com.example.Interfaces.AccederCafes;
import com.example.Interfaces.CrearCafes;
import com.example.Modelo.Acceder.AccesoCafes;
import com.example.Modelo.Object.Archivos;
import com.example.Modelo.Object.Cafes;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import java.io.FileNotFoundException;
import java.util.Objects;

public class CrearCafe implements CrearCafes{

   public void AnadirCafe(ActionEvent event, TextField nameField, TextField PrecioField, TextField MarcaField, TextField SaborField, TextField CuerpoField, TextField AromaField) throws FileNotFoundException {
       Cafes cafes = new Cafes();
       AccederCafes b = new AccesoCafes();

       if(!Objects.equals(nameField.getText(), "") && !Objects.equals(PrecioField.getText(), "") &&
                !Objects.equals(MarcaField.getText(), "") && !Objects.equals(SaborField.getText(),"") &&
                !Objects.equals(CuerpoField.getText(),"") && !Objects.equals(AromaField.getText(),"")){


            Archivos.llenarListaCafes(b.getCafesList());
            cafes.setMarca(MarcaField.getText());
            cafes.setName(nameField.getText());
            cafes.setPrecio(PrecioField.getText());

            cafes.setSabores(SaborField.getText());
            cafes.setCuerpo(CuerpoField.getText());
            cafes.setAromas(AromaField.getText());

            if(b.getCafesList().stream().noneMatch(p -> p.getName().equalsIgnoreCase(cafes.getName()))){
                b.getCafesList().add(cafes);
                MarcaField.setText("");
                nameField.setText("");
                PrecioField.setText("");
                SaborField.setText("");
                CuerpoField.setText("");
                AromaField.setText("");
                Archivos.guardarListaCArchivos(b.getCafesList());
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
