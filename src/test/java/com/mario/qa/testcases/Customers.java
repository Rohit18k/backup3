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

public class Customers extends TestBase1{

	Random r=new Random();
	
	public Customers() {
	super();
	}
	
//	@BeforeTest
//	public void openBrowser() throws Exception {
//		initialization();
//	}
	


	 @Test(priority=1)
		public  void addCustomers() throws Exception {
			
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
				   
                     Thread.sleep(5000);
				WebElement customers=	driver.findElement(By.xpath("//*[@id=\"container-1\"]/fuse-sidebar/navbar/navbar-vertical-style-1/div[2]/div[1]/fuse-navigation/div/fuse-nav-vertical-collapsable[2]/div/fuse-nav-vertical-item[1]/a/span"));
			   ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", customers);
			   Thread.sleep(2000);
			   Actions action1=new Actions(driver);
			   action1.moveToElement(customers).click().build().perform();
			   Thread.sleep(2000);   
			   driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			   
			   
			   
			   JavascriptExecutor js = (JavascriptExecutor) driver;
			   js.executeScript("window.scrollBy(0,350)", "");
			   
			   
			   try {
			   
				  Thread.sleep(9000);   
			
				  WebElement addicon=driver.findElement(By.xpath("//button[@id=\"add-customer-button\" or @aria-label='add customer']/span/mat-icon[contains(text(),'add')]"));
				  
			   Actions action2=new Actions(driver);
			   action2.moveToElement(addicon).click().build().perform();}
			   catch(Exception e) {
				   e.printStackTrace();
			   }
		
			   Thread.sleep(5000);   
			   
			   
				  Actions action711=new Actions(driver);
			   action711.moveToElement(driver.findElement(By.xpath("//*[@id=\"zone-template\"]/form/div[1]/div[2]/button"))).click().build().perform();

			   
			   
		//	   driver.findElement(By.xpath("//mat-error[ @role='alert'][1]"))
			   
				String text1=driver.findElement(By.xpath("//mat-error[contains(text(),'Customer Name is required!')]")).getText();
				System.out.println(text1);
				String exp1="Customer Name is required!";
				Assert.assertEquals(text1,exp1);
			   
			   
			   WebElement firstname= driver.findElement(By.xpath("//input[@id=\"mat-input-120\" or @formcontrolname='customerName' or @placeholder='Customer Name']"));
			   Actions action3=new Actions(driver);
			   action3.moveToElement(firstname).click().build().perform();
			   
			   firstname.sendKeys("Robert Retail pvt ltd");
			   
			   
//			   driver.findElement(By.xpath("//*[@id=\"mat-error-2\"]"))   
			   
			   String text2=driver.findElement(By.xpath("//mat-error[contains(text(),'Price Group is required!')]")).getText();
				System.out.println(text2);
				String exp2="Price Group is required!";
				Assert.assertEquals(text2,exp2);
			   

			WebElement pricegroup=   driver.findElement(By.xpath("//mat-select[@id=\"mat-select-45\" or @role='listbox' or @formcontrolname='priceGroup']/div/div[1]"));
			pricegroup	.click();
			   
			   
//			pricegroup.sendKeys("N");
				  Thread.sleep(2000);
				  
				  List<WebElement> lstt1= driver.findElements(By.xpath("//mat-option"));
				  lstt1.get(lstt1.size()-1).click(); 
			   
			   
			   
			   
			///   selectOptionsFromDropdown("Retail");
			   
			   
//			   driver.findElement(By.xpath("//*[@id=\"mat-error-4\"]"))
			   
			   String text3=driver.findElement(By.xpath("//mat-error[contains(text(),'Credit Limit is required!')]")).getText();
				System.out.println(text3);
				String exp3="Credit Limit is required!";
				Assert.assertEquals(text3,exp3);
			   
				 driver.findElement(By.xpath("//input[@id=\"mat-input-121\" or @formcontrolname='creditLimit' or @placeholder='Credit Limit']")).sendKeys("1");
				 
				 Thread.sleep(1000);   
				 
//				 driver.findElement(By.xpath("//*[@id=\"mat-error-5\"]")) 
				 
				   String text4=driver.findElement(By.xpath("//mat-error[contains(text(),'Contact Name is required!')]")).getText();
					System.out.println(text4);
					String exp4="Contact Name is required!";
					Assert.assertEquals(text4,exp4);
				 
					String name="Robert"+r.nextInt(1000);
				 
				 driver.findElement(By.xpath("//input[@id=\"mat-input-123\" or @formcontrolname='contactName' or @placeholder='Contact Name']")).sendKeys(name);
			
//				 driver.findElement(By.xpath("//*[@id=\"mat-error-5\"]"))
				 
				 String text40=driver.findElement(By.xpath("//mat-error[contains(text(),'Contact Email is required!')]")).getText();
					System.out.println(text40);
					String exp40="Contact Email is required!";
					Assert.assertEquals(text40,exp40);
				 
				 
				 
				 
				 
				 String email="robert"+r.nextInt(1000)+"@mailinator.com";
				 
				 driver.findElement(By.xpath("//input[@id=\"mat-input-124\" or @formcontrolname='contactEmail' or @placeholder='Contact Email']")).sendKeys("!%$^(**");

//				 driver.findElement(By.xpath("//*[@id=\"mat-error-8\"]"))
				 
				 String text5=driver.findElement(By.xpath("//mat-error[contains(text(),'Please enter a valid email address!')]")).getText();
					System.out.println(text5);
					String exp5="Please enter a valid email address!";
					Assert.assertEquals(text5,exp5);
				 
				 
					 driver.findElement(By.xpath("//input[@id=\"mat-input-124\" or @formcontrolname='contactEmail' or @placeholder='Contact Email']")).clear();

				 
				 driver.findElement(By.xpath("//input[@id=\"mat-input-124\" or @formcontrolname='contactEmail' or @placeholder='Contact Email']")).sendKeys(email);

				 
			//	 driver.findElement(By.xpath("//*[@id=\"mat-error-7\"]"))
				 
				 
				 
				 String text6=driver.findElement(By.xpath("//mat-error[contains(text(),'Phone Number is required!')]")).getText();
					System.out.println(text6);
					String exp6="Phone Number is required!";
					Assert.assertEquals(text6,exp6);
				 
					 driver.findElement(By.xpath("//input[@id=\"mat-input-125\" or @formcontrolname='contactPhone1' or @placeholder='Phone Number']")).sendKeys("&&*()__");

					
				//	 driver.findElement(By.xpath("//*[@id=\"mat-error-10\"]"))
					 
					 String text7=driver.findElement(By.xpath("//mat-error[contains(text(),'Only number are allowed!')]")).getText();
						System.out.println(text7);
						String exp7="Only number are allowed!";
						Assert.assertEquals(text7,exp7);
					 
						
						 driver.findElement(By.xpath("//input[@id=\"mat-input-125\" or @formcontrolname='contactPhone1' or @placeholder='Phone Number']")).clear();
		
						
						 driver.findElement(By.xpath("//input[@id=\"mat-input-125\" or @formcontrolname='contactPhone1' or @placeholder='Phone Number']")).sendKeys("67899990");
							
						 
					//	 driver.findElement(By.xpath("//*[@id=\"mat-error-11\"]"))
				 
						 String text8=driver.findElement(By.xpath("//mat-error[contains(text(),'Phone Number is minimum 10 digit long!')]")).getText();
							System.out.println(text8);
							String exp8="Phone Number is minimum 10 digit long!";
							Assert.assertEquals(text8,exp8);
						
							 driver.findElement(By.xpath("//input[@id=\"mat-input-125\" or @formcontrolname='contactPhone1' or @placeholder='Phone Number']")).clear();
		
							 
								Faker faker = new Faker(new Locale("en-IND"));
								String num=	faker.number().digits(10);
							 
			
				 driver.findElement(By.xpath("//input[@id=\"mat-input-125\" or @formcontrolname='contactPhone1' or @placeholder='Phone Number']")).sendKeys(num);
				 
				 
				 
				 driver.findElement(By.xpath("//input[@id=\"mat-input-126\" or @formcontrolname='contactPhone2' or @placeholder='Alternate Phone Number']")).sendKeys("((**((");

				 
				 driver.findElement(By.xpath("//input[@id=\"mat-input-126\" or @formcontrolname='contactPhone2' or @placeholder='Alternate Phone Number']")).clear();

				 driver.findElement(By.xpath("//input[@id=\"mat-input-126\" or @formcontrolname='contactPhone2' or @placeholder='Alternate Phone Number']")).sendKeys("95632");

				 driver.findElement(By.xpath("//input[@id=\"mat-input-126\" or @formcontrolname='contactPhone2' or @placeholder='Alternate Phone Number']")).clear();

					String num2=	faker.number().digits(10);
				 
				 
   
				 driver.findElement(By.xpath("//input[@id=\"mat-input-126\" or @formcontrolname='contactPhone2' or @placeholder='Alternate Phone Number']")).sendKeys(num2);

				   
			  
				   
				   Thread.sleep(1000);   
				   
				   driver.findElement(By.xpath("//textarea[@id=\"mat-input-127\" or @formcontrolname='addressLine1']")).click();
			   
				   driver.findElement(By.xpath("//textarea[@id=\"mat-input-127\" or @formcontrolname='addressLine1']")).sendKeys("13 Ditmars St");

				   driver.findElement(By.xpath("//textarea[@id=\"mat-input-128\" or @formcontrolname='addressLine2']")).sendKeys("Space # MC-83");
				   Thread.sleep(1000);   
				   
			WebElement city= driver.findElement(By.xpath("//input[@id=\"mat-input-129\" or @formcontrolname='addressCity' or @placeholder='City']"));
				   
				   
				   
				   Actions action6=new Actions(driver);
				   action6.moveToElement(city).click().build().perform();
				   
				   city.sendKeys("Vancouver");
				   Thread.sleep(1000);
				   
				   city.sendKeys(Keys.ARROW_DOWN);
				   city.sendKeys(Keys.ENTER);
				   

				   Thread.sleep(1000);   
				   

				   
							   Actions action8=new Actions(driver);
							   action8.moveToElement(driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='addressZipcode']"))).click().build().perform();
							   
							   
							   driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='addressZipcode']")).sendKeys("&*^&*(");
							   
							   
						//	   driver.findElement(By.xpath("//*[@id=\"mat-error-14\"]"))
							   
							   String text9=driver.findElement(By.xpath("//mat-error[contains(text(),'Enter valid postal code!')]")).getText();
								System.out.println(text9);
								String exp9="Enter valid postal code!";
								Assert.assertEquals(text9,exp9);
							   
								  driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='addressZipcode']")).clear();
							   
							   
							  driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='addressZipcode']")).sendKeys("V5K 0A1");

				   
							  WebElement element = driver.findElement(By.xpath("//input[@formcontrolname='billingEmail' or @placeholder='Email']"));
							  ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
				   
							  
							  Thread.sleep(1000);
							  
							  
							  Actions action9=new Actions(driver);
							   action9.moveToElement(driver.findElement(By.xpath("//input[@formcontrolname='billingEmail' or @placeholder='Email']"))).click().build().perform();
							   
							   String email1="robertbusiness"+r.nextInt(1000)+"@mailinator.com";
							   
							   
							   driver.findElement(By.xpath("//input[@formcontrolname='billingEmail' or @placeholder='Email']")).sendKeys(email1);
		
	 
							   driver.findElement(By.xpath("//textarea[@id=\"mat-input-133\" or @formcontrolname='billingLine1']")).sendKeys("56 OLD STEESE HWY");
								
	 
	 
	 
							   driver.findElement(By.xpath("//textarea[@id=\"mat-input-134\" or @formcontrolname='billingLine2']")).sendKeys("UNIT 9");
								
							   Thread.sleep(1000);   
							   
							   driver.findElement(By.xpath("//*[@id=\"mat-input\" or @formcontrolname='billingCity']")).click();
							   
							   driver.findElement(By.xpath("//*[@id=\"mat-input\" or @formcontrolname='billingCity']")).sendKeys("Vancouver",Keys.ARROW_DOWN,Keys.ENTER);
								
	 
	 
							   Thread.sleep(1000);   
							   
							   
							   driver.findElement(By.xpath("//*[@id=\"mat-input\" or @formcontrolname='billingZipcode' ]")).sendKeys("&*^%^&&");
							   driver.findElement(By.xpath("//*[@id=\"mat-input\" or @formcontrolname='billingZipcode' ]")).clear();
							   
							   driver.findElement(By.xpath("//*[@id=\"mat-input\" or @formcontrolname='billingZipcode' ]")).sendKeys("V5K 1N6");
										  
										  
							   
							   Thread.sleep(1000);   
										  driver.findElement(By.xpath("//input[@id=\"mat-input\" or @data-placeholder='Question' or @formcontrolname='question']")).sendKeys("Did driver has required documents?");
										  
										  driver.findElement(By.xpath("//input[@id=\"mat-input\" or @data-placeholder='Answer' or @formcontrolname='answer']")).sendKeys("License");
										  
