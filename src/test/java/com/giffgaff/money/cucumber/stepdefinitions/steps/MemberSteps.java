package com.giffgaff.money.cucumber.stepdefinitions.steps;

import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import com.giffgaff.money.cucumber.pages.HomePage;
import com.giffgaff.money.cucumber.pages.LoginPage;

import com.giffgaff.money.cucumber.data.model.Member;

@SuppressWarnings("serial")
public class MemberSteps extends ScenarioSteps {

    HomePage home;
    LoginPage login;
	
	public boolean isLoggedIn() {
		if (home.isLoggedIn())
			return true;
		else
			return false;
	}

	@Step
	public void clickLogOut() {
		home.clickLogOut();
	}
	

	@Step
	public void clickRegisterNewMember() {
		login.clickRegister();
	}

	@Step
	public void completeRegistrationForm() {
		Member member = new Member().populatedWithRandomData();
		fillRegistrationForm(member);
	}

	@Step
	public void submitRegistrationForm() {
		login.clickSubmit();
	}
	
	private void fillRegistrationForm(Member member) {
		login.fillMemberName(member.getUsername());
		login.fillPassword(member.getPassword());
		login.fillEmail(member.getEmail());
		
		if (member.isGiffgaffNotifications())
			login.checkNotifications();
		else
			login.uncheckNotifications();
			
		Serenity.getCurrentSession().put("member", member);
	}
}
