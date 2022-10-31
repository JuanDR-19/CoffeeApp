package com.example.Modelo.Object;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.StringTokenizer;

public class Archivos {

    public static void guardarListaUArchivos(List<UsuarioFactory> usuarioFactories){
        Path path = Paths.get("Usuarios.txt");
        try (BufferedWriter writer = Files.newBufferedWriter(path)) {
            for (UsuarioFactory item: usuarioFactories) {
                    writer.write(item.getUserName()+";"+item.getPassword());
                    writer.write("\n");
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }


    public static void llenarListaUsuario(List<UsuarioFactory> usuarioFactories) throws FileNotFoundException {
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
                    UsuarioFactory nuevouser= new UsuarioFactory(user,pass);
                    if(usuarioFactories.stream().noneMatch(p -> p.getUserName().equalsIgnoreCase(nuevouser.getUserName())))
                        usuarioFactories.add(nuevouser);
                }
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void guardarListaCArchivos(List<Cafes> cafesList) {

        Path path = Paths.get("Cafes.txt");
        try (BufferedWriter writer = Files.newBufferedWriter(path)) {
            for (Cafes item:cafesList) {
                writer.write(item.getName()+";"+item.getPrecio()+";"+item.getMarca());
                writer.write("\n");
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
