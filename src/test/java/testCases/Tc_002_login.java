 package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class Tc_002_login extends BaseClass

{
  @Test
  public void  test_Login()
{
	      logger.info("starting Tc_002_login");
			    try
			         {
				driver.get(rb.getString("appurl"));
		     	logger.info("home page isDisplayed");
				driver.manage().window().maximize();
				  
			    HomePage hp=new HomePage(driver);
			    hp.clickmyaccount();
			    logger.info("clicked into MyAccount");
			    hp.clicklogin();
			    logger.info("clicked into login");
			    
			    LoginPage lp=new LoginPage(driver);
			    lp.setemail(rb.getString("email"));
			    logger.info("Provided email");
			    
			    lp.setpassword(rb.getString("password"));
			    logger.info("Provided pasword");
			    
			    lp.clicklogin();
			    logger.info("clicked tologin");
			    
			    boolean targetpage=lp.isMyAccountPageExist();
			    if(targetpage)
			    {
			    	logger.info("Login success");
			    	Assert.assertTrue(true);
		  	    }
			    else
			    {
			    	logger.error("login Failed");
			    	captureScreen(driver,"testlogin");
			    	Assert.assertTrue(false);
			    }
			}
			catch(Exception e)
			{
				logger.fatal("Login Failed");
				Assert.fail();
			}
			logger.info("Finished Tc_002_login");
			 	
			}
			}



