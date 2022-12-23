package com.wellness.qa.testcases;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.wellness.qa.base.TestBase1;

public class CreateSubscriptionWithValidations extends TestBase1{


	public CreateSubscriptionWithValidations() {
	super();
	}
	
	@BeforeTest
	public void openBrowser() throws Exception {
		initialization1();
	}

	
	
	 @Test(priority=1)
     public void  createSubscriptionWithValidations() throws Exception {
		 Thread.sleep(5000);
         
         File src=new File("./src/main/java/com/degreezen/qa/config/config.properties");
     	FileInputStream fis=new FileInputStream(src);
     	Properties pro=new  Properties();
     	pro=new Properties();
     	pro.load(fis);

         
         Actions actn= new Actions(driver);
       actn.moveToElement(driver.findElement(By.xpath("//*[@id=\"sidebarnav\"]/li[1]/a[3]/span"))).click().build().perform();
       
       Thread.sleep(3000);
		 
       
       Actions actn11= new Actions(driver);
       actn11.moveToElement(driver.findElement(By.xpath("//button[contains(text(),'Next')]"))).click().build().perform();
       
       
       String actual= "Plan selection is required";
		String expected=driver.findElement(By.xpath("//span[@class='error ng-star-inserted']")).getText();
		System.out.println(expected);
		Assert.assertEquals(actual, expected);
		
   
       
       Actions actn1= new Actions(driver);
       actn1.moveToElement(driver.findElement(By.xpath("//*[@id=\"plan_type\" or @name=\"plan_type\"]"))).click().build().perform();

       Thread.sleep(2000);
    Boolean wellneesslist=   driver.findElement(By.xpath("//*[@id=\"plan_type\"]")).isDisplayed();
    System.out.println(wellneesslist);
	

WebElement opt1=driver.findElement(By.id("plan_type"));
	
	WebElement opt2=driver.findElement(By.id("plan_type"));
	
	    	doSelectByVisbleValue(opt1,pro.getProperty("WellnessPlan"));
	    	
	    	
   // driver.findElement(By.xpath("//*[@id=\"plan_type\"]")).sendKeys("Adult Dog Wellness PlansKeys",Keys.ARROW_DOWN.ENTER);
	  
    Thread.sleep(5000);

    WebElement element11 =    driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div/app-create-subscription/div[1]/div/div/div/div[4]/div[1]/div/div[2]/button"));
	  ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element11);  
   
	  WebDriverWait wait = new WebDriverWait(driver, 5);
		 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(element11)); 
		 ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
	
		 
		 
		 
		 WebElement element2 =    driver.findElement(By.xpath("//button[contains(text(),'Next')]"));
		 WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(element2)); 
		 ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element1);
		 
	 
		 
		 String actual2= "User selection is required";
			String expected2=driver.findElement(By.xpath("//span[@class='error custom-error-margin ng-star-inserted']")).getText();
			System.out.println(expected2);
			Assert.assertEquals(actual2, expected2);
		 
		 
		 
		 
		 Thread.sleep(2000);
		 
		 WebElement element211 =    driver.findElement(By.xpath("//button[contains(text(),'Add New User')]"));
		 WebElement element123 = wait.until(ExpectedConditions.elementToBeClickable(element211)); 
		 ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element123);
		 
		 
