package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
	
	public static void main(String[] args) throws InterruptedException {
			
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Naveenaa\\eclipse-workspace\\Selenium\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		WebElement searchtxt = driver.findElement(By.name("q"));
		
		searchtxt.sendKeys("greens technology");
		
		Thread.sleep(1000);
		
		searchtxt.sendKeys(Keys.ENTER);
		
		Thread.sleep(4000);
		
		driver.quit();
	}

}
