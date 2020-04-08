package pkg.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pkg.baseClass.TestBase;

public class addCustomerPage extends TestBase {
	
	@FindBy(xpath="//input[@id='done']")
	WebElement doneButton;
	
	@FindBy(name="fname")
	WebElement fName;
	
	@FindBy(name="lname")
	WebElement lname;
	
	@FindBy(name="emailid")
	WebElement emailid;
	
	
	@FindBy(xpath="/html/body/section/div/form/div/div[7]/textarea")
	WebElement Message;
	
	@FindBy(id="telephoneno")
	WebElement telephoneno;
	
	@FindBy(name="submit")
	WebElement submitButton;
	
	@FindBy(xpath="//tbody//tr//td//h3")
	WebElement custId;
	
	@FindBy(xpath="//ul[@class='actions']//li//a[@class='button']")
	WebElement homeButton;
	
	
	
	public addCustomerPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void addCust(String firstn,String Lastn,String Email, String Addresss, String Mob)
	{
		JavascriptExecutor executor=(JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", doneButton);
		fName.sendKeys(firstn);
		lname.sendKeys(Lastn);
		emailid.sendKeys(Email);
		telephoneno.sendKeys(Mob);
		Message.sendKeys(Addresss);
		JavascriptExecutor executor1=(JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", submitButton);
		
		}

	
	public WebElement navigateHome()
	{
		System.out.println(custId.getText());
		homeButton.click();
		return custId;
	}
	
	
	
	
	
	
	

}
