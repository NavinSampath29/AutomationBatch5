package Day6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsLearning {

	public static void main(String[] args) {
		
		// Actions class - Actions like right click, drag and drop can be performed using actions clas
		//  Actions class is a class which is coming from selenium inbuild class
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\AutomationTestingB6\\src\\test\\resources\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		
		// Creating object for action class 
		Actions a = new Actions(driver);
		
		WebElement rightclick = driver.findElement(By.xpath("//span[text() = 'right click me']"));
		
		a.contextClick(rightclick).build().perform();
		
		List<WebElement> opt = driver.findElements(By.xpath("//ul[contains(@class , 'context-menu-list context-menu-root')]/li"));
		
		for(WebElement e : opt) {
			System.out.println(e.getText());
			
			if(e.getText().equals("Edit"))
			{
				e.click();
				break;
			}
			
		}
		
		driver.switchTo().alert().accept();
		
		
		

	}

}
