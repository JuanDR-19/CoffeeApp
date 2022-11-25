package com.example.Modelo.Object;

import com.example.Modelo.Object.Cafes;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestCafes {

    @Test
    public void TestGuardarCafe(){
        Cafes a = new Cafes();
        a.setName("Messi");
        assertEquals("Messi", a.getName());

        a.setAromas("aaa");
        assertEquals("aaa", a.getAromas());

        a.setCuerpo("bbb");
        assertEquals("bbb", a.getCuerpo());

        a.setMarca("ppp");
        assertEquals("ppp", a.getMarca());

        a.setPrecio("123");
        assertEquals("123", a.getPrecio());

        a.setSabores("mmm");
        assertEquals("mmm", a.getSabores());


    }

}
