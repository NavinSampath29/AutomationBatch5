package Day14;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TagsLearning {
	
	@BeforeMethod
	public void deletecookies()
	{
		System.out.println("2 Cookies Deleted");
	}
	
	@BeforeTest
	public void launchbrowser()
	{
		System.out.println("1 Browser Launched");
	}
	
	@Test
	public void tc01()
	{
		System.out.println("3 Vaidation of login page");
	}

	@AfterMethod
	public void generatereport()
	{
		System.out.println("4 Report Genrated");
	}
	
	@AfterTest
	public void closebrowser()
	{
		System.out.println("5 Browser CLosed");
	}
}
