package com.giffgaff.money.cucumber.stepdefinitions.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import com.giffgaff.money.cucumber.pages.TopNavigation;

@SuppressWarnings("serial")
public class TopNavigationSteps extends ScenarioSteps {

    TopNavigation topNav;

    @Step
	public void openOurOfferGiffgaffMoney() {
		topNav.clickGiffgaffMoney();
	}
}
