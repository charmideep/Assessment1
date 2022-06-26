package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.Registerpage;

public class Register extends TestBase {
	Registerpage re;
	
	public Register()
	{
		super();
	}
	@BeforeMethod
	public void setup() throws InterruptedException
	{
		
		initialization();
		re=new Registerpage();
	}
	@Test
	public void click_on_reg() throws InterruptedException
	{
		 re.click_reg();
	String actaul=re.click_con(pro.getProperty("fname"),pro.getProperty("lname"),pro.getProperty("email"),pro.getProperty("telp"),pro.getProperty("psw"),pro.getProperty("repsw"));
	Assert.assertEquals(actaul,"Your Account Has Been Created!");
	}
	
	@AfterMethod()
	public void teardown()
	{
		driver.quit();
	}

}
