package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountregistrationPage {
WebDriver driver;
public AccountregistrationPage(WebDriver driver) 
{
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
@FindBy(id="input-firstname")
WebElement  txtFirstname;

@FindBy(id="input-lastname")
WebElement txtlastname;

@FindBy(css="#input-email")
WebElement txtemail;

@FindBy(xpath="//input[@id='input-telephone']")
WebElement txttelephone;  

@FindBy (css="input#input-password")
WebElement  txtpassword;

@FindBy(css="#input-confirm")
WebElement  txtconformpas;

@FindBy(xpath="//input[@name='agree']")
WebElement chkdPolicy;

@FindBy(xpath="//input[@value='Continue']")
WebElement  btncontine;

@FindBy(xpath="//h1[contains(text(),'Your Account Has Been Created!')]")
WebElement textmessage;

public void  setfirstname(String fname)
{
	txtFirstname.sendKeys(fname);
}
public void setlastname(String lname)
{
	txtlastname.sendKeys(lname);
}
public void setemail(String email)
{
	txtemail.sendKeys(email);
}
public void settelephone(String tel)
{
	txttelephone.sendKeys(tel);
}
public void setpassword(String pwd)
{
	txtpassword.sendKeys(pwd);
}
public void setconformpas(String cnfpwd)
{
	txtconformpas.sendKeys(cnfpwd);
}
public void setPrivacypolicy()
{
	chkdPolicy.click();
}
public void btcontinue()
{
	btncontine.click();
}
public String getConformationMsg()
{
	try
	{
		return(textmessage.getText());
	}
	catch(Exception e)
	{
		return(e.getMessage());
	}

}

}

