package com.mario.qa.testcases;

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

public class Yards extends TestBase1{

	Random r=new Random();
	
	public Yards() {
	super();
	}
	
	
	@BeforeTest
	public void openBrowser() throws Exception {
		initialization();
	}

	
	 @Test(priority=1)
		public  void addYard() throws Exception {
			
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
					   WebElement sidebar=	driver.findElement(By.xpath("//*[@id=\"container-1\"]/fuse-sidebar/navbar/navbar-vertical-style-1/div[2]/div[1]/fuse-navigation/div/fuse-nav-vertical-collapsable[4]/a/span"));
					   Actions action=new Actions(driver);
					   action.moveToElement(sidebar).click().build().perform();
				   
				   }
				   catch(Exception e ) {
						  e.printStackTrace();
					   }
				   
			   Thread.sleep(5000);
				WebElement yard=	driver.findElement(By.xpath("//*[@id=\"container-1\"]/fuse-sidebar/navbar/navbar-vertical-style-1/div[2]/div[1]/fuse-navigation/div/fuse-nav-vertical-collapsable[4]/div/fuse-nav-vertical-item[2]/a/span"));
			   ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", yard);
			   Thread.sleep(2000);
			   Actions action1=new Actions(driver);
			   action1.moveToElement(yard).click().build().perform();
			   Thread.sleep(2000);   
			   driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			   
			   
			   
			   JavascriptExecutor js = (JavascriptExecutor) driver;
			   js.executeScript("window.scrollBy(0,350)", "");
			   
			   
			   try {
			   
				  Thread.sleep(5000);    
			
				  WebElement addicon=driver.findElement(By.xpath("//*[@id=\"add-yard-button\" or @aria-label='add yard']/span/mat-icon[contains(text(),'add')]"));
				  
			   Actions action2=new Actions(driver);
			   action2.moveToElement(addicon).click().build().perform();}
			   catch(Exception e) {
				   e.printStackTrace();
			   }
			   Thread.sleep(5000);
			   
			   Actions action51=new Actions(driver);
			   action51.moveToElement(driver.findElement(By.xpath("//button[@type='submit' or @aria-label='Add']"))).click().build().perform();
			
			
			   
			   String text1=driver.findElement(By.xpath("//mat-error[contains(text(),'Name is required!')]")).getText();
			   
				System.out.println(text1);
				String exp1="Name is required!";
				Assert.assertEquals(text1,exp1);
	
				Thread.sleep(2000);   
				
				
				String name="SouthYard"+r.nextInt(1000);
				
			   driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='name' or @data-placeholder='Name']")).sendKeys(name);
				
			   Thread.sleep(1000);   
			   
		WebElement territory=	driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='zone' or @data-placeholder='Territory']"));
			   
		territory.sendKeys("N");
		  Thread.sleep(2000);
		  
		  List<WebElement> lstt1= driver.findElements(By.xpath("//mat-option"));
		  lstt1.get(lstt1.size()-1).click(); 
		  
//		  territory.sendKeys(Keys.ARROW_DOWN);					
//		  Thread.sleep(2000);
//		  territory.sendKeys(Keys.ENTER);
				
			   Thread.sleep(1000); 
