package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	 WebDriver driver;

	public LoginPage  (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//input[@id='input-email']")
	WebElement txtemailAddress;
	@FindBy(xpath="//input[@id='input-password']")
	WebElement txtpassword;
	@FindBy(xpath="//input[@value='Login']")
	WebElement clickLogin;
	@FindBy(xpath="//h2[normalize-space()='My Account']")
	WebElement msgHeading;
	
	public void setemail(String email)
	{
		txtemailAddress.sendKeys(email);
	}
	public void setpassword (String pwd)
	{
		txtpassword.sendKeys(pwd);
	}
	public void clicklogin()
	{
		clickLogin.click();
	}
	public boolean isMyAccountPageExist()
	{
		try
		{
			return(msgHeading.isDisplayed());
		}
		catch(Exception e)
		{
			return(false);
		}
		
		}
	}
	
	
	
	
	
