package br.com.cwi_qa_reset_challenge_03.tests.auth.requests;

import br.com.cwi_qa_reset_challenge_03.tests.auth.payloads.AuthPayloads;
import io.qameta.allure.Step;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class PostAuthRequest {

    AuthPayloads authPayloads = new AuthPayloads();
    @Step("Retorna o token")
    public Response callToken(){
        return given()
                .header("Content-Type", "application/json")
                .when()
                .body(authPayloads.jsonObjectAuthLogin().toString())
                .post("auth");
    }

    @Step("Busca o token")
    public String getToken(){
        return "token="+this.callToken()
                .then()
                .statusCode(200)
                .extract()
                .path("token");
    }
}
