package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\AutomationTrainingB5\\src\\test\\resources\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		
		String username = "standard_user" ;
		String password = "secret_sauce" ;
		
		// Locators - To identify web element locators are used 
		
		// By class
		
		//  ID = user-name
		// NAME = password 
		// CLASS
		// LINK TEXT = LinkedIn
		// PARTIAL LINK TEXT = Twi
		// CSS SELECTORS
		// XPATH
		
		WebElement un = driver.findElement(By.id("user-name"));
		WebElement pwd = driver.findElement(By.name("password"));
		WebElement login = driver.findElement(By.name("login-button"));
		
		un.sendKeys(username);
		pwd.sendKeys(password);
		login.click();
		
		// WebElement linkedin = driver.findElement(By.linkText("LinkedIn"));
		// linkedin.click();
		
		WebElement twiter = driver.findElement(By.partialLinkText("Twi"));
		twiter.click();
		
		driver.quit();
		
	}

}
