package com.mario.qa.testcases;

import java.util.List;
import java.util.Locale;
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

public class InsuranceProviders extends TestBase1{

	Random r=new Random();
	
	public InsuranceProviders() {
	super();
	}
	
//	@BeforeTest
//	public void openBrowser() throws Exception {
//		initialization();
//	}

	@Test(priority=1)
	public  void addInsuranceProvider() throws Exception {
		
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
			
		   Thread.sleep(2000);
			WebElement vehicles=	driver.findElement(By.xpath("//*[@id=\"container-1\"]/fuse-sidebar/navbar/navbar-vertical-style-1/div[2]/div[1]/fuse-navigation/div/fuse-nav-vertical-collapsable[3]/div/fuse-nav-vertical-item[9]/a/span"));
		   ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", vehicles);
		   Thread.sleep(2000);
		   Actions action1=new Actions(driver);
		   action1.moveToElement(vehicles).click().build().perform();
		   Thread.sleep(2000);   
		   driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		   
		   
		   
		   JavascriptExecutor js = (JavascriptExecutor) driver;
		   js.executeScript("window.scrollBy(0,350)", "");
		   
		   
		   try {
		   
			  Thread.sleep(5000);   
		
			  WebElement addicon=driver.findElement(By.xpath("//button[@id=\"add-driver-skill-button\" or @aria-label='add insurance provider']/span/mat-icon[contains(text(),'add')]"));
			  
		   Actions action2=new Actions(driver);
		   action2.moveToElement(addicon).click().build().perform();}
		   catch(Exception e) {
			   e.printStackTrace();
		   }

		   Thread.sleep(2000);   
		   
		   
		   Actions action7112=new Actions(driver);
		   action7112.moveToElement(driver.findElement(By.xpath("//button[@aria-label='Save' or @type='submit']/span"))).click().build().perform();
		   
		   String text1=driver.findElement(By.xpath("//mat-error[contains(text(),'Insurance Provider Name is required!')]")).getText();
			System.out.println(text1);
			String exp1="Insurance Provider Name is required!";
			Assert.assertEquals(text1,exp1);
			
		   Thread.sleep(1000);   
		   
			WebElement insaurancename= driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='name' or @data-placeholder='Insurance Provider Name']"));
				   
			   
				   Thread.sleep(1000);   

					String name="Sonnet"+r.nextInt(1000);

					insaurancename.sendKeys(name);
				
				   

				   driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='locationNumber' or @data-placeholder='Location Number']")).sendKeys("416");
				   
					driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='contactName' or @data-placeholder='Name']")).sendKeys("Sonnet");
