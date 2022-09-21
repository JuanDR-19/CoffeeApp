package com.example.Modelo;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class cafes {

    private String name;
    private String sabores;
    private String aromas;
    private String cuerpo;
    private String precio;
    private String marca;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSabores() {
        return sabores;
    }

    public void setSabores(String sabores) {
        this.sabores = sabores;
    }

    public String getAromas() {
        return aromas;
    }

    public void setAromas(String aromas) {
        this.aromas = aromas;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public cafes(String name, String sabores, String aromas, String cuerpo, String precio, String marca) {
        this.name = name;
        this.sabores = sabores;
        this.aromas = aromas;
        this.cuerpo = cuerpo;
        this.precio = precio;
        this.marca = marca;
    }

    public cafes(String name, String precio, String marca) {
        this.name = name;
        this.precio = precio;
        this.marca = marca;
    }

    public cafes(String name, String marca) {
        this.name = name;
        this.marca = marca;
    }

    public static void guardarCafe(cafes nuevo){
        Path path = Paths.get("Cafes.txt");
        try (BufferedWriter writer = Files.newBufferedWriter(path)) {
                writer.write(nuevo.getName()+";"+nuevo.getMarca()+";"+nuevo.getPrecio());
                writer.write("\n");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
