package com.giffgaff.money.cucumber.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.NamedUrl;
import net.thucydides.core.annotations.NamedUrls;
import net.thucydides.core.pages.PageObject;

import org.openqa.selenium.support.FindBy;

@NamedUrls({ @NamedUrl(name = "money", url = "{1}/money/login?dtp=1") })
public class LoginPage extends PageObject {
	
	//Register new member
	@FindBy(xpath = "//div[@id='register-here']/a")
	private WebElementFacade registerButton;

	public void clickRegister() {
		registerButton.click();
	}
	
	//Fill in new member details
	@FindBy(id = "signup_nickname")
	private WebElementFacade usernameField;

	public void fillMemberName(String username) {
		usernameField.type(username);
	}

	@FindBy(id = "password1")
	private WebElementFacade passwordField;

	@FindBy(id = "password2")
	private WebElementFacade confirmPasswordField;

	public void fillPassword(String password) {
		passwordField.type(password);
		confirmPasswordField.type(password);
	}

	@FindBy(id = "email1")
	private WebElementFacade emailField;

	public void fillEmail(String email) {
		emailField.type(email);
	}

	@FindBy(id = "terms")
	private WebElementFacade termsAndConditionsCheckbox;

	public void checkTermsAndConditions() {
		setCheckbox(termsAndConditionsCheckbox, true);
	}

	public void uncheckTermsAndConditions() {
		setCheckbox(termsAndConditionsCheckbox, false);
	}

	@FindBy(id = "promotions")
	private WebElementFacade notificationsCheckbox;

	public void checkNotifications() {
		setCheckbox(notificationsCheckbox, true);
	}

	public void uncheckNotifications() {
		setCheckbox(notificationsCheckbox, false);
	}

	//Submit member registration
	@FindBy(id = "signup_submit_button")
	private WebElementFacade submitButton;

	public void clickSubmit() {
		submitButton.click();
	} 
}


