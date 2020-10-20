package app.models.entities;

import lombok.AllArgsConstructor;

import java.math.BigDecimal;
import java.sql.Date;

@AllArgsConstructor
public class Pagamento {
    private final Integer id;
    private final String cpf;
    private final Integer idFonte;
    private final Integer numeroContrato;
    private final Date dataVencimentoParcela;
    private final Date dataPagamentoParcela;
    private final BigDecimal valorPago;
    private final String codigoModalidade;
}
