package Day17;

import org.testng.annotations.Test;

public class TestNGTags {


	// InvocationCount - If we need to run a method for more than one time it is used
	
	
	@Test(invocationCount = 100 , invocationTimeOut = 1000)
	public void click()
	{
		System.out.println("Click 5 times");
	}
	
	
}
