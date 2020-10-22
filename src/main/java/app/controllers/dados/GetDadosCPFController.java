package app.controllers.dados;

import app.models.dtos.getdadoscpf.GetDadosCPFResponse;
import app.models.repository.DadosCPFRepository;
import spark.Request;
import spark.Response;
import spark.Route;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GetDadosCPFController {
    private static final Logger LOGGER = Logger.getLogger(GetDadosCPFController.class.getName());
    private static final String MENSAGEM_ERRO_SELECT = "CPF Não Foi Encontrado";

    private final DadosCPFRepository dadosCPFRepository = new DadosCPFRepository();

    public final Route getDadosCPF = (Request request, Response response) -> {
        try {
            GetDadosCPFResponse getDadosCPFResponse = dadosCPFRepository.getDadosCPFResponse(request.params(":doc_cli"));
            response.status(200);
            response.body(getDadosCPFResponse.toString());
        } catch (SQLException e) {
            LOGGER.log(Level.INFO, e.getMessage());
            response.status(404);
            response.body(MENSAGEM_ERRO_SELECT);
        }
        return response.body();
    };
}
