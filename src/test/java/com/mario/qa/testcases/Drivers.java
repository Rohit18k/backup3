package com.mario.qa.testcases;

import java.awt.Robot;
import java.awt.event.KeyEvent;
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

public class Drivers extends TestBase1{

	Random r=new Random();
	
	public Drivers() {
	super();
	}
	
//	@BeforeTest
//	public void openBrowser() throws Exception {
//		initialization();
//	}
	

	 @Test(priority=1)
		public  void addDriver() throws Exception {
			
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
			
			 
//			 Thread.sleep(9000); 
//			 
//		 
//				   try {
//					   WebElement sidebar=	driver.findElement(By.xpath("//*[@id=\"container-1\"]/fuse-sidebar/navbar/navbar-vertical-style-1/div[2]/div[1]/fuse-navigation/div/fuse-nav-vertical-collapsable[2]/a/span"));
//					   Actions action=new Actions(driver);
//					   action.moveToElement(sidebar).click().build().perform();
//				   
//				   }
//				   catch(Exception e ) {
//						  e.printStackTrace();
//					   }

			   Thread.sleep(5000); 
			   
				WebElement customers=	driver.findElement(By.xpath("//*[@id=\"container-1\"]/fuse-sidebar/navbar/navbar-vertical-style-1/div[2]/div[1]/fuse-navigation/div/fuse-nav-vertical-collapsable[2]/div/fuse-nav-vertical-item[2]/a/span"));
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
			
				  WebElement addicon=driver.findElement(By.xpath("//button[@id=\"add-driver-button\" or @aria-label='add driver']/span/mat-icon[contains(text(),'add')]"));
				  
			   Actions action2=new Actions(driver);
			   action2.moveToElement(addicon).click().build().perform();}
			   catch(Exception e) {
				   e.printStackTrace();
			   }
			   
			   
			   
			   Thread.sleep(9000);
			   
			   
			   
			   try {
			    	  Actions action658=new Actions(driver);    	
			    	  action658.moveToElement(driver.findElement(By.xpath("//button/span[contains(text(),'Save')]"))).click().build().perform();
			    }
			    catch(Exception e) {
			    	e.printStackTrace();
			    }
			   
			   
			   
//			   driver.findElement(By.xpath("//mat-error[@role='alert'][1]"))
			   
			   String text1=driver.findElement(By.xpath("//mat-error[contains(text(),'Territory is required!')]")).getText();
				System.out.println(text1);
				String exp1="Territory is required!";
				Assert.assertEquals(text1,exp1);
			   
			   
			   
			   
			   WebElement territory= driver.findElement(By.xpath("//input[@id=\"mat-input-310\" or @formcontrolname='territory' or @placeholder='Territory']"));
			   
			   
//			   
//			   Actions action6=new Actions(driver);
//			   action6.moveToElement(territory).click().build().perform();
//			   
//			   Thread.sleep(5000);
//			   selectOptionsFromDropdown("Nunavut");
//			   
//			   
//			   
//			   
//			   Thread.sleep(1000);   
//			   
//				WebElement territory=	driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='zone' or @data-placeholder='Territory']"));
					   
				territory.sendKeys("N");
				  Thread.sleep(2000);
				  
				  List<WebElement> lstt1= driver.findElements(By.xpath("//mat-option"));
				  lstt1.get(lstt1.size()-1).click(); 
			   
			   
			   
			   
			   
			   
			   
			//   selectOptionsFromDropdown("Kamloops");
			 
//			   territory.sendKeys("Sola");
//			   Thread.sleep(2000);
//			   
//			   territory.sendKeys(Keys.ARROW_DOWN);
//			   
//			   Thread.sleep(2000);
//			   
//			   territory.sendKeys(Keys.ENTER);
//			   
			   Thread.sleep(1000);
			   
//			   driver.findElement(By.xpath("//*[@id=\"mat-error-3\"]"))	   
			   
			   String text2=driver.findElement(By.xpath("//mat-error[contains(text(),'Driver Number is required!')]")).getText();
				System.out.println(text2);
				String exp2="Driver Number is required!";
				Assert.assertEquals(text2,exp2);
			   
			   
			   driver.findElement(By.xpath("//input[@id=\"mat-input-341\" or @formcontrolname='autoNumber' or @placeholder='Driver Number']")).click();
			 
