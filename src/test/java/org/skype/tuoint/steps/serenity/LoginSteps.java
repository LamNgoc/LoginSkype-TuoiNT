package org.skype.tuoint.steps.serenity;

import org.skype.tuoint.pages.LoginPage;

import net.thucydides.core.annotations.Step;

public class LoginSteps {

	LoginPage onLoginPage;
	
	
	@Step
	public void open_Skype_login(){
		onLoginPage.open();
	}

	public void input_skypeName(String name) {
		onLoginPage.typeInto(onLoginPage.UsernameID, name);
	}

	public void input_password(String pass) {
		onLoginPage.typeInto(onLoginPage.PassID, pass);
	}

	public void click_SignIn_button() {
		onLoginPage.clickOn(onLoginPage.SignInBtn);
	}

	public String getErrMsg() {
		String errMsg = onLoginPage.getErrMsg();
		return errMsg;
		
	}

	
}
