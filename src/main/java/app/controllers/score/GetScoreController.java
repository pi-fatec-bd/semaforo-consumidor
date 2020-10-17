package app.controllers.score;

import spark.Request;
import spark.Response;
import spark.Route;

public class GetScoreController {
    public final Route getScore = (Request request, Response response) -> {
        //FAKE
        response.status(200);
        response.body("999");
        return response.body();
    };
}
