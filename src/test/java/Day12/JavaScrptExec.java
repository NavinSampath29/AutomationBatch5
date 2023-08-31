package Day12;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScrptExec {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\AutomationTestingB6\\src\\test\\resources\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		JavascriptExecutor js = (JavascriptExecutor)driver ;
		
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.xpath("//input[contains(@placeholder , 'Username')]"));
		
		WebElement password = driver.findElement(By.xpath("//input[contains(@data-test, 'password')]"));
		
		WebElement login = driver.findElement(By.xpath("//input[contains(@id , 'login-button')]"));
		
		username.sendKeys("standard_user");
		
		//js.executeScript("document.getElementById('password').value ='secret_sauce'");
		
		js.executeScript("arguments[0].value='secret_sauce'", password);
		js.executeScript("arguments[0].click()", login);
		
		//js.executeScript("window.scrollTo(0,1100)");
		
		WebElement at = driver.findElement(By.xpath("//button[contains(@id , 'add-to-cart-test.allthethings()-t-shirt-(red)' )]"));
		
		js.executeScript("arguments[0].scrollIntoView(true)", at);
		
		
		

	}

}
