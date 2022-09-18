package com.example.Controladores;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.image.ImageView;

public class CoffeeAppController {

    @FXML
    private Button botonrecetas;

    @FXML
    private ImageView inicio1;

    @FXML
    private ListView<?> listaPreparaciones;

    @FXML
    private Button metodos;

    @FXML
    private ImageView metodosimg;

    @FXML
    private ImageView recetasimg;

    @FXML
    void accesoMetodos(ActionEvent event) {
        //crear el ingreso a las opciones de los metodos
    }

    @FXML
    void ingresoRecetas(ActionEvent event) {
        //crear el ingreso a las opciones de las recetas
    }

}
