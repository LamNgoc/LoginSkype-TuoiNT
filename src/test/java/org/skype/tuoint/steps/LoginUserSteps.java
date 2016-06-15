package org.skype.tuoint.steps;

import org.junit.Assert;
import org.skype.tuoint.steps.serenity.LoginSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LoginUserSteps {

	@Steps
	LoginSteps loginsteps;

	@Given("^Go to the login Skype page successfully$")
	public void go_to_the_login_Skype_page_successfully() throws Throwable {
		loginsteps.open_Skype_login();
	}

	@When("^Input a skype name \"([^\"]*)\"$")
	public void input_a_skype_name(String name) throws Throwable {
		loginsteps.input_skypeName(name);
	}

	@When("^Input a password \"([^\"]*)\"$")
	public void input_a_password(String pass) throws Throwable {
		loginsteps.input_password(pass);
	}

	@When("^Click Sign in button$")
	public void click_Sign_in_button() throws Throwable {
		loginsteps.click_SignIn_button();
	}

	@Then("^Show an error message \"([^\"]*)\"$")
	public void show_an_error_message(String message) throws Throwable {
		Assert.assertEquals(loginsteps.getErrMsg(),message);
	}
	
}
