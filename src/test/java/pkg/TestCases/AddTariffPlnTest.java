package pkg.TestCases;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pkg.baseClass.TestBase;
import pkg.pages.addTariffPlan;
import pkg.pages.homePage;
import pkg.resources.ExcelReader;

public class AddTariffPlnTest extends TestBase {
	
	homePage hp;
	addTariffPlan addTariff;
	String sheet="TariffPlan";
	
	
	public AddTariffPlnTest()
	{
		super();
		
	}
	
	@BeforeMethod
	public void setUp()
	{
		initilize();
		hp=new homePage();
		hp.addTariffPlan();
	}
	
	
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data= ExcelReader.readData(sheet);
		return data;
	}
	
	@Test(priority=1,dataProvider="getData")
	public void addTariff(String monthRental, String flocalmin, String fintmin, String fsmspack, String localcharge, String intCharge, String smsChrage)
	{
		
		addTariff=new addTariffPlan();
		addTariff.addTariff(monthRental, flocalmin, fintmin, fsmspack, localcharge, intCharge, smsChrage);
		addTariff.navigateToHome();
		}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
