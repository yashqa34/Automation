package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePage.BaseClass;

public class DashboardPage extends BaseClass {
	
	@FindBy(xpath= "//body/div[@id='root']/aside/ul/a[2]") public WebElement adminmenu;
	@FindBy(xpath = "//div[@id ='root']//ul//a[3]//li[text()='User Management']") public WebElement usermanage;
	@FindBy(xpath = "//div[@id ='root']//ul//a[4]//li[text()='Admin Users']") public WebElement adminuser;
	@FindBy(xpath = "//div[@id ='root']//ul//a[5]//li[text()='KCC Applications']") public WebElement kcc;

	
	
	
	public WebDriver driver;
	public DashboardPage(WebDriver driver)
	
	{
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement adminR() {
		return adminmenu;
	
	}
	
}
