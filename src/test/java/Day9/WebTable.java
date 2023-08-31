package Day9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\AutomationTestingB6\\src\\test\\resources\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		
		// table 
		
		// TR - ROWS 
		
		// TH - COLOUMN HEADER 
		
		// TD - ROWS DATAS 
		
		
		WebElement table = driver.findElement(By.xpath("//table[contains(@id , 'customers')]"));
	
		List<WebElement> coloumn =  driver.findElements(By.xpath("//table[contains(@id , 'customers')]/tbody/tr/th"));
	
		List<WebElement> th = driver.findElements(By.xpath("//table[contains(@id , 'customers')]/tbody/tr/th"));
		
		List<WebElement> rowdats = driver.findElements(By.xpath("//table[contains(@id , 'customers')]/tbody/tr/td"));
	
		for(WebElement e : th)
		{
			System.out.println(e.getText());
		}
		
		System.out.println("********************************");
		
		for(WebElement w : rowdats)
		{
			System.out.println(w.getText());
		}

		
		// Coloumn Size 
		
		// Where to start > 0 <=  coloumn size
		
		for(int i = 1 ; i <= coloumn.size() ; i++)
		{
			List<WebElement> coloumnvalues = driver.findElements(By.xpath("//table[contains(@id , 'customers')]/tbody/tr/th["+i+"]"));
			
			for(WebElement e : coloumnvalues)
			{
				List<WebElement> rowvalues = driver.findElements(By.xpath("//table[contains(@id , 'customers')]/tbody/tr/td["+i+"]"));
				for(WebElement w :rowvalues )
				{
					System.out.println(e.getText());
					System.out.println(w.getText());
					System.out.println("*************************");
				}
			}
			
		
		
		}
		
		
		
	
	}

}
