package com.mycompany.daosistema;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO {

    public boolean cadastrar(Usuario usuario) {
        String sql = "INSERT INTO tb_CadastroUsuario (nome, senha) VALUES (?, ?)";
        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getSenha());
            stmt.executeUpdate();
            return true;
            
        } catch (SQLException e) {
            System.err.println("Erro no cadastro: " + e.getMessage());
            return false;
        }
    }

    public boolean autenticar(String nome, String senha) {
        String sql = "SELECT id FROM tb_CadastroUsuario WHERE nome = ? AND senha = ?";
        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setString(1, nome);
            stmt.setString(2, senha);
            ResultSet rs = stmt.executeQuery();
            return rs.next(); // true se achou o usuário
            
        } catch (SQLException e) {
            System.err.println("Erro na autenticação: " + e.getMessage());
            return false;
        }
    }
}