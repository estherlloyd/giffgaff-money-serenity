Feature: Apply for a quote
  As a potential member
  I want to be able to register
  So that I can apply navigate and apply for a quote
  
  Background:
  	Given I am not a registered member

  Scenario: New Member apply for a retail loan
    When I navigate to the giffgaff money home page
	And I select to get a quote
	And I register a new member
	Then the quote form is presented


