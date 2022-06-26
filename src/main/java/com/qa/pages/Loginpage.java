package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class Loginpage extends TestBase {
	
	public Loginpage()
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
	
	@FindBy(linkText="Laptops & Notebooks")
	WebElement menu;
	
	@FindBy(xpath="//a[contains(text(),'Show All Laptops & Notebooks')]")
	WebElement shows;
	
	@FindBy(xpath="//select[@id='input-sort']")
	WebElement sort;
	
	@FindBy(xpath="//option[contains(text(),'Price (High > Low)')]")
	WebElement high;
	
	@FindBy(linkText="MacBook Pro")
	WebElement MacBookpro;
	
	public String  login(String email,String psw)
	{
		myaccount.click();
		login.click();
		em.sendKeys(email);
		ps.sendKeys(psw);
		lclick.click();
		return actaul.getText();
	}
	
	public String check_expensive()
	{
		menu.click();
		shows.click();
		sort.click();
		high.click();
		
		return MacBookpro.getText();
		
	}

}
