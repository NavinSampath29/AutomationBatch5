package Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

	public static void main(String[] args) {
		
		// Selenium : Jar file - Executable file which is developed in JAVA codes from the team called thoughtworks 
		
		// Selenium is a open source // It is avilable for free of cost 
		
		// Whatever starting with HTTPS:// can be automated using selenium
		
		// It can 	 only web applications
		
		// WebElement 
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\AutomationTrainingB5\\src\\test\\resources\\chromedriver.exe");
		
		// WebDriver - Webdriver is a interface [Important Interview Questions]
		
		WebDriver driver = new ChromeDriver();
		
		// To launch the website 
		
		driver.get("https://www.saucedemo.com/");
		
		// To maximize the screen 
		
		driver.manage().window().maximize();
		
		// To Minimize the screen 
		
		driver.manage().window().minimize();
		
		driver.manage().window().maximize();
		
		// To get the Titile 
		
		String title = driver.getTitle();
		System.out.println(title);
		
		// TO get the current URL 
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		// To close the screen 
		
		driver.close();
		

	}

}
