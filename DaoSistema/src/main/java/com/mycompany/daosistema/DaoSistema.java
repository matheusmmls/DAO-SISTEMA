package com.mycompany.daosistema;

import java.sql.Connection;
import java.sql.SQLException;

public class DaoSistema {

    public static void main(String[] args) {
        
        // 1. Chama a tela de Login como a primeira tela do sistema
        TelaDeLogin telaLogin = new TelaDeLogin();
        telaLogin.setVisible(true);
        
        // 2. Apenas para testar se o banco conectou no console
        try (Connection conexao = Conexao.conectar()){
            System.out.println("Conectado ao banco de dados com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao conectar no banco: " + e.getMessage());
        }
    }
}