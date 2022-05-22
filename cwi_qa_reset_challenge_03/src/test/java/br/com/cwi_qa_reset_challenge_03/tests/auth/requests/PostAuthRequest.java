package br.com.cwi_qa_reset_challenge_03.tests.auth.requests;

import io.restassured.response.Response;
import org.json.JSONObject;

import static io.restassured.RestAssured.given;

public class PostAuthRequest {

    JSONObject payload = new JSONObject()
            .put("username", "admin")
            .put("password","password123");
    public Response callToken(){
        return given()
                .header("Content-Type", "application/json")
                .when()
                .body(payload.toString())
                .post("https://treinamento-api.herokuapp.com/auth");
    }

    public String getToken(){
        return "token:"+this.callToken()
                .then()
                .statusCode(200)
                .extract()
                .path("token");
    }
}
