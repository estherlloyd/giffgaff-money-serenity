package com.giffgaff.money.cucumber.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.NamedUrl;
import net.thucydides.core.annotations.NamedUrls;
import net.thucydides.core.pages.PageObject;

import org.openqa.selenium.support.FindBy;
import com.giffgaff.money.cucumber.pages.Ratesetter;


@NamedUrls({ @NamedUrl(name = "money", url = "{1}/money/loans?dtp=1") })
public class MoneyLoansPage extends PageObject {
	
	@FindBy(linkText = "Get a quote")
	private WebElementFacade getAQuote;
	
	public Ratesetter clickGetAQuote() {
		getAQuote.click();
		return new Ratesetter();
	}	
}


