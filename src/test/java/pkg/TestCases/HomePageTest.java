package pkg.TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pkg.baseClass.TestBase;
import pkg.pages.homePage;

public class HomePageTest extends TestBase{
	homePage hp;
	
	
	
	
	public HomePageTest()
	{
		super();
	}

	@BeforeMethod
	public void setUp()
	{
		initilize();
		hp=new homePage();
		
		}
	
	@Test(priority=1)
	public void homePgeValidtion()
	{
		hp.addCustomer();
	}
	
	@Test(priority=2)
	public void hoemPgeLinkValidate()
	{
		hp.addTariffPlan();
	}
	
	@AfterMethod
	public void tearDown()
	{
		
		driver.close();
}
}
