package app.models.dtos;

import lombok.Getter;
import org.apache.commons.codec.digest.DigestUtils;

import java.util.Map;

@Getter
public class PostUsuarioPessoaFisica {
    private String cpf;
    private Integer anoNascimento;
    private String sexo;
    private String cidade;
    private String estado;
    private String senha;
    private String confirmarSenha;

    public PostUsuarioPessoaFisica(Map<String, String> params) {
        this.cpf = params.get("cpf");
        this.anoNascimento = Integer.valueOf(params.get("anoNascimento"));
        this.sexo = params.get("sexo");
        this.cidade = params.get("cidade");
        this.estado = params.get("estado");
        this.senha = DigestUtils.md5Hex(params.get("senha"));
        this.confirmarSenha = DigestUtils.md5Hex(params.get("confirmarSenha"));
    }
}
