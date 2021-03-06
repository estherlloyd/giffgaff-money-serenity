package com.giffgaff.money.cucumber.stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import com.giffgaff.money.cucumber.stepdefinitions.steps.HomeSteps;
import com.giffgaff.money.cucumber.stepdefinitions.steps.TopNavigationSteps;
import com.giffgaff.money.cucumber.stepdefinitions.steps.MoneyLoansSteps;
import com.giffgaff.money.cucumber.stepdefinitions.steps.RatesetterSteps;
import com.giffgaff.money.cucumber.stepdefinitions.steps.MemberSteps;

public class ApplyForQuoteStepDefinitions {

    @Steps
    HomeSteps home;
    
    @Steps
    MemberSteps member;
    
    @Steps
    TopNavigationSteps topNav;
    
    @Steps
    MoneyLoansSteps moneyLoans;
    
    @Steps
    RatesetterSteps quoteForm;
   
    
    @Given("I am not a registered member")
    public void givenIAmNotARegisteredMember(){
		home.loadHomePage();
		if (member.isLoggedIn()) {
			member.clickLogOut();
		}
    }
    
    @When("I navigate to the giffgaff money home page")
    public void whenINavigateGiffgaffMoneyHomePage(){
    	topNav.openOurOfferGiffgaffMoney();
    }
    
    @Then("I select to get a quote")
    public void thenISelectGetAQuote(){
    	moneyLoans.clickGetAQuote();
    }
    
    @Then("I register a new member")
    public void thenIRegisterANewMember(){
		member.clickRegisterNewMember();
		member.completeRegistrationForm();
		member.submitRegistrationForm();
    }
    
    @Then("the quote form is presented")
    public void thenTheQuoteFormIsPresented(){
    	quoteForm.loadQuotePage();
    }
}
