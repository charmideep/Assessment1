package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class DataProviderLogin extends TestBase {
	public DataProviderLogin()
	{
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//li[@class='dropdown']")
	WebElement myaccount;
	
	@FindBy(linkText="Login")
	WebElement login;
	
	@FindBy(name="email")
	WebElement em;
	
	@FindBy(name="password")
	WebElement ps;
	
	@FindBy(xpath="//input[@value=\"Login\"]")
	WebElement lclick;
	
	@FindBy(xpath="//h2[contains(text(),'My Account')]")
	WebElement actaul;
	
	
	public String  login(String email,String psw)
	{
		myaccount.click();
		login.click();
		em.sendKeys(email);
		ps.sendKeys(psw);
		lclick.click();
		return actaul.getText();
	}

}
