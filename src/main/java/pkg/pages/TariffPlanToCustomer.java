package pkg.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pkg.baseClass.TestBase;

public class TariffPlanToCustomer extends TestBase {
	
	@FindBy(name="customer_id")
	WebElement customerId;
	
	@FindBy(name="submit")
	WebElement submitButton;
	
	public TariffPlanToCustomer()
	{
		PageFactory.initElements(driver, this);
	}

}