//		 
//		  String actual2= "User selection is required";
//			String expected2=driver.findElement(By.xpath("//span[@class='error custom-error-margin ng-star-inserted']")).getText();
//			System.out.println(expected2);
//			Assert.assertEquals(actual2, expected2);
//		 
		 	 
		 
//		  Actions actn31= new Actions(driver);
//	       actn31.moveToElement(driver.findElement(By.xpath("//button[@class='btn btn-info pull-right']"))).click().build().perform();
//
		 
	       Thread.sleep(2000);
	       
		 
	       Actions actn41= new Actions(driver);
	       actn41.moveToElement(driver.findElement(By.xpath("//span[normalize-space()='Submit']"))).click().build().perform();

	       
	       Thread.sleep(2000);
	       
	       String actual21= "First Name is required";
			String expected21=driver.findElement(By.xpath("//span[normalize-space()='First Name is required']")).getText();
			System.out.println(expected21);
			Assert.assertEquals(actual21, expected21);
	       
			driver.findElement(By.xpath("//input[@placeholder='Enter First Name']")).click();

			driver.findElement(By.xpath("//input[@placeholder='Enter First Name']")).sendKeys("!!!@#@@!");
			
			driver.findElement(By.xpath("//input[@placeholder='Enter First Name']")).clear();
			
			driver.findElement(By.xpath("//input[@placeholder='Enter First Name']")).sendKeys("7856235");
			
			driver.findElement(By.xpath("//input[@placeholder='Enter First Name']")).clear();
			
			driver.findElement(By.xpath("//input[@placeholder='Enter First Name']")).sendKeys(pro.getProperty("User1"));
			
		 
			 String actual31= "Last Name is required";
				String expected31=driver.findElement(By.xpath("//span[normalize-space()='Last Name is required']")).getText();
				System.out.println(expected31);
				Assert.assertEquals(actual31, expected31);
		       
			
				driver.findElement(By.xpath("//input[@placeholder='Enter Last Name']")).click();

				driver.findElement(By.xpath("//input[@placeholder='Enter Last Name']")).sendKeys("!!!@#@@!");
			
			
				driver.findElement(By.xpath("//input[@placeholder='Enter Last Name']")).clear();
				
				driver.findElement(By.xpath("//input[@placeholder='Enter Last Name']")).sendKeys("7856235");
				
				driver.findElement(By.xpath("//input[@placeholder='Enter Last Name']")).clear();
				
				driver.findElement(By.xpath("//input[@placeholder='Enter Last Name']")).sendKeys(pro.getProperty("Last"));
			
			
				 String actual41= "Email Address is required";
					String expected41=driver.findElement(By.xpath("//span[normalize-space()='Email Address is required']")).getText();
					System.out.println(expected41);
					Assert.assertEquals(actual41, expected41);
				
				
				
					driver.findElement(By.xpath("//input[@placeholder='Enter Email Address']")).click();

					driver.findElement(By.xpath("//input[@placeholder='Enter Email Address']")).sendKeys("mark@gmail.com@gmail.com");
					
					
					 String actual51= "Please Fill Proper Email Address";
						String expected51=driver.findElement(By.xpath("//span[normalize-space()='Please Fill Proper Email Address']")).getText();
						System.out.println(expected51);
						Assert.assertEquals(actual51, expected51);
					
				
				
						driver.findElement(By.xpath("//input[@placeholder='Enter Email Address']")).clear();
					
						driver.findElement(By.xpath("//input[@placeholder='Enter Email Address']")).sendKeys(pro.getProperty("Email"));
					
						Thread.sleep(2000);
					
				
						driver.findElement(By.xpath("//label[@for='generate_email']")).click();
						
						Thread.sleep(1000);
						
						
						 String actual61= "Mobile Number is required";
							String expected61=driver.findElement(By.xpath("//span[normalize-space()='Mobile Number is required']")).getText();
							System.out.println(expected61);
							Assert.assertEquals(actual61, expected61);
						
						
							driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).click();

							driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).sendKeys("!ASqwe^");
						
						
							driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).clear();
			
							driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).sendKeys("00");
		 
							 String actual71= "Minimum 6 digits required";
								String expected71=driver.findElement(By.xpath("//span[normalize-space()='Minimum 6 digits required']")).getText();
								System.out.println(expected71);
								Assert.assertEquals(actual71, expected71);
							
								driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).clear();
								driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).sendKeys("0000000000000000");
								
								
								 String actual81= "Maximum 15 digits allowed";
									String expected81=driver.findElement(By.xpath("//span[normalize-space()='Maximum 15 digits allowed']")).getText();
									System.out.println(expected81);
									Assert.assertEquals(actual81, expected81);
								
								
									driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).clear();
									
									driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).sendKeys("ASWE!@");
									
									
									 String actual811= "Please enter numerals only (no-dashes)";
										String expected811=driver.findElement(By.xpath("//span[@class='error ng-star-inserted']")).getText();
										System.out.println(expected811);
										Assert.assertEquals(actual811, expected811);
									
									
									
										driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).clear();
																		
									driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).sendKeys(pro.getProperty("Number"));
									
									Thread.sleep(2000);
								
									driver.findElement(By.xpath("//input[@placeholder='Enter State']")).clear();
									
