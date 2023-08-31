package Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathWokring {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\AutomationTrainingB5\\src\\test\\resources\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		WebElement username = driver.findElement(By.xpath("//input[contains(@placeholder , 'Username')]"));

		WebElement password = driver.findElement(By.xpath("//input[contains(@id , 'password')]"));
		
		WebElement login = driver.findElement(By.xpath("//input[contains(@data-test, 'login-button')]"));
		
		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		login.click();
		
		WebElement link = driver.findElement(By.xpath("//a[text() = 'LinkedIn']"));
		
		link.click();
	}

}
