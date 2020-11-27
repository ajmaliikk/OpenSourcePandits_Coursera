package testScenarios;





import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import userDefinedLibraries.Utilities;

public class DriverSetup extends Utilities{
	
	
	public static WebDriver driver;
	
	@BeforeSuite
	@Parameters("browser")
	public void openWebsite(String browser)
	{
		DriverSetup.browse=browser;
		/*          For Grid       */
		
			//driver=GridDriver();
		
		
		driver = getDriver(browser);
		openUrl();	
	}
	
	
	
	@AfterSuite
	public void exitBrowser()
	{
		quitBrowser();
	}

}
