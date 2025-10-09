package com.nef.crud_usuarios_java.controller;

import com.nef.crud_usuarios_java.Service.UsuarioService;
import com.nef.crud_usuarios_java.model.Usuario;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.Label;

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
    private Label statusLable;

    @FXML
    private Button syncButton;

    private UsuarioService usuarioService;
    private ObservableList<Usuario> obsUsuario;

    public void initialize() {
    }

    public void atualizarStatusConexao() {
    }

    @FXML
    public void handleSincronizar() {
    }

    public void carregarDadosTable() {
    }

    public void adicionarBotoesDeAcao() {
    }

    @FXML
    public void handleAdicionarUsuario() {
    }

    public void abrirFormularioUsuario() {
    }

}
