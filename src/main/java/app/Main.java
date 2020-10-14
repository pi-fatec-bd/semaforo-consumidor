package app;

import app.controllers.DeleteUsuarioPessoaFisicaController;
import app.controllers.GetUsuarioPessoaFisicaController;
import app.controllers.PostUsuarioPessoaFisicaController;
import app.controllers.PutUsuarioPessoaFisicaController;

import static spark.Spark.*;

public class Main {
    public static final String ORACLE_USER = "system";
    public static final String ORACLE_USER_PASSWORD = "admin";
    public static final String ORACLE_URL = "jdbc:oracle:thin:@localhost:1521:xe";

    private static final String URI_USUARIO_PESSOA_FISICA = "/api/v1/UsuarioPessoaFisica";

    public static void main(String[] args) {
        String projectDir = System.getProperty("user.dir");
        String staticDir = "/src/main/resources/public";
        staticFiles.externalLocation(projectDir + staticDir);

        PostUsuarioPessoaFisicaController postUsuarioPessoaFisicaController = new PostUsuarioPessoaFisicaController();
        PutUsuarioPessoaFisicaController putUsuarioPessoaFisicaController = new PutUsuarioPessoaFisicaController();
        DeleteUsuarioPessoaFisicaController deleteUsuarioPessoaFisicaController = new DeleteUsuarioPessoaFisicaController();
        GetUsuarioPessoaFisicaController getUsuarioPessoaFisicaController = new GetUsuarioPessoaFisicaController();

        get("/", (req, res) -> "" );
        get(URI_USUARIO_PESSOA_FISICA + "/:cpf", getUsuarioPessoaFisicaController.getUsuarioPessoaFisica);
        post(URI_USUARIO_PESSOA_FISICA, postUsuarioPessoaFisicaController.cadastroPessoaFisica);
        put(URI_USUARIO_PESSOA_FISICA, putUsuarioPessoaFisicaController.putUsuarioPessoaFisica);
        delete(URI_USUARIO_PESSOA_FISICA + "/:cpf", deleteUsuarioPessoaFisicaController.deleteUsuarioPessoaFisica);
    }
}