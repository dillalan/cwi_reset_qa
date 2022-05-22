package br.com.cwi_qa_reset_challenge_03.tests.ping;

import br.com.cwi_qa_reset_challenge_03.suites.AllTests;
import br.com.cwi_qa_reset_challenge_03.tests.ping.requests.GetPingRequest;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class GetPingTest {

    GetPingRequest getPingRequest = new GetPingRequest();

    @Test
    @Category(AllTests.class)
    public void healthCheck(){
        getPingRequest.getPingRequest().then()
                .statusCode(201);
    }
}
