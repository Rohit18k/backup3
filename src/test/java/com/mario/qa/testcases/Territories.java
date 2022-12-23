package com.mario.qa.testcases;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.fitsyn.qa.base.TestBase1;

public class Territories extends TestBase1{

	Random r=new Random();
	
	public Territories() {
	super();
	}
	
	@BeforeTest
	public void openBrowser() throws Exception {
		initialization();
	}

	@Test(priority=1)
	public  void addTerritory() throws Exception {
		
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
			   WebElement sidebar=	driver.findElement(By.xpath("//*[@id=\"container-1\"]/fuse-sidebar/navbar/navbar-vertical-style-1/div[2]/div[1]/fuse-navigation/div/fuse-nav-vertical-collapsable[3]/a/span"));
			   Actions action=new Actions(driver);
			   action.moveToElement(sidebar).click().build().perform();
		   
		   }
			   catch(Exception e ) {
					  e.printStackTrace();
				   }
			   
		   Thread.sleep(5000);
		   
			WebElement territory=	driver.findElement(By.xpath("//*[@id=\"container-1\"]/fuse-sidebar/navbar/navbar-vertical-style-1/div[2]/div[1]/fuse-navigation/div/fuse-nav-vertical-collapsable[3]/div/fuse-nav-vertical-item[5]/a"));
		   ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", territory);
		   Thread.sleep(2000);
		   Actions action1=new Actions(driver);
		   action1.moveToElement(territory).click().build().perform();
		   Thread.sleep(2000);   
		   driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		   
		   
		   
		   JavascriptExecutor js = (JavascriptExecutor) driver;
		   js.executeScript("window.scrollBy(0,350)", "");
		   
		   
		   try {
		   
			  Thread.sleep(9000);    
		
			  WebElement addicon=driver.findElement(By.xpath("//*[@id=\"add-zone-button\" or @aria-label='add zone']/span/mat-icon[contains(text(),'add')]"));
			  
		   Actions action2=new Actions(driver);
		   action2.moveToElement(addicon).click().build().perform();}
		   catch(Exception e) {
			   e.printStackTrace();
		   }
		   Thread.sleep(5000);
		   
		   Actions action51=new Actions(driver);
		   action51.moveToElement(driver.findElement(By.xpath("//button[@type='submit' or @aria-label='Save']"))).click().build().perform();
		
//		   driver.findElement(By.xpath("//*[@id=\"mat-error-3\"]"))
		   String text1=driver.findElement(By.xpath("//mat-error[contains(text(),'Name is required!')]")).getText();
			System.out.println(text1);
			String exp1="Name is required!";
			Assert.assertEquals(text1,exp1);
			
			String name="Manitoba"+r.nextInt(1000);
			
		   driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='name' or @placeholder='Name']")).sendKeys(name);

		   
		   //driver.findElement(By.xpath("//*[@id=\"mat-error-2\"]"))
		   String text2=driver.findElement(By.xpath("//mat-error[contains(text(),'Code is required!')]")).getText();
			System.out.println(text2);
			String exp2="Code is required!";
			Assert.assertEquals(text2,exp2);
			
			String code="Manit"+r.nextInt(1000);
		   driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='code' or @placeholder='Short Code']")).sendKeys(code);
			
		   Thread.sleep(1000); 
		 //driver.findElement(By.xpath("//*[@id=\"mat-error-4\"]"))
		   
		   String text3=driver.findElement(By.xpath("//mat-error[contains(text(),'Driver Commission is required!')]")).getText();
			System.out.println(text3);
			String exp3="Driver Commission is required!";
			Assert.assertEquals(text3,exp3);
			
			
			
			 driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='driverCommission' or @name='driverCommission']")).sendKeys("Asqwe!!!!");
					
		//	 driver.findElement(By.xpath("//*[@id=\"mat-error-5\"]"))
		   
			 String text4=driver.findElement(By.xpath("//mat-error[contains(text(),'Only number are allowed!')]")).getText();
				System.out.println(text4);
				String exp4="Only number are allowed!";
				Assert.assertEquals(text4,exp4);
			 
			 
				driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='driverCommission' or @name='driverCommission']")).clear();
				driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='driverCommission' or @name='driverCommission']")).sendKeys("5");
				 
	
		   Thread.sleep(5000);
		   
		   
		   Actions action514=new Actions(driver);
		   action514.moveToElement(driver.findElement(By.xpath("//button[@type='submit' or @aria-label='Save']"))).click().build().perform();
 }


	 @Test(priority=2) 	
	 public void editTerritory() throws Exception {
	 	Thread.sleep(3000);		
	 	  Actions action2=new Actions(driver);

	 	  action2.moveToElement(driver.findElement(By.xpath("//*[@id=\"zones\"]/div[2]/div/div[3]/manage-zones/div[2]/div/div[2]/div[3]/div[2]/a"))).click().build().perform();
	 	 

	 	 Thread.sleep(1000);   
	 	 driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='name' or @placeholder='Name']")).clear();
		   
	 	 
	 	String name1="Nunavut"+r.nextInt(1000);
	 	 
	 	 driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='name' or @placeholder='Name']")).sendKeys(name1);
			

	 	 
	 	 driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='code' or @placeholder='Short Code']")).clear();
	 	 
	 	 
	 	String code1="NV"+r.nextInt(1000);
	 	 
	 	 driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='code' or @placeholder='Short Code']")).sendKeys(code1);
	 	 
	 	 
	 	 
	 	driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='driverCommission' or @name='driverCommission']")).clear();
	 	
		driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='driverCommission' or @name='driverCommission']")).sendKeys("6");
	 
		   Thread.sleep(5000);
		   
		   
		   Actions action514=new Actions(driver);
		   action514.moveToElement(driver.findElement(By.xpath("//button[@aria-label='Update' or @type='submit']/span"))).click().build().perform();
		  
		   
	 			   
	 }
	
	
	
//	 @Test(priority=4) 	
//	 public void DeleteTerritory() throws Exception {
//		 Thread.sleep(3000);		
//						
//					   Actions action5=new Actions(driver);
//					  
//						WebElement sort=	driver.findElement(By.xpath("//*[@id=\"zones\"]/div[2]/div/div[3]/manage-zones/div[2]/div/div[2]/div[3]/div[2]/button/mat-icon"));
//						action5.moveToElement(sort).click().build().perform();
//						
//						  Thread.sleep(2000);
//						  
//						  Actions action6=new Actions(driver);
//						  
//							WebElement sort1=	driver.findElement(By.xpath("//*[@id=\"mat-dialog-0\"]/fuse-confirm-dialog/mat-dialog-actions/button"));
//							action6.moveToElement(sort1).click().build().perform();
//		   
//	 			   
//	 }
	
	
	 @Test(priority=3) 	
	 public void sortTerritory() throws Exception {

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
	


	
	
	
	
}
