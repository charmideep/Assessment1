package com.qa.tests;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.Verify_costpage;

public class Verify_costTest extends TestBase {
	
	Verify_costpage vc;
	
	public Verify_costTest()
	{
		super();
		
	}
	@BeforeMethod
	public void setup() throws InterruptedException
	{
		initialization();
		vc=new Verify_costpage();
	}
	@Test
	public void check_totalcost()
	{
		int actaul=vc.check_price();
		Assert.assertEquals(actaul,725.20);

		System.out.println("pass");
	
	}
	@AfterMethod()
	public void teardown()
	{
		driver.quit();
	}
}
