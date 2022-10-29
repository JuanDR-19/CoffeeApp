package com.example.Modelo;

public class UsuarioFactory {

    private String userName;
    private String password;
    private char tipo;

    public UsuarioFactory(String user, String pass){
        this.userName=user;
        this.password=pass;
    }

    public UsuarioFactory(String userName, String password, char tipo) {
        this.userName = userName;
        this.password = password;
        this.tipo = tipo;
    }

    public UsuarioFactory(){

    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }
}
