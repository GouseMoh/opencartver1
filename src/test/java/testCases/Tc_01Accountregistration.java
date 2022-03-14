package testCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.AccountregistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class Tc_01Accountregistration extends BaseClass
{
	   @Test
		public  void test_account_Registration() throws IOException
	    {
		
		logger.info("Tc_01Accountregistration");
		logger.info("Opening the app url");
		driver.get(rb.getString("appURL"));
		driver.manage().window().maximize();
		
		HomePage hp=new HomePage(driver);
		logger.info("click on myaccount.....");
		hp.clickmyaccount();
		logger.info("click on registation account");
		hp.clickregistration();
		logger.info("provide user details..");
		
		AccountregistrationPage rp=new AccountregistrationPage(driver);
		logger.info("Given firstname");
		rp.setfirstname("naveen");
		logger.info("Given lastname");
		rp.setlastname("sajjala");
		logger.info("Given email");
		rp.setemail(randomestring()+"@gmail.com");
		logger.info("Given telephone number");
		rp.settelephone("8971552442");
		logger.info("provided psword");
		rp.setpassword("naveen1233 ");
		logger.info("conpassword");
		rp.setconformpas("naveen1233");
		logger.info("click on privacypolicy");
		rp.setPrivacypolicy();
		logger.info("click on continue");
		rp.btcontinue();
		
		String confmsg=rp.getConformationMsg();
		if(confmsg.equals("Your Account Has Been Created!"))
		{
			logger.info("Account registration success");
			Assert.assertTrue(true);
		}
		else
		    {
			captureScreen(driver,"test_account_Registration");
			logger.error("Account registration is fail");
			Assert.assertTrue(false);
		}
		
		
	}


	

}
