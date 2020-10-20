package app.models.repository;

import app.models.entities.Pagamento;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static app.Main.*;
import static java.sql.DriverManager.getConnection;

public class PagamentoRepository {

    public List<Pagamento> selectMovimentosPorCpfENumeroContrato(String cpf, Integer contrato, Date dataVencimentoParcela) throws SQLException {
        try (Connection con = getConnection(ORACLE_URL, ORACLE_USER, ORACLE_USER_PASSWORD)) {
            ResultSet resultSet;
            final String selectString = "SELECT * FROM PAGAMENTOS WHERE PGT_DOC_CLI = ? AND PGT_NUM_UNC = ? AND PGT_DAT_VCT = ?";

            List<Pagamento> pagamentos = new ArrayList<>();
            try (PreparedStatement selectStatement = con.prepareStatement(selectString)) {
                selectStatement.setString(1, cpf);
                selectStatement.setInt(2, contrato);
                selectStatement.setDate(3, dataVencimentoParcela);
                resultSet = selectStatement.executeQuery();
                while(resultSet.next()) {
                    pagamentos.add(new Pagamento(
                            resultSet.getInt(1),
                            resultSet.getString(2),
                            resultSet.getInt(3),
                            resultSet.getInt(4),
                            resultSet.getDate(5),
                            resultSet.getDate(6),
                            resultSet.getBigDecimal(7),
                            resultSet.getString(8)
                    ));
                }
            }

            return pagamentos;
        }
    }
}
