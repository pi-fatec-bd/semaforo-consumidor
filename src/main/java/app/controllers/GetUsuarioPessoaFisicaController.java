package app.controllers;

import app.models.dtos.GetUsuarioPessoaFisica;
import app.models.repository.UsuarioPessoaFisicaRepository;
import spark.Request;
import spark.Response;
import spark.Route;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GetUsuarioPessoaFisicaController {
    private static final Logger LOGGER = Logger.getLogger(GetUsuarioPessoaFisicaController.class.getName());
    private static final String MENSAGEM_ERRO_SELECT = "CPF Não Foi Encontrado";

    private final UsuarioPessoaFisicaRepository usuarioPessoaFisicaRepository = new UsuarioPessoaFisicaRepository();

    public final Route getUsuarioPessoaFisica = (Request request, Response response) -> {
        try {
            GetUsuarioPessoaFisica usuarioPessoaFisica = new GetUsuarioPessoaFisica(usuarioPessoaFisicaRepository
                    .selectUsuarioPessoaFisica(request.params(":cpf")));
            response.status(200);
            response.body(usuarioPessoaFisica.toString());
        } catch (SQLException e) {
            LOGGER.log(Level.INFO, e.getMessage());
            response.status(404);
            response.body(MENSAGEM_ERRO_SELECT);
        }
        return response.body();
    };
}
