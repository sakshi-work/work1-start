package com.selenium;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class work1 {

@Test
 public void verifyfacebookhomepage()
 {                //git testing
	 String URL = "https://www.facebook.com";
	 //open the url of selenium
	 System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 //System.setProperty("webdriver.ie.driver","C:\\IEDriverServer_Win32_3.150.1\\IEDriverServer.exe");
	 //WebDriver driver=new InternetExplorerDriver();
	 		
	 //to maximise the browser
	 driver.manage().window().maximize();
	 driver.get(URL);
	//verify HomePageTitle
	 String pagetitle=driver.getTitle();
	 System.out.println("We get the title like:"+pagetitle);
	 Assert.assertEquals(pagetitle,"Facebook – log in or sign up");
	 //to close the browser
	 driver.close();
	 
 }
}
