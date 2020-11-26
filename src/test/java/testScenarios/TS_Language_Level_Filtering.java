package testScenarios;

//import org.openqa.selenium.support.ui.Select;
import mainFunctionalities.WebDevelopmentSearch;
import mainFunctionalities.LanguageLearning;

import org.testng.annotations.*;

import userDefinedLibraries.JSONRead;

public class TS_Language_Level_Filtering extends DriverSetup{
	
	public LanguageLearning filter;
	public WebDevelopmentSearch details;

	@BeforeTest
	public void TC_initiateClasses()
	{
		filter = new LanguageLearning();
		details = new WebDevelopmentSearch();
	}
	@Test(priority=1)
	public void languagesDisplayed()
	{
		openUrl();
		details.search(JSONRead.readJSONData("Course2"));
		details.searchClick();
		filter.setLanguage();
	}
	@Test(priority=2)
	public void extractLanguageDetails()
	{
		filter.extractLanguageDetails();
	}
	@Test(priority=3)
	public void levelsDisplayed()
	{
		filter.setLevels();
	}
	@Test(priority=4)
	public void extractLevelsDetails()
	{
		filter.extractLevelDetails();
	}
	

}