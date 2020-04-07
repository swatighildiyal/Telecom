package pkg.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pkg.baseClass.TestBase;

public class addCustomerPage extends TestBase {
	
	@FindBy(name="fname")
	WebElement fName;
	
	@FindBy(name="lname")
	WebElement lname;
	@FindBy(name="emailid")
	WebElement emailid;
	
	@FindBy(xpath="//*[@id=\"message\"]")
	WebElement Message;
	
	@FindBy(id="telephoneno")
	WebElement telephoneno;
	
	@FindBy(name="submit")
	WebElement submitButton;
	
	public addCustomerPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void addCust(String firstn,String Lastn,String Email, String Addresss, String Mob)
	{
		
	fName.sendKeys(firstn);
		lname.sendKeys(Lastn);
		emailid.sendKeys(Email);
		telephoneno.sendKeys(Mob);
		Message.sendKeys(Addresss);		
		submitButton.click();
		}
	
	
	
	
	
	
	
	

}
