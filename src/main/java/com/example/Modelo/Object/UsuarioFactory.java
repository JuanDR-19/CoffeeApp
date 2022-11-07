package com.example.Modelo.Object;

public class UsuarioFactory {

    private String userName;
    private String password;
    private String tipo;

    public UsuarioFactory(String user, String pass){
        this.userName=user;
        this.password=pass;
    }

    public UsuarioFactory(String userName, String password, String tipo) {
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
