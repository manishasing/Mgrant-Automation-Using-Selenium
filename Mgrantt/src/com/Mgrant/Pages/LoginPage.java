package com.Mgrant.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	
	@FindBy(how=How.XPATH,using="//input[@name='LoginForm[username]']") WebElement username;
	
	@FindBy(how=How.ID,using="loginform-password") WebElement password;
	
	@FindBy(how=How.XPATH,using="//button[@type='submit' and @id='login-button']") WebElement login_button;
	
	public void login_credentials(String uname,String pass) {
		
		username.sendKeys(uname);
		password.sendKeys(pass);
		login_button.click();	
	}
}
