package Day10;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RoboScreenShot {

	public static void main(String[] args) throws AWTException, InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\AutomationTestingB6\\src\\test\\resources\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		
		// Robot class is used to take screen shots 
		
		Robot r = new Robot();
		
		// Dimensions 
		
		Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
		
		// Rectangle 
		
		Rectangle rr = new Rectangle(screensize);
		
		// Buffered Image 
		
		BufferedImage br = r.createScreenCapture(rr);
		
		// Destaination where needs to be saved 
		
		File destination = new File("C:\\Users\\Dell\\eclipse-workspace\\AutomationTrainingB5\\target\\TC-01.png");

		WebElement username = driver.findElement(By.xpath("//input[contains(@placeholder , 'Username')]"));
		
		WebElement password = driver.findElement(By.xpath("//input[contains(@data-test, 'password')]"));
		
		WebElement login = driver.findElement(By.xpath("//input[contains(@id , 'login-button')]"));
		
		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		login.click();
		
		Thread.sleep(3000);
		
		try {
			ImageIO.write(br, "png", destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
