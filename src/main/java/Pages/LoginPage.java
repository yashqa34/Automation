package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePage.BaseClass;

public class LoginPage extends BaseClass {
	
	@FindBy(xpath = "//input[@type= 'text']")  WebElement Email;
	@FindBy(xpath = "//input[@type ='password']")  WebElement password;
	@FindBy(xpath = "//button[text() ='SIGN IN']")  WebElement SigninBtn;
	
	
	public WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this); 
	}
	
	
	public WebElement email() {
		
		return Email;
	}
	
	public WebElement Pass() {
		
		return password;
	}
	
	
	public WebElement signin() {
		
		
		return SigninBtn;
	}
	
	Public void test(){
		
		
	}
}
