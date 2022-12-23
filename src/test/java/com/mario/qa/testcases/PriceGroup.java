package com.mario.qa.testcases;

import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.apache.commons.lang3.RandomStringUtils;
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

public class PriceGroup extends TestBase1{

	Random r=new Random();
	
	public PriceGroup() {
	super();
	}
	
	@BeforeTest
	public void openBrowser() throws Exception {
		initialization();
	}


	 @Test(priority=1)
		public  void addPriceGroup() throws Exception {
			
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
				   WebElement sidebar=	driver.findElement(By.xpath("//*[@id=\"container-1\"]/fuse-sidebar/navbar/navbar-vertical-style-1/div[2]/div[1]/fuse-navigation/div/fuse-nav-vertical-collapsable[3]/a/span"));
				   Actions action=new Actions(driver);
				   action.moveToElement(sidebar).click().build().perform();
			   
			   }
				   catch(Exception e ) {
						  e.printStackTrace();
					   }
		   
			   Thread.sleep(2000);
				WebElement price=	driver.findElement(By.xpath("//*[@id=\"container-1\"]/fuse-sidebar/navbar/navbar-vertical-style-1/div[2]/div[1]/fuse-navigation/div/fuse-nav-vertical-collapsable[3]/div/fuse-nav-vertical-item[3]/a"));
			   ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", price);
			   Thread.sleep(2000);
			   Actions action1=new Actions(driver);
			   action1.moveToElement(price).click().build().perform();
			   Thread.sleep(2000);   
			   driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			   
			   
			   
			   JavascriptExecutor js = (JavascriptExecutor) driver;
			   js.executeScript("window.scrollBy(0,350)", "");
			   
			   
			   try {
			   
				  Thread.sleep(5000);    
			
				  WebElement addicon=driver.findElement(By.xpath("//*[@id=\"add-price-group-button\" or @aria-label='add price group']/span/mat-icon[contains(text(),'add')]"));
				  
			   Actions action2=new Actions(driver);
			   action2.moveToElement(addicon).click().build().perform();}
			   catch(Exception e) {
				   e.printStackTrace();
			   }
			   Thread.sleep(2000);
			   
			   Actions action51=new Actions(driver);
			   action51.moveToElement(driver.findElement(By.xpath("//button[@type='submit' or @aria-label='Save']"))).click().build().perform();
			
			
			   
			   String text1=driver.findElement(By.xpath(" //mat-error[contains(text(),'Name is required!')]")).getText();
			   
			//   String text1=driver.findElement(By.xpath("//*[@id=\"mat-error-2\"]")).getText();
				System.out.println(text1);
				String exp1="Name is required!";
				Assert.assertEquals(text1,exp1);
	
				Thread.sleep(2000);   
				
				
				String name="Retail"+r.nextInt(1000);
				
			   driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='name' or @placeholder='Name']")).sendKeys(name);
				
//			   Thread.sleep(1000);   
//			   
//			   driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='customer' or @placeholder='Search and Add Customer']")).sendKeys("James Retail pvt ltd");
//				
//			   Thread.sleep(1000); 
//			   
//			   
//			   Actions action515=new Actions(driver);
//			   action515.moveToElement(driver.findElement(By.xpath("//mat-table/mat-row/mat-cell[2]/button/mat-icon"))).click().build().perform();
			
			   
//			   Thread.sleep(1000);
//			   
//			   
//			   Actions action5155=new Actions(driver);
//			   action5155.moveToElement(driver.findElement(By.xpath("//app-warning-popup/div[2]/button/span[contains(text(),'Confirm')]"))).click().build().perform();
//			
	
			   
			   Thread.sleep(5000);
			   
			   
			   Actions action514=new Actions(driver);
			   action514.moveToElement(driver.findElement(By.xpath("//button[@type='submit' or @aria-label='Save']"))).click().build().perform();
			   
			   
			   
		 }
	


	
	 @Test(priority=2) 	
	 public void editPriceGroup() throws Exception {
	 	Thread.sleep(3000);		
	 	  Actions action2=new Actions(driver);

	 	  action2.moveToElement(driver.findElement(By.xpath("//*[@id=\"price-groups\"]/div[2]/div/div[3]/manage-price-groups/div[2]/div/div[2]/div[3]/div[2]/a"))).click().build().perform();
	 	 
	 	
	 		Thread.sleep(2000);   
			
			
			String name="Retail"+r.nextInt(1000);
			
			 driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='name' or @placeholder='Name']")).clear();
			
		   driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='name' or @placeholder='Name']")).sendKeys(name);
			
//		   Thread.sleep(1000);  
//		   
//		   driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='customer' or @placeholder='Search and Add Customer']")).clear();
//			
//		   
//		   driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='customer' or @placeholder='Search and Add Customer']")).sendKeys("James Retail pvt ltd");
//			
//	 	  
//	 	  
//	 	  
//	 	  
//	 	  
//	 	  
//	 	  
//	 	 Thread.sleep(1000);   
//		   
//		   driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='customer' or @placeholder='Search and Add Customer']")).sendKeys("Robert");
//			
//		   Thread.sleep(1000); 
//		   
//		   
//		   Actions action515=new Actions(driver);
//		   action515.moveToElement(driver.findElement(By.xpath("//mat-table/mat-row[1]/mat-cell[2]/button/mat-icon"))).click().build().perform();
//		
//		   Thread.sleep(1000);
//		   
//		   
//		   Actions action5155=new Actions(driver);
//		   action5155.moveToElement(driver.findElement(By.xpath("//app-warning-popup/div[2]/button/span[contains(text(),'Confirm')]"))).click().build().perform();
//		
//		   
		   Thread.sleep(5000);
		   
		   Actions action514=new Actions(driver);
		   action514.moveToElement(driver.findElement(By.xpath("//button[@aria-label='Update' or @type='submit']/span"))).click().build().perform();
		   
	 			   
	 }
	
	

	/*
	 @Test(priority=4) 	
	 public void DeletePriceGroup() throws Exception {
		 Thread.sleep(3000);		
						
					   Actions action5=new Actions(driver);
					  
						WebElement sort=	driver.findElement(By.xpath("//button[@mattooltip='Delete Price Group' or @aria-label='remove']/mat-icon"));
						action5.moveToElement(sort).click().build().perform();
						
						  Thread.sleep(2000);
						  
						  Actions action6=new Actions(driver);
						  
							WebElement sort1=	driver.findElement(By.xpath("//*[@id=\"mat-dialog-0\"]/fuse-confirm-dialog/mat-dialog-actions/button"));
							action6.moveToElement(sort1).click().build().perform();
		   
	 			   
	 }
	*/

@Test(priority=3) 	
public void sortPriceGroup() throws Exception {

	Thread.sleep(6000);		
			   
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
   Thread.sleep(2000);
   driver.navigate().refresh();
	
}
	

}
