package com.qa.tests;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.DataProviderLogin;
import com.qa.utility.TestUtil;


public class DataProvideLoginTest extends TestBase{
	DataProviderLogin dp;
	
	TestUtil tu;
	String sheetName="contacts";
	public DataProvideLoginTest()
	{
		super();
	}
	@BeforeMethod
	public void setup() throws InterruptedException
	{
		initialization();
		dp=new DataProviderLogin();
		tu=new TestUtil();
		
	}
	@DataProvider
	public Object[][] getTestData1() throws InvalidFormatException, IOException
	{
		Object data[][]=TestUtil.getTestData(sheetName);
		return data;
	}
	@Test(dataProvider="getTestData1")
	public void login(String Email,String Password)
	{
		String actaul=dp.login(Email,Password);
		Assert.assertEquals(actaul,"My Account");
		System.out.println("Sucessfully login");
	    
	}

	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}

}