			   driver.findElement(By.xpath("//input[@id=\"mat-input-341\" or @formcontrolname='autoNumber' or @placeholder='Driver Number']")).sendKeys("%%^^&");
				 
			  
//			   driver.findElement(By.xpath("//*[@id=\"mat-error-8\"]"))	   
			   
			   String text7=driver.findElement(By.xpath("//mat-error[contains(text(),'Only number are allowed!')]")).getText();
				System.out.println(text7);
				String exp7="Only number are allowed!";
				Assert.assertEquals(text7,exp7);
			 
			   
				 driver.findElement(By.xpath("//input[@id=\"mat-input-341\" or @formcontrolname='autoNumber' or @placeholder='Driver Number']")).clear();
				 
			   
			   
				Faker faker = new Faker();
				String num=	faker.number().digits(5);

				 
				 
			   driver.findElement(By.xpath("//input[@id=\"mat-input-341\" or @formcontrolname='autoNumber' or @placeholder='Driver Number']")).sendKeys(num);
			   
			   
//			   driver.findElement(By.xpath("//*[@id=\"mat-error-4\"]"))	   
			   
			   String text3=driver.findElement(By.xpath("//mat-error[contains(text(),'First Name is required!')]")).getText();
				System.out.println(text3);
				String exp3="First Name is required!";
				Assert.assertEquals(text3,exp3);
			   
				String name="Martion"+r.nextInt(1000);

			   driver.findElement(By.xpath("//input[@id=\"mat-input-342\" or @formcontrolname='first' or @placeholder='First Name']")).sendKeys(name);
			    
			   
			 //  driver.findElement(By.xpath("//*[@id=\"mat-error-5\"]"))
			   
			   String text4=driver.findElement(By.xpath("//mat-error[contains(text(),'Last Name is required!')]")).getText();
				System.out.println(text4);
				String exp4="Last Name is required!";
				Assert.assertEquals(text4,exp4);
				
				String lastname="louis"+r.nextInt(1000);
		   
			   driver.findElement(By.xpath("//input[@id=\"mat-input-343\" or @formcontrolname='last' or @placeholder='Last Name']")).sendKeys(lastname);
	   
//			   driver.findElement(By.xpath("//*[@id=\"mat-error-6\"]"))
			   
			   
				 String text5=driver.findElement(By.xpath("//mat-error[contains(text(),'Email is required!')]")).getText();
					System.out.println(text5);
					String exp5="Email is required!";
					Assert.assertEquals(text5,exp5);
	
			   
			   
					 
					   driver.findElement(By.xpath("//input[@id=\"mat-input-344\" or @formcontrolname='email' or @placeholder='Email']")).sendKeys("&*^%");
					    
					   
//					   driver.findElement(By.xpath("//*[@id=\"mat-error-9\"]"))
			   
					   String text6=driver.findElement(By.xpath("//mat-error[contains(text(),'Please enter a valid email address!')]")).getText();
						System.out.println(text6);
						String exp6="Please enter a valid email address!";
						Assert.assertEquals(text6,exp6);
		
						 driver.findElement(By.xpath("//input[@id=\"mat-input-344\" or @formcontrolname='email' or @placeholder='Email']")).clear();
					
						 
						 String email="louis"+r.nextInt(1000)+"@mailinator.com";
						 
			   
			   driver.findElement(By.xpath("//input[@id=\"mat-input-344\" or @formcontrolname='email' or @placeholder='Email']")).sendKeys(email);
			    
			   
			 //  driver.findElement(By.xpath("//*[@id=\"mat-error-7\"]"))
			   
			   String text8=driver.findElement(By.xpath("//mat-error[contains(text(),'Phone Number is required!')]")).getText();
				System.out.println(text8);
				String exp8="Phone Number is required!";
				Assert.assertEquals(text8,exp8);

			   
				 driver.findElement(By.xpath("//input[@id=\"mat-input-345\" or @formcontrolname='primaryNumber' or @placeholder='Phone Number']")).sendKeys("^&&&");
				    
				 
				 
			//	 driver.findElement(By.xpath("//*[@id=\"mat-error-11\"]"))
			   
				 String text9=driver.findElement(By.xpath("//mat-error[contains(text(),'Only number are allowed!')]")).getText();
					System.out.println(text9);
					String exp9="Only number are allowed!";
					Assert.assertEquals(text9,exp9);

					 driver.findElement(By.xpath("//input[@id=\"mat-input-345\" or @formcontrolname='primaryNumber' or @placeholder='Phone Number']")).clear();
					    
					 driver.findElement(By.xpath("//input[@id=\"mat-input-345\" or @formcontrolname='primaryNumber' or @placeholder='Phone Number']")).sendKeys("7898");
					   
					 
				//	 driver.findElement(By.xpath("//*[@id=\"mat-error-12\"]"))
					 
			   
					 String text10=driver.findElement(By.xpath("//mat-error[contains(text(),'Primary Number is minimum 10 digit long!')]")).getText();
						System.out.println(text10);
						String exp10="Primary Number is minimum 10 digit long!";
						Assert.assertEquals(text10,exp10);
			   

						 driver.findElement(By.xpath("//input[@id=\"mat-input-345\" or @formcontrolname='primaryNumber' or @placeholder='Phone Number']")).clear();
						 
						 
						 Faker faker2 = new Faker(new Locale("en-IND"));
							String num1=faker2.number().digits(10);
						 
				
			   driver.findElement(By.xpath("//input[@id=\"mat-input-345\" or @formcontrolname='primaryNumber' or @placeholder='Phone Number']")).sendKeys(num1);
			    
			   
			   driver.findElement(By.xpath("//input[@id=\"mat-input-346\" or @formcontrolname='secondaryNumber' or @placeholder='Alternate Phone Number']")).sendKeys("^%#$%");
			    

			   driver.findElement(By.xpath("//input[@id=\"mat-input-346\" or @formcontrolname='secondaryNumber' or @placeholder='Alternate Phone Number']")).clear();
			    
			   driver.findElement(By.xpath("//input[@id=\"mat-input-346\" or @formcontrolname='secondaryNumber' or @placeholder='Alternate Phone Number']")).sendKeys("9141");
			    

			   driver.findElement(By.xpath("//input[@id=\"mat-input-346\" or @formcontrolname='secondaryNumber' or @placeholder='Alternate Phone Number']")).clear();
			    
	   
			   String num2=faker2.number().digits(10);
			   
			   
			   
			   driver.findElement(By.xpath("//input[@id=\"mat-input-346\" or @formcontrolname='secondaryNumber' or @placeholder='Alternate Phone Number']")).sendKeys(num2);
			    
			  
			   
			   Thread.sleep(5000);
			   
			   Actions action65=new Actions(driver);
			   action65.moveToElement(driver.findElement(By.xpath("//*[@id=\"driver-template\"]/form/div[2]/div/div/div/div[6]/div[2]/div[3]/div/img"))).click().build().perform();
			   
			   
			   Thread.sleep(2000);
			   List <WebElement> AllCheckboxes =  driver.findElements(By.xpath("//mat-checkbox"));
			    
