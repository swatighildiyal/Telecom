package pkg.baseClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase()
	{
		
		
	try
	{
		prop=new Properties();
		FileInputStream ip=new FileInputStream("F:\\Users\\ghildiyal\\eclipse-workspace\\TelecomProject\\src\\main\\java\\pkg\\resources\\config.properties");
		prop.load(ip);
	}
	
	catch(FileNotFoundException e)
	{
		e.printStackTrace();
	}
	
	catch(IOException e)
	{
		e.printStackTrace();
	}
	
}
	
	public void initilize()
	{
		
		System.setProperty("webdriver.chrome.driver", "F:/Users/ghildiyal/Downloads/chromedriver_win32/chromedriver.exe");
		driver=new ChromeDriver();
		String urlSite=prop.getProperty("url");
		driver.get(urlSite);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		}
	
	
	
		
	
	
	
	
	
	

}
