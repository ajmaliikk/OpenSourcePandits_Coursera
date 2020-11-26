package testScenarios;

import mainFunctionalities.WebDevelopmentSearch;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import userDefinedLibraries.JSONRead;

public class TS_WebDevelopment	extends DriverSetup {
	
	public WebDevelopmentSearch details;
	
	@BeforeTest
	public void TC_initiateCourse() {
		details = new WebDevelopmentSearch();
	}
	
	@Test(priority=1)
	public void TC_SearchTextBox() {
		details.search(JSONRead.readJSONData("Course1"));
	}
	
	@Test(priority=2)
	public void TC_SearchButtonClickable() {
		details.searchClick();
	}

	@Test(priority=3)
	public void TC_FilterLanguage() {
		details.filterLanguage(JSONRead.readJSONData("Language"));
	}
	
	@Test(priority=4)
	public void TC_FilterLevel() {
		details.filterLevel(JSONRead.readJSONData("Level"));
	}
	
	@Test(priority=5)
	public void TC_CourseAvailability(){
		details.getCourseDetails(2);
		
	}
	
	@Test(priority=6)
	public void TC_CourseDuration() {
		
		details.getCourseDuration(2);
	}

}
