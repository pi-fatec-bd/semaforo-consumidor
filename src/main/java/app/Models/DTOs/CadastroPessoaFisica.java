package app.Models.DTOs;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CadastroPessoaFisica {
    private String cpf;
    private Integer anoNascimento;
    private String cidade;
    private String estado;
    private String senha;
}
