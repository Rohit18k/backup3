package com.mario.qa.testcases;

import java.util.Locale;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.fitsyn.qa.base.TestBase1;
import com.github.javafaker.Faker;

public class LoggoutUser extends TestBase1{

	Random r=new Random();
	
	public LoggoutUser() {
	super();
	}
	
	@BeforeTest
	public void openBrowser() throws Exception {
		initialization();
	}
	

	
	 @Test(priority=1)
		public  void loggoutAdminUser() throws Exception {
			
			Thread.sleep(5000);		
			
			
			 try { 
					
				  WebElement clockbutton=  driver.findElement(By.xpath("//*[@id=\"mat-dialog-0\"]/app-clock-in-popup/div/div[2]/button"));
				  
				   if (clockbutton.isDisplayed()) {
						Thread.sleep(2000);	
					   clockbutton.click();
				   }}
				   catch(Exception e ) {
					  e.printStackTrace();
				   }
			 
			 
			  Thread.sleep(5000);
				
				   try {
					   WebElement loggedinusers=	driver.findElement(By.xpath("//*[@id=\"container-3\"]/toolbar/mat-toolbar/div/div[8]/button/span[1]/div/span"));
					   Actions action=new Actions(driver);
					   action.moveToElement(loggedinusers).click().build().perform();
				   
				   }
				   catch(Exception e ) {
						  e.printStackTrace();
					   }
				   
			   Thread.sleep(5000);
				WebElement loggoutusers=	driver.findElement(By.xpath("//*[@id=\"mat-menu-panel-0\"]/div/button[4]/span"));
			   Actions action1=new Actions(driver);
			   action1.moveToElement(loggoutusers).click().build().perform();
			  
driver.close();
		 
		 }
	
	
	
	
	
	
	
	
	
}
