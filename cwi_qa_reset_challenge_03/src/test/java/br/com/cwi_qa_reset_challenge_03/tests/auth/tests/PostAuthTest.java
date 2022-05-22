package br.com.cwi_qa_reset_challenge_03.tests.auth.tests;

import br.com.cwi_qa_reset_challenge_03.base.BaseTest;
import br.com.cwi_qa_reset_challenge_03.suites.AllTests;
import br.com.cwi_qa_reset_challenge_03.suites.SmokeTests;
import br.com.cwi_qa_reset_challenge_03.tests.auth.requests.PostAuthRequest;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.hamcrest.CoreMatchers.notNullValue;

public class PostAuthTest extends BaseTest {
    PostAuthRequest postAuthRequest = new PostAuthRequest();
    @Test
    @Severity(SeverityLevel.BLOCKER)
    @Category({AllTests.class, SmokeTests.class})
    @DisplayName("Valida a geração de um token")
    public void validateAccessTokenGranted(){
        postAuthRequest.callToken()
                .then()
                .statusCode(200)
                .body("token", notNullValue());
    }
}
