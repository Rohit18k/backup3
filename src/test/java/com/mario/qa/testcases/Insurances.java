package com.mario.qa.testcases;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.fitsyn.qa.base.TestBase1;

public class Insurances extends TestBase1{

	Random r=new Random();
	
	public Insurances() {
	super();
	}
	
//	@BeforeTest
//	public void openBrowser() throws Exception {
//		initialization();
//	}


	@Test(priority=1)
	public  void addInsurance() throws Exception {
		
		Thread.sleep(3000);	
		
		 try { 
				
			  WebElement clockbutton=  driver.findElement(By.xpath("//*[@id=\"mat-dialog-0\"]/app-clock-in-popup/div/div[2]/button"));
			  
			   if (clockbutton.isDisplayed()) {
					Thread.sleep(2000);	
				   clockbutton.click();
			   }}
			   catch(Exception e ) {
				  e.printStackTrace();
			   }
			
			   try {
				   WebElement sidebar=	driver.findElement(By.xpath("//*[@id=\"container-1\"]/fuse-sidebar/navbar/navbar-vertical-style-1/div[2]/div[1]/fuse-navigation/div/fuse-nav-vertical-collapsable[2]/a/span"));
				   Actions action=new Actions(driver);
				   action.moveToElement(sidebar).click().build().perform();
			   
			   }
			   catch(Exception e ) {
					  e.printStackTrace();
				   }

		   Thread.sleep(2000);
			WebElement insaurance=	driver.findElement(By.xpath("//*[@id=\"container-1\"]/fuse-sidebar/navbar/navbar-vertical-style-1/div[2]/div[1]/fuse-navigation/div/fuse-nav-vertical-collapsable[2]/div/fuse-nav-vertical-item[10]/a/span"));
		   ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", insaurance);
		   Thread.sleep(2000);
		   Actions action1=new Actions(driver);
		   action1.moveToElement(insaurance).click().build().perform();
		   Thread.sleep(2000);   
		   driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		   
		   
		   
		   JavascriptExecutor js = (JavascriptExecutor) driver;
		   js.executeScript("window.scrollBy(0,350)", "");
		   
		   
		   try {
		   
			  Thread.sleep(7000);   
		
			  WebElement addicon=driver.findElement(By.xpath("//button[@id=\"add-insurance-button\" or @aria-label='add insurance']/span/mat-icon[contains(text(),'add')]"));
			  
		   Actions action2=new Actions(driver);
		   action2.moveToElement(addicon).click().build().perform();}
		   catch(Exception e) {
			   e.printStackTrace();
		   }

		   Thread.sleep(2000);   
		   
		   
		   Actions action7112=new Actions(driver);
		   action7112.moveToElement(driver.findElement(By.xpath("//button[@aria-label='Save' or @type='submit']/span"))).click().build().perform();
		   

		   Thread.sleep(1000);  
		   
		   
		   String text1=driver.findElement(By.xpath("//mat-error[contains(text(),'Vehicle is required!')]")).getText();
			System.out.println(text1);
			String exp1="Vehicle is required!";
			Assert.assertEquals(text1,exp1);
		   
		   
			WebElement vehiclenumber= driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='vehicle' or @data-placeholder='Vehicle Number, Make, Model (Truck License Plate)']"));
				   
				   
				   
				   Actions action6=new Actions(driver);
				   action6.moveToElement(vehiclenumber).click().build().perform();
				   
				   
				   vehiclenumber.sendKeys("ASD");
				   
				  // vehiclenumber.sendKeys("ford");
				   Thread.sleep(1000);
				   
				   vehiclenumber.sendKeys(Keys.ARROW_DOWN);
				   vehiclenumber.sendKeys(Keys.ENTER);
				   
				   
				   String text2=driver.findElement(By.xpath("//mat-error[contains(text(),'Insurance Provider is required!')]")).getText();
					System.out.println(text2);
					String exp2="Insurance Provider is required!";
					Assert.assertEquals(text2,exp2);
					
//				   Thread.sleep(1000);   
//   
//
//				   driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='insuranceProvider' or @data-placeholder='Insurance Provider']")).click();
//				   
//				   
//				   
//				   Thread.sleep(2000);  
				   
	   
				   Thread.sleep(2000);   
				   
