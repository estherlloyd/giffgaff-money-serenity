package com.giffgaff.money.cucumber.pages;

import com.giffgaff.money.cucumber.pages.MoneyLoansPage;
import net.serenitybdd.core.pages.WebElementFacade;
//import net.thucydides.core.pages.PageObject;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class TopNavigation extends HomePage {
	
	@FindBy(linkText = "Our offer")
	private WebElementFacade headerOurOffer;

	private void mouseOverHoverOurOffer() {
		Actions actions = new Actions(getDriver());
		actions.moveToElement(headerOurOffer).build().perform();
	}

	@FindBy(linkText = "giffgaff money")
	private WebElementFacade topNavOurOfferGiffgaffMoney;
	
	public MoneyLoansPage clickGiffgaffMoney() {
		mouseOverHoverOurOffer();
		topNavOurOfferGiffgaffMoney.click();
		return new MoneyLoansPage();
	}
}


