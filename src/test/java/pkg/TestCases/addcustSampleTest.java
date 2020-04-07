package pkg.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class addcustSampleTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:/Users/ghildiyal/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/addcustomer.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='active' and @value='ACTIVE']")).click();		
		driver.findElement(By.name("fname")).sendKeys("richa");
		driver.findElement(By.name("lname")).sendKeys("chhabra");
		driver.findElement(By.name("emailid")).sendKeys("rc@gmail.com");
		driver.findElement(By.name("telephoneno")).sendKeys("12345");
		driver.findElement(By.name("submit")).click();
		
		
		
		
		
	
		

	}

}
