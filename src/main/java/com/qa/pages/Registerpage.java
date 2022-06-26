package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class Registerpage extends TestBase {
	
	public Registerpage()
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//li[@class='dropdown']")
	WebElement myaccount;
	
	@FindBy(linkText="Register")
	WebElement register;
	
	@FindBy(name="firstname")
	WebElement firstname;
	
	@FindBy(name="lastname")
	WebElement lastname;
	
	@FindBy(name="email")
	WebElement em;
	
	@FindBy(name="telephone")
	WebElement telep;
	
	@FindBy(name="password")
	WebElement pass;
	
	@FindBy(name="confirm")
	WebElement repass;
	
	@FindBy(name="agree")
	WebElement agree;
	
	@FindBy(xpath="//input[@value='Continue']")
	WebElement cont;
	
	@FindBy(xpath="//h1[contains(text(),'Your Account Has Been Created!')]")
	WebElement check;
	
	
	
	public void click_reg() throws InterruptedException
	{
		
		myaccount.click();
		Thread.sleep(3000);
	    register.click();
	}
	
	public String click_con(String fn,String ln,String email,String tel,String psw,String repasw)
	{
		firstname.sendKeys(fn);
		lastname.sendKeys(ln);
		em.sendKeys(email);
		telep.sendKeys(tel);
		pass.sendKeys(psw);
		repass.sendKeys(repasw);
		agree.click();
		cont.click();
		
		
		return check.getText();
		
	}
	

}
