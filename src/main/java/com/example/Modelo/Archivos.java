package com.example.Modelo;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

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


    public static void llenarListaUsuario(List<Usuario> usuarios) throws FileNotFoundException {
        Path path = Paths.get("Usuarios.txt");
        File doc = new File(String.valueOf(path));
        BufferedReader obj = new BufferedReader(new FileReader(doc));
        String strng;

        try  {
            while ((strng = obj.readLine()) != null){
                StringTokenizer token= new StringTokenizer(strng,";");
                while(token.hasMoreTokens()){
                    String user= token.nextToken();
                    String pass= token.nextToken();
                    Usuario nuevouser= new Usuario(user,pass);
                    if(usuarios.stream().noneMatch(p -> p.getUserName().equalsIgnoreCase(nuevouser.getUserName())))
                        usuarios.add(nuevouser);
                }
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
