package app.controllers;

import app.models.dtos.DeleteUsuarioPessoaFisica;
import app.models.repository.UsuarioPessoaFisicaRepository;
import spark.Request;
import spark.Response;
import spark.Route;

import java.util.logging.Level;
import java.util.logging.Logger;

import static app.utils.JsonToPOJO.toMap;

public class DeleteUsuarioPessoaFisicaController {
    private static final Logger LOGGER = Logger.getLogger(PutUsuarioPessoaFisicaController.class.getName());
    private static final String MENSAGEM_ERRO_DELETE = "Não Foi Possível Deletar os Registros";

    private UsuarioPessoaFisicaRepository usuarioPessoaFisicaRepository = new UsuarioPessoaFisicaRepository();

    public final Route deleteUsuarioPessoaFisica = (Request request, Response response) -> {
        DeleteUsuarioPessoaFisica usuarioPessoaFisica = new DeleteUsuarioPessoaFisica(toMap(request));
        try {
            usuarioPessoaFisicaRepository.deleteUsuarioPessoaFisica(usuarioPessoaFisica.getCpf());
            response.status(204);
        } catch (Exception e) {
            LOGGER.log(Level.INFO, e.getMessage());
            response.status(500);
            response.body(MENSAGEM_ERRO_DELETE);
        }
        return response.body();
    };
}
