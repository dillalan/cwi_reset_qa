package br.com.cwi_qa_reset_challenge_03.tests.booking.tests;

import br.com.cwi_qa_reset_challenge_03.base.BaseTest;
import br.com.cwi_qa_reset_challenge_03.suites.AllTests;
import br.com.cwi_qa_reset_challenge_03.suites.ContractTests;
import br.com.cwi_qa_reset_challenge_03.tests.booking.requests.GetBookingRequest;
import br.com.cwi_qa_reset_challenge_03.utils.Utils;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import java.io.File;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static org.hamcrest.Matchers.greaterThan;

public class GetBookingTest extends BaseTest {

    GetBookingRequest getBookingRequest = new GetBookingRequest();

    @Test
    @Category(AllTests.class)
    public void validateBookingListIds(){
        getBookingRequest.getBooking().then()
                .statusCode(200)
                .body("size()", greaterThan(0));
    }

    @Test
    @Category({AllTests.class, ContractTests.class})
    public void validateListBookingSchema() {
        getBookingRequest.getBooking().then()
                .statusCode(200)
                .body(matchesJsonSchema(new File(Utils.getSchemaBasePath("booking", "bookings"))));
    }
}