			    int size = AllCheckboxes.size();
			    System.out.println(size);
			    
			    
			    for(WebElement checkox: AllCheckboxes) {
			    	checkox.click();
			    }
			    
			    
			    Thread.sleep(5000);
			    try {
			    
			    	  Actions action658=new Actions(driver);    	
			    	  action658.moveToElement(driver.findElement(By.xpath("//span[normalize-space()='Save']"))).click().build().perform();
			    }
			    catch(Exception e) {
			    	e.printStackTrace();
			    }
		
	 }
	

	 @Test(priority=2)
		public  void editDriver() throws Exception { 
	 
	 
			Thread.sleep(3000);		
//			WebElement sidebar=	driver.findElement(By.xpath("//*[@id=\"container-1\"]/fuse-sidebar/navbar/navbar-vertical-style-1/div[2]/div[1]/fuse-navigation/div/fuse-nav-vertical-collapsable[3]/a/span"));
//				   Actions action=new Actions(driver);
//				   action.moveToElement(sidebar).click().build().perform();
//				   Thread.sleep(2000); 
//				   
//					WebElement customers=	driver.findElement(By.xpath("//*[@id=\"container-1\"]/fuse-sidebar/navbar/navbar-vertical-style-1/div[2]/div[1]/fuse-navigation/div/fuse-nav-vertical-collapsable[3]/div/fuse-nav-vertical-item[2]/a/span"));
//				   ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", customers);
//				   Thread.sleep(2000);
//				   Actions action1=new Actions(driver);
//				   action1.moveToElement(customers).click().build().perform(); 
//				   driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
//				   
//				   Thread.sleep(5000);  
//
//					  Actions action4=new Actions(driver);
//
//					  action4.moveToElement(driver.findElement(By.xpath("//mat-icon[@class='ng-tns-c397-12 mat-icon notranslate align-items-end pointer material-icons mat-icon-no-color']"))).click().build().perform();
//					 
//					 
//					  Actions action2=new Actions(driver);
//					  action2.moveToElement(driver.findElement(By.xpath("//input[@id=\"mat-input-0\" or @formcontrolname='search' or @placeholder='Name, Phone Number, Email']"))).click().build().perform();
//				
//					  driver.findElement(By.xpath("//input[@id=\"mat-input-0\" or @formcontrolname='search' or @placeholder='Name, Phone Number, Email']")).sendKeys("Louis");
//					 
//					 
//				//	  driver.findElement(By.xpath("//input[@id=\"mat-input-43\" or @formcontrolname='number' or @placeholder='Driver Code Number']")).sendKeys("15067");
//						 
//					  
//					  Thread.sleep(1000);  
//					  
//					  
//					  
//					  
//					  Actions action3=new Actions(driver);
//					  action3.moveToElement(driver.findElement(By.xpath("//*[@id=\"drivers\"]/div[2]/div/div[3]/manage-drivers/custom-sidebar/div/div[2]/div[3]/div/form/div[2]/button[1]"))).click().build().perform();
//						   
//					  Thread.sleep(1000);  
					  
					  
					  
					  
					  Actions action5=new Actions(driver);
					  action5.moveToElement(driver.findElement(By.xpath("//*[@id=\"drivers\"]/div[2]/div/div[3]/manage-drivers/div[2]/div/div[2]/div[8]/div[2]/a[2]/mat-icon"))).click().build().perform();
					
					  Thread.sleep(1000);
					  
					   WebElement territory= driver.findElement(By.xpath("//input[@id=\"mat-input-310\" or @formcontrolname='territory' or @placeholder='Territory']"));
					   
					   territory.clear();
					   territory.click();
					   territory.sendKeys("N");
						  Thread.sleep(2000);
						  
						  List<WebElement> lstt1= driver.findElements(By.xpath("//mat-option"));
						  lstt1.get(lstt1.size()-1).click(); 
					   
				   
					   
//					   
//					   
//					   
//					   
//					   Actions action6=new Actions(driver);
//					   action6.moveToElement(territory).click().build().perform();
//					   territory.clear();
//					   territory.click();
//					   
//					   Thread.sleep(2000);
//					   selectOptionsFromDropdown("Nunavut");
					   
					 //  selectOptionsFromDropdown("Sola");
					   
					   Thread.sleep(1000);
					   
					   driver.findElement(By.xpath("//input[@id=\"mat-input-341\" or @formcontrolname='autoNumber' or @placeholder='Driver Number']")).clear();
						 
				   
					   Faker faker = new Faker(new Locale("en-IND"));
						String num=	faker.number().digits(5);
				   
					   driver.findElement(By.xpath("//input[@id=\"mat-input-341\" or @formcontrolname='autoNumber' or @placeholder='Driver Number']")).sendKeys(num);
						 
					   
					   Thread.sleep(1000);
					   driver.findElement(By.xpath("//input[@id=\"mat-input-342\" or @formcontrolname='first' or @placeholder='First Name']")).clear();
					    
					   String name1="Mandley"+r.nextInt(1000);
			   
					   driver.findElement(By.xpath("//input[@id=\"mat-input-342\" or @formcontrolname='first' or @placeholder='First Name']")).sendKeys(name1);
					    
				   
					   driver.findElement(By.xpath("//input[@id=\"mat-input-343\" or @formcontrolname='last' or @placeholder='Last Name']")).clear();
					   
					   String name2="louis"+r.nextInt(1000);
					   
					   driver.findElement(By.xpath("//input[@id=\"mat-input-343\" or @formcontrolname='last' or @placeholder='Last Name']")).sendKeys(name2);
					   
					   
					   driver.findElement(By.xpath("//input[@id=\"mat-input-344\" or @formcontrolname='email' or @placeholder='Email']")).clear();
					    
					   
					   
					   
					   
					   String email="louis"+r.nextInt(1000)+"@mailinator.com";
						 
					   
					   driver.findElement(By.xpath("//input[@id=\"mat-input-344\" or @formcontrolname='email' or @placeholder='Email']")).sendKeys(email);
					    
	 
	 
					   Faker faker2 = new Faker(new Locale("en-IND"));
						String num1=faker2.number().digits(10);
					 
			
		   driver.findElement(By.xpath("//input[@id=\"mat-input-345\" or @formcontrolname='primaryNumber' or @placeholder='Phone Number']")).clear();
		    

driver.findElement(By.xpath("//input[@id=\"mat-input-345\" or @formcontrolname='primaryNumber' or @placeholder='Phone Number']")).sendKeys(num1);

	 
driver.findElement(By.xpath("//input[@id=\"mat-input-346\" or @formcontrolname='secondaryNumber' or @placeholder='Alternate Phone Number']")).clear();


String num2=faker2.number().digits(10);

driver.findElement(By.xpath("//input[@id=\"mat-input-346\" or @formcontrolname='secondaryNumber' or @placeholder='Alternate Phone Number']")).sendKeys(num2);

	 
Thread.sleep(5000);

Actions action65=new Actions(driver);
action65.moveToElement(driver.findElement(By.xpath("//*[@id=\"driver-template\"]/form/div[2]/div/div/div/div[6]/div[2]/div[3]/div/img"))).click().build().perform();



List <WebElement> AllCheckboxes = driver.findElements(By.xpath("//mat-checkbox"));
 
 int size = AllCheckboxes.size();
 System.out.println(size);
 
 for(int i=0;i<=size-1;i++){
	 AllCheckboxes.get(i).click();
 }
 
 
 Thread.sleep(5000);
 try {
 
 	  Actions action658=new Actions(driver);    	
 	  action658.moveToElement(driver.findElement(By.xpath("//*[@id=\"driver-template\"]/form/div[1]/div[2]/button"))).click().build().perform();
 }
 catch(Exception e) {
 	e.printStackTrace();
 }
	 }
	

 @Test(priority=3) 	
 public void sortDriver() throws Exception {
 
		Thread.sleep(3000);		
//		WebElement sidebar=	driver.findElement(By.xpath("//*[@id=\"container-1\"]/fuse-sidebar/navbar/navbar-vertical-style-1/div[2]/div[1]/fuse-navigation/div/fuse-nav-vertical-collapsable[3]/a/span"));
//			   Actions action=new Actions(driver);
//			   action.moveToElement(sidebar).click().build().perform();
//			   Thread.sleep(2000); 
//			   
//				WebElement customers=	driver.findElement(By.xpath("//*[@id=\"container-1\"]/fuse-sidebar/navbar/navbar-vertical-style-1/div[2]/div[1]/fuse-navigation/div/fuse-nav-vertical-collapsable[3]/div/fuse-nav-vertical-item[2]/a/span"));
//			   ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", customers);
//			   Thread.sleep(2000);
//			   Actions action1=new Actions(driver);
//			   action1.moveToElement(customers).click().build().perform(); 
//			   driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
//			   
//			   
//			   Thread.sleep(5000);
			
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
	 driver.close();
	 
	 }

 

 /*
 @Test(priority=4) 	
 public void DisabeDriver() throws Exception {
 
	 Thread.sleep(3000);		
//		WebElement sidebar=	driver.findElement(By.xpath("//*[@id=\"container-1\"]/fuse-sidebar/navbar/navbar-vertical-style-1/div[2]/div[1]/fuse-navigation/div/fuse-nav-vertical-collapsable[3]/a/span"));
//			   Actions action=new Actions(driver);
//			   action.moveToElement(sidebar).click().build().perform();
//			   Thread.sleep(2000); 
//			   
//				WebElement customers=	driver.findElement(By.xpath("//*[@id=\"container-1\"]/fuse-sidebar/navbar/navbar-vertical-style-1/div[2]/div[1]/fuse-navigation/div/fuse-nav-vertical-collapsable[3]/div/fuse-nav-vertical-item[2]/a/span"));
//			   ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", customers);
//			   Thread.sleep(2000);
//			   Actions action1=new Actions(driver);
//			   action1.moveToElement(customers).click().build().perform(); 
//			   driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
// 
//			   Thread.sleep(7000);
//				
			   Actions action5=new Actions(driver);
			  
				WebElement sort=	driver.findElement(By.xpath("//*[@id=\"drivers\"]/div[2]/div/div[3]/manage-drivers/div[2]/div/div[2]/div[8]/div[2]/button[2]/mat-icon"));
				action5.moveToElement(sort).click().build().perform();
				
				  Thread.sleep(2000);
				  
				  Actions action6=new Actions(driver);
				  
					WebElement sort1=	driver.findElement(By.xpath("//*[@id=\"mat-dialog-0\"]/fuse-confirm-dialog/mat-dialog-actions/button"));
					action6.moveToElement(sort1).click().build().perform();
					  
		
} 
 */
 
}