//							   	
					
					String text4=driver.findElement(By.xpath("//mat-error[contains(text(),'Phone Number is required!')]")).getText();
					System.out.println(text4);
					String exp4="Phone Number is required!";
					Assert.assertEquals(text4,exp4);
					
					driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='contactPhone' or @data-placeholder='Phone Number']")).sendKeys("!@#@!ASSD1122");
				   
					
					 String text40=driver.findElement(By.xpath("//mat-error[contains(text(),'Only number are allowed!')]")).getText();
						System.out.println(text40);
						String exp40="Only number are allowed!";
						Assert.assertEquals(text40,exp40);
					
						driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='contactPhone' or @data-placeholder='Phone Number']")).clear();
						   		
						
						
						Faker faker = new Faker(new Locale("en-IND"));
						String num=	faker.number().digits(10);
						
						
						driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='contactPhone' or @data-placeholder='Phone Number']")).sendKeys(num);
						   
				
				   driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='contactFax' or @data-placeholder='Fax']")).sendKeys("!!AS@@#");
				   			   
				   
				   String text5=driver.findElement(By.xpath("//mat-error[contains(text(),'Only number are allowed!')]")).getText();
					System.out.println(text5);
					String exp5="Only number are allowed!";
					Assert.assertEquals(text5,exp5);
					
					driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='contactFax' or @data-placeholder='Fax']")).clear();
					   
				   
					String fxnum=	faker.number().digits(10);
					
					
					 driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='contactFax' or @data-placeholder='Fax']")).sendKeys(fxnum);
					   	  
		   
				   driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='contactEmail' or @data-placeholder='Email']")).sendKeys("sonnet@gmail@gmail.com");
				
				   
				   String text7=driver.findElement(By.xpath("//mat-error[contains(text(),'Please enter a valid email address!')]")).getText();
					System.out.println(text7);
					String exp7="Please enter a valid email address!";
					Assert.assertEquals(text7,exp7);
				 
				   
					 driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='contactEmail' or @data-placeholder='Email']")).clear();
					 
					 String email="sonnet"+r.nextInt(1000)+"@mailinator.com";
					 
					 driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='contactEmail' or @data-placeholder='Email']")).sendKeys(email);
					 
					 
					 
					 String text6=driver.findElement(By.xpath("//mat-error[contains(text(),'Line 1 is required!')]")).getText();
						System.out.println(text6);
						String exp6="Line 1 is required!";
						Assert.assertEquals(text6,exp6);
					   
				   
				   driver.findElement(By.xpath("//textarea[@id=\"mat-input\" or @formcontrolname='line1' or @data-placeholder='Line 1']")).sendKeys("4419 RANGELINE RD");
				   
				
				   driver.findElement(By.xpath("//textarea[@id=\"mat-input\" or @formcontrolname='line2' or @data-placeholder='Line 2']")).sendKeys("STE D");
				   
				   
					  WebElement element = driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='city' or @data-placeholder='City']"));
					  ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
					
				   
					   Thread.sleep(1000); 
					   
					   Actions action101=new Actions(driver);
					   action101.moveToElement(element).click().build().perform();
					
		   
					 String text4011=driver.findElement(By.xpath("//mat-error[contains(text(),'City is required!')]")).getText();
					System.out.println(text4011);
					String exp4011="City is required!";
					Assert.assertEquals(text4011,exp4011);
	
					element.sendKeys("Toronto");
					  Thread.sleep(2000);
					element.sendKeys(Keys.ARROW_DOWN);					
					  Thread.sleep(2000);
					element.sendKeys(Keys.ENTER);
					  
					   Thread.sleep(1000);
				   driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='zipcode' or @data-placeholder='Postal Code']")).sendKeys("KKJU!!@@");
				     
				 
		   String text51=driver.findElement(By.xpath("//mat-error[contains(text(),'Enter valid postal code!')]")).getText();
					System.out.println(text51);
					String exp51="Enter valid postal code!";
					Assert.assertEquals(text51,exp51);
				 
					 driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='zipcode' or @data-placeholder='Postal Code']")).clear();
					
					 driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='zipcode' or @data-placeholder='Postal Code']")).sendKeys("M1R 0E9");
					 

    
	   Thread.sleep(5000);
		
	   
    
	    Actions action7111=new Actions(driver);
		   action7111.moveToElement(driver.findElement(By.xpath("//button[@aria-label='Save' or @type='submit']/span"))).click().build().perform();

}
	@Test(priority=2)
	public  void editInsuranceProvider() throws Exception {
			Thread.sleep(3000);		
			  Actions action2=new Actions(driver);

			  action2.moveToElement(driver.findElement(By.xpath("//*[@id=\"insurance-provider\"]/div[2]/div/div[3]/manage-insurance-providers/div[2]/div/div[2]/div[5]/div[2]/a[2]"))).click().build().perform();
			  Thread.sleep(1000);   
			   
				WebElement insaurancename= driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='name' or @data-placeholder='Insurance Provider Name']"));
					   
				   
					   Thread.sleep(1000);   

						String name="Pembridge"+r.nextInt(1000);

						insaurancename.clear();
						insaurancename.sendKeys(name);
						
						Faker faker = new Faker();
						String num2=	faker.number().digits(3);

						 driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='locationNumber' or @data-placeholder='Location Number']")).clear();
						   
					   driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='locationNumber' or @data-placeholder='Location Number']")).sendKeys(num2);
					
						driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='contactName' or @data-placeholder='Name']")).clear();
				   
					   
						driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='contactName' or @data-placeholder='Name']")).sendKeys("Pembridge");								   	
						
						Faker fake1 = new Faker(new Locale("en-IND"));
						String num=	fake1.number().digits(10);
						
						
						driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='contactPhone' or @data-placeholder='Phone Number']")).clear();
					
						driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='contactPhone' or @data-placeholder='Phone Number']")).sendKeys(num);
							   
						
						String fxnum=	faker.number().digits(10);
						
						driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='contactFax' or @data-placeholder='Fax']")).clear();
					
						 driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='contactFax' or @data-placeholder='Fax']")).sendKeys(fxnum);
						   	  
			   
					   
						 driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='contactEmail' or @data-placeholder='Email']")).clear();
						 
						 
						 String email="Pembridge"+r.nextInt(1000)+"@mailinator.com";
						 
						 driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='contactEmail' or @data-placeholder='Email']")).sendKeys(email);

					   
						  WebElement element = driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='city' or @data-placeholder='City']"));
						  ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
						
					   
						   Thread.sleep(1000); 
						   
						   Actions action101=new Actions(driver);
						   action101.moveToElement(element).click().build().perform();
						
						   element.clear();
					element.sendKeys("Thorold");
						  Thread.sleep(2000);
						element.sendKeys(Keys.ARROW_DOWN);					
						  Thread.sleep(2000);
						element.sendKeys(Keys.ENTER);
						  
						   Thread.sleep(1000);
					  	
						 driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='zipcode' or @data-placeholder='Postal Code']")).clear();
						
						 driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='zipcode' or @data-placeholder='Postal Code']")).sendKeys("L2V 0A1");
						 

	    
		   Thread.sleep(5000);
			
		   
	    
		    Actions action7111=new Actions(driver);
			   action7111.moveToElement(driver.findElement(By.xpath("//button[@aria-label='Update' or @type='submit']/span"))).click().build().perform();
		
}

	 @Test(priority=3)
		public  void viewInsuranceProviderDetails() throws Exception {		

		Thread.sleep(3000);	
		

		  Actions action2=new Actions(driver);
		  action2.moveToElement(driver.findElement(By.xpath("//*[@id=\"insurance-provider\"]/div[2]/div/div[3]/manage-insurance-providers/div[2]/div/div[2]/div[5]/div[2]/a[1]/mat-icon"))).click().build().perform();
		 
		  Thread.sleep(5000);   
		  
		  String insuaranceprovidername=  driver.findElement(By.xpath("//*[@id=\"insurance-provider-details\"]/div[2]/div/div[1]/div/div/div[2]/mat-label[2]/strong/span")).getText();
			System.out.println(insuaranceprovidername);
			
			
			String phonenumber=  driver.findElement(By.xpath("//*[@id=\"insurance-provider-details\"]/div[2]/div/div[1]/div/div/div[3]/mat-label[2]/strong/span")).getText();
			System.out.println(phonenumber);
			
			String email=  driver.findElement(By.xpath("//*[@id=\"insurance-provider-details\"]/div[2]/div/div[1]/div/div/div[4]/mat-label[2]/strong/a/span")).getText();
			System.out.println(email);
			
			
			String faxnnumber=  driver.findElement(By.xpath("//*[@id=\"insurance-provider-details\"]/div[2]/div/div[1]/div/div/div[5]/mat-label[2]/strong")).getText();
			System.out.println(faxnnumber);
			
			String address=  driver.findElement(By.xpath("//*[@id=\"insurance-provider-details\"]/div[2]/div/div[1]/div/div/div[6]/mat-label[2]/strong/span")).getText();
			System.out.println(address);
			
			  Thread.sleep(1000);   
	
			  Actions action7111=new Actions(driver);
			   action7111.moveToElement(driver.findElement(By.xpath("//*[@id=\"insurance-provider-details\"]/div[1]/div/div[1]/mat-icon[1]"))).click().build().perform();
	
		   
	 }

	 @Test(priority=4) 	
	 public void sortInsuarance() throws Exception {

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

	 
//	 @Test(priority=5) 	
//	 public void disableInsuranceDetails() throws Exception {
//
//	 	Thread.sleep(3000);					
//	 	
//	 			   Actions action5=new Actions(driver);
//	 				WebElement sort=	driver.findElement(By.xpath("//*[@id=\"insurance-provider\"]/div[2]/div/div[3]/manage-insurance-providers/div[2]/div/div[2]/div[5]/div[2]/button"));
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
