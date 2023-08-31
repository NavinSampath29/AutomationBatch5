package Day16;

import org.testng.annotations.Test;

public class TestNgTAGS {
	
	@Test
	public void logintc()
	{
		System.out.println("Login Tc Executed");
		throw new RuntimeException();
	}

	@Test(dependsOnMethods = "logintc")
	public void hometc()
	{
		System.out.println("Home Tc Executed");

	}
	
	@Test(dependsOnMethods = "logintc")
	public void checkout()
	{
		System.out.println("checkout Tc Executed");

	}
	
	@Test(dependsOnMethods = "logintc")
	public void logouttc()
	{
		System.out.println("logouttc Tc Executed");

	}
	
	
	
	
}
