package com.Mgrant.TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Mgrant.MainPage.BaseClass;
import com.Mgrant.Pages.LoginPage;

public class LoginTestCase extends BaseClass{

	@Test
	public void loginTest() {
			
		LoginPage login_page=PageFactory.initElements(driver, LoginPage.class);
		
		login_page.login_credentials("dhwani", "123456");
	}
}
