package app.models.dtos;

import app.models.entities.UsuarioPessoaFisica;
import lombok.Getter;

@Getter
public class GetUsuarioPessoaFisica {
    private final String cpf;
    private final String sexo;
    private final Integer anoNascimento;
    private final String cidade;
    private final String estado;

    @Override
    public String toString() {
        return "{" +
                "'cpf': '" + cpf + "'," +
                "'sexo': '" + sexo + "'," +
                "'anoNascimento': '" + anoNascimento + "'," +
                "'cidade': '" + cidade + "'," +
                "'estado': '" + estado + "'" +
                '}';
    }

    public GetUsuarioPessoaFisica(UsuarioPessoaFisica usuarioPessoaFisica) {
        cpf = usuarioPessoaFisica.getCpf();
        sexo = usuarioPessoaFisica.getSexo();
        anoNascimento = usuarioPessoaFisica.getAnoNascimento();
        cidade = usuarioPessoaFisica.getCidade();
        estado = usuarioPessoaFisica.getEstado();
    }
}
