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
import com.github.javafaker.Faker;

public class Permits extends TestBase1{

	Random r=new Random();
	
	public Permits() {
	super();
	}
	
	@BeforeTest
	public void openBrowser() throws Exception {
		initialization();
	}


	@Test(priority=1)
	public  void addPermit() throws Exception {
		
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
			
		 Thread.sleep(5000);	
		
			   try {
				   WebElement sidebar=	driver.findElement(By.xpath("//*[@id=\"container-1\"]/fuse-sidebar/navbar/navbar-vertical-style-1/div[2]/div[1]/fuse-navigation/div/fuse-nav-vertical-collapsable[2]/a/span"));
				   Actions action=new Actions(driver);
				   action.moveToElement(sidebar).click().build().perform();
			   
			   }
			   catch(Exception e ) {
					  e.printStackTrace();
				   }

		   Thread.sleep(5000);
		   
			WebElement permit=	driver.findElement(By.xpath("//*[@id=\"container-1\"]/fuse-sidebar/navbar/navbar-vertical-style-1/div[2]/div[1]/fuse-navigation/div/fuse-nav-vertical-collapsable[2]/div/fuse-nav-vertical-item[9]/a/span"));
		   ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", permit);
		   Thread.sleep(2000);
		   Actions action1=new Actions(driver);
		   action1.moveToElement(permit).click().build().perform();
		   Thread.sleep(2000);   
		   driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		   
		   
		   
		   JavascriptExecutor js = (JavascriptExecutor) driver;
		   js.executeScript("window.scrollBy(0,350)", "");
		   
		   
		   try {
		   
			  Thread.sleep(7000);   
		
			  WebElement addicon=driver.findElement(By.xpath("//button[@id=\"add-permit-button\" or @aria-label='add permit']/span/mat-icon[contains(text(),'add')]"));
			  
		   Actions action2=new Actions(driver);
		   action2.moveToElement(addicon).click().build().perform();}
		   catch(Exception e) {
			   e.printStackTrace();
		   }

		   Thread.sleep(5000);   
		   
		   
		   Actions action7112=new Actions(driver);
		   action7112.moveToElement(driver.findElement(By.xpath("//button[@aria-label='Save' or @type='submit']/span"))).click().build().perform();
		   

		   Thread.sleep(1000);  
		   
		   
		   String text1=driver.findElement(By.xpath("//mat-error[contains(text(),'Vehicle is required!')]")).getText();
			System.out.println(text1);
			String exp1="Vehicle is required!";
			Assert.assertEquals(text1,exp1);
		   
		   
			WebElement vehiclenumber= driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='vehicle' or @data-placeholder='Vehicle Number, VIN, License Plate']"));
				   
				   
				   
				   Actions action6=new Actions(driver);
				   action6.moveToElement(vehiclenumber).click().build().perform();
				   
				   
				   vehiclenumber.sendKeys("ASD");
				  // vehiclenumber.sendKeys("GJ-01-KV-");
				   Thread.sleep(1000);
				   
				   vehiclenumber.sendKeys(Keys.ARROW_DOWN);
				   vehiclenumber.sendKeys(Keys.ENTER);
				   
				   
				   String text2=driver.findElement(By.xpath("//mat-error[contains(text(),'Permit type is required!')]")).getText();
					System.out.println(text2);
					String exp2="Permit type is required!";
					Assert.assertEquals(text2,exp2);
					
				   Thread.sleep(1000);   
   

				   driver.findElement(By.xpath("//mat-select[@id=\"mat-input\" or @formcontrolname='permitTypes' or @matinput='permitTypes']")).click();
				   
				   
				   
				   Thread.sleep(1000);   
				   selectOptionsFromDropdown("Oversize");
		   
				   String text3=driver.findElement(By.xpath("//mat-error[contains(text(),'Permit start date is required!')]")).getText();
					System.out.println(text3);
					String exp3="Permit start date is required!";
					Assert.assertEquals(text3,exp3);
				   
