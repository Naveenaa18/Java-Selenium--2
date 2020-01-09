package Day1;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ddnFirstFive {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Naveenaa\\eclipse-workspace\\Selenium\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement ddnMonth = driver.findElement(By.id("month"));
		
		Select s = new Select (ddnMonth);
		
		List <WebElement> newList = s.getOptions();
		
		for(int i = 6; i<8 ;i++)
		{
			WebElement months = newList.get(i);
			
	//		String value = months.getText();
			
	//		s.selectByVisibleText(value);
			
			s.selectByIndex(i);
		
		List <WebElement> selectedOptions = s.getAllSelectedOptions();
		
			for (int j = 0; j < selectedOptions.size(); j++) {
				
				
				WebElement toPrint = selectedOptions.get(j);
				
				String firstFive = toPrint.getText();
				
				System.out.println(firstFive);		
				
			}			
		}	
	driver.quit();		
	}		
			
}