//			   String text2=driver.findElement(By.xpath(" //mat-error[contains(text(),'Max Spot Count is required!')]")).getText();
//			   
//				System.out.println(text2);
//				String exp2="Max Spot Count is required!";
//				Assert.assertEquals(text2,exp2);
//			   
			   
			   
				driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='maxLotCount' or @data-placeholder='Max Spot Count']")).sendKeys("40");
			
			   
				
				  String text3=driver.findElement(By.xpath("//mat-error[contains(text(),'Yard per 24 hours rate is required!')]")).getText();
				   
					System.out.println(text3);
					String exp3="Yard per 24 hours rate is required!";
					Assert.assertEquals(text3,exp3);
				   
				
				
					driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='yardRate' or @data-placeholder='Yard Per 24 Hours Rate']")).sendKeys("15");
					
					 Thread.sleep(1000); 
					 
					String text4=driver.findElement(By.xpath("//mat-hint[contains(text(),'Address Line is required!')]")).getText();
					   
					System.out.println(text4);
					String exp4="Address Line is required!";
					Assert.assertEquals(text4,exp4);
				   
				WebElement address=	driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='addressLine' or @data-placeholder='Address Line']"));
					
				address.sendKeys("Calg");
					  Thread.sleep(2000);
					  address.sendKeys(Keys.ARROW_DOWN);	
					  Thread.sleep(2000);
					  address.sendKeys(Keys.ENTER);	
					
//		WebElement city= driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='addressCity' or @data-placeholder='City']"));
//					
//		   
//		city.sendKeys("TORONTO");
//			  Thread.sleep(2000);
//			  city.sendKeys(Keys.ARROW_DOWN);					
//			  Thread.sleep(2000);
//			  city.sendKeys(Keys.ENTER);
			  
			  Thread.sleep(1000); 
	
			  driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='addressZipcode' or @data-placeholder='Postal Code']")).sendKeys("T1X 0L3");
			  
			
			  
