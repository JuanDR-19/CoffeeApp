package com.example.Interfaces;

import com.example.Modelo.Object.Cafes;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

import java.util.List;

public interface CrearCafes {

    void AnadirCafe(ActionEvent event, TextField nameField, TextField PrecioField, TextField MarcaField, TextField SaborField, TextField CuerpoField, TextField AromaField, List<Cafes> cafesList);


}
