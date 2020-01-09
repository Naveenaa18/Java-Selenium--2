package Day1;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task_EvenOptions {
	
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Naveenaa\\eclipse-workspace\\Selenium\\chromedriver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
	driver.manage().window().maximize();
	
	WebElement ddnMonth = driver.findElement(By.id("month"));
	
	Select s = new Select (ddnMonth);
	
	List <WebElement> optionsMonth = s.getOptions();
	
	for (int i = 0; i < optionsMonth.size(); i++) {
				
		if(i%2!=0)	
		{
		
		WebElement webElementMonth = optionsMonth.get(i);
		
		String months = webElementMonth.getText();
		
		s.selectByVisibleText(months);
		
		List <WebElement> output = s.getAllSelectedOptions();
		
		for(int j=0;j<output.size();j++)
		{
			WebElement value = output.get(j);
			
			String monthsSelected = value.getText();
			
			System.out.println("The selected values are : " +monthsSelected);
		
		}
		
		}
	}
	
driver.quit();
	}

}