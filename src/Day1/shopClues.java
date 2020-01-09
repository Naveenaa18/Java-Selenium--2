package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class shopClues {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Naveenaa\\eclipse-workspace\\Selenium\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.shopclues.com/wholesale.html");
		
		driver.manage().window().maximize();
		
		WebElement searchTxt = driver.findElement(By.xpath("//input[@id='autocomplete']"));
		
		searchTxt.sendKeys("Fastrack watch for women");
		
		Thread.sleep(1000);
		
		searchTxt.sendKeys(Keys.ENTER);
		
		WebElement watch = driver.findElement(By.xpath("//img[@id='det_img_131857965']"));
		
		watch.click();
		
		driver.get("https://www.shopclues.com/fastrack-quartz-white-round-men-watch-3121sm01-131857965.html");
		
		WebElement addToCartBtn = driver.findElement(By.id("add_cart"));
		
		addToCartBtn.click();
		
		WebElement cartBtn = driver.findElement(By.xpath("//a[@class='cart_ic']"));
		
		cartBtn.click();
		
		WebElement amount = driver.findElement(By.xpath("//span[@contains(text()='Rs']"));
		
		String msg = amount.getText();
		
		System.out.println(msg);		
		
		
	}

}
