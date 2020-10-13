package app.models.repository;

import app.models.dtos.PostUsuarioPessoaFisica;
import app.models.dtos.PutUsuarioPessoaFisica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static app.Main.*;
import static java.sql.DriverManager.getConnection;

public class UsuarioPessoaFisicaRepository {

    public void insertUsuarioPessoaFisica(PostUsuarioPessoaFisica novoCadastro) throws SQLException {
        String insertString = "INSERT INTO USUARIO_PESSOA_FISICA (UPF_DOC_CLI, UPF_IDC_SEXO, UPF_ANO_DAT_NASCIMENTO," +
                " UPF_NOM_CIDADE, UPF_DES_ESTADO, UPF_PF_SENHA) VALUES(?,?,?,?,?,?)";
        try (Connection con = getConnection(ORACLE_URL, ORACLE_USER, ORACLE_USER_PASSWORD);
             PreparedStatement insertStatement = con.prepareStatement(insertString)) {
            insertStatement.setString(1, novoCadastro.getCpf());
            insertStatement.setString(2, novoCadastro.getSexo());
            insertStatement.setInt(3, novoCadastro.getAnoNascimento());
            insertStatement.setString(4, novoCadastro.getCidade());
            insertStatement.setString(5, novoCadastro.getEstado());
            insertStatement.setString(6, novoCadastro.getSenha());
            insertStatement.executeUpdate();
        }
    }

    public void putUsuarioPessoaFisica(PutUsuarioPessoaFisica usuarioPessoaFisica) throws SQLException {
        String updateString = "UPDATE USUARIO_PESSOA_FISICA SET UPF_DOC_CLI = ?, UPF_IDC_SEXO = ?, " +
                "UPF_ANO_DAT_NASCIMENTO = ?, UPF_NOM_CIDADE = ?, UPF_DES_ESTADO = ?, UPF_PF_SENHA = ? " +
                "WHERE UPF_DOC_CLI = ?";
        try (Connection con = getConnection(ORACLE_URL, ORACLE_USER, ORACLE_USER_PASSWORD);
             PreparedStatement updateStatement = con.prepareStatement(updateString)) {
            updateStatement.setString(1, usuarioPessoaFisica.getCpf());
            updateStatement.setString(2, usuarioPessoaFisica.getSexo());
            updateStatement.setInt(3, usuarioPessoaFisica.getAnoNascimento());
            updateStatement.setString(4, usuarioPessoaFisica.getCidade());
            updateStatement.setString(5, usuarioPessoaFisica.getEstado());
            updateStatement.setString(6, usuarioPessoaFisica.getSenhaNova());
            updateStatement.setString(7, usuarioPessoaFisica.getCpf());
            updateStatement.executeUpdate();
        }
    }

    public void deleteUsuarioPessoaFisica(String cpf) throws SQLException {
        String deleteString = "DELETE FROM USUARIO_PESSOA_FISICA WHERE UPF_DOC_CLI = ?";
        try (Connection con = getConnection(ORACLE_URL, ORACLE_USER, ORACLE_USER_PASSWORD);
             PreparedStatement updateStatement = con.prepareStatement(deleteString)) {
            updateStatement.setString(1, cpf);
            updateStatement.executeUpdate();
        }
    }
}