					WebElement insuranceprovider=	driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='insuranceProvider' or @data-placeholder='Insurance Provider']"));
						   
					insuranceprovider.sendKeys("pem");
					  Thread.sleep(2000);
					  
					  List<WebElement> lstt1= driver.findElements(By.xpath("//mat-option"));
					  lstt1.get(lstt1.size()-1).click(); 
				   
				   
				   
				   
				   
				   
				 //  selectOptionsFromDropdown("Pem");
				   
				 //  selectOptionsFromDropdown("Private Insurer A");
				   
				   
				   
				   
				   
				   driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='insuranceNumber' or @data-placeholder='Insurance Number']")).sendKeys("12655461");
				   
				   
			   String text3=driver.findElement(By.xpath("//mat-error[contains(text(),'Insurance start date is required!')]")).getText();
					System.out.println(text3);
					String exp3="Insurance start date is required!";
					Assert.assertEquals(text3,exp3);
				   
					   Thread.sleep(1000);
					    
					    
					    WebElement insauracestartdate= driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='insuranceStartDate' or @data-placeholder='Insurance Start Date']"));					   
						   
						   Actions action1011=new Actions(driver);
						   action1011.moveToElement(insauracestartdate).click().build().perform();
						   Thread.sleep(2000);
						   
						   while(true){	  
								  String text=driver.findElement(By.xpath("//mat-calendar-header/div[@class='mat-calendar-header']")).getText();

							if(text.equalsIgnoreCase("FEB 2021")){
								break;}
							else {
								driver.findElement(By.xpath("//mat-calendar-header/div/div/button[2]")).click();
								 Thread.sleep(2000);
							}
						   
				}  
				   
						   driver.findElement(By.xpath("//mat-month-view/table/tbody/tr[3]/td[4]")).click();
				   
				   
				   
					 String text40=driver.findElement(By.xpath("//mat-error[contains(text(),'Insurance end date is required!')]")).getText();
					System.out.println(text40);
					String exp40="Insurance end date is required!";
					Assert.assertEquals(text40,exp40);
	
					
					 Thread.sleep(1000);
					   
					 WebElement permitenddate= driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='insuranceEndDate' or @data-placeholder='Insurance End Date']"));					   
					 					   
					 					   Actions action10=new Actions(driver);
					 					   action10.moveToElement(permitenddate).click().build().perform();
					 					   Thread.sleep(2000);
					 					   
					 					   while(true){	  
					 							  String mon=driver.findElement(By.xpath("//mat-calendar-header/div[@class='mat-calendar-header']")).getText();

					 						if(mon.equalsIgnoreCase("OCT 2022")){
					 							break;}
					 						else {
					 							driver.findElement(By.xpath("//mat-calendar-header/div/div/button[3]")).click();
					 							 Thread.sleep(2000);
					 						}
					 					   
					 	 }
					 	    driver.findElement(By.xpath("//mat-month-view/table/tbody/tr[3]/td[6]")).click();
					 			
					 	   Thread.sleep(1000);
					  
					  driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='premium' or @data-placeholder='Premium']")).sendKeys("5000$");
					  
					  
					  driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='liability' or @data-placeholder='Liability']")).sendKeys("500$");
					  
					  
					  driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='collisionDeductible' or @data-placeholder='Collision Deductible Amount']")).sendKeys("1000$");
					  
					  
					  driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='comprehensiveDeductible' or @data-placeholder='Comprehensive Deductible Amount']")).sendKeys("200$");
					
					  
					
					  Thread.sleep(1000);
			           Actions actn12111=new Actions (driver);
			           actn12111.moveToElement(driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='declaredValue' or @data-placeholder='Declared Value Amount']"))).click().build().perform(); 
					  
			           
			           
			           driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='declaredValue' or @data-placeholder='Declared Value Amount']")).sendKeys("4000$");
			           
			           
					  
					   
					  Thread.sleep(2000);
			           Actions actn121=new Actions (driver);
			           actn121.moveToElement(driver.findElement(By.xpath("//input[@name=\"upload\" or @type='file']"))).click().build().perform();  
			           
			           File file = new File("./Image/5032.jpg");
			           driver.findElement(By.xpath("//input[@name=\"upload\" or @type='file']")).sendKeys(file.getAbsolutePath());
			           
			           
			           
			         Thread.sleep(5000);
			        
    
	    Actions action7111=new Actions(driver);
		   action7111.moveToElement(driver.findElement(By.xpath("//button[@aria-label='Save' or @type='submit']"))).click().build().perform();

}

	@Test(priority=2) 	
	public void editInsurance() throws Exception {
		
		   Thread.sleep(7000);  
		   
		
		 Actions action21=new Actions(driver);

		  action21.moveToElement(driver.findElement(By.xpath("//*[@id=\"insurances\"]/div[2]/div/div[3]/manage-insurances/div[2]/div/div[2]/div[10]/div[2]/a[2]"))).click().build().perform();
		 
	
		
	

		   Thread.sleep(2000);  
		   
		   
		
		   
			WebElement vehiclenumber= driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='vehicle' or @data-placeholder='Vehicle Number, Make, Model (Truck License Plate)']"));
				   
				   
				   
				   Actions action6=new Actions(driver);
				   action6.moveToElement(vehiclenumber).click().build().perform();
				   
				   
				   vehiclenumber.clear();
				   Thread.sleep(1000);
				   
				   vehiclenumber.sendKeys("ASD");
				 //  vehiclenumber.sendKeys("ford");
				   Thread.sleep(2000);
				   
				   vehiclenumber.sendKeys(Keys.ARROW_DOWN);
				   vehiclenumber.sendKeys(Keys.ENTER);
				   
				   
				
