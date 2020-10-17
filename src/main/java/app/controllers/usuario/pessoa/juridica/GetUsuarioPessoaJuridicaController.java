package app.controllers.usuario.pessoa.juridica;

import app.models.dtos.GetUsuarioPessoaJuridica;
import app.models.repository.UsuarioPessoaJuridicaRepository;
import spark.Request;
import spark.Response;
import spark.Route;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GetUsuarioPessoaJuridicaController {
    private static final Logger LOGGER = Logger.getLogger(GetUsuarioPessoaJuridicaController.class.getName());
    private static final String MENSAGEM_ERRO_SELECT = "CNPJ Não Foi Encontrado";

    UsuarioPessoaJuridicaRepository usuarioPessoaJuridicaRepository = new UsuarioPessoaJuridicaRepository();

    public final Route getUsuarioPessoaJuridica = (Request request, Response response) -> {
        try {
            GetUsuarioPessoaJuridica usuarioPessoaJuridica = new GetUsuarioPessoaJuridica(usuarioPessoaJuridicaRepository
                    .selectUsuarioPessoaJuridica(request.params(":cnpj")));
            response.status(200);
            response.body(usuarioPessoaJuridica.toString());
        } catch (SQLException e) {
            LOGGER.log(Level.INFO, e.getMessage());
            response.status(404);
            response.body(MENSAGEM_ERRO_SELECT);
        }
        return response.body();
    };
}