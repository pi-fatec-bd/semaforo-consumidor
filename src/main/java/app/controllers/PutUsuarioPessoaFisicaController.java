package app.controllers;

import app.models.dtos.PutUsuarioPessoaFisica;
import app.models.repository.UsuarioPessoaFisicaRepository;
import spark.Request;
import spark.Response;
import spark.Route;

import java.util.logging.Level;
import java.util.logging.Logger;

import static app.utils.JsonToPOJO.toMap;

public class PutUsuarioPessoaFisicaController {
    private static final Logger LOGGER = Logger.getLogger(PutUsuarioPessoaFisicaController.class.getName());
    private static final String MENSAGEM_ERRO_UPDATE = "Não Foi Possível Realizar a Edição";

    private UsuarioPessoaFisicaRepository usuarioPessoaFisicaRepository = new UsuarioPessoaFisicaRepository();

    public final Route putUsuarioPessoaFisica = (Request request, Response response) -> {
        PutUsuarioPessoaFisica usuarioPessoaFisica = new PutUsuarioPessoaFisica(toMap(request));
        try {
            usuarioPessoaFisicaRepository.putUsuarioPessoaFisica(usuarioPessoaFisica);
            response.status(204);
        } catch (Exception e) {
            LOGGER.log(Level.INFO, e.getMessage());
            response.status(500);
            response.body(MENSAGEM_ERRO_UPDATE);
        }
        return response.body();
    };
}
