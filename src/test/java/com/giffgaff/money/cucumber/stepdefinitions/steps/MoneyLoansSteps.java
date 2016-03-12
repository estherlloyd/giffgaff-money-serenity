package com.giffgaff.money.cucumber.stepdefinitions.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import com.giffgaff.money.cucumber.pages.MoneyLoansPage;

@SuppressWarnings("serial")
public class MoneyLoansSteps extends ScenarioSteps {
	
	MoneyLoansPage loans;

	@Step
	public void clickGetAQuote() {
		loans.clickGetAQuote();
	}
}
