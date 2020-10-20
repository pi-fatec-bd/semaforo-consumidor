package app.models.entities;

import lombok.AllArgsConstructor;

import java.math.BigDecimal;
import java.sql.Date;

@AllArgsConstructor
public class Operacao {
    private final Integer id;
    private final String cpf;
    private final Integer numeroContrato;
    private final Integer idModalidade;
    private final String codigoModalidade;
    private final Integer quantidadeParcelasContrato;
    private final Date dataContrato;
    private final Date dataVencimentoUltimaParcela;
    private final Date dataVencimento;
    private final BigDecimal valorTotalContratadoParcelado;
    private final BigDecimal valorTotalContratadoConsorcio;
    private final BigDecimal valorSaldoDevedor;
}
