package br.com.cwi_qa_reset_challenge_03.tests.booking.requests;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class GetBookingRequest {

    public Response getBooking(){
        return given()
                .when()
                .get("booking");
    }
}
