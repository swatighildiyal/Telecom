package pkg.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pkg.baseClass.TestBase;

public class addTariffPlan extends TestBase {
	
	@FindBy(name="rental")
	WebElement rental;
	
	@FindBy(name="local_minutes")
	WebElement localMinutes;
	
	@FindBy(name="inter_minutes")
	WebElement interMinutes;
	
	@FindBy(name="sms_pack")
	WebElement smsPack;
	
	@FindBy(name="minutes_charges")
	WebElement minutesCharges;
	
	@FindBy(name="inter_charges")
	WebElement interCharges;

	@FindBy(name="sms_charges")
	WebElement smsCharges;
	
	@FindBy(name="submit")
	WebElement submitButton;
	
	@FindBy(xpath="//div[@class='inner']//h2")
	WebElement tariffMessage;
	
	@FindBy(xpath="//ul[@class='actions']//li//a")
	WebElement homeLink;
	
	public addTariffPlan()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void addTariff(String mr, String flm,String fim, String fsm, String localchrg, String intchrg, String smschrg)
	{
		rental.sendKeys(mr);
		localMinutes.sendKeys(flm);
		interMinutes.sendKeys(fim);
		smsPack.sendKeys(fsm);
		minutesCharges.sendKeys(localchrg);
		interCharges.sendKeys(intchrg);
		smsCharges.sendKeys(smschrg);
		submitButton.click();
		
		}
	
	public void navigateToHome()
	{
		System.out.println(tariffMessage.getText());
		System.out.println(homeLink.getText());
		homeLink.click();
		
		}
	
	

	

}
