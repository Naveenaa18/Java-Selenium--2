package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Greens {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Naveenaa\\eclipse-workspace\\Selenium\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		WebElement txtboxFirstName = driver.findElement(By.xpath("//input[@ng-model='FirstName']"));
		
		txtboxFirstName.sendKeys("Naveenaa");
		
		WebElement txtboxLastName = driver.findElement(By.xpath("//input[@ng-model='LastName']"));
		
		txtboxLastName.sendKeys("Srikanth");
		
		WebElement txtboxAddress = driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
		
		txtboxAddress.sendKeys("Cbe");
		
		WebElement txtboxEmail = driver.findElement(By.xpath("//input[@ng-model='EmailAdress']"));
		
		txtboxEmail.sendKeys("naveenaa907@gmail.com");
		
		WebElement txtboxPhone = driver.findElement(By.xpath("//input[@ng-model='Phone']"));
		
		txtboxPhone.sendKeys("8976452310");
		
		WebElement radioBtn = driver.findElement(By.xpath("//input[@value='FeMale']"));
		
		radioBtn.click();
		
		WebElement checkBox1 = driver.findElement(By.id("checkbox1"));
		
		checkBox1.click();
		
		WebElement lang = driver.findElement(By.id("msdd"));
		
		lang.click();
		
		WebElement english = driver.findElement(By.xpath("(//a[@class='ui-corner-all'])[8]"));
		
		english.click();
		
		WebElement emptySpace = driver.findElement(By.xpath("//label[contains(text(),'Lang')]"));
		
		//WebElement emptySpace = driver.findElement(By.xpath("//label[text()='Lang']"));
		
		emptySpace.click();	
		
		WebElement skills = driver.findElement(By.id("Skills"));
		
		//skills.click();
		
		Select s = new Select (skills);
		
		s.selectByVisibleText("Java");
		
		WebElement d = driver.findElement(By.xpath("//div[contains(text(),'2016')]"));
		
		js.executeScript("arguments[0].scrollIntoView(true)", d);
		
		WebElement countryDdn = driver.findElement(By.id("countries"));
		
		Select s1 = new Select(countryDdn);
		
		s1.selectByVisibleText("India");
		
		WebElement countrySelect = driver.findElement(By.xpath("//span[@class = 'select2-selection select2-selection--single']"));
		
		countrySelect.sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("India",Keys.ENTER);
			
		WebElement yearDdn = driver.findElement(By.id("yearbox"));
		
		yearDdn.sendKeys("1995");
		
		WebElement monthDdn = driver.findElement(By.xpath("//select[@ng-model='monthbox']"));
		
		monthDdn.sendKeys("April");
		
		WebElement dayDdn = driver.findElement(By.id("daybox"));
		
		dayDdn.sendKeys("18");
		
		WebElement password = driver.findElement(By.id("firstpassword"));
		
		js.executeScript("arguments[0].setAttribute('value','Password')", password)	;
		
		WebElement pwdConfirm = driver.findElement(By.id("secondpassword"));
		
		js.executeScript("arguments[0].setAttribute('value','Password')", pwdConfirm);	
		
		driver.findElement(By.id("submitbtn")).click();
		
		Thread.sleep(5000);
		
		driver.quit();
	}

}
