package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Irctc {
	
	public static void main(String[] args) throws InterruptedException {
		
			
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Naveenaa\\eclipse-workspace\\Selenium\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.irctc.co.in/");
		
		driver.manage().window().maximize();
		
		WebElement fromTxt = driver.findElement(By.xpath("//input[@placeholder='From*']"));
		
		fromTxt.sendKeys("MAS");
		
		Thread.sleep(1000);
		
		fromTxt.sendKeys(Keys.ENTER);
		
		WebElement Totxt = driver.findElement(By.xpath("//input[@placeholder='To*']"));
		
		Totxt.sendKeys("CBE");
		
		Thread.sleep(1000);
		
		Totxt.sendKeys(Keys.ENTER);
		
		WebElement submitBtn = driver.findElement(By.xpath("//button[@label='Find Trains']"));
		
		submitBtn.click();
		
		Thread.sleep(5000);
		
		driver.quit();
		
		
		
		
		
	}

}
