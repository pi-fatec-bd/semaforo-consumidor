package app.models.dtos;

import lombok.Getter;

import java.util.Map;

import static org.apache.commons.codec.digest.DigestUtils.md5Hex;

@Getter
public class PostUsuarioPessoaFisica {
    private final String cpf;
    private final Integer anoNascimento;
    private final String sexo;
    private final String cidade;
    private final String estado;
    private final String senha;
    private final String confirmarSenha;

    public PostUsuarioPessoaFisica(Map<String, String> params) {
        this.cpf = params.get("cpf");
        this.anoNascimento = Integer.valueOf(params.get("anoNascimento"));
        this.sexo = params.get("sexo");
        this.cidade = params.get("cidade");
        this.estado = params.get("estado");
        this.senha = md5Hex(params.get("senha"));
        this.confirmarSenha = md5Hex(params.get("confirmarSenha"));
    }
}
