package br.com.cwi_qa_reset_challenge_03.runners;

import br.com.cwi_qa_reset_challenge_03.tests.auth.tests.PostAuthTest;
import br.com.cwi_qa_reset_challenge_03.tests.booking.tests.GetBookingTest;
import br.com.cwi_qa_reset_challenge_03.tests.booking.tests.PutBookingTest;
import br.com.cwi_qa_reset_challenge_03.tests.ping.tests.GetPingTest;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Categories.IncludeCategory(br.com.cwi_qa_reset_challenge_03.suites.AllTests.class)
@Suite.SuiteClasses({
        GetBookingTest.class,
        GetPingTest.class,
        PostAuthTest.class,
        PutBookingTest.class
})
public class AllTests {

}
