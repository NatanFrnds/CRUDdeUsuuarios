package com.nef.crud_usuarios_java.controller;

import com.nef.crud_usuarios_java.Service.UsuarioService;
import com.nef.crud_usuarios_java.model.Usuario;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.Label;
import javafx.scene.control.cell.PropertyValueFactory;

public class UserListController {
    @FXML
    private TableView<Usuario> tableView;

    @FXML
    private TableColumn<Usuario, String> colNome;

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

        usuarioService = new UsuarioService();
        carregarDadosTable();
    }

    public void atualizarStatusConexao() {


    }

    @FXML
    public void handleSincronizar() {
    }

    public void carregarDadosTable() {
        if (usuarioService.isDbloaded()) {
            colNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
            colSobrenome.setCellValueFactory(new PropertyValueFactory<>("sobrenome"));
            colEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
            colTelefone.setCellValueFactory(new PropertyValueFactory<>("telefone"));
            colLogin.setCellValueFactory(new PropertyValueFactory<>("login"));
            obsUsuario = FXCollections.observableArrayList(usuarioService.listarUsuarios());
            tableView.setItems(obsUsuario);
        }else{
            System.out.println("Dados não foram carregados.");
        }
        }

    public void adicionarBotoesDeAcao() {
    }

    @FXML
    public void handleAdicionarUsuario() {
    }

    public void abrirFormularioUsuario() {
    }

}
