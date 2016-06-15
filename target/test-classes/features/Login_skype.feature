#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios 
#<> (placeholder)
#""
## (Comments)

#Sample Feature Definition Template

Feature: Login Skype page
	I want to test three cases:
	Login with invalid Skype name
	Login with invalid password
	Login with invalid Skype name and password

Scenario: Login with invalid Skype name
Given Go to the login Skype page successfully
When Input a skype name "Lamngoc"
	And Input a password "1234567890"
	And Click Sign in button
Then Show an error message "Signing in failed. Please double-check your Skype Name and re-enter your password."

Scenario: Login with invalid password
Given Go to the login Skype page successfully
When Input a skype name "Lamngoc_xinhxinh"
	And Input a password "1234567890"
	And Click Sign in button
Then Show an error message "Signing in failed. Please double-check your Skype Name and re-enter your password."

Scenario: Login with invalid Skype name and password
Given Go to the login Skype page successfully
When Input a skype name "Lamngoc"
	And Input a password "1234567890"
	And Click Sign in button
Then Show an error message "Signing in failed. Please double-check your Skype Name and re-enter your password."

Scenario: Login with Skype name and password are empty
Given Go to the login Skype page successfully
When Click Sign in button
Then Show an error message "You did not enter your Skype Name."