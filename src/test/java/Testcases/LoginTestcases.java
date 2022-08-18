package Testcases;

import org.testng.annotations.Test;


import BasePage.BaseClass;
import Pages.LoginPage;
public class LoginTestcases  extends BaseClass {
	
	@Test
	public void vaildLogin() {
	
		
		LoginPage login = new LoginPage(driver);
		login.email().sendKeys("nishants440@gmail.com");
		login.Pass().sendKeys("Test@1234");
		login.signin().click();
		

	}

}
