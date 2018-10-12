package junitexamplepackage;

import org.junit.Ignore;
import org.junit.Test;

public class JunitClassExample {
	
	@Test
	public void inboxTestMethod()
	{
		System.out.println("1.Inbox Test Method");
	}
	@Ignore
	@Test
	public void sentTestMehtod()
	{
		System.out.println("2.Sent Test Method...set to ignore");	
	}
	@Test
	public void TrashTestMehtod()
	{
		System.out.println("3.Trash Test Method");	
	}
	@Test
	public void SpamTestMehtod()
	{
		System.out.println("4.Spam Test Method");	
	}
	@Test
	public void DraftTestMehtod()
	{
		System.out.println("5.Draft Test Method");	
		System.out.println("This print message added by Sireesha");
	}
}
