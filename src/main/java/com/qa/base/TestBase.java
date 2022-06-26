package com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	
public static WebDriver driver;
public static Properties pro;
	
	public TestBase()
	{
		
		try {
			pro=new Properties();
			FileInputStream ip=new FileInputStream("C:\\javapra\\Assessment2\\src\\main\\java\\com\\qa\\confirg\\confir.properties ");
			pro.load(ip);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public static void initialization() throws InterruptedException
	{
	String browsername=pro.getProperty("browser");
	
	if(browsername.equals("chrome"))
	{
		// System.setProperty("webdriver.chrome.driver","C:\\seleniumjar1\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		Thread.sleep(2000);
		
	}
	else if(browsername.equals("Edge"))
	{
		// System.setProperty("webdriver.chrome.driver","C:\\seleniumjar1\\chromedriver.exe");
		WebDriverManager.edgedriver().setup();
		driver= new EdgeDriver();
		Thread.sleep(2000);
		
		
	}
	else if(browsername.equals("Firefox "))
	{
		// System.setProperty("webdriver.chrome.driver","C:\\seleniumjar1\\chromedriver.exe");
		WebDriverManager.firefoxdriver().setup();
		driver= new FirefoxDriver();
		Thread.sleep(2000);
		
		
	}
	
	driver.get(pro.getProperty("url"));
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

}
