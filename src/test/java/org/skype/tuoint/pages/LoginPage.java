package org.skype.tuoint.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://login.skype.com/login")
public class LoginPage extends PageObject {

	

	@FindBy (id="username")
	public WebElementFacade UsernameID;
	
	@FindBy (id="password")
	public WebElementFacade PassID;

	@FindBy (id="signIn")
	public WebElementFacade SignInBtn;

	@FindBy (css="div.messageBox.message_error > span")
	public WebElementFacade ErrMsg;
	
	public String getErrMsg() {
		ErrMsg.waitUntilPresent();
		return ErrMsg.getText();
	}


}
