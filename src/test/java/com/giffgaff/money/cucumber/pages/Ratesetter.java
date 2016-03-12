package com.giffgaff.money.cucumber.pages;

import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.NamedUrl;
import net.thucydides.core.annotations.NamedUrls;
import net.thucydides.core.pages.PageObject;

@NamedUrls({ @NamedUrl(name = "money", url = "https://peer2peer.giffgaff.com/your_borrowing/applications/quote.aspx") })
public class Ratesetter extends PageObject {
	
	@FindBy(css = "h1")
	private WebElementFacade quotePageHeader;
	
	public String quoteHeaderText(){
		return quotePageHeader.getText();
	}
}


