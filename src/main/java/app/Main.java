package app;

import app.Controllers.CadastroController;

import static spark.Spark.*;

public class Main {
    public static void main(String[] args) {


        staticFiles.location("/public");


        get("/", (req, res) -> "" );
        post("/api/v1/PessoaFisica", CadastroController.cadastroPessoaFisica);
    }
}