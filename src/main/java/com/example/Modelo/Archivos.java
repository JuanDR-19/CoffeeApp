package com.example.Modelo;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Archivos {

    public static void guardarListaUArchivos(List<Usuario> usuarios){
        Path path = Paths.get("Usuarios.txt");
        try (BufferedWriter writer = Files.newBufferedWriter(path)) {
            for (Usuario item:usuarios) {

                    writer.write(item.getUserName()+";"+item.getPassword());
                    writer.write("\n");

            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }



}
