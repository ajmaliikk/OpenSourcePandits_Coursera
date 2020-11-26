package testScenarios;

import mainFunctionalities.CourseraForCampusForm;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

public class TS_CourseraFormFillupValid extends DriverSetup {
	
	public CourseraForCampusForm fill;

	@BeforeTest
	public void TC_initiateCourse() {
		fill = new CourseraForCampusForm();
	}
	
	@Test(priority=1)
	public void TC_validData() {
		fill.getCourse();
		fill.navigateForm();
		System.out.println("Valid Form Fill-up Started");
		fill.setFormValues(1);
		System.out.println("Valid Form Fill-up completed");
	}
	
}
