package br.com.cwi_qa_reset_challenge_03.tests.booking.requests;

import io.qameta.allure.Step;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class GetBookingRequest {

    @Step("Retorna a lista de id de reservas")
    public Response getBooking(){
        return given()
                .when()
                .get("booking");
    }
}
