package app.models.repository;

import app.models.dtos.PostUsuarioPessoaJuridica;
import app.models.entities.UsuarioPessoaJuridica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static app.Main.*;
import static java.sql.DriverManager.getConnection;

public class UsuarioPessoaJuridicaRepository {

    public UsuarioPessoaJuridica selectUsuarioPessoaJuridica(String cnpj) throws SQLException {
        String selectString = "SELECT * FROM USUARIO_PESSOA_JURIDICA WHERE UPJ_DOC_CLI = ?";
        ResultSet resultSet;
        UsuarioPessoaJuridica usuarioPessoaJuridica = null;
        try (Connection con = getConnection(ORACLE_URL, ORACLE_USER, ORACLE_USER_PASSWORD);
             PreparedStatement updateStatement = con.prepareStatement(selectString)) {
            updateStatement.setString(1, cnpj);
            resultSet = updateStatement.executeQuery();
            if(resultSet.next()) {
                usuarioPessoaJuridica = new UsuarioPessoaJuridica(
                        resultSet.getString(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getString(4),
                        resultSet.getString(5),
                        resultSet.getString(6)
                );
            }
        }
        return usuarioPessoaJuridica;
    }

    public void insertUsuarioPessoaJuridica(PostUsuarioPessoaJuridica novoCadastro) throws SQLException {
        String insertString = "INSERT INTO USUARIO_PESSOA_FISICA (UPJ_DOC_CLI, UPJ_EMAIL, UPJ_CELULAR," +
                " UPJ_NOM_CIDADE, UPJ_DES_ESTADO, UPJ_PJ_SENHA) VALUES(?,?,?,?,?,?)";
        try (Connection con = getConnection(ORACLE_URL, ORACLE_USER, ORACLE_USER_PASSWORD);
             PreparedStatement insertStatement = con.prepareStatement(insertString)) {
            insertStatement.setString(1, novoCadastro.getCnpj());
            insertStatement.setString(2, novoCadastro.getEmail());
            insertStatement.setString(3, novoCadastro.getCelular());
            insertStatement.setString(4, novoCadastro.getCidade());
            insertStatement.setString(5, novoCadastro.getEstado());
            insertStatement.setString(6, novoCadastro.getSenha());
            insertStatement.executeUpdate();
        }
    }
}
