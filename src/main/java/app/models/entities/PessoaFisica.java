package app.models.entities;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PessoaFisica {
    private String cpf;
    private String sexo;
    private Integer anoNascimento;
    private String cidade;
    private String estado;
}
