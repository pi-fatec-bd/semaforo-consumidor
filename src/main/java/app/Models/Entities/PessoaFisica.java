package app.Models.Entities;

import lombok.Data;

@Data
public class PessoaFisica {
    private String cpf;
    private String sexo;
    private Integer anoNascimento;
    private String cidade;
    private String estado;
}
