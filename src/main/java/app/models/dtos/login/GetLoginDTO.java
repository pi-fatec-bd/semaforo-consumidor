package app.models.dtos.login;

import lombok.Getter;

import java.util.Map;

@Getter
public class GetLoginDTO {
    private final String doc_cli;
    private final String senha;

    public GetLoginDTO(Map<String, String> params) {
        this.doc_cli = params.get("cpf");
        this.senha = params.get("senha");
    }
}
