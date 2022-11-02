package day5_assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomateRegistrationPage {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.name("firstName")).sendKeys("AAA");
		driver.findElement(By.name("lastName")).sendKeys("BBB");
		driver.findElement(By.name("phone")).sendKeys("123456789");
		driver.findElement(By.id("userName")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[contains(@name,'add')]")).sendKeys("North Street");
		driver.findElement(By.name("city")).sendKeys("XYZ");
		driver.findElement(By.name("state")).sendKeys("ABC");
		driver.findElement(By.name("postalCode")).sendKeys("GHI");
		Select country=new Select(driver.findElement(By.name("country")));
		country.selectByVisibleText("INDIA");
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.name("password")).sendKeys("123@abc");
		driver.findElement(By.name("confirmPassword")).sendKeys("123@abc");
		driver.findElement(By.name("submit")).click();
		
		
		
		

	}

}
