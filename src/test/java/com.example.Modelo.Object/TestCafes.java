package com.example.Preubas;

import com.example.Modelo.Object.Cafes;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestCafes {

    @Test
    public void TestGuardarCafe(){
        Cafes a = new Cafes();
        a.setName("Messi");
        assertEquals("Messi", a.getName());
    }

}