//					
//				   Thread.sleep(1000);   
//  
//
//				   driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='insuranceProvider' or @data-placeholder='Insurance Provider']")).click();
//				   
//				   
				   
					WebElement insuranceprovider=	driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='insuranceProvider' or @data-placeholder='Insurance Provider']"));
						   
					
					
					insuranceprovider.clear();
					  Thread.sleep(2000);
					insuranceprovider.sendKeys("pem");
					  Thread.sleep(2000);
					  
					  List<WebElement> lstt1= driver.findElements(By.xpath("//mat-option"));
					  
					  Thread.sleep(2000);
					  lstt1.get(lstt1.size()-1).click(); 
				   
				   
				   
				   
//				   Thread.sleep(2000);   
//				   
//				   selectOptionsFromDropdown("Pem");
				   
				  // selectOptionsFromDropdown("Private Insurer B");
				   
				   
				   driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='insuranceNumber' or @data-placeholder='Insurance Number']")).clear();
				   
				   
				   
				   
				   driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='insuranceNumber' or @data-placeholder='Insurance Number']")).sendKeys("853265475");
				   
				   
			
				   
					   Thread.sleep(1000);
					    
					    
					    WebElement insauracestartdate= driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='insuranceStartDate' or @data-placeholder='Insurance Start Date']"));					   
						   
						   Actions action1011=new Actions(driver);
						   action1011.moveToElement(insauracestartdate).click().build().perform();
						   Thread.sleep(2000);
						   
						   while(true){	  
								  String text=driver.findElement(By.xpath("//mat-calendar-header/div[@class='mat-calendar-header']")).getText();

							if(text.equalsIgnoreCase("APR 2021")){
								break;}
							else {
								driver.findElement(By.xpath("//mat-calendar-header/div/div/button[3]")).click();
								 Thread.sleep(2000);
							}
						   
				}  
				   
						   driver.findElement(By.xpath("//mat-month-view/table/tbody/tr[3]/td[4]")).click();
				   
				   
				   
					
					 Thread.sleep(1000);
					   
					 WebElement permitenddate= driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='insuranceEndDate' or @data-placeholder='Insurance End Date']"));					   
					 					   
					 					   Actions action10=new Actions(driver);
					 					   action10.moveToElement(permitenddate).click().build().perform();
					 					   Thread.sleep(2000);
					 					   
					 					   while(true){	  
					 							  String mon=driver.findElement(By.xpath("//mat-calendar-header/div[@class='mat-calendar-header']")).getText();

					 						if(mon.equalsIgnoreCase("DEC 2022")){
					 							break;}
					 						else {
					 							driver.findElement(By.xpath("//mat-calendar-header/div/div/button[3]")).click();
					 							 Thread.sleep(2000);
					 						}
					 					   
					 	 }
					 	    driver.findElement(By.xpath("//mat-month-view/table/tbody/tr[3]/td[6]")).click();
					 			
					 	   Thread.sleep(1000);
					  
					 	  driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='premium' or @data-placeholder='Premium']")).clear();
					 	  
					  driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='premium' or @data-placeholder='Premium']")).sendKeys("6000$");
					  
					  
					  driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='liability' or @data-placeholder='Liability']")).clear();
					  
				  
					  driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='liability' or @data-placeholder='Liability']")).sendKeys("600$");
					  
					  
					  driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='collisionDeductible' or @data-placeholder='Collision Deductible Amount']")).clear();
					  
					  
					  driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='collisionDeductible' or @data-placeholder='Collision Deductible Amount']")).sendKeys("1200$");
					  
					  
					  driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='comprehensiveDeductible' or @data-placeholder='Comprehensive Deductible Amount']")).clear();		
					  
					  
					  driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='comprehensiveDeductible' or @data-placeholder='Comprehensive Deductible Amount']")).sendKeys("250$");
					
					  
					
					  Thread.sleep(1000);
			           Actions actn12111=new Actions (driver);
			           actn12111.moveToElement(driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='declaredValue' or @data-placeholder='Declared Value Amount']"))).click().build().perform(); 
					  
			           
			           driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='declaredValue' or @data-placeholder='Declared Value Amount']")).clear();
			           
			           
			           
			           driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='declaredValue' or @data-placeholder='Declared Value Amount']")).sendKeys("5000$");
			           
			           
					  
					   
					  Thread.sleep(2000);
			           Actions actn121=new Actions (driver);
			           actn121.moveToElement(driver.findElement(By.xpath("//input[@name=\"upload\" or @type='file']"))).click().build().perform();  
			           
			           File file = new File("./Image/5032.jpg");
			           driver.findElement(By.xpath("//input[@name=\"upload\" or @type='file']")).sendKeys(file.getAbsolutePath());
			           
			           
			           
			         Thread.sleep(5000);
			        
   
	    Actions action7111=new Actions(driver);
		   action7111.moveToElement(driver.findElement(By.xpath("//button[@aria-label='Update' or @type='submit']"))).click().build().perform();
	
	
	
	}
	
		
	
	@Test(priority=3) 	
	public void sortInsurance() throws Exception {

		Thread.sleep(3000);		
				   
				   Actions action5=new Actions(driver);
					WebElement sort=	driver.findElement(By.xpath("//*[@id=\"sorting-select\"]/div"));
					action5.moveToElement(sort).doubleClick().build().perform();
				   
					 Thread.sleep(2000);
					 
			List<WebElement> lst= driver.findElements(By.xpath("//div[@class=\"sorting-field-data ng-star-inserted\"]"));

	   
	   int size = lst.size();
	   System.out.println(size);
	   
	   
	   for(int i = 0; i<size; i++) {
	       
	   	lst.get(i).click();
	       
	   }			

	   driver.navigate().refresh();
	}
	
	
	
	@Test(priority=4)
	public  void viewInsuranceDetails() throws Exception {		

	Thread.sleep(3000);	
	
	  Actions action2=new Actions(driver);
	  action2.moveToElement(driver.findElement(By.xpath("//*[@id=\"insurances\"]/div[2]/div/div[3]/manage-insurances/div[2]/div/div[2]/div[10]/div[2]/a[1]/mat-icon"))).click().build().perform();
	 
	  Thread.sleep(5000);  
	  
	  String status=  driver.findElement(By.xpath("//*[@id=\"insurance-detail\"]/div[2]/div[1]/div/div/div[1]/div[2]/div[1]/mat-label[2]/strong")).getText();
		System.out.println(status);
		
		
		String number=  driver.findElement(By.xpath("//*[@id=\"insurance-detail\"]/div[2]/div[1]/div/div/div[1]/div[2]/div[2]/mat-label[2]")).getText();
		System.out.println(number);
		
		String liability=  driver.findElement(By.xpath("//*[@id=\"insurance-detail\"]/div[2]/div[1]/div/div/div[1]/div[2]/div[2]/mat-label[4]")).getText();
		System.out.println(liability);
		
		
		String premium=  driver.findElement(By.xpath("//*[@id=\"insurance-detail\"]/div[2]/div[1]/div/div/div[1]/div[2]/div[3]/mat-label[2]")).getText();
		System.out.println(premium);
		
		String collision=  driver.findElement(By.xpath("//*[@id=\"insurance-detail\"]/div[2]/div[1]/div/div/div[1]/div[2]/div[3]/mat-label[4]")).getText();
		System.out.println(collision);
		
		
		String comphrehensive=  driver.findElement(By.xpath("//*[@id=\"insurance-detail\"]/div[2]/div[1]/div/div/div[1]/div[2]/div[4]/mat-label[2]")).getText();
		System.out.println(comphrehensive);
		
		

		String declared=  driver.findElement(By.xpath("//*[@id=\"insurance-detail\"]/div[2]/div[1]/div/div/div[1]/div[2]/div[4]/mat-label[4]")).getText();
		System.out.println(declared);
		

		String startdate=  driver.findElement(By.xpath("//*[@id=\"insurance-detail\"]/div[2]/div[1]/div/div/div[1]/div[2]/div[5]/mat-label[2]")).getText();
		System.out.println(startdate);
		

		String enddate=  driver.findElement(By.xpath("//*[@id=\"insurance-detail\"]/div[2]/div[1]/div/div/div[1]/div[2]/div[5]/mat-label[4]")).getText();
		System.out.println(enddate);
		
	
		 Thread.sleep(2000);   
			
		  Actions action7111=new Actions(driver);
		   action7111.moveToElement(driver.findElement(By.xpath("//*[@id=\"insurance-detail\"]/div[1]/div/div[1]/mat-icon[1]"))).click().build().perform();
		   
		   driver.close();		   

 }
	

	
//	@Test(priority=5) 	
//	public void DeleteInsurance() throws Exception {
//
//		Thread.sleep(3000);				
//				   Actions action5=new Actions(driver);
//					WebElement sort=	driver.findElement(By.xpath("//*[@id=\"insurances\"]/div[2]/div/div[3]/manage-insurances/div[2]/div/div[2]/div[10]/div[2]/button"));
//					action5.moveToElement(sort).click().build().perform();
//					
//					  Thread.sleep(2000);
//					  
//					  Actions action6=new Actions(driver);
//					  
//						WebElement sort1=	driver.findElement(By.xpath("//*[@id=\"mat-dialog-0\"]/fuse-confirm-dialog/mat-dialog-actions/button"));
//						action6.moveToElement(sort1).click().build().perform();
//						  
//			
//	}
	
	
	
	
	
	
	
	
	
}
