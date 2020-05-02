package com.selenium.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebElementpackage {
    @Test
	public void ReddifTest() {
	
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
	//open the reddif.com
    driver.get("https://www.reddit.com/");
    //verify page title
    String pageTitle=driver.getTitle();
    Assert.assertEquals(pageTitle,"reddit: the front page of the internet");
    
    //click sigh-in button
    WebElement loginlink=driver.findElement(By.linkText("log in"));
    loginlink.click();
    
    
    //verify sign-in page title
    
    //insert usename and password
    WebElement username=driver.findElement(By.id("loginUsername"));
    WebElement password=driver.findElement(By.name("password"));
    username.sendKeys("rishan@reddif");
    try {
		Thread.sleep(4000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    password.sendKeys("test123");
    try {
		Thread.sleep(4000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    
  //click submit button
    WebElement submitkey=driver.findElement(By.className("AnimatedForm__submitButton"));
    submitkey.click();
    //verify the Profile Title
    
    
    
    	
	}
}
