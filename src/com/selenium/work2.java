package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import org.testng.annotations.Test;




public class work2 {
	WebDriver driver=null;
	@Parameters("browser")
	@BeforeMethod
	public void openbrowser(String browser)
	{    //open the url of selenium
		if(browser.equalsIgnoreCase("chrome"))
		{
         System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
	
		}
		if(browser.equalsIgnoreCase("IE"))
		{
			System.setProperty("webdriver.ie.driver","C:\\IEDriverServer_Win32_3.150.1\\IEDriverServer.exe");
			 driver=new InternetExplorerDriver();	
			 
		}
		driver.manage().window().maximize();
		 
	}
	@AfterMethod
	public void quitbrowser()
		{
			driver.quit();
		}
	
	@Test
	public void verifyfacebookhomepage()
	 {  
		 String URL = "https://www.facebook.com";
		 driver.get(URL);
		//verify HomePageTitle
		 String pagetitle=driver.getTitle();
		 System.out.println("We get the title like:"+pagetitle);
		 Assert.assertEquals(pagetitle,"Facebook – log in or sign up");
		 
		 
	 }
}
