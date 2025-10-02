package com.nef.cruddeusuuarios.model;

import java.util.Date;

public class Usuario extends Pessoa {
    private String Login;
    private String Password;
    private String email;

    public Usuario() {
        super();
        this.Login = "";
        this.Password = "";
        this.email = "";
    }

    public Usuario(String nome,String sobrenome,Date dataNasc,int telefone,char sexo,String endereco,int idade,String login, String password, String email) {
        super(nome,sobrenome,dataNasc,telefone,sexo,endereco,idade);
        this.Login = login;
        this.Password = password;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        this.Password = password;
    }

    public boolean passwordIsEquals(String password) {
        return password.equals(this.Password);
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String login) {
        this.Login = login;
    }
}