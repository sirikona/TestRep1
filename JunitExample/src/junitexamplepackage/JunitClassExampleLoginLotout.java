package junitexamplepackage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JunitClassExampleLoginLotout {
	
	@After
	public void Logout()
	{
		System.out.println("Logout Method");
	}
	@Before
	public void login()
	{
		System.out.println("Login Method");
	}
	@Test
	public void ComposeEmail()
	{
		System.out.println("Compose Email Test method");
		System.out.println("Print message 2 added by Sireesha");
	}
}
