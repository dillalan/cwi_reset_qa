package br.com.cwi_qa_reset_challenge_03.tests.booking.tests;

import br.com.cwi_qa_reset_challenge_03.base.BaseTest;
import br.com.cwi_qa_reset_challenge_03.suites.AllTests;
import br.com.cwi_qa_reset_challenge_03.tests.auth.requests.PostAuthRequest;
import br.com.cwi_qa_reset_challenge_03.tests.booking.requests.GetBookingRequest;
import br.com.cwi_qa_reset_challenge_03.tests.booking.requests.PutBookingRequest;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.hamcrest.Matchers.greaterThan;

public class PutBookingTest extends BaseTest {

    PutBookingRequest putBookingRequest = new PutBookingRequest();
    GetBookingRequest getBookingRequest = new GetBookingRequest();
    PostAuthRequest postAuthRequest = new PostAuthRequest();

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Category(AllTests.class)
    @DisplayName("Valida a atualização de uma reserva usando um token")
    public void validateUpdateBookingWithToken(){
        int id = getBookingRequest.getBooking()
                        .then()
                        .statusCode(200)
                        .extract()
                        .path("[0].bookingid");
        String token = postAuthRequest.getToken();

        putBookingRequest.updateBookingToken(id, token)
                .then()
                .statusCode(200)
                .body("size()", greaterThan(0));
    }
}
