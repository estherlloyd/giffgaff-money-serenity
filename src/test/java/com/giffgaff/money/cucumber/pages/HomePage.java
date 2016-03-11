package com.giffgaff.money.cucumber.pages;

import com.giffgaff.money.cucumber.data.Constants;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

@DefaultUrl("https://staging.giffgaff.com")

public class HomePage extends PageObject {

	public boolean isLoggedIn() {
		reduceWaitTimes();
		if(isElementVisible(By.id("link_logout"))){
			resetWaitTimes();
			return true;
		} else{
			resetWaitTimes();
			return false;
		}
	}

	@FindBy(id = "link_logout")
	private WebElementFacade logOutButton;

	public void clickLogOut() {
		logOutButton.click();
	}
	
	public void reduceWaitTimes(){
		setImplicitTimeout(1, TimeUnit.SECONDS);
		setWaitForTimeout(Constants.MIN_DRIVER_TIMEOUT_MILLI_SECONDS);
	}
	
	public void resetWaitTimes(){
		resetImplicitTimeout();
		setWaitForTimeout(Constants.DEFAULT_DRIVER_TIMEOUT_MILLI_SECONDS);
	}
}


