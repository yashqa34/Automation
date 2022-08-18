package BasePage;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	
	public WebDriver driver;
	public Properties prop;
	
	public WebDriver initializeBrowser() throws Exception
	{
		prop = new Properties();
		FileInputStream fis =new FileInputStream("C:/Users/Dell/eclipse-workspace/Sample/src/main/java/BasePage/Properties");
		prop.load(fis);
		String browserName=prop.getProperty("Browser");
		System.out.println("hiii");
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:/Users/Dell/eclipse-workspace/Sample/Drivers/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browserName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "/Users/apple/eclipse-workspace/E2ETesting.zip_expanded/E2ETesting/BrowserUtils/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(browserName.equals("edge"))
		{
			System.setProperty("webdriver.edge.driver", "/Users/apple/eclipse-workspace/E2ETesting.zip_expanded/E2ETesting/BrowserUtils/msedgedriver.exe");
			driver = new EdgeDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		return driver;
	}
	
	@BeforeMethod
	public void launchBrowser() throws Exception
	{
		driver=initializeBrowser();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.quit();
	}




}

