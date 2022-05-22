package br.com.cwi_qa_reset_challenge_03.runners;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(Categories.class)
@Categories.IncludeCategory(br.com.cwi_qa_reset_challenge_03.suites.AcceptanceTests.class)
@Suite.SuiteClasses({
})

public class AcceptanceTests {
}
