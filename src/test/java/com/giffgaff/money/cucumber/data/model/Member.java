package com.giffgaff.money.cucumber.data.model;

import static com.giffgaff.money.cucumber.data.WordGenerator.getRandomWord;

public class Member {
	
	// Credentials
	private String username = null;
	private String password = null;

	// Basic info
	private String email = null;

	// Updates and notifications
	private boolean giffgaffNotifications = false;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isGiffgaffNotifications() {
		return giffgaffNotifications;
	}

	public Member populatedWithRandomData() {
		if (username == null) {
			String randomUsername = ("money_" + getRandomWord());
			setUsername(randomUsername.substring(0, Math.min(24, randomUsername.length())));
		}
		if (password == null)
			setPassword("golden$33M");
		
		if (email == null)
			setEmail(getRandomWord() + "@mailinator.com");
		
		return this;
	}
}