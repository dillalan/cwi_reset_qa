package br.com.cwi_qa_reset_challenge_03.tests.booking.requests.payloads;

import org.json.JSONObject;

public class BookingPayloads {

    public JSONObject payloadValidBooking(){

        JSONObject bookingDates = new JSONObject()
                .put("checkin", "2018-01-01")
                .put("checkout", "2018-01-01");

        return new JSONObject()
                .put("firstname", "Alan")
                .put("lastname", "Dill")
                .put("totalprice", 123)
                .put("depositpaid", true)
                .put("bookingDates", bookingDates)
                .put("additionalneeds", "Breakfast");
    }
}
