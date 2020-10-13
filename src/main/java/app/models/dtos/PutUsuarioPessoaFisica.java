package app.models.dtos;

import lombok.Getter;

import java.util.Map;

@Getter
public class PutUsuarioPessoaFisica {
    private String cpf;
    private Integer anoNascimento;
    private String sexo;
    private String cidade;
    private String estado;
    private String senhaAntiga;
    private String senhaNova;
    private String confirmarSenhaNova;

    public PutUsuarioPessoaFisica(Map<String, String> params) {
        this.cpf = params.get("cpf");
        this.anoNascimento = Integer.valueOf(params.get("anoNascimento"));
        this.sexo = params.get("sexo");
        this.cidade = params.get("cidade");
        this.estado = params.get("estado");
        this.senhaAntiga = params.get("senhaAntiga");
        this.senhaNova = params.get("senhaNova");
        this.confirmarSenhaNova = params.get("confirmarSenhaNova");
    }
}
