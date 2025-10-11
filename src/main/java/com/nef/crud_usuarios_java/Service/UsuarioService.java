package com.nef.crud_usuarios_java.Service;

import com.nef.crud_usuarios_java.model.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsuarioService {

    public static final List<Usuario> usuarios = new ArrayList<>();
    public static boolean dbloaded = false;


    public boolean isDbloaded(){
        return dbloaded;
    }
    public UsuarioService() {
        if (!dbloaded) {
            carregarUsuarioDoBanco();
            dbloaded = true;
        }
    }

    public void carregarUsuarioDoBanco() {
        usuarios.clear();
        String sql = "SELECT*FROM usuarios";
        if (!DatabaseService.testarConexao()) {
            System.out.println("Conexão: offline");
        } else {
            try (Connection conn = DatabaseService.getConecction();
                 PreparedStatement stmt = conn.prepareStatement(sql);
                 ResultSet rs = stmt.executeQuery();) {
                while (rs.next()) {
                    Usuario usuario = new Usuario();
                    usuario.setId(rs.getInt("id"));
                    usuario.setNome(rs.getString("nome"));
                    usuario.setSobrenome(rs.getString("sobrenome"));
                    usuario.setEmail(rs.getString("email"));
                    usuario.setLogin(rs.getString("login"));
                    usuario.setDataNascimento(rs.getDate("dataNascimento"));
                    usuario.setTelefone(rs.getString("telefone"));
                    usuario.setSexo(rs.getString("sexo") != null ? rs.getString("sexo").charAt(0) : ' ');
                    usuario.setEndereco(rs.getString("endereço"));
                    usuarios.add(usuario);

                }
            } catch (SQLException e) {
            }
        }
    }

    public List<Usuario> listarUsuarios() {
        return usuarios;
    }
}