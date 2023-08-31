package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessBrowser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\AutomationTrainingB5\\src\\test\\resources\\chromedriver.exe");

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--headless=new");
		
		WebDriver driver = new ChromeDriver(co);
		
		driver.get("https://www.saucedemo.com/");

		// CSS Selector 
		
		// tagname[attributename = 'attributevalue']
		
		WebElement username = driver.findElement(By.cssSelector("input[data-test='username']"));
		WebElement password = driver.findElement(By.cssSelector("input[placeholder='Password']"));
		WebElement login = driver.findElement(By.cssSelector("input[name='login-button']"));
		
		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		login.click();
		
		String url = "https://www.saucedemo.com/inventory.html";
		
		String cureurl = driver.getCurrentUrl();
		
		if(url.equals(cureurl))
		{
			System.out.println("U have logged in");
		}
		else
		{
			System.out.println("Not logged in");
		}
		
	}

}
