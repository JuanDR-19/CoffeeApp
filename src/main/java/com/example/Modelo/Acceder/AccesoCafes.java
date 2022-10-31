package com.example.Modelo.Acceder;

import com.example.Interfaces.AccederCafes;
import com.example.Modelo.Object.Cafes;

import java.util.ArrayList;
import java.util.List;

public class AccesoCafes implements AccederCafes {

    List<Cafes> cafesList = new ArrayList<>();

    public  List<Cafes> getCafesList() {
        return cafesList;
    }

    public void setCafesList(List<Cafes> cafesList) {
        this.cafesList = cafesList;
    }
}
