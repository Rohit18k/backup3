package com.mario.qa.testcases2;

import java.util.List;
import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.fitsyn.qa.base.TestBase1;

public class ChangeStatus extends TestBase1{

	Random r=new Random();
	
	public ChangeStatus() {
	super();
	}
	
	@BeforeTest
	public void openBrowser() throws Exception {
		initializationDrivers();
	}

	
	
	 @Test(priority=1)
		public  void changeServiceRequest() throws Exception {		
			Thread.sleep(9000);	
			
			
			try { 
				
				WebElement vehicledetails=	driver.findElement(By.xpath("//*[@id=\"mat-input\" or @formcontrolname='allocatedVehicle' or @data-placeholder='Vehicle Number, Make, Model (Truck License Plate)']"));
				  
				   if (vehicledetails.isDisplayed()) {
						Thread.sleep(2000);	
						 Actions action=new Actions(driver);
						   action.moveToElement(vehicledetails).click().build().perform();
						   
						   vehicledetails.clear();
										   
						   vehicledetails.sendKeys("ASD");
						   
											  Thread.sleep(2000);
											  
											  List<WebElement> lstt1= driver.findElements(By.xpath("//mat-option"));
											  lstt1.get(lstt1.size()-1).click(); 
											  
											  
											  Thread.sleep(2000);
											  
											  
											  WebElement clockin=	driver.findElement(By.xpath("//button[@form='allocateTruckForm']/span[contains(text(),'Clock In')]"));
											   Actions action1=new Actions(driver);
											   action1.moveToElement(clockin).click().build().perform();
				   }}
				   catch(Exception e ) {
					  e.printStackTrace();
				   }
				
			
				   try {
					   Thread.sleep(5000);
						 Actions action4=new Actions(driver);
						   action4.moveToElement( driver.findElement(By.xpath("//*[@id=\"container-1\"]/fuse-sidebar/navbar/navbar-vertical-style-1/div[2]/div[1]/fuse-navigation/div/fuse-nav-vertical-item[4]/a/span"))).click().build().perform();
							
				   
				   }
				   catch(Exception e ) {
						  e.printStackTrace();
					   }
		
			
					   Thread.sleep(5000);
									   
									   Actions action5=new Actions(driver);
									   action5.moveToElement( driver.findElement(By.xpath("//*[@id=\"service-requests\"]/div[2]/div/div[3]/manage-service-requests/app-service-request-table/div/div/mat-table/mat-row/mat-cell/div/div[2]/div[3]/span/span"))).click().build().perform();
										
								   
	 }
	
	
}
