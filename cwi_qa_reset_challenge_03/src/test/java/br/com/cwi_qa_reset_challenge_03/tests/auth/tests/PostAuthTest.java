package br.com.cwi_qa_reset_challenge_03.tests.auth.tests;

import br.com.cwi_qa_reset_challenge_03.base.BaseTest;
import br.com.cwi_qa_reset_challenge_03.suites.AllTests;
import br.com.cwi_qa_reset_challenge_03.tests.auth.requests.PostAuthRequest;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.hamcrest.CoreMatchers.notNullValue;

public class PostAuthTest extends BaseTest {
    PostAuthRequest postAuthRequest = new PostAuthRequest();
    @Test
    @Category(AllTests.class)
    public void validateAccessTokenGranted(){
        postAuthRequest.callToken()
                .then()
                .statusCode(200)
                .body("token", notNullValue());
    }
}
