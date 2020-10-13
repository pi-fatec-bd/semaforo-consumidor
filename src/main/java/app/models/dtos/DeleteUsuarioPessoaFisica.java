package app.models.dtos;

import lombok.Getter;

import java.util.Map;

@Getter
public class DeleteUsuarioPessoaFisica {
    private String cpf;

    public DeleteUsuarioPessoaFisica(Map<String, String> params) {
        this.cpf = params.get("cpf");
    }
}
