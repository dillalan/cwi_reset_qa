import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class testAPI {

    @Test
    public void healthCheck(){
        Response response =
                given()
                        .header("Content-Type", "application/json")
                        .when()
                        .get("https://treinamento-api.herokuapp.com/ping");
        response.then()
                .statusCode(201);
    }
}
