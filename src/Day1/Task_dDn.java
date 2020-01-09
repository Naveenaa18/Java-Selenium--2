package Day1;

import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task_dDn {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Naveenaa\\eclipse-workspace\\Selenium\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement ddnMonth = driver.findElement(By.id("month"));
				
		Select s = new Select (ddnMonth);
		
		List<WebElement> optionsMonth = s.getOptions();
		
		int listSize = optionsMonth.size();
		
		Set <WebElement> setMonth = new LinkedHashSet <WebElement>();
		
		setMonth.addAll(optionsMonth);
		
		int setSize = setMonth.size();
		
		if(listSize==setSize)
		{
			System.out.println("There are no duplicates");
		}
		
		else
		{
			System.out.println("Duplicates present");
		}
	
	//Thread.sleep(1000);
		
	//driver.quit();
		
	}

}
