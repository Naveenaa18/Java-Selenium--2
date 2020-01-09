package Day1;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Naveenaa\\eclipse-workspace\\Selenium\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://toolsqa.com/automation-practice-form/");
		
		driver.manage().window().maximize();
		
		WebElement dDnOption = driver.findElement(By.id("selenium_commands"));
		
		Select s = new Select (dDnOption);
		
		List<WebElement> listElements = s.getOptions();
		
		for (int i=0;i<listElements.size();i++) {
			
			if(i%2 != 0)
			{
			WebElement options = listElements.get(i);
			
			String commands = options.getText();
			
			s.selectByVisibleText(commands);
			}
			
		}
		
		List <WebElement> selectedOptions = s.getAllSelectedOptions();
		
		for(int i=0;i<selectedOptions.size();i++)		{
			
			WebElement seleniumCommands = selectedOptions.get(i);
			String output = seleniumCommands.getText();
		
//		for (WebElement webElement : selectedOptions) {
			
		//	String selectedCommands = webElement.getText();
			System.out.println(output);
		}
	
	Thread.sleep(2000);
	driver.quit();
	
	}
	
}
