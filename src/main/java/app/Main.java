package app;

import app.controllers.PostCadastroUsuarioPessoaFisicaController;
import app.controllers.PutUsuarioPessoaFisicaController;

import static spark.Spark.*;

public class Main {
    public static final String ORACLE_USER = "system";
    public static final String ORACLE_USER_PASSWORD = "admin";
    public static final String ORACLE_URL = "jdbc:oracle:thin:@localhost:1521:xe";

    public static void main(String[] args) {
        String projectDir = System.getProperty("user.dir");
        String staticDir = "/src/main/resources/public";
        staticFiles.externalLocation(projectDir + staticDir);
        PostCadastroUsuarioPessoaFisicaController postCadastroUsuarioPessoaFisicaController = new PostCadastroUsuarioPessoaFisicaController();
        PutUsuarioPessoaFisicaController putUsuarioPessoaFisicaController = new PutUsuarioPessoaFisicaController();
        get("/", (req, res) -> "" );
        post("/api/v1/UsuarioPessoaFisica", postCadastroUsuarioPessoaFisicaController.cadastroPessoaFisica);
        put("/api/v1/UsuarioPessoaFisica", putUsuarioPessoaFisicaController.putUsuarioPessoaFisica);
    }
}