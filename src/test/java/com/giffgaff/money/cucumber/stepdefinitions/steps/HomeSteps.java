package com.giffgaff.money.cucumber.stepdefinitions.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.Dimension;
import com.giffgaff.money.cucumber.pages.HomePage;
import com.giffgaff.money.cucumber.data.Constants;

@SuppressWarnings("serial")
public class HomeSteps extends ScenarioSteps {

	HomePage home;
	
	@Step
	public void loadHomePage() {
		home.open();
		getDriver().manage().window().setSize(new Dimension(Constants.BROWSER_WINDOW_WIDTH, Constants.BROWSER_WINDOW_HEIGHT));
	}
}
