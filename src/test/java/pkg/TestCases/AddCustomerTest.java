package pkg.TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import pkg.baseClass.TestBase;
import pkg.pages.addCustomerPage;
import pkg.pages.homePage;
import pkg.resources.ExcelReader;

public class AddCustomerTest extends TestBase {
	
	
	
	homePage hp;
	addCustomerPage adCustomer;
	String sheet="Sheet1";
	
	public AddCustomerTest()
	{
		super();
		
	}
	
	@BeforeMethod
	public void setUp()
	{
		initilize();
		hp=new homePage();
		hp.addCustomer();
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data= ExcelReader.readData(sheet);
		return data;
	}
	
	@Test(priority=1, dataProvider="getData")
	public void addNewCustomer(String first,String last,String email, String addres, String mob)
	{
		
		adCustomer=new addCustomerPage();		
		adCustomer.addCust(first, last, email, addres, mob);
		
	}

	@AfterMethod
	public void tearDown()
	{
		System.out.println("Driver needs to be closed");
		driver.close();
		}
	
	

}
