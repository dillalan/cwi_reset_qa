package br.com.cwi_qa_reset_challenge_03.tests.booking.tests;

import br.com.cwi_qa_reset_challenge_03.suites.AllTests;
import br.com.cwi_qa_reset_challenge_03.tests.booking.requests.GetBookingRequest;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.hamcrest.Matchers.greaterThan;

public class GetBookingTest {

    GetBookingRequest getBookingRequest = new GetBookingRequest();

    @Test
    @Category(AllTests.class)
    public void validateBookingListIds(){
        getBookingRequest.getBooking().then()
                .statusCode(200)
                .body("size()", greaterThan(0));
    }
}
