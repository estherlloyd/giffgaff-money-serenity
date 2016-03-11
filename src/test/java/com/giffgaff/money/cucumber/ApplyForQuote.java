package com.giffgaff.money.cucumber;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/PotentialBorrower/ApplyForQuote.feature")
public class ApplyForQuote  {

}
