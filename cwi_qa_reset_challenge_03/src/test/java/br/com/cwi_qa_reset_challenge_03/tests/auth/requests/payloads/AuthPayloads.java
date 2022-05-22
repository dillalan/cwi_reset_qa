package br.com.cwi_qa_reset_challenge_03.tests.auth.requests.payloads;

import org.json.JSONObject;

public class AuthPayloads {

    public JSONObject jsonObjectAuthLogin() {
        return new JSONObject()
                .put("username", "admin")
                .put("password", "password123");
    }
}
