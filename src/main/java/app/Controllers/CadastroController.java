package app.Controllers;

import app.Models.DTOs.CadastroPessoaFisica;
import spark.Request;
import spark.Response;
import spark.Route;

public class CadastroController {

    public static Route cadastroPessoaFisica = (Request request, Response response) -> {
        if(request.queryParams("senha").equals(request.queryParams("confirmarSenha"))) {

        } else {
            response.status(400);
            return response.status();
        }
        CadastroPessoaFisica novoCadastro = new CadastroPessoaFisica(
                request.queryParams("cpf"),
                Integer.valueOf(request.queryParams("anoNascimento")),
                request.queryParams("cidade"),
                request.queryParams("estado"),
                request.queryParams("senha")
        );
        response.status(201);
        return response.status();
    };
}
