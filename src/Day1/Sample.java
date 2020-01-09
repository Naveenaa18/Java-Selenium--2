package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;

public class Sample {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Naveenaa\\eclipse-workspace\\Selenium\\chromedriver\\chromedriver.exe");
		
		WebDriver obj = new ChromeDriver();
		
		
//		obj.get("https://www.amazon.com/");		
//		obj.navigate().back();		
//		obj.navigate().forward();		
//		obj.navigate().refresh();
		
		
		obj.navigate().to("https://www.adactin.com/HotelApp/");
		
		WebElement txtUserName = obj.findElement(By.id("username"));
		
		txtUserName.sendKeys("Naveenaa");
		
	//	txtUserName.sendKeys("Madhavaram");
		
		WebElement txtPass = obj.findElement(By.id("password"));
		
		txtPass.sendKeys("12345678");

		
	}

}
