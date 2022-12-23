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
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.fitsyn.qa.base.TestBase1;
import com.github.javafaker.Faker;

public class Users extends TestBase1{

	Random r=new Random();
	
	public Users() {
	super();
	}
	
//	@BeforeTest
//	public void openBrowser() throws Exception {
//		initialization();
//	}
	


	 @Test(priority=1)
	public  void addDispatcherUser() throws Exception {
		
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
		 
		 
		  Thread.sleep(7000);
			   try {
				   WebElement sidebar=	driver.findElement(By.xpath("//*[@id=\"container-1\"]/fuse-sidebar/navbar/navbar-vertical-style-1/div[2]/div[1]/fuse-navigation/div/fuse-nav-vertical-collapsable[3]/a/span"));
				   Actions action=new Actions(driver);
				   action.moveToElement(sidebar).click().build().perform();
			   
			   }
			   catch(Exception e ) {
					  e.printStackTrace();
				   }
			   
		   Thread.sleep(7000);
			WebElement users=	driver.findElement(By.xpath("//*[@id=\"container-1\"]/fuse-sidebar/navbar/navbar-vertical-style-1/div[2]/div[1]/fuse-navigation/div/fuse-nav-vertical-collapsable[3]/div/fuse-nav-vertical-item[4]/a"));
		   ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", users);
		   Thread.sleep(2000);
		   Actions action1=new Actions(driver);
		   action1.moveToElement(users).click().build().perform();
		   Thread.sleep(2000);   
		   driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		   
		   
		   
		   JavascriptExecutor js = (JavascriptExecutor) driver;
		   js.executeScript("window.scrollBy(0,350)", "");
		   
		   
		   try {
		   
			  Thread.sleep(5000);   
		
			  WebElement addicon=driver.findElement(By.xpath("//*[@id=\"add-contact-button\" or @aria-label='add user']/span/mat-icon[contains(text(),'add')]"));
			  
		   Actions action2=new Actions(driver);
		   action2.moveToElement(addicon).click().build().perform();}
		   catch(Exception e) {
			   e.printStackTrace();
		   }
		   Thread.sleep(5000);
		   
		   Actions action51=new Actions(driver);
		   action51.moveToElement(driver.findElement(By.xpath("//button[@type='submit' or @aria-label='Save']"))).click().build().perform();
		
		   
		   Faker faker2 = new Faker(new Locale("en-IND"));
			String num1=faker2.number().digits(10);
			
			
			
			  String email1="waden"+r.nextInt(1000)+"@mailinator.com";
		   
		   
			  RandomStringUtils r=new RandomStringUtils();
			   String firstname="John"+r.randomAlphabetic(10);
			   
			   
			   
			   
			   RandomStringUtils r1=new RandomStringUtils();
			   String lastname="waden"+r1.randomAlphabetic(10);
			   
			   
			   

		   
  createMultipleUsers(firstname,lastname,num1,email1);
		   
	//	   driver.findElement(By.xpath("//*[@id=\"mat-error-2\"]"))	 
		   
		   String text8=driver.findElement(By.xpath("//mat-error[contains(text(),'Type is required!')]")).getText();
			System.out.println(text8);
			String exp8="Type is required!";
			Assert.assertEquals(text8,exp8);
		   	 
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//mat-select[@id=\"mat-select-11\" or @formcontrolname='role' or @role='listbox']/div/div[1]")).click();
		//	 selectOptionsFromDropdown("Admin");
			 
			 selectOptionsFromDropdown("Dispatcher");
			 
			// driver.findElement(By.xpath("//*[@id=\"mat-error-3\"]")) 
		 
			 String text9=driver.findElement(By.xpath("//mat-error[contains(text(),'Access is required!')]")).getText();
				System.out.println(text9);
				String exp9="Access is required!";
				Assert.assertEquals(text9,exp9);
	 
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//*[@id=\"user-template\"]/form/div[2]/div/div/div/div/mat-form-field[6]/div/div[1]/div[3]")).click();			 	 
			// selectOptionsFromDropdown("Admin");
			 
			 selectOptionsFromDropdown("Dispatch");
			 
			 
			 Thread.sleep(5000);
			   Actions action5=new Actions(driver);
			   action5.moveToElement(driver.findElement(By.xpath("//button[@type='submit' or @aria-label='Save']"))).click().build().perform();
			
	 
	 }
	 

	
	 @Test(priority=2)
		public  void editDispatcherUser() throws Exception { 
	 
		 Thread.sleep(7000);		
//			WebElement sidebar=	driver.findElement(By.xpath("//*[@id=\"container-1\"]/fuse-sidebar/navbar/navbar-vertical-style-1/div[2]/div[1]/fuse-navigation/div/fuse-nav-vertical-collapsable[4]/a/span"));
//				   Actions action=new Actions(driver);
//				   action.moveToElement(sidebar).click().build().perform();
//				   Thread.sleep(2000);
//					WebElement users=	driver.findElement(By.xpath("//*[@id=\"container-1\"]/fuse-sidebar/navbar/navbar-vertical-style-1/div[2]/div[1]/fuse-navigation/div/fuse-nav-vertical-collapsable[4]/div/fuse-nav-vertical-item[4]/a"));
//				   ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", users);
//				   Thread.sleep(2000);
//				   Actions action1=new Actions(driver);
//				   action1.moveToElement(users).click().build().perform();
//				  
//				   driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
//				   
//				   
//				   Thread.sleep(5000);  
//
//					  Actions action4=new Actions(driver);
//
//					  action4.moveToElement(driver.findElement(By.xpath("//*[@id=\"users\"]/div[1]/div/div[2]/span/mat-icon"))).click().build().perform();
//					 
//					 
//					  Actions action2=new Actions(driver);
//					  action2.moveToElement(driver.findElement(By.xpath("//input[@id=\"mat-input-0\" or @formcontrolname='search' or @placeholder='Name, Phone Number, Email']"))).click().build().perform();
//				
//					  driver.findElement(By.xpath("//input[@id=\"mat-input-0\" or @formcontrolname='search' or @placeholder='Name, Phone Number, Email']")).sendKeys("James");
//					 
//					  
//					   Thread.sleep(1000);   
//					   
//						WebElement Type= driver.findElement(By.xpath("//*[@id=\"mat-select-0\"]"));
//							   
//							   
//							   
//							   Actions action6=new Actions(driver);
//							   action6.moveToElement(Type).click().build().perform();
//							   
//							   Thread.sleep(1000);
//							   
//							   Type.sendKeys(Keys.ARROW_DOWN);
//							   Type.sendKeys(Keys.ENTER);
//							   
//							   Thread.sleep(1000);  
//								  
//								  
//								  
//								  
//								  Actions action3=new Actions(driver);
//								  action3.moveToElement(driver.findElement(By.xpath("//*[@id=\"users\"]/div[2]/div/div[3]/manage-users/custom-sidebar/div/div[2]/div[3]/div/form/div[2]/button"))).click().build().perform();
//									   
//								  Thread.sleep(1000);  
//								  
								  
								  
		
								  Actions action5=new Actions(driver);
								  action5.moveToElement(driver.findElement(By.xpath("//*[@id=\"users\"]/div[2]/div/div[3]/manage-users/div[2]/div/div[2]/div[6]/div[2]/button[2]/mat-icon"))).click().build().perform();
								
				   
								  Thread.sleep(1000);
				   
				   
								  WebElement firstname= driver.findElement(By.xpath("//input[@id=\"mat-input-10\" or @formcontrolname='firstName' or @placeholder='First Name']"));
								   Actions action51=new Actions(driver);
								   action51.moveToElement(firstname).click().build().perform();
								   
								   
								   
								   RandomStringUtils r=new RandomStringUtils();
								   String firstname1="John"+r.randomAlphabetic(10);
								   
								   
								   firstname.clear();
								   firstname.sendKeys(firstname1);
								   
								   RandomStringUtils r1=new RandomStringUtils();
								   String lastname="waden"+r1.randomAlphabetic(10);
								   
								   
								   driver.findElement(By.xpath("//input[@id=\"mat-input-11\" or @formcontrolname='lastName' or @placeholder='Last Name']")).clear();
									 
								   
								   driver.findElement(By.xpath("//input[@id=\"mat-input-11\" or @formcontrolname='lastName' or @placeholder='Last Name']")).sendKeys(lastname);
									 
								   
								   
								   Faker faker2 = new Faker(new Locale("en-IND"));
									String num1=faker2.number().digits(10);
									
								   
									 driver.findElement(By.xpath("//input[@id=\"mat-input-12\" or @formcontrolname='mobile' or @placeholder='Mobile Number']")).clear();
									 
								   driver.findElement(By.xpath("//input[@id=\"mat-input-12\" or @formcontrolname='mobile' or @placeholder='Mobile Number']")).sendKeys(num1);
									 
								   Random r2=new Random();
								   String email1="waden"+r2.nextInt(1000)+"@mailinator.com";
								   
								 
								   
								   
								   
								   driver.findElement(By.xpath("//input[@id=\"mat-input-13\" or @formcontrolname='email' or @placeholder='Email']")).clear();
						   
								   driver.findElement(By.xpath("//input[@id=\"mat-input-13\" or @formcontrolname='email' or @placeholder='Email']")).sendKeys(email1);

								   Thread.sleep(5000);
								   try {
								   
								   	  Actions action658=new Actions(driver);    	
								   	  action658.moveToElement(driver.findElement(By.xpath("//*[@id=\"user-template\"]/form/div[1]/div[2]/button"))).click().build().perform();
								   }
								   catch(Exception e) {
								   	e.printStackTrace();
								   }
	 }
	 

	 
	 @Test(priority=3) 	
	 public void sortDispatcherUser() throws Exception {
	 
		 Thread.sleep(3000);		
//			WebElement sidebar=	driver.findElement(By.xpath("//*[@id=\"container-1\"]/fuse-sidebar/navbar/navbar-vertical-style-1/div[2]/div[1]/fuse-navigation/div/fuse-nav-vertical-collapsable[4]/a/span"));
//				   Actions action=new Actions(driver);
//				   action.moveToElement(sidebar).click().build().perform();
//				   Thread.sleep(2000);
//					WebElement users=	driver.findElement(By.xpath("//*[@id=\"container-1\"]/fuse-sidebar/navbar/navbar-vertical-style-1/div[2]/div[1]/fuse-navigation/div/fuse-nav-vertical-collapsable[4]/div/fuse-nav-vertical-item[4]/a"));
//				   ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", users);
//				   Thread.sleep(2000);
//				   Actions action1=new Actions(driver);
//				   action1.moveToElement(users).click().build().perform();
//				  
//				   driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
//				   
//				   Thread.sleep(5000);
//				
				   Actions action5=new Actions(driver);
				  
					WebElement sort=	driver.findElement(By.xpath("//*[@id=\"sorting-select\"]"));
					action5.moveToElement(sort).doubleClick().build().perform();
				   
					 Thread.sleep(2000);
					 
			List<WebElement> lst= driver.findElements(By.xpath("//div[@class=\"sorting-field-data ng-star-inserted\"] "));

	    
	    int size = lst.size();
	    System.out.println(size);
	    
	    
	    for(int i = 0; i<size; i++) {
	        
	    	lst.get(i).click();
	        
	    }			
		 
		 driver.navigate().refresh();
		 
		 }
	 
	 
	 
	 
	 @Test(priority=4) 	
	 public void resetDispatcherPassword() throws Exception {
	 
//		 Thread.sleep(3000);		
//			WebElement sidebar=	driver.findElement(By.xpath("//*[@id=\"container-1\"]/fuse-sidebar/navbar/navbar-vertical-style-1/div[2]/div[1]/fuse-navigation/div/fuse-nav-vertical-collapsable[4]/a/span"));
//				   Actions action=new Actions(driver);
//				   action.moveToElement(sidebar).click().build().perform();
//				   Thread.sleep(2000);
//					WebElement users=	driver.findElement(By.xpath("//*[@id=\"container-1\"]/fuse-sidebar/navbar/navbar-vertical-style-1/div[2]/div[1]/fuse-navigation/div/fuse-nav-vertical-collapsable[4]/div/fuse-nav-vertical-item[4]/a"));
//				   ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", users);
//				   Thread.sleep(2000);
//				   Actions action1=new Actions(driver);
//				   action1.moveToElement(users).click().build().perform();
//				  
//				   driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
//	 
		 Thread.sleep(7000);
			
		   Actions action5=new Actions(driver);
			WebElement resetpassword=	driver.findElement(By.xpath("//*[@id=\"users\"]/div[2]/div/div[3]/manage-users/div[2]/div/div[4]/div[6]/div[2]/button[1]/mat-icon"));
			action5.moveToElement(resetpassword).click().build().perform();
			
					
					  Thread.sleep(2000);
					  
					  Actions action6=new Actions(driver);
					  
						WebElement pwd=	driver.findElement(By.xpath("//*[@id=\"mat-input\" or @formcontrolname='password' or @data-placeholder='New Password']"));
						action6.moveToElement(pwd).click().build().perform();
						
						pwd.sendKeys("123456789");
						
						
						driver.findElement(By.xpath("//*[@id=\"mat-input\" or @formcontrolname='confirmPassword' or @data-placeholder='Confirm Password']")).sendKeys("123456789");
						
						 Thread.sleep(5000);
						 
						 
						 Actions action7=new Actions(driver);
						  
							WebElement button=	driver.findElement(By.xpath("//button/span[contains(text(),'Reset Password')]"));
							action7.moveToElement(button).click().build().perform();
							
						//driver.close();
			
 }

	 
	 @Test(priority=4) 	
	 public void resetDriverPassword() throws Exception {
	 
//		 Thread.sleep(3000);		
//			WebElement sidebar=	driver.findElement(By.xpath("//*[@id=\"container-1\"]/fuse-sidebar/navbar/navbar-vertical-style-1/div[2]/div[1]/fuse-navigation/div/fuse-nav-vertical-collapsable[3]/a/span"));
//				   Actions action=new Actions(driver);
//				   action.moveToElement(sidebar).click().build().perform();
//				   Thread.sleep(2000);
//					WebElement users=	driver.findElement(By.xpath("//*[@id=\"container-1\"]/fuse-sidebar/navbar/navbar-vertical-style-1/div[2]/div[1]/fuse-navigation/div/fuse-nav-vertical-collapsable[3]/div/fuse-nav-vertical-item[4]/a"));
//				   ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", users);
//				   Thread.sleep(2000);
//				   Actions action1=new Actions(driver);
//				   action1.moveToElement(users).click().build().perform();
//				  
//				   driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
//	 
				   Thread.sleep(7000);
					
				   Actions action5=new Actions(driver);
					WebElement resetpassword=	driver.findElement(By.xpath("//*[@id=\"users\"]/div[2]/div/div[3]/manage-users/div[2]/div/div[3]/div[6]/div[2]/button[1]/mat-icon"));
					action5.moveToElement(resetpassword).click().build().perform();
					
					  Thread.sleep(2000);
					  
					  Actions action6=new Actions(driver);
					  
						WebElement pwd=	driver.findElement(By.xpath("//*[@id=\"mat-input\" or @formcontrolname='password' or @data-placeholder='New Password']"));
						action6.moveToElement(pwd).click().build().perform();
						
						pwd.sendKeys("123456789");
						
						
						driver.findElement(By.xpath("//*[@id=\"mat-input\" or @formcontrolname='confirmPassword' or @data-placeholder='Confirm Password']")).sendKeys("123456789");
						
						 Thread.sleep(5000);
						 
						 
						 Actions action7=new Actions(driver);
						  
							WebElement button=	driver.findElement(By.xpath("//button/span[contains(text(),'Reset Password')]"));
							action7.moveToElement(button).click().build().perform();
							
						driver.close();
			
 }
	 
	 

