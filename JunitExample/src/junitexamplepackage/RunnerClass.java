package junitexamplepackage;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({JunitClassExampleLoginLotout.class,JunitClassExample.class})

public class RunnerClass {
	@BeforeClass
	public static void app_Launch()
	{
		System.out.println("Launching application..");
	}
	@AfterClass
	public static void app_Exit()
	{
		System.out.println("Exiting application..");
	}
}
