package app.models.dtos;

import lombok.Getter;

import java.util.Map;

import static org.apache.commons.codec.digest.DigestUtils.md5Hex;

@Getter
public class PostUsuarioPessoaJuridica {
    private final String cnpj;
    private final String email;
    private final String celular;
    private final String cidade;
    private final String estado;
    private final String senha;
    private final String confirmarSenha;

    public PostUsuarioPessoaJuridica(Map<String, String> params) {
        this.cnpj = params.get("cnpj");
        this.email = params.get("email");
        this.celular = params.get("celular");
        this.cidade = params.get("cidade");
        this.estado = params.get("estado");
        this.senha = md5Hex(params.get("senha"));
        this.confirmarSenha = md5Hex(params.get("confirmarSenha"));
    }
}
