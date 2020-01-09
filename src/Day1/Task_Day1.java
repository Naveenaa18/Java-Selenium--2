package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_Day1 {

	
	public static void main(String[] args) {
	
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Naveenaa\\eclipse-workspace\\Selenium\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://netbanking.hdfcbank.com/");
		
		WebElement loginId = driver.findElement(By.name("fldCustId"));
		
		loginId.sendKeys("Naveenaa");
		
		
		WebElement btnContinue = driver.findElement(By.xpath("//a[@onclick='return fLogon();']"));
				
		btnContinue.click();
		
		WebElement pwd = driver.findElement(By.xpath("//input[@onkeypress='return fSubmit(event);']"));
		
		pwd.sendKeys("1234567");
		
		
		WebElement text1 = driver.findElement(By.xpath("//p[contains(text(),'I / We ackowledge')]"));
		
		//WebElement text1 = driver.findElement(By.xpath("//p[text()='I / We acknowledge']"));
		
		String msgg = text1.getText();
		
		System.out.println(msgg);
		
		WebElement btnLogin = driver.findElement(By.xpath("//a[@onclick='return fLogon();']"));
		
		btnLogin.click();
		
		WebElement text = driver.findElement(By.xpath("//strong[contains(text(),'The Customer ID')]"));
		
		String msg = text.getText();
		
		System.out.println(msg);
		
		driver.quit();
		
	}
	
}