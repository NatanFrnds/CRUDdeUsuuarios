package com.nef.cruddeusuuarios;

import com.nef.cruddeusuuarios.controller.UserController;
import com.nef.cruddeusuuarios.model.Usuario;

import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
UserController uc = new UserController();
uc.cadastrarUsuario(new Usuario("Jose","Fernandes",new Date(21/02/2006),40028922,'M',
        "R.Acre",27,"Pai de todos","70707070","707070@GMAIL.COM"));
    uc.listarUsuarios();
    }
    }