	 /*
	 @Test(priority=4) 	
	 public void DisabeAdminUser() throws Exception {
	 
		 Thread.sleep(3000);		
//			WebElement sidebar=	driver.findElement(By.xpath("//*[@id=\"container-1\"]/fuse-sidebar/navbar/navbar-vertical-style-1/div[2]/div[1]/fuse-navigation/div/fuse-nav-vertical-collapsable[4]/a/span"));
//				   Actions action=new Actions(driver);
//				   action.moveToElement(sidebar).click().build().perform();
//				   Thread.sleep(2000);
//					WebElement users=	driver.findElement(By.xpath("//*[@id=\"container-1\"]/fuse-sidebar/navbar/navbar-vertical-style-1/div[2]/div[1]/fuse-navigation/div/fuse-nav-vertical-collapsable[4]/div/fuse-nav-vertical-item[4]/a"));
//				   ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", users);
//				   Thread.sleep(2000);
//				   Actions action1=new Actions(driver);
//				   action1.moveToElement(users).click().build().perform();
//				  
//				   driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
//	 
//				   Thread.sleep(5000);
					
				   Actions action5=new Actions(driver);
				  
					WebElement sort=	driver.findElement(By.xpath("//*[@id=\"users\"]/div[2]/div/div[3]/manage-users/div[2]/div/div[2]/div[6]/div[2]/button[4]"));
					action5.moveToElement(sort).click().build().perform();
					
					  Thread.sleep(2000);
					  
					  Actions action6=new Actions(driver);
					  
						WebElement sort1=	driver.findElement(By.xpath("//*[@id=\"mat-dialog-0\"]/fuse-confirm-dialog/mat-dialog-actions/button"));
						action6.moveToElement(sort1).click().build().perform();
						  
			
 }
	 

	 @Test(priority=5)
		public  void addDispatcher() throws Exception {
			
			Thread.sleep(3000);					   
			   JavascriptExecutor js = (JavascriptExecutor) driver;
			   js.executeScript("window.scrollBy(0,350)", "");
			   
			   
			   try {
			   
				  Thread.sleep(2000);   
			
				  WebElement addicon=driver.findElement(By.xpath("//*[@id=\"add-contact-button\" or @aria-label='add user']/span/mat-icon[contains(text(),'add')]"));
				  
			   Actions action2=new Actions(driver);
			   action2.moveToElement(addicon).click().build().perform();}
			   catch(Exception e) {
				   e.printStackTrace();
			   }
			   Thread.sleep(2000);
			   
			   Actions action51=new Actions(driver);
			   action51.moveToElement(driver.findElement(By.xpath("//button[@type='submit' or @aria-label='Save']"))).click().build().perform();
			
			   
			   
			   Faker faker2 = new Faker(new Locale("en-IND"));
				String num1=faker2.number().digits(10);
				
				
				
				  String email1="dark"+r.nextInt(1000)+"@mailinator.com";
			   
			   
				  RandomStringUtils r=new RandomStringUtils();
				   String firstname="Renoldo"+r.randomAlphabetic(10);
				   
				   
				   
				   RandomStringUtils r1=new RandomStringUtils();
				   String lastname="Dark"+r1.randomAlphabetic(10);
				   
			   
			   
			   createMultipleUsers(firstname,lastname,num1,email1);
			   	 
			   
			   String text8=driver.findElement(By.xpath("//mat-error[contains(text(),'Type is required!')]")).getText();
				System.out.println(text8);
				String exp8="Type is required!";
				Assert.assertEquals(text8,exp8);
				 
               			 Thread.sleep(2000);
				 driver.findElement(By.xpath("//mat-select[@id=\"mat-select-11\" or @formcontrolname='role' or @role='listbox']/div/div[1]")).click();
				 selectOptionsFromDropdown("Dispatcher");
				 
				 
				 String text9=driver.findElement(By.xpath("//mat-error[contains(text(),'Access is required!')]")).getText();
					System.out.println(text9);
					String exp9="Access is required!";
					Assert.assertEquals(text9,exp9);
				 
				 
				 
				 
				 Thread.sleep(2000);
	 driver.findElement(By.xpath("//*[@id=\"user-template\"]/form/div[2]/div/div/div/div/mat-form-field[6]/div/div[1]/div[3]")).click();			 	 
				 selectOptionsFromDropdown("Dispatch");
		 
				 Thread.sleep(1000);
				   Actions action5=new Actions(driver);
				   action5.moveToElement(driver.findElement(By.xpath("//button[@type='submit' or @aria-label='Save']"))).click().build().perform();
				
		 
		 }
	 
	 
	 
	 @Test(priority=6)
		public  void addAccountant() throws Exception {
			
			Thread.sleep(3000);					   
			   JavascriptExecutor js = (JavascriptExecutor) driver;
			   js.executeScript("window.scrollBy(0,350)", "");
			   
			   
			   try {
			   
				  Thread.sleep(2000);   
			
				  WebElement addicon=driver.findElement(By.xpath("//*[@id=\"add-contact-button\" or @aria-label='add user']/span/mat-icon[contains(text(),'add')]"));
				  
			   Actions action2=new Actions(driver);
			   action2.moveToElement(addicon).click().build().perform();}
			   catch(Exception e) {
				   e.printStackTrace();
			   }
                    Thread.sleep(2000);
			   
			   Actions action51=new Actions(driver);
			   action51.moveToElement(driver.findElement(By.xpath("//button[@type='submit' or @aria-label='Save']"))).click().build().perform();
			
			   
			   Faker faker2 = new Faker(new Locale("en-IND"));
				String num1=faker2.number().digits(10);
				
				
				
				  String email1="messi"+r.nextInt(1000)+"@mailinator.com";
			   
			   
				  RandomStringUtils r=new RandomStringUtils();
				   String firstname="Lionel"+r.randomAlphabetic(10);
				   
				   
				   
				   RandomStringUtils r1=new RandomStringUtils();
				   String lastname="messi"+r1.randomAlphabetic(10);
				   
			   
				   createMultipleUsers(firstname,lastname,num1,email1);
			   	 
				 Thread.sleep(2000);
				 driver.findElement(By.xpath("//mat-select[@id=\"mat-select-11\" or @formcontrolname='role' or @role='listbox']/div/div[1]")).click();
				 selectOptionsFromDropdown("Accountant");
				 
				 Thread.sleep(2000);
				 driver.findElement(By.xpath("//*[@id=\"user-template\"]/form/div[2]/div/div/div/div/mat-form-field[6]/div/div[1]/div[3]")).click();			 	 
				 selectOptionsFromDropdown("Accountant");
		 
				 Thread.sleep(1000);
				   Actions action5=new Actions(driver);
				   action5.moveToElement(driver.findElement(By.xpath("//button[@type='submit' or @aria-label='Save']"))).click().build().perform();
				
		 
		 }
	 
	 @Test(priority=7)
		public  void addSuperAdmin() throws Exception {
			
			Thread.sleep(3000);					   
			   JavascriptExecutor js = (JavascriptExecutor) driver;
			   js.executeScript("window.scrollBy(0,350)", "");
			   
			   
			   try {
			   
				  Thread.sleep(2000);   
			
				  WebElement addicon=driver.findElement(By.xpath("//*[@id=\"add-contact-button\" or @aria-label='add user']/span/mat-icon[contains(text(),'add')]"));
				  
			   Actions action2=new Actions(driver);
			   action2.moveToElement(addicon).click().build().perform();}
			   catch(Exception e) {
				   e.printStackTrace();
			   }
			   
                 Thread.sleep(2000);
			   
			   Actions action51=new Actions(driver);
			   action51.moveToElement(driver.findElement(By.xpath("//button[@type='submit' or @aria-label='Save']"))).click().build().perform();
			
			   
			   Faker faker2 = new Faker(new Locale("en-IND"));
				String num1=faker2.number().digits(10);
				
				
				
				  String email1="seth"+r.nextInt(1000)+"@mailinator.com";
			   
			   
				  RandomStringUtils r=new RandomStringUtils();
				   String firstname="Rimson"+r.randomAlphabetic(10);
				   
				   
				   
				   RandomStringUtils r1=new RandomStringUtils();
				   String lastname="Seth"+r1.randomAlphabetic(10);
				   
			   
				   createMultipleUsers(firstname,lastname,num1,email1);
			
			   	 
				 Thread.sleep(2000);
				 driver.findElement(By.xpath("//mat-select[@id=\"mat-select-11\" or @formcontrolname='role' or @role='listbox']/div/div[1]")).click();
				 selectOptionsFromDropdown("Super Admin");
				 
				 Thread.sleep(2000);
				 driver.findElement(By.xpath("//*[@id=\"user-template\"]/form/div[2]/div/div/div/div/mat-form-field[6]/div/div[1]/div[3]")).click();			 	 
				 selectOptionsFromDropdown("Supar Admin");
		 
				 Thread.sleep(1000);
				   Actions action5=new Actions(driver);
				   action5.moveToElement(driver.findElement(By.xpath("//button[@type='submit' or @aria-label='Save']"))).click().build().perform();
				
		 
		 }
	 
	 @Test(priority=8)
		public  void addAdministrative() throws Exception {
			
			Thread.sleep(3000);					   
			   JavascriptExecutor js = (JavascriptExecutor) driver;
			   js.executeScript("window.scrollBy(0,350)", "");
			   
			   
			   try {
			   
				  Thread.sleep(2000);   
			
				  WebElement addicon=driver.findElement(By.xpath("//*[@id=\"add-contact-button\" or @aria-label='add user']/span/mat-icon[contains(text(),'add')]"));
				  
			   Actions action2=new Actions(driver);
			   action2.moveToElement(addicon).click().build().perform();}
			   catch(Exception e) {
				   e.printStackTrace();
			   }
			   
                    Thread.sleep(2000);
			   
			   Actions action51=new Actions(driver);
			   action51.moveToElement(driver.findElement(By.xpath("//button[@type='submit' or @aria-label='Save']"))).click().build().perform();
			
			   Faker faker2 = new Faker(new Locale("en-IND"));
				String num1=faker2.number().digits(10);
				
				
				
				  String email1="rai"+r.nextInt(1000)+"@mailinator.com";
			   
			   
				  RandomStringUtils r=new RandomStringUtils();
				   String firstname="Rehana"+r.randomAlphabetic(10);
				   
				   
				   
				   RandomStringUtils r1=new RandomStringUtils();
				   String lastname="Rai"+r1.randomAlphabetic(10);
				   
			   
				   createMultipleUsers(firstname,lastname,num1,email1);
			   	 
				 Thread.sleep(2000);
				 driver.findElement(By.xpath("//mat-select[@id=\"mat-select-11\" or @formcontrolname='role' or @role='listbox']/div/div[1]")).click();
				 selectOptionsFromDropdown("Administrative");
				 
				 Thread.sleep(2000);
				 driver.findElement(By.xpath("//*[@id=\"user-template\"]/form/div[2]/div/div/div/div/mat-form-field[6]/div/div[1]/div[3]")).click();			 	 
				 selectOptionsFromDropdown("Administative");
		 
				 Thread.sleep(1000);
				   Actions action5=new Actions(driver);
				   action5.moveToElement(driver.findElement(By.xpath("//button[@type='submit' or @aria-label='Save']"))).click().build().perform();
				
		 
		 }

*/

}
	

	 

