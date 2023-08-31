package Day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\AutomationTrainingB5\\src\\test\\resources\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");

		// CSS Selector 
		
		// tagname[attributename = 'attributevalue']
		
		WebElement username = driver.findElement(By.cssSelector("input[data-test='username']"));
		WebElement password = driver.findElement(By.cssSelector("input[placeholder='Password']"));
		WebElement login = driver.findElement(By.cssSelector("input[name='login-button']"));
		
		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		login.click();
		
		
		// Select class is used to handle drop down web element
		
		WebElement filter = driver.findElement(By.cssSelector("select[data-test='product_sort_container']"));
		
		Select s = new Select(filter);
		
		List<WebElement> p = s.getOptions();
		
		for(WebElement w : p)
		{
			System.out.println(w.getText());
		}
		
		// Selecting using index values 
		
		 // s.selectByIndex(1);
		
		// Select by visible text 
		
		// s.selectByVisibleText("Price (low to high)");
		
		// Select by value 
		
		s.selectByValue("hilo");
	
		
		
		
	}

}
