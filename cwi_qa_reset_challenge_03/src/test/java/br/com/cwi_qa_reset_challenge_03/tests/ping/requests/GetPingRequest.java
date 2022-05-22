package br.com.cwi_qa_reset_challenge_03.tests.ping.requests;

import io.qameta.allure.Step;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class GetPingRequest {

    @Step("Retorna o status da API")
    public Response getPingRequest(){
        return given()
                .header("Content-Type", "application/json")
                .when()
                .get("ping");
    }
}