//			  Thread.sleep(5000);
//			   
//			   Actions action515=new Actions(driver);
//			   action515.moveToElement(driver.findElement(By.xpath("//button[@type='submit' or @aria-label='Add']"))).click().build().perform();
	 }
	
	
	/*
	 @Test(priority=2)
		public  void editYard() throws Exception {
				Thread.sleep(3000);		
				
				  Actions action2=new Actions(driver);

				  action2.moveToElement(driver.findElement(By.xpath("//*[@id=\"yard\"]/div[2]/div/div[3]/manage-yards/div[2]/div/div[2]/div[4]/div[2]/a[2]"))).click().build().perform();
				  
							Thread.sleep(2000);   
							
							
							String name="SouthYard"+r.nextInt(1000);
							
							
							 driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='name' or @data-placeholder='Name']")).clear();
							
						   driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='name' or @data-placeholder='Name']")).sendKeys(name);
							
						   Thread.sleep(1000);   
						   
					WebElement territory=	driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='zone' or @data-placeholder='Territory']"));
						   
					territory.clear();
					
					territory.sendKeys("N");
					  Thread.sleep(2000);
					  
					  List<WebElement> lstt1= driver.findElements(By.xpath("//mat-option"));
					  lstt1.get(lstt1.size()-1).click();
					
									
//					territory.sendKeys("N");
//					  Thread.sleep(2000);
//					  territory.sendKeys(Keys.ARROW_DOWN);					
//					  Thread.sleep(2000);
//					  territory.sendKeys(Keys.ENTER);
							
						   Thread.sleep(1000); 					   
						   
						   
							driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='maxLotCount' or @data-placeholder='Max Spot Count']")).clear();
							
						   
							driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='maxLotCount' or @data-placeholder='Max Spot Count']")).sendKeys("80");
						
						   
							driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='yardRate' or @data-placeholder='Yard Per 24 Hours Rate']")).clear();
							
							
								driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='yardRate' or @data-placeholder='Yard Per 24 Hours Rate']")).sendKeys("25");
								
								 Thread.sleep(1000); 
								 
							   
							WebElement address=	driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='addressLine' or @data-placeholder='Address Line']"));
								
							
							address.clear();
							address.sendKeys("Tor");
								  Thread.sleep(2000);
								  address.sendKeys(Keys.ARROW_DOWN);
								  Thread.sleep(2000);
								  address.sendKeys(Keys.ENTER);	
								
								
//					WebElement city= driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='addressCity' or @data-placeholder='City']"));
//								
//					city.clear();
//					Thread.sleep(2000);
//					city.sendKeys("Ottawa");
//						  Thread.sleep(2000);
//						  city.sendKeys(Keys.ARROW_DOWN);					
//						  Thread.sleep(2000);
//				  city.sendKeys(Keys.ENTER);
						  
						  Thread.sleep(1000);
						  
						  
//						  driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='addressZipcode' or @data-placeholder='Postal Code']")).clear();
//						  
//				
						  driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='addressZipcode' or @data-placeholder='Postal Code']")).sendKeys("M3C 0C1");
						  
						
						  
						  Thread.sleep(5000);
						   
						   Actions action515=new Actions(driver);
						   action515.moveToElement(driver.findElement(By.xpath("//button[@type='submit' or @aria-label='Update']"))).click().build().perform();
	 

	 }

	 
	 @Test(priority=3) 	
	 public void sortYard() throws Exception {

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
		public  void viewYardDetails() throws Exception {		

		Thread.sleep(3000);	
		

		  Actions action2=new Actions(driver);
		  action2.moveToElement(driver.findElement(By.xpath("//*[@id=\"yard\"]/div[2]/div/div[3]/manage-yards/div[2]/div/div[2]/div[4]/div[2]/a[1]/mat-icon"))).click().build().perform();
		 
		  Thread.sleep(5000);   
		  
		  String territory=  driver.findElement(By.xpath("//*[@id=\"yard-details\"]/div[2]/div/div/div/div/div[2]/mat-label[2]/strong")).getText();
			System.out.println(territory);
			
			
			String spotcount=  driver.findElement(By.xpath("//*[@id=\"yard-details\"]/div[2]/div/div/div/div/div[3]/mat-label[2]/strong")).getText();
			System.out.println(spotcount);
			
			String city=  driver.findElement(By.xpath("//*[@id=\"yard-details\"]/div[2]/div/div/div/div/div[4]/mat-label[2]/strong/span/span")).getText();
			System.out.println(city);
			
			  Thread.sleep(1000);   
	
			  Actions action7111=new Actions(driver); 
			   action7111.moveToElement(driver.findElement(By.xpath("//*[@id=\"yard-details\"]/div[1]/div/div[1]/mat-icon[1]"))).click().build().perform();
	
		   
	 }

	 
	/* 
	 @Test(priority=5) 	
	 public void makeSpotFull() throws Exception {

	 	Thread.sleep(3000);					
	 	
	 			   Actions action5=new Actions(driver);             
	 				WebElement sort=	driver.findElement(By.xpath("//*[@id=\"yard\"]/div[2]/div/div[3]/manage-yards/div[2]/div/div[2]/div[4]/div[2]/button[1]"));
	 				action5.moveToElement(sort).click().build().perform();
	 				
	 				  Thread.sleep(2000);
	 				  
	 				  Actions action6=new Actions(driver);
	 				  
	 					WebElement sort1=	driver.findElement(By.xpath("//button/span[contains(text(),'Confirm')]"));
	 					action6.moveToElement(sort1).click().build().perform();
	 					  
	 }
	 
	 
	 
	 
	 @Test(priority=6) 	
	 public void disableYardDetails() throws Exception {

	 	Thread.sleep(3000);					
	 	
	 			   Actions action5=new Actions(driver);              
	 				WebElement sort=	driver.findElement(By.xpath("//*[@id=\"yard\"]/div[2]/div/div[3]/manage-yards/div[2]/div/div[2]/div[4]/div[2]/button[2]"));
	 				action5.moveToElement(sort).click().build().perform();
	 				
	 				  Thread.sleep(2000);
	 				  
	 				  Actions action6=new Actions(driver); 
	 				  
	 					WebElement sort1=	driver.findElement(By.xpath("//*[@id=\"mat-dialog-1\"]/fuse-confirm-dialog/mat-dialog-actions/button/span[1]"));
	 					action6.moveToElement(sort1).click().build().perform();
	 					  
	 }
	 */
	 
}