					   Thread.sleep(1000);
					    
					    
					    WebElement permitstartdate= driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='permitStartDate' or @data-placeholder='Permit Start Date']"));					   
						   
						   Actions action1011=new Actions(driver);
						   action1011.moveToElement(permitstartdate).click().build().perform();
						   Thread.sleep(2000);
						   
						   while(true){	  
								  String text=driver.findElement(By.xpath("//mat-calendar-header/div[@class='mat-calendar-header']")).getText();

							if(text.equalsIgnoreCase("MAR 2021")){
								break;}
							else {
								driver.findElement(By.xpath("//mat-calendar-header/div/div/button[2]")).click();
								 Thread.sleep(2000);
							}
						   
				}  
				   
						   driver.findElement(By.xpath("//mat-month-view/table/tbody/tr[3]/td[4]")).click();
				   
				   
				   
					 String text40=driver.findElement(By.xpath("//mat-error[contains(text(),'Permit end date is required!')]")).getText();
					System.out.println(text40);
					String exp40="Permit end date is required!";
					Assert.assertEquals(text40,exp40);
	
					
					 Thread.sleep(1000);
					   
					 WebElement permitenddate= driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='permitEndDate' or @data-placeholder='Permit End Date']"));					   
					 					   
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
					 			
					  
					  
					  driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='permitValue' or @data-placeholder='Permit Amount']")).sendKeys("250");
					   
					  Thread.sleep(2000);
			           Actions actn121=new Actions (driver);
			           actn121.moveToElement(driver.findElement(By.xpath("//button/span[contains(text(),'Upload')]"))).click().build().perform();  
			           
			           Thread.sleep(2000);
			           
			           Actions actn1211=new Actions (driver);
			           actn1211.moveToElement(driver.findElement(By.xpath("//input[@type='file' or @name='upload']"))).click().build().perform();  
			           
			           
			           
			           Robot robot=new Robot();
			           robot.setAutoDelay(5000);
			           File file = new File("./Image/5032.jpg");	
			           StringSelection stringSelection=new StringSelection(file.getAbsolutePath());
			           Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
			           clipboard.setContents(stringSelection, null);
			           robot.setAutoDelay(5000);
			           robot.keyPress(KeyEvent.VK_CONTROL);
			           robot.keyPress(KeyEvent.VK_V);
			           
			           robot.keyRelease(KeyEvent.VK_V);
			           robot.keyRelease(KeyEvent.VK_CONTROL);
			           
			           robot.setAutoDelay(5000);
			           
			           robot.keyPress(KeyEvent.VK_ENTER);
			           robot.keyRelease(KeyEvent.VK_ENTER);
			           
			           
			           Thread.sleep(5000);
			         Actions actn111=new Actions (driver);
			         actn111.moveToElement(driver.findElement(By.xpath("//button/span[contains(text(),'Apply')]"))).click().build().perform();
			         
			         Thread.sleep(5000);
			        
    
	    Actions action7111=new Actions(driver);
		   action7111.moveToElement(driver.findElement(By.xpath("//button[@aria-label='Save' or @type='submit']"))).click().build().perform();

}
	
	
	@Test(priority=2) 	
	public void sortPermit() throws Exception {

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
	   sort.click();
	 
	}

	
	
	
	
	@Test(priority=3) 	
	public void editPermit() throws Exception {
		
		   Thread.sleep(7000);  
		   
		
		 Actions action21=new Actions(driver);

		  action21.moveToElement(driver.findElement(By.xpath("//*[@id=\"permits\"]/div[2]/div/div[3]/manage-permits/div[2]/div/div[2]/div[6]/div[2]/a[2]"))).click().build().perform();
		 
		  
//		  Thread.sleep(1000);  
//		   
//		   
//			WebElement vehiclenumber= driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='vehicle' or @data-placeholder='Vehicle Number, VIN, License Plate']"));
//				   
//				   
//				   
//				   Actions action6=new Actions(driver);
//				   action6.moveToElement(vehiclenumber).click().build().perform();
//				   
//				   vehiclenumber.clear();
//				   vehiclenumber.sendKeys("GJ-01-KV-");
//				   Thread.sleep(1000);
//
//				   vehiclenumber.sendKeys(Keys.ENTER);
				   
					
				   Thread.sleep(2000);   
  

				   driver.findElement(By.xpath("//mat-select[@id=\"mat-input\" or @formcontrolname='permitTypes' or @matinput='permitTypes']")).click();
				   
				   
				   
				   Thread.sleep(1000);   
				   selectOptionsFromDropdown("Oversize/Overweight");
		   
					   Thread.sleep(4000);
					    
					    
					    WebElement permitstartdate= driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='permitStartDate' or @data-placeholder='Permit Start Date']"));					   
						   
						   Actions action1011=new Actions(driver);
						   action1011.moveToElement(permitstartdate).click().build().perform();
						   Thread.sleep(2000);
						   
						   while(true){	  
								  String text=driver.findElement(By.xpath("//mat-calendar-header/div[@class='mat-calendar-header']")).getText();

							if(text.equalsIgnoreCase("MAY 2021")){
								break;}
							else {
								driver.findElement(By.xpath("//mat-calendar-header/div/div/button[3]")).click();
								 Thread.sleep(2000);
							}
						   
				}  
				   
						   driver.findElement(By.xpath("//mat-month-view/table/tbody/tr[2]/td[4]")).click();
				   
				   
					
					 Thread.sleep(1000);
					   
					 WebElement permitenddate= driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='permitEndDate' or @data-placeholder='Permit End Date']"));					   
					 					   
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
					 	    
					 			
					 	   driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='permitValue' or @data-placeholder='Permit Amount']")).clear();
						   
					  
					  driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='permitValue' or @data-placeholder='Permit Amount']")).sendKeys("250");
					   
					  Thread.sleep(2000);
			           Actions actn121=new Actions (driver);
			           actn121.moveToElement(driver.findElement(By.xpath("//button/span[contains(text(),'Upload')]"))).click().build().perform();  
			           
			           Thread.sleep(2000);
			           
			           Actions actn1211=new Actions (driver);
			           actn1211.moveToElement(driver.findElement(By.xpath("//input[@type='file' or @name='upload']"))).click().build().perform();  
			           
			           
			           
			           Robot robot=new Robot();
			           robot.setAutoDelay(5000);
			           File file = new File("./Image/5032.jpg");	
			           StringSelection stringSelection=new StringSelection(file.getAbsolutePath());
			           Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
			           clipboard.setContents(stringSelection, null);
			           robot.setAutoDelay(5000);
			           robot.keyPress(KeyEvent.VK_CONTROL);
			           robot.keyPress(KeyEvent.VK_V);
			           
			           robot.keyRelease(KeyEvent.VK_V);
			           robot.keyRelease(KeyEvent.VK_CONTROL);
			           
			           robot.setAutoDelay(5000);
			           
			           robot.keyPress(KeyEvent.VK_ENTER);
			           robot.keyRelease(KeyEvent.VK_ENTER);
			           
			           
			           Thread.sleep(5000);
			         Actions actn111=new Actions (driver);
			         actn111.moveToElement(driver.findElement(By.xpath("//button/span[contains(text(),'Apply')]"))).click().build().perform();
			        
			         
			         
			         Thread.sleep(2000);  
					   
					   
						WebElement vehiclenumber= driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='vehicle' or @data-placeholder='Vehicle Number, VIN, License Plate']"));
							   
							   
							   
							   Actions action6=new Actions(driver);
							   action6.moveToElement(vehiclenumber).click().build().perform();
							   
							   vehiclenumber.clear();
							   
							   Thread.sleep(1000);
							   
							   vehiclenumber.sendKeys("ASD");
							   //vehiclenumber.sendKeys("GJ-01-KV-");
							   Thread.sleep(1000);

							   vehiclenumber.sendKeys(Keys.ENTER);
							   
			         
	         
			         Thread.sleep(5000);
			        
   
	    Actions action7111=new Actions(driver);
		   action7111.moveToElement(driver.findElement(By.xpath("//button[@aria-label='Update' or @type='submit']"))).click().build().perform();
	
	
	
	}
	
	@Test(priority=4) 	
	public void sortPermit1() throws Exception {

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
	   sort.click();
	 
	}

	

	
	 @Test(priority=5)
		public  void viewPermitDetails() throws Exception {		

		Thread.sleep(7000);	
		

		  Actions action2=new Actions(driver);
		  action2.moveToElement(driver.findElement(By.xpath("//*[@id=\"permits\"]/div[2]/div/div[3]/manage-permits/div[2]/div/div[2]/div[6]/div[2]/a[1]/mat-icon"))).click().build().perform();
		 
		  Thread.sleep(5000);  
		  
		  String status=  driver.findElement(By.xpath("//*[@id=\"permit-detail\"]/div[2]/div/app-permit-view/div[1]/div/div/div/div[1]/mat-label[2]/strong")).getText();
			System.out.println(status);
			
			
			String expired=  driver.findElement(By.xpath("//*[@id=\"permit-detail\"]/div[2]/div/app-permit-view/div[1]/div/div/div/div[1]/mat-label[4]")).getText();
			System.out.println(expired);
			
			String type=  driver.findElement(By.xpath("//*[@id=\"permit-detail\"]/div[2]/div/app-permit-view/div[1]/div/div/div/div[2]/mat-label[2]")).getText();
			System.out.println(type);
			
			
			String startdate=  driver.findElement(By.xpath("//*[@id=\"permit-detail\"]/div[2]/div/app-permit-view/div[1]/div/div/div/div[3]/mat-label[2]")).getText();
			System.out.println(startdate);
			
			String enddate=  driver.findElement(By.xpath("//*[@id=\"permit-detail\"]/div[2]/div/app-permit-view/div[1]/div/div/div/div[3]/mat-label[3]/b")).getText();
			System.out.println(enddate);
			
			
			String vehiclenumber=  driver.findElement(By.xpath("//*[@id=\"permit-detail\"]/div[2]/div/app-permit-view/div[1]/div/div/div/div[4]/mat-label[2]")).getText();
			System.out.println(vehiclenumber);
			
			 Thread.sleep(2000);   
				
			  Actions action7111=new Actions(driver);
			   action7111.moveToElement(driver.findElement(By.xpath("//*[@id=\"permit-detail\"]/div[1]/div/div[1]/mat-icon[1]"))).click().build().perform();
	

	 }
	 
