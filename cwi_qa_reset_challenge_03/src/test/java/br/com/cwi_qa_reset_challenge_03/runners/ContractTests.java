package br.com.cwi_qa_reset_challenge_03.runners;

import br.com.cwi_qa_reset_challenge_03.tests.booking.tests.GetBookingTest;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(Categories.class)
@Categories.IncludeCategory(br.com.cwi_qa_reset_challenge_03.suites.ContractTests.class)
@Suite.SuiteClasses({
        GetBookingTest.class
})

public class ContractTests {
}
