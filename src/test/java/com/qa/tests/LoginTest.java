package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.Loginpage;

public class LoginTest extends TestBase {
	Loginpage lp;
	public LoginTest()
	{
		super();
	}
	@BeforeMethod
	public void setup() throws InterruptedException
	{
		initialization();
		lp=new Loginpage();
		
	}
	@Test
	public void login()
	{
		String actaul=lp.login(pro.getProperty("email"),pro.getProperty("psw"));
		Assert.assertEquals(actaul,"My Account");
		System.out.println("Sucessfully login");
	    String exp=lp.check_expensive();
	    
	    Assert.assertEquals(exp, "MacBook Pro");
	    System.out.println("The most expensive laptop is macbook pro.");

	}
	

	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}

}
