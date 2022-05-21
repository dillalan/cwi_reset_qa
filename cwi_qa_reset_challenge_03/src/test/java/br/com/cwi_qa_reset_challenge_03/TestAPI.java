package br.com.cwi_qa_reset_challenge_03;

import br.com.cwi_qa_reset_challenge_03.suites.AllTests;
import io.restassured.response.Response;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.greaterThan;

public class TestAPI {

    @Test
    @Category(AllTests.class)
    public void healthCheck(){
        Response response =
                given()
                        .header("Content-Type", "application/json")
                        .when()
                        .get("https://treinamento-api.herokuapp.com/ping");
        response.then()
                .statusCode(201);
    }

    @Test
    @Category(AllTests.class)
    public void validateBookingListIds(){
        Response response =
                given()
                        .when()
                        .get("https://treinamento-api.herokuapp.com/booking");
        response.then()
                .statusCode(200)
                .body("size()", greaterThan(0));
    }

}
