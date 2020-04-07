package pkg.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pkg.baseClass.TestBase;

public class homePage extends TestBase {
	
	@FindBy(xpath="//div[@class='flex-item left']/div[1]/h3")
	WebElement firstLink;
	
	@FindBy(xpath="//div[@class='flex-item left']/div[2]/h3")
	WebElement secondLink;
	
	@FindBy(xpath="//div[@class='flex-item right']/div[1]/h3")
	WebElement thirdLink;
	
	@FindBy(xpath="//div[@class='flex-item right']/div[2]/h3")
	WebElement fourthLink;
	
	public homePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void addCustomer()
	{
		System.out.println(firstLink.getText());		
		firstLink.click();
		
	}
	
	public void addTariffPlan()
	{
		System.out.println(thirdLink.getText());	
		thirdLink.click();
		
	}
	
	public void addTariffToCustomer()
	{
		secondLink.click();
	}
	
	public void payBilling()
	{
		fourthLink.click();
	}

	}

