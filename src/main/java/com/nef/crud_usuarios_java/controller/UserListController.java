package com.nef.crud_usuarios_java.controller;

import com.nef.crud_usuarios_java.Service.UsuarioService;
import com.nef.crud_usuarios_java.model.Usuario;
import javafx.beans.Observable;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class UserListController {
@FXML
    private TableView<Usuario> tableView;

@FXML
    private TableColumn<Usuario, String> colName;

    @FXML
    private TableColumn<Usuario, String> colSobrenome;

    @FXML
    private TableColumn<Usuario, String> colEmail;

    @FXML
    private TableColumn<Usuario, String> colTelefone;

    @FXML
    private TableColumn<Usuario, String> colLogin;

    @FXML
    private TableColumn<Usuario, String> colAcoes;

    @FXML
    private Lable statusLable;

    @FXML
    private Button syncButton;

    private UsuarioService usuarioService;
    private ObservableList<Usuario>obsUsuario;



}
