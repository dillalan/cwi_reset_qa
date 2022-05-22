package br.com.cwi_qa_reset_challenge_03.tests.booking.requests;

import br.com.cwi_qa_reset_challenge_03.tests.booking.payloads.BookingPayloads;
import io.qameta.allure.Step;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class PutBookingRequest {

    BookingPayloads bookingPayloads = new BookingPayloads();

    @Step("Atualiza informações de uma reserva através de um token")
    public Response updateBookingToken(int id, String token){
        return given()
                .header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .header("Cookie", token)
                .when()
                .body(bookingPayloads.payloadValidBooking().toString())
                .put("booking/" + id);
    }
}