//	 
//	 @Test(priority=6) 	
//		public void sortPermit2() throws Exception {
//
//			Thread.sleep(3000);		
//					   
//					   Actions action5=new Actions(driver);
//						WebElement sort=	driver.findElement(By.xpath("//*[@id=\"sorting-select\"]/div"));
//						action5.moveToElement(sort).doubleClick().build().perform();
//					   
//						 Thread.sleep(2000);
//						 
//				List<WebElement> lst= driver.findElements(By.xpath("//div[@class=\"sorting-field-data ng-star-inserted\"]"));
//
//		   
//		   int size = lst.size();
//		   System.out.println(size);
//		   
//		   
//		   for(int i = 0; i<size; i++) {
//		       
//		   	lst.get(i).click();
//		       
//		   }			
//			driver.findElement(By.xpath("//*[@id=\"permits\"]/div[1]/div/div[1]/span")).click();
//		 
//		}


	 
//	 @Test(priority=7) 	
//	 public void deleteDetails() throws Exception {
//
//	 	Thread.sleep(7000);					
//	 	
//	 			   Actions action5=new Actions(driver);
//	 				WebElement sort=	driver.findElement(By.xpath("//*[@id=\"permits\"]/div[2]/div/div[3]/manage-permits/div[2]/div/div[2]/div[6]/div[2]/button"));
//	 				action5.moveToElement(sort).click().build().perform();
//	 				
//	 				  Thread.sleep(2000);
//	 				  
//	 				  Actions action6=new Actions(driver);
//	 				  
//	 					WebElement sort1=	driver.findElement(By.xpath("//*[@id=\"mat-dialog-0\"]/fuse-confirm-dialog/mat-dialog-actions/button"));
//	 					action6.moveToElement(sort1).click().build().perform();
//	 					  
//	 		
//	 }
	
}
