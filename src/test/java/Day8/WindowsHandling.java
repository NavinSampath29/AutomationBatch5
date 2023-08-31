package Day8;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {

	public static void main(String[] args) throws InterruptedException {
		
		// Windows Handling - Handling the tabs said to be as windows 
		
		//  Selenium focus will be on the web elements which is on the page 0 parent window 
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\AutomationTestingB6\\src\\test\\resources\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		// Relative xpath 
		
		// Using contains
		
			// //TAGNAME[contains(@Attributename , 'AttributeValue')]
		
		WebElement username = driver.findElement(By.xpath("//input[contains(@placeholder , 'Username')]"));
		
		WebElement password = driver.findElement(By.xpath("//input[contains(@data-test, 'password')]"));
		
		WebElement login = driver.findElement(By.xpath("//input[contains(@id , 'login-button')]"));
		
		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		login.click();
		
		String curent = driver.getWindowHandle();
		
		WebElement linkedin = driver.findElement(By.xpath("//a[text() = 'LinkedIn']"));
		linkedin.click();
		
		//  Importan interview questions 
		
		Set<String> allwindows = driver.getWindowHandles();
		
		// List to get the windows index as we dont have get method in set 
		
		List<String> setofwindows = new ArrayList<String>(allwindows);
		
		String newtab1 = setofwindows.get(1);
		
		driver.switchTo().window(newtab1);
		Thread.sleep(5000) ;
		
		driver.close();
		
		driver.switchTo().window(curent);
		
		
		
		
		
	}

}
