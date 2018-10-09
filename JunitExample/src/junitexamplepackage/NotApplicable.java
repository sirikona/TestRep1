package junitexamplepackage;

import org.junit.AfterClass;
import org.junit.BeforeClass;

public class NotApplicable {
	
	@BeforeClass
	public void app_Launch()
	{
		System.out.println("Launching application..");
	}
	@AfterClass
	public void app_Exit()
	{
		System.out.println("Exiting application..");
	}
}
