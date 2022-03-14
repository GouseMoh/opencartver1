package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;                         
	public HomePage(WebDriver driver)  //constructor
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//Elements
	@FindBy(xpath=" //span[normalize-space()='My Account']")
	WebElement  lnkMyaccount;
	@FindBy(linkText="Register")
	WebElement lnkReg;
	@FindBy(linkText="Login")
	WebElement lnklogin;
	
	public void clickmyaccount()
	{
		lnkMyaccount.click();
	}
	public void clickregistration()
	{
		lnkReg.click();
	}
	public void clicklogin() 
	{
		lnklogin.click();
	}
	
		
		
	}
	
	
	