//									Thread.sleep(2000);
//									
//									
//									 String actual91= "State is required";
//										String expected91=driver.findElement(By.xpath("//span[normalize-space()='State is required']")).getText();
//										System.out.println(expected91);
//										Assert.assertEquals(actual91, expected91);
										
										
										
										
										driver.findElement(By.xpath("//input[@placeholder='Enter State']")).sendKeys("1234!!!!");
										
										driver.findElement(By.xpath("//input[@placeholder='Enter State']")).clear();
										
										driver.findElement(By.xpath("//input[@placeholder='Enter State']")).sendKeys(pro.getProperty("State"));
										
										
										
										
										 String actual12= "City is required";
											String expected12=driver.findElement(By.xpath("//span[normalize-space()='City is required']")).getText();
											System.out.println(expected12);
											Assert.assertEquals(actual12, expected12);
											
										
										
										
											driver.findElement(By.xpath("//input[@placeholder='Enter City']")).sendKeys("1234!!!!");
										
										
											driver.findElement(By.xpath("//input[@placeholder='Enter City']")).clear();
										
										
											driver.findElement(By.xpath("//input[@placeholder='Enter City']")).sendKeys(pro.getProperty("City"));
										
										
											String actual13= "Zipcode is required";
											String expected13=driver.findElement(By.xpath("//span[normalize-space()='Zipcode is required']")).getText();
											System.out.println(expected13);
											Assert.assertEquals(actual13, expected13);
											
											
											
											
											driver.findElement(By.xpath("//input[@placeholder='Enter Zipcode']")).sendKeys("Asder!@#");
											
											
											
											
											String actual113= "Zipcode should be a number";
											String expected113=driver.findElement(By.xpath("//span[normalize-space()='Zipcode should be a number']")).getText();
											System.out.println(expected113);
											Assert.assertEquals(actual113, expected113);
											
											
											
											
											driver.findElement(By.xpath("//input[@placeholder='Enter Zipcode']")).clear();
								
							
											driver.findElement(By.xpath("//input[@placeholder='Enter Zipcode']")).sendKeys("00");
											
											
											
											String actual23= "Minimum 5 digits required";
											String expected23=driver.findElement(By.xpath("//span[normalize-space()='Minimum 5 digits required']")).getText();
											System.out.println(expected23);
											Assert.assertEquals(actual23, expected23);
											
											
											driver.findElement(By.xpath("//input[@placeholder='Enter Zipcode']")).clear();
											
											
											
											driver.findElement(By.xpath("//input[@placeholder='Enter Zipcode']")).sendKeys("0000000000");
											
											
											

											String actual33= "Maximum 9 digits required";
											String expected33=driver.findElement(By.xpath("//span[normalize-space()='Maximum 9 digits required']")).getText();
											System.out.println(expected33);
											Assert.assertEquals(actual33, expected33);
											
											driver.findElement(By.xpath("//input[@placeholder='Enter Zipcode']")).clear();

											driver.findElement(By.xpath("//input[@placeholder='Enter Zipcode']")).sendKeys(pro.getProperty("Zipcode"));
											
											
											String actual43= "Address is required";
											String expected43=driver.findElement(By.xpath("//span[normalize-space()='Address is required']")).getText();
											System.out.println(expected43);
											Assert.assertEquals(actual43, expected43);
											
											
											driver.findElement(By.xpath("//input[@placeholder='Enter Address']")).sendKeys(pro.getProperty("Address"));
											
											
											
											 Thread.sleep(2000);
										       
										       Actions actn412= new Actions(driver);
										       actn412.moveToElement(driver.findElement(By.xpath("//span[normalize-space()='Submit']"))).click().build().perform();
										       
										       
										       Thread.sleep(2000);
										       
										       Actions actn12= new Actions(driver);
										       actn12.moveToElement(driver.findElement(By.xpath("//button[contains(text(),'Next')]"))).click().build().perform();
										       
										       
										   	String actual431= "Pet selection is required";
											String expected431=driver.findElement(By.xpath("//span[contains(text(),'Pet selection is required')]")).getText();
											System.out.println(expected43);
											Assert.assertEquals(actual431, expected431);
											
										       
											   Thread.sleep(2000);
										       
										       
											   Actions actn112= new Actions(driver);
										       actn112.moveToElement(driver.findElement(By.xpath("//button[contains(text(),'Add New Pet')]"))).click().build().perform();
										       
										       Thread.sleep(2000);
										       
								       Actions actn212= new Actions(driver);
								       actn212.moveToElement(driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[3]/button[2]/span[1]"))).click().build().perform();
										       
								       
								   	String actual91= "Name is required";
									String expected91=driver.findElement(By.xpath("//span[normalize-space()='Name is required']")).getText();
									System.out.println(expected91);
									Assert.assertEquals(actual91, expected91);
									
									
									driver.findElement(By.xpath("//input[@placeholder='Enter Name']")).sendKeys("122");
									
									driver.findElement(By.xpath("//input[@placeholder='Enter Name']")).clear();
									
									driver.findElement(By.xpath("//input[@placeholder='Enter Name']")).sendKeys("===!@#$");
									
									driver.findElement(By.xpath("//input[@placeholder='Enter Name']")).clear();
											
									
									driver.findElement(By.xpath("//input[@placeholder='Enter Name']")).sendKeys(pro.getProperty("Petname"));
									
																	
									
									String actual01= "Sex selection is required";
									String expected01=driver.findElement(By.xpath("//span[normalize-space()='Sex selection is required']")).getText();
									System.out.println(expected01);
									Assert.assertEquals(actual01, expected01);
									
									
									WebElement sex= driver.findElement(By.xpath("//select[@name='sex']"));
									
									  Actions actn32= new Actions(driver);
									  actn32.moveToElement(sex).click().build().perform();
										    
									  Thread.sleep(2000);
									  
										List<WebElement> sexoption= driver.findElements(By.xpath("//*[@id=\"addPetForm\"]/div/div/div/div[2]/div/select/option"));
										sexoption.get(1).click();
									  
									  
									
										String actual451= "Color is required";
										String expected451=driver.findElement(By.xpath("//span[normalize-space()='Color is required']")).getText();
										System.out.println(expected451);
										Assert.assertEquals(actual451, expected451);
									
										driver.findElement(By.xpath("//input[@placeholder='Enter Color']")).sendKeys("122");
										
										driver.findElement(By.xpath("//input[@placeholder='Enter Color']")).clear();
										
										driver.findElement(By.xpath("//input[@placeholder='Enter Color']")).sendKeys("===!@#$");
										
										driver.findElement(By.xpath("//input[@placeholder='Enter Color']")).clear();
												
										
										driver.findElement(By.xpath("//input[@placeholder='Enter Color']")).sendKeys(pro.getProperty("Petcolor"));
										
										
										String actual481= "Age is required";
										String expected481=driver.findElement(By.xpath("//span[normalize-space()='Age is required']")).getText();
										System.out.println(expected481);
										Assert.assertEquals(actual481, expected481);
									
                                        driver.findElement(By.xpath("//input[@placeholder='Enter Age']")).sendKeys("ASER");
										
                                        driver.findElement(By.xpath("//input[@placeholder='Enter Age']")).clear();
										
                                        driver.findElement(By.xpath("//input[@placeholder='Enter Age']")).sendKeys("===!@#$");
                                        
                                        
                                        String actual781= "Age should be valid numeric value";
										String expected781=driver.findElement(By.xpath("//span[normalize-space()='Age should be valid numeric value']")).getText();
										System.out.println(expected781);
										Assert.assertEquals(actual781, expected781);
                                        
										
                                        driver.findElement(By.xpath("//input[@placeholder='Enter Age']")).clear();
												
                                    driver.findElement(By.xpath("//input[@placeholder='Enter Age']")).sendKeys(pro.getProperty("Petage"));
										
										Thread.sleep(2000);
										
										
										String actual85= "Weight is required";
										String expected85=driver.findElement(By.xpath("//span[normalize-space()='Weight is required']")).getText();
										System.out.println(expected85);
										Assert.assertEquals(actual85, expected85);
                                        
										  driver.findElement(By.xpath("//input[@placeholder='Enter Weight']")).sendKeys("ASER");
										
										  driver.findElement(By.xpath("//input[@placeholder='Enter Weight']")).clear();
										  
										  driver.findElement(By.xpath("//input[@placeholder='Enter Weight']")).sendKeys("===!@#$");
										  
										  String actual95= "Weight should be valid numeric value";
											String expected95=driver.findElement(By.xpath("//span[normalize-space()='Weight should be valid numeric value']")).getText();
											System.out.println(expected95);
											Assert.assertEquals(actual95, expected95);
										  
								  
										  driver.findElement(By.xpath("//input[@placeholder='Enter Weight']")).clear();
										  driver.findElement(By.xpath("//input[@placeholder='Enter Weight']")).sendKeys(pro.getProperty("Petweight"));
										
										  String actual65= "Breed is required";
											String expected65=driver.findElement(By.xpath("//span[normalize-space()='Breed is required']")).getText();
											System.out.println(expected65);
											Assert.assertEquals(actual65, expected65);
										
											driver.findElement(By.xpath("//input[@placeholder='Enter Breed']")).sendKeys("122");
											
											driver.findElement(By.xpath("//input[@placeholder='Enter Breed']")).clear();
											
											driver.findElement(By.xpath("//input[@placeholder='Enter Breed']")).sendKeys("===!@#$");
											
											driver.findElement(By.xpath("//input[@placeholder='Enter Breed']")).clear();
													
											
											driver.findElement(By.xpath("//input[@placeholder='Enter Breed']")).sendKeys(pro.getProperty("Breed"));
											
											Thread.sleep(2000);
											
											 Actions actn72= new Actions(driver);
											 actn72.moveToElement(driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[3]/button[2]/span[1]"))).click().build().perform();
												    
										
												Thread.sleep(2000);
											 
												 Actions actn712= new Actions(driver);
												 actn712.moveToElement(driver.findElement(By.xpath("//button[contains(text(),'Next')]"))).click().build().perform();
													
											 
												 Thread.sleep(2000);
											 
											 
												 Actions actn742= new Actions(driver);
												 actn742.moveToElement(driver.findElement(By.xpath("//*[@id=\"addCreditCardFormInputs\"]/div[4]/div/button/span[1]"))).click().build().perform();
												
												 Thread.sleep(2000);
											 
											 
											 
												  String actual615= "Card Holder Name is required";
													String expected615=driver.findElement(By.xpath("//span[normalize-space()='Card Holder Name is required']")).getText();
													System.out.println(expected615);
													Assert.assertEquals(actual615, expected615);
											 
													driver.findElement(By.xpath("//input[@placeholder='Card Holder Name']")).sendKeys("123.322");
											 
													driver.findElement(By.xpath("//input[@placeholder='Card Holder Name']")).clear();
											 
													driver.findElement(By.xpath("//input[@placeholder='Card Holder Name']")).sendKeys("!!@@&^^");
											 
													driver.findElement(By.xpath("//input[@placeholder='Card Holder Name']")).clear();
													
													driver.findElement(By.xpath("//input[@placeholder='Card Holder Name']")).sendKeys(pro.getProperty("Cardholdername"));
													
													
													  String actual15= "Card Number is required";
														String expected15=driver.findElement(By.xpath("//span[normalize-space()='Card Number is required']")).getText();
														Assert.assertEquals(actual15, expected15);
												 
													
														driver.findElement(By.xpath("//input[@placeholder='Card Number']")).sendKeys("123.322");
													
													
														driver.findElement(By.xpath("//input[@placeholder='Card Number']")).clear();
													
													
													
														driver.findElement(By.xpath("//input[@placeholder='Card Number']")).sendKeys("!!@@&^^");
													
													
														driver.findElement(By.xpath("//input[@placeholder='Card Number']")).clear();
													
													
														driver.findElement(By.xpath("//input[@placeholder='Card Number']")).sendKeys(pro.getProperty("Cardnumber"));
														
														
														

														  String actual915= "Card Expiry Month is required";
															String expected915=driver.findElement(By.xpath("//span[@class='error ng-star-inserted']")).getText();
															Assert.assertEquals(actual915, expected915);
													 
														
															driver.findElement(By.xpath("//input[@placeholder='MM/YY']")).sendKeys("00 / 00");
														
														
															 String actual92= "Please enter valid Expiry";
																String expected92=driver.findElement(By.xpath("//span[@class='error ng-star-inserted']")).getText();
																Assert.assertEquals(actual92, expected92);
															
															driver.findElement(By.xpath("//input[@placeholder='MM/YY']")).clear();
														
															driver.findElement(By.xpath("//input[@placeholder='MM/YY']")).sendKeys(pro.getProperty("Cardexpiry"));
														
														
															driver.findElement(By.xpath("//input[@placeholder='MM/YY']")).sendKeys("7853",Keys.ENTER);
														
															 Thread.sleep(2000);
														
															 Actions actn7412= new Actions(driver);
															 actn7412.moveToElement(driver.findElement(By.xpath("//*[@id=\"addCreditCardFormInputs\"]/div[4]/div/button/span[1]"))).click().build().perform();
															
															 Thread.sleep(9000);
															 
								WebElement paybutton=	 driver.findElement(By.xpath("/html/body/app-root/app-full-layout/div/div/div/app-create-subscription/div[2]/div/div/div/div/div[6]/address/button"));
															
															 
															 Actions actn732= new Actions(driver);
															 actn732.moveToElement(paybutton).click().build().perform();
																												
	 }
	 /*
	  @Test(priority=4)
	     public void cancelSubscription() throws Exception {
	         Thread.sleep(5000);

			 driver.navigate().to("http://wellness.projectdemo.us/admin/dashboard");
			 
			 Thread.sleep(2000);
			 
	Actions action3= new Actions(driver);
			 
	action3.moveToElement(driver.findElement(By.xpath("//*[@id=\"sidebarnav\"]/li[6]/a"))).click().build().perform();

	Thread.sleep(5000);


	driver.findElement(By.xpath("//table[1]/tbody[1]/tr[1]/td[7]/a[1]")).click();


	Thread.sleep(2000);
	         
	Actions action4= new Actions(driver);
	 
	action4.moveToElement(driver.findElement(By.xpath("//*[@id=\"PlanDetails\"]/div[1]/div/a[contains(text(),'Cancel Subscription')]"))).click().build().perform();
	         
	Thread.sleep(2000);
	
	WebElement note=driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div/ng-component/p-sidebar[2]/div/div/div/div[2]/div/textarea"));
	
	Actions action5= new Actions(driver);
	 
	action5.moveToElement(note).click().build().perform();
	
	
	note.sendKeys("features are not available",Keys.ENTER);
	
	        
	WebElement paymentoption = driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div/ng-component/p-sidebar[2]/div/div/div/div[3]/div[1]/select"));
	
	paymentoption.click();
	
Thread.sleep(2000);

paymentoption.sendKeys(Keys.ARROW_DOWN);
paymentoption.sendKeys(Keys.ARROW_DOWN);
paymentoption.sendKeys(Keys.ARROW_DOWN);
paymentoption.sendKeys(Keys.ENTER);

Thread.sleep(2000);

WebElement cardtype = driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div/ng-component/p-sidebar[2]/div/div/div/div[3]/div[2]/select"));

cardtype.click();

cardtype.sendKeys(Keys.ARROW_DOWN);
cardtype.sendKeys(Keys.ENTER);


Actions action6= new Actions(driver);

action6.moveToElement(driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div/ng-component/p-sidebar[2]/div/div/div/div[4]/div/div/button[1]/span[1]"))).click().build().perform();

}


@Test(priority=2)
	     public void upgradeSubscription() throws Exception {
		  
		  	   Thread.sleep(5000);

			 driver.navigate().to("http://wellness.projectdemo.us/admin/dashboard");
			 
			 Thread.sleep(2000);
			 
	Actions action3= new Actions(driver);
			 
	action3.moveToElement(driver.findElement(By.xpath("//*[@id=\"sidebarnav\"]/li[6]/a"))).click().build().perform();

	Thread.sleep(5000);


	driver.findElement(By.xpath("//table[1]/tbody[1]/tr[1]/td[7]/a[1]")).click();

	Thread.sleep(2000);
   
	Actions action4= new Actions(driver);
	 
	action4.moveToElement(driver.findElement(By.xpath("//*[@id=\"PlanDetails\"]/div[1]/div/a[contains(text(),'Upgrade Plan')]"))).click().build().perform();
	         
		  

	Thread.sleep(2000);
   
	WebElement upgradeplan= driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div/ng-component/p-sidebar[2]/div/div/div/div[2]/div/div/div/select[@name='plan']"));
	
	
	Actions action5= new Actions(driver);
	 
	action5.moveToElement(upgradeplan).click().build().perform();
	
	upgradeplan.sendKeys(Keys.ARROW_DOWN);
	
	upgradeplan.sendKeys(Keys.ENTER);
	
	
	Thread.sleep(2000);
	
	WebElement textarea= driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div/ng-component/p-sidebar[2]/div/div/div/div[4]/div[2]/textarea"));
	
	Actions action6= new Actions(driver);
	 
	action6.moveToElement(textarea).click().build().perform();
	   
	
	textarea.sendKeys("Plan has good features");
	
	
	WebElement paymentmode = driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div/ng-component/p-sidebar[2]/div/div/div/div[5]/div[1]/select"));
	
	
	Actions action7= new Actions(driver);
	 
	action7.moveToElement(paymentmode).click().build().perform();
	
	
	paymentmode.sendKeys(Keys.ARROW_DOWN);
	paymentmode.sendKeys(Keys.ARROW_DOWN);
	paymentmode.sendKeys(Keys.ARROW_DOWN);
	paymentmode.sendKeys(Keys.ENTER);
	
	
	

	WebElement paymenttype = driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div/ng-component/p-sidebar[2]/div/div/div/div[5]/div[2]/select"));
	
	
	Actions action8= new Actions(driver);
	 
	action8.moveToElement(paymenttype).click().build().perform();
	
	
	paymenttype.sendKeys(Keys.ARROW_DOWN);
	paymenttype.sendKeys(Keys.ENTER);
	
	
	
driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div/ng-component/p-sidebar[2]/div/div/div/div[6]/div/div/button[1]/span[1]")).click();	  


	  }
	  

	  @Test(priority=3)
	     public void downgradeSubscription() throws Exception {
		  
		  	   Thread.sleep(5000);

			 driver.navigate().to("http://wellness.projectdemo.us/admin/dashboard");
			 
			 Thread.sleep(2000);
			 
	Actions action3= new Actions(driver);
			 
	action3.moveToElement(driver.findElement(By.xpath("//*[@id=\"sidebarnav\"]/li[6]/a"))).click().build().perform();

	Thread.sleep(5000);


	driver.findElement(By.xpath("//table[1]/tbody[1]/tr[1]/td[7]/a[1]")).click();

	Thread.sleep(2000);

	Actions action4= new Actions(driver);
	 
	action4.moveToElement(driver.findElement(By.xpath("//*[@id=\"PlanDetails\"]/div[1]/div/a[3]"))).click().build().perform();
	         
		  

	Thread.sleep(2000);

	WebElement downgradeplan= driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div/ng-component/p-sidebar[2]/div/div/div/div[2]/div/div/div/select[@name='plan']"));
	
	
	Actions action5= new Actions(driver);
	 
	action5.moveToElement(downgradeplan).click().build().perform();
	
	downgradeplan.sendKeys(Keys.ARROW_DOWN);
	
	downgradeplan.sendKeys(Keys.ENTER);
	

	Thread.sleep(2000);
	
	WebElement textarea= driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div/ng-component/p-sidebar[2]/div/div/div/div[4]/div/textarea"));
	
	Actions action6= new Actions(driver);
	 
	action6.moveToElement(textarea).click().build().perform();
	   
	
	textarea.sendKeys("need less requirement");
	

	WebElement paymentmode = driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div/ng-component/p-sidebar[2]/div/div/div/div[5]/div[1]/select"));
	
	
	Actions action7= new Actions(driver);
	 
	action7.moveToElement(paymentmode).click().build().perform();
	
	
	paymentmode.sendKeys(Keys.ARROW_DOWN);
	paymentmode.sendKeys(Keys.ARROW_DOWN);
	paymentmode.sendKeys(Keys.ARROW_DOWN);
	paymentmode.sendKeys(Keys.ENTER);
	
	


	WebElement paymenttype = driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div/ng-component/p-sidebar[2]/div/div/div/div[5]/div[2]/select"));
	
	
	Actions action8= new Actions(driver);
	 
	action8.moveToElement(paymenttype).click().build().perform();
	
	
	paymenttype.sendKeys(Keys.ARROW_DOWN);
	paymenttype.sendKeys(Keys.ENTER);
	
	
	
driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div/ng-component/p-sidebar[2]/div/div/div/div[6]/div/div/button[1]/span[1]")).click();	 

	  }	  
	*/
	
}