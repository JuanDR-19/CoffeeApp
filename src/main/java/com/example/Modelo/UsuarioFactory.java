package com.example.Modelo;

public class UsuarioFactory {

    private String userName;
    private String password;

    public UsuarioFactory(String user, String pass){
        this.userName=user;
        this.password=pass;
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
}