//										  Thread.sleep(1000); 
//										  Actions action712=new Actions(driver);
//										   action712.moveToElement(driver.findElement(By.xpath("//button[@type='button']/span[contains(text(),'Add ')]"))).click().build().perform();
//										  
										   
//										   Thread.sleep(1000); 
//										   
//										   
//										   driver.findElement(By.xpath("//*[@id=\"mat-input-23\"]")).sendKeys("Driver experienced?");
//											  
//									  driver.findElement(By.xpath("//*[@id=\"mat-input-24\"]")).sendKeys("10years");
										   
									  Thread.sleep(5000);  
									  
								  
										  Actions action7111=new Actions(driver);
										   action7111.moveToElement(driver.findElement(By.xpath("//*[@id=\"zone-template\"]/form/div[1]/div[2]/button"))).click().build().perform();
 
	 }
	

	 @Test(priority=3) 	
	 public void editCustomer() throws Exception {
//			Thread.sleep(3000);		
//			WebElement sidebar=	driver.findElement(By.xpath("//*[@id=\"container-1\"]/fuse-sidebar/navbar/navbar-vertical-style-1/div[2]/div[1]/fuse-navigation/div/fuse-nav-vertical-collapsable[3]/a/span"));
//				   Actions action=new Actions(driver);
//				   action.moveToElement(sidebar).click().build().perform();
//				   Thread.sleep(2000);
//					WebElement customers=	driver.findElement(By.xpath("//*[@id=\"container-1\"]/fuse-sidebar/navbar/navbar-vertical-style-1/div[2]/div[1]/fuse-navigation/div/fuse-nav-vertical-collapsable[3]/div/fuse-nav-vertical-item[1]/a/span"));
//				   ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", customers);
//				   Thread.sleep(2000);
//				   Actions action4=new Actions(driver);
//				   action4.moveToElement(customers).click().build().perform();
//				   
//				   driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
				   
				   Thread.sleep(5000);  

//		  Actions action1=new Actions(driver);
//
//		  action1.moveToElement(driver.findElement(By.xpath("//*[@id=\"customers\"]/div[1]/div/div[2]/span/mat-icon"))).click().build().perform();
////		 
//		 
//		  Actions action2=new Actions(driver);
//		  action2.moveToElement(driver.findElement(By.xpath("//input[@id=\"mat-input-0\" or @formcontrolname='search' or @placeholder='Name, Phone Number, Email']"))).click().build().perform();
//	
//		  driver.findElement(By.xpath("//input[@id=\"mat-input-0\" or @formcontrolname='search' or @placeholder='Name, Phone Number, Email']")).sendKeys("Retail pvt ltd");
//		 
//		 
//		  driver.findElement(By.xpath("//input[@id=\"mat-input-49\" or @formcontrolname='address' or @placeholder='Address, Province, City']")).sendKeys("13 Ditmars St");
//			 
//		  
//		  Actions action3=new Actions(driver);
//		  action3.moveToElement(driver.findElement(By.xpath("//*[@id=\"customers\"]/div[2]/div/div[4]/manage-customers/custom-sidebar/div/div[2]/div[3]/div/form/div[2]/button[1]"))).click().build().perform();
//		
//		  Thread.sleep(1000);  
//		  
		  
		  
		  Actions action5=new Actions(driver);
		  action5.moveToElement(driver.findElement(By.xpath("//*[@id=\"customers\"]/div[2]/div/div[4]/manage-customers/div[2]/div/div[2]/div[5]/div[2]/a[2]"))).click().build().perform();
		
		  
		  WebElement firstname= driver.findElement(By.xpath("//input[@id=\"mat-input-120\" or @formcontrolname='customerName' or @placeholder='Customer Name']"));
		   Actions action6=new Actions(driver);
		   action6.moveToElement(firstname).click().build().perform();
		   
		   firstname.clear();
		   
		   firstname.sendKeys("James Retail pvt ltd");
		   
		   
//		   driver.findElement(By.xpath("//mat-select[@id=\"mat-select-45\" or @role='listbox' or @formcontrolname='priceGroup']/div/div[1]")).click();
//		   
//		   selectOptionsFromDropdown("Retail Customers");
		   
			WebElement pricegroup=   driver.findElement(By.xpath("//mat-select[@id=\"mat-select-45\" or @role='listbox' or @formcontrolname='priceGroup']/div/div[1]"));
			pricegroup	.click();
			   
			   
//			pricegroup.sendKeys("N");
				  Thread.sleep(2000);
				  
				  List<WebElement> lstt1= driver.findElements(By.xpath("//mat-option"));
				  lstt1.get(lstt1.size()-1).click();
		   
		   	   
		   
		   driver.findElement(By.xpath("//input[@id=\"mat-input-121\" or @formcontrolname='creditLimit' or @placeholder='Credit Limit']")).clear();
			 
		   driver.findElement(By.xpath("//input[@id=\"mat-input-121\" or @formcontrolname='creditLimit' or @placeholder='Credit Limit']")).sendKeys("1");
			
		   driver.findElement(By.xpath("//input[@id=\"mat-input-123\" or @formcontrolname='contactName' or @placeholder='Contact Name']")).clear();
			 
			String name="James"+r.nextInt(1000);
			
		   driver.findElement(By.xpath("//input[@id=\"mat-input-123\" or @formcontrolname='contactName' or @placeholder='Contact Name']")).sendKeys(name);
		   
		   String email="james"+r.nextInt(1000)+"@mailinator.com";
			 
			 driver.findElement(By.xpath("//input[@id=\"mat-input-124\" or @formcontrolname='contactEmail' or @placeholder='Contact Email']")).clear();

		   
			 driver.findElement(By.xpath("//input[@id=\"mat-input-124\" or @formcontrolname='contactEmail' or @placeholder='Contact Email']")).sendKeys(email);

			 Faker faker = new Faker(new Locale("en-IND"));
				String num=	faker.number().digits(10);
			 

driver.findElement(By.xpath("//input[@id=\"mat-input-125\" or @formcontrolname='contactPhone1' or @placeholder='Phone Number']")).clear();

driver.findElement(By.xpath("//input[@id=\"mat-input-125\" or @formcontrolname='contactPhone1' or @placeholder='Phone Number']")).sendKeys(num);
Thread.sleep(1000);

WebElement city= driver.findElement(By.xpath("//input[@id=\"mat-input-129\" or @formcontrolname='addressCity' or @placeholder='City']"));


Actions action9=new Actions(driver);
action9.moveToElement(city).click().build().perform();

city.clear();

city.sendKeys("Toronto");
Thread.sleep(1000);

city.sendKeys(Keys.ARROW_DOWN);
city.sendKeys(Keys.ENTER);

Thread.sleep(1000);

driver.findElement(By.xpath("//*[@id=\"mat-input\" or @formcontrolname='addressZipcode' ]")).clear();


driver.findElement(By.xpath("//*[@id=\"mat-input\" or @formcontrolname='addressZipcode' ]")).sendKeys("M1R 0E9");

Thread.sleep(1000);   

driver.findElement(By.xpath("//*[@id=\"mat-input\" or @formcontrolname='billingCity']")).clear();

driver.findElement(By.xpath("//*[@id=\"mat-input\" or @formcontrolname='billingCity']")).sendKeys("Toronto");

Thread.sleep(2000);

city.sendKeys(Keys.ARROW_DOWN);
Thread.sleep(2000);
city.sendKeys(Keys.ENTER);

Thread.sleep(4000);

driver.findElement(By.xpath("//*[@id=\"mat-input\" or @formcontrolname='billingZipcode']")).click();


driver.findElement(By.xpath("//*[@id=\"mat-input\" or @formcontrolname='billingZipcode']")).clear();

Thread.sleep(2000);

driver.findElement(By.xpath("//*[@id=\"mat-input\" or @formcontrolname='billingZipcode']")).sendKeys("M3C 0C1");
   

Thread.sleep(5000);

Actions action7111=new Actions(driver);
action7111.moveToElement(driver.findElement(By.xpath("//*[@id=\"zone-template\"]/form/div[1]/div[2]/button"))).click().build().perform();
 }
	
	 

	 @Test(priority=2) 	
	 public void sortCustomer() throws Exception {
	 
		 Thread.sleep(3000);		
//			WebElement sidebar=	driver.findElement(By.xpath("//*[@id=\"container-1\"]/fuse-sidebar/navbar/navbar-vertical-style-1/div[2]/div[1]/fuse-navigation/div/fuse-nav-vertical-collapsable[3]/a/span"));
//				   Actions action=new Actions(driver);
//				   action.moveToElement(sidebar).click().build().perform();
//				   Thread.sleep(2000);
//					WebElement customers=	driver.findElement(By.xpath("//*[@id=\"container-1\"]/fuse-sidebar/navbar/navbar-vertical-style-1/div[2]/div[1]/fuse-navigation/div/fuse-nav-vertical-collapsable[3]/div/fuse-nav-vertical-item[1]/a/span"));
//				   ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", customers);
//				   Thread.sleep(2000);
//				   Actions action4=new Actions(driver);
//				   action4.moveToElement(customers).click().build().perform();
//				   
//				   driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
//				   
//				   Thread.sleep(5000);
//				
				   
				   
				   Actions action5=new Actions(driver);
					WebElement sort=	driver.findElement(By.xpath("//app-custom-sorting"));
					action5.moveToElement(sort).doubleClick().build().perform();
				   
					 Thread.sleep(2000);
					 
			List<WebElement> lst= driver.findElements(By.xpath("//div[@class=\"sorting-field-data ng-star-inserted\"] "));
	
	    
	    int size = lst.size();
	    System.out.println(size);
	    
	    
	    for(int i = 0; i<size; i++) {
	        
	    	lst.get(i).click();
	        
	    }			
		
	    driver.findElement(By.xpath("//*[@id=\"sorting-select\"]/div")).click();
	    
 }

	/*
	 @Test(priority=3) 	
	 public void DisabeCustomer() throws Exception {
	 
		 Thread.sleep(3000);		
//			WebElement sidebar=	driver.findElement(By.xpath("//*[@id=\"container-1\"]/fuse-sidebar/navbar/navbar-vertical-style-1/div[2]/div[1]/fuse-navigation/div/fuse-nav-vertical-collapsable[3]/a/span"));
//				   Actions action=new Actions(driver);
//				   action.moveToElement(sidebar).click().build().perform();
//				   Thread.sleep(2000);
//					WebElement customers=	driver.findElement(By.xpath("//*[@id=\"container-1\"]/fuse-sidebar/navbar/navbar-vertical-style-1/div[2]/div[1]/fuse-navigation/div/fuse-nav-vertical-collapsable[3]/div/fuse-nav-vertical-item[1]/a/span"));
//				   ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", customers);
//				   Thread.sleep(2000);
//				   Actions action4=new Actions(driver);
//				   action4.moveToElement(customers).click().build().perform();
//				   
//				   driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
//				   
//	 
//				   Thread.sleep(5000);
//					
				   Actions action5=new Actions(driver);
				  
					WebElement sort=	driver.findElement(By.xpath("//*[@id=\"customers\"]/div[2]/div/div[4]/manage-customers/div[2]/div/div[2]/div[5]/div[2]/button"));
					action5.moveToElement(sort).click().build().perform();
					
					  Thread.sleep(2000);
					  
					  Actions action6=new Actions(driver);
					  
						WebElement sort1=	driver.findElement(By.xpath("//*[@id=\"mat-dialog-0\"]/fuse-confirm-dialog/mat-dialog-actions/button"));
						action6.moveToElement(sort1).click().build().perform();
						  
			
 } 
 
	*/ 
}
