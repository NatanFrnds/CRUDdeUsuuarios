package com.nef.crud_usuarios_java.Service;

import io.github.cdimascio.dotenv.Dotenv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLDataException;
import java.sql.SQLException;

public class DatabaseService {
    private static final Dotenv dotenv = Dotenv.load();
    private static final String URL = dotenv.get("DB_URL");
    private static final String USER = dotenv.get("DB_USER");
    private static final String PASSWORD = dotenv.get("DB_PASSWORD");

    public static Connection getConecction() throws SQLException {
        if (URL == null || USER == null || PASSWORD == null) {
            throw new SQLException("Credeniais não foram encontradas no .env");
        }
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static boolean testarConexao() {
        try (Connection conn = getConecction()) {
            return conn != null;
        } catch (SQLException e) {
            return false;
        }
    }
}
