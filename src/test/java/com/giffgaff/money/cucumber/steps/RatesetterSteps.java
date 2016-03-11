package com.giffgaff.money.cucumber.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

//import static org.assertj.core.api.Assertions.assertThat;

import com.giffgaff.money.cucumber.pages.Ratesetter;

@SuppressWarnings("serial")
public class RatesetterSteps extends ScenarioSteps {

	Ratesetter ratesetter;
	
	@Step
	public void loadQuotePage() {
		//TODO:
		//Insert assertion to verify the page loads
		//assertThat("Some text on the site is displayed",ratesetter.)
	}
   
}
