package com.mycompany.daosistema;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    // URL ajustada para o banco DAO_atvd
    private static final String URL = "jdbc:sqlserver://localhost\\SQLEXPRESS;databaseName=DAO_atvd;encrypt=true;trustServerCertificate=true;";
    private static final String USER = "sa";
    private static final String SENHA = "1234";

    public static Connection conectar() {
        try {
            return DriverManager.getConnection(URL, USER, SENHA);
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao conectar ao banco!", e);
        }
    }
}