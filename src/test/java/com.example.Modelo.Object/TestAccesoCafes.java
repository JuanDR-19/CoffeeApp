package com.example.Modelo.Object;

import com.example.Interfaces.AccederCafes;
import com.example.Modelo.Acceder.AccesoCafes;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TestAccesoCafes {

    @Test
    public void testAccesoC(){

        List<Cafes> cafesList = new ArrayList<>();
        Cafes cafe = new Cafes();
        cafe.setName("aaa");
        AccederCafes a = new AccesoCafes();
        cafesList.add(cafe);
        a.setCafesList(cafesList);
        assertEquals("aaa", a.getCafesList().get(0).getName());

    }



}
