package com.qa.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class Verify_costpage extends TestBase {

	public Verify_costpage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[@onclick=\"cart.add('43');\"]")
	WebElement Addtocart1;
	
	@FindBy(xpath="//button[@onclick=\"cart.add('40');\"]")
	WebElement Addtocart2;
	
	@FindBy(xpath="//a[@title=\"Shopping Cart\"]")
	WebElement cart;
	
	//@FindBy(xpath="//td[@class=\"text-left\"]/a")
	//List<WebElement> list1;
	
	@FindBy(xpath="//table[@class=\"table table-bordered\"]//tr[2]/td[6]")
	WebElement add1;
	
	@FindBy(xpath="//tbody/tr[1]/td[6]")
	WebElement add2;
	
	public int check_price()
	{
		int sum=0;
		Addtocart1.click();
		Addtocart2.click();
		cart.click();
		String s=add1.getText();
		
			
			String[] p=s.split("$");
			int price=Integer.parseInt(p[0]);
		String s1=add2.getText();
		String[] p1=s1.split("$");
		int price1=Integer.parseInt(p1[0]);
		
		sum=price+price1;
		
		//sum=sum+Integer.parseInt(add1.getText());
		//sum=sum+Integer.parseInt(add2.getText());
		//sum=sum+(add1.getText().toI)
		return sum;
		
		
	}
	
	//div[@class="button-group"]/button[1]
	//span[text()="Add to Cart"][1]
}
