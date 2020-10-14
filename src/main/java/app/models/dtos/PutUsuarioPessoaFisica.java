package app.models.dtos;

import lombok.Getter;
import org.apache.commons.codec.digest.DigestUtils;

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
        this.senhaAntiga = DigestUtils.md5Hex(params.get("senhaAntiga"));
        this.senhaNova = DigestUtils.md5Hex(params.get("senhaNova"));
        this.confirmarSenhaNova = DigestUtils.md5Hex(params.get("confirmarSenhaNova"));
    }
}
