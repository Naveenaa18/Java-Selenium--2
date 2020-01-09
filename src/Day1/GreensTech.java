package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensTech {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Naveenaa\\eclipse-workspace\\Selenium\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement emailTxt = driver.findElement(By.id("email"));
		
		emailTxt.sendKeys("Naveenaa");
				
		WebElement pwdTxt = driver.findElement(By.id("pass"));
		
		pwdTxt.sendKeys("Naveenaa1234");
		
		String email = emailTxt.getAttribute("value");
		
		System.out.println(email);
		
		String pass = pwdTxt.getAttribute("value");
		
		System.out.println(pass);
		
		Thread.sleep(3000);
		
		driver.quit();
		
	}

}
