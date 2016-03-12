package com.giffgaff.money.cucumber.stepdefinitions.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.assertj.core.api.Assertions.assertThat;

import com.giffgaff.money.cucumber.pages.Ratesetter;

@SuppressWarnings("serial")
public class RatesetterSteps extends ScenarioSteps {

	Ratesetter ratesetter;
	
	@Step
	public void loadQuotePage() {
		assertThat(ratesetter.quoteHeaderText()).contains("Get a personalised quote in just 2 minutes");
	}
}
