package app.models.repository;

import app.models.dtos.CadastroPessoaFisica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static app.Main.*;
import static java.sql.DriverManager.getConnection;

public class UsuarioPessoaFisicaRepository {

    public void insertUsuarioPessoaFisica(CadastroPessoaFisica novoCadastro) throws SQLException {
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
}
