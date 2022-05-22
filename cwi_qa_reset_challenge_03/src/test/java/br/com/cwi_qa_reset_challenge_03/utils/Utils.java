package br.com.cwi_qa_reset_challenge_03.utils;

public class Utils {
    public static String getSchemaBasePath(String pack, String nameSchema){
        return System.getProperty("user.dir")+
                "/src/test/java/br/com/cwi_qa_reset_challenge_03/tests/"+
                pack +
                "/schema/"+
                nameSchema +
                ".json";

    }
}
