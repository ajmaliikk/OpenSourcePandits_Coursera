package tests;



import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import utilities.BaseUi;

public class BaseClass extends BaseUi{
	
	
	public static WebDriver driver;
	
	@BeforeSuite
	@Parameters("browser")
	public void openWebsite(String browser)
	{
		/*          For Grid       */
		//driver=GridDriver();
		BaseClass.browse=browser;
		driver = getDriver(browser);
		openUrl();	
	}
	
	
	
	@AfterSuite
	public void exitBrowser()
	{
		quitBrowser();
	}

}
