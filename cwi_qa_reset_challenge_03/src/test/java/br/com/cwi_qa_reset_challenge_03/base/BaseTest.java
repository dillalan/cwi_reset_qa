package br.com.cwi_qa_reset_challenge_03.base;

import io.restassured.RestAssured;
import org.junit.BeforeClass;

public class BaseTest {

    @BeforeClass
    public static void setup(){
        RestAssured.baseURI = "https://treinamento-api.herokuapp.com/";
    }
}
