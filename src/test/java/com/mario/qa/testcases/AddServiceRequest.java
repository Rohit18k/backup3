package com.mario.qa.testcases;


import java.util.List;
import java.util.Locale;
import java.util.Properties;
import java.util.Random;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.fitsyn.qa.base.TestBase1;
import com.github.javafaker.Faker;
import com.screenrecorder.MyScreenRecorder;

public class AddServiceRequest extends TestBase1{

	Random r=new Random();
	
	public AddServiceRequest() {
	super();
	}
	
//	@BeforeTest
//	public void openBrowser() throws Exception {
//		initialization();
//	}


	 @Test(priority=1)
		public  void addServiceRequest() throws Exception {		
	//	 MyScreenRecorder.startRecording("servicerequest");
			Thread.sleep(2000);	
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
						   WebElement sidebar=	driver.findElement(By.xpath("//span[contains(text(),'Add Service Request')]"));
						   Actions action=new Actions(driver);
						   action.moveToElement(sidebar).click().build().perform();
					   
					   }
					   catch(Exception e ) {
							  e.printStackTrace();
						   }
			
			

			   Thread.sleep(2000);
			   Actions action41=new Actions(driver);
			   action41.moveToElement( driver.findElement(By.xpath("//*[@id=\"service-request-partial\"]/form/div[1]/div[2]/button"))).click().build().perform();
		
			   
			   
			   String text1=driver.findElement(By.xpath("//mat-error[contains(text(),'Service is required!')]")).getText();
				System.out.println(text1);
				String exp1="Service is required!";
				Assert.assertEquals(text1,exp1);
	
				
				  Thread.sleep(1000);
			   driver.findElement(By.xpath("//*[@id=\"mat-select\" or @formcontrolname='service' or @placeholder='Select Service']")).click();		   
			   
		List<WebElement> lst=  driver.findElements(By.xpath("//mat-option"));
		System.out.println(lst.size());
		  Thread.sleep(1000);
		
		lst.get(1).click();  

		 String text2=driver.findElement(By.xpath("//mat-error[contains(text(),'Caller Name is required!')]")).getText();
			System.out.println(text2);
			String exp2="Caller Name is required!";
			Assert.assertEquals(text2,exp2);
		
		
		
		  Thread.sleep(1000);
			  
			WebElement callerdetails=driver.findElement(By.xpath("//input[@id='mat-input' or @data-placeholder='Caller Name' or @formcontrolname='customerName']")); 
		  Actions action1=new Actions(driver);
		   action1.moveToElement(callerdetails).click().build().perform();	 
	   
			String name="John"+r.nextInt(1000);
		   callerdetails.sendKeys(name);
		   
		   
		   
		   String text7=driver.findElement(By.xpath("//mat-error[contains(text(),'Callback Number is required!')]")).getText();
			System.out.println(text7);
			String exp7="Callback Number is required!";
			Assert.assertEquals(text7,exp7);
		   
			driver.findElement(By.xpath("//input[@id='mat-input-55' or @data-placeholder='Callback Number']")).sendKeys("!!!@@!Assdd");
			
			
			 String text3=driver.findElement(By.xpath("//mat-error[contains(text(),'Only number are allowed!')]")).getText();
				System.out.println(text3);
				String exp3="Only number are allowed!";
				Assert.assertEquals(text3,exp3);
			   
		
			Faker faker = new Faker(new Locale("en-IND"));
			String num=	faker.number().digits(10);
		   
			 driver.findElement(By.xpath("//input[@id='mat-input-55' or @data-placeholder='Callback Number']")).clear();
			
		   driver.findElement(By.xpath("//input[@id='mat-input-55' or @data-placeholder='Callback Number']")).sendKeys(num)  ;
		   
		   
		  
		   driver.findElement(By.xpath("//input[@id='mat-input-56' or @data-placeholder='Email']")).sendKeys("q@gmail@gmail.com");
		   
		   
		   String text4=driver.findElement(By.xpath("//mat-error[contains(text(),'Please enter a valid email address!')]")).getText();
			System.out.println(text4);
			String exp4="Please enter a valid email address!";
			Assert.assertEquals(text4,exp4);
			   
		   String email="John"+r.nextInt(1000)+"@mailinator.com";
		   
		   driver.findElement(By.xpath("//input[@id='mat-input-56' or @data-placeholder='Email']")).clear();
		   driver.findElement(By.xpath("//input[@id='mat-input-56' or @data-placeholder='Email']")).sendKeys(email);
			   
		   
		   Thread.sleep(1000);
		   
			
		   
		   
		WebElement agency=   driver.findElement(By.xpath("//*[@id=\"mat-input-5\" or @data-placeholder='Customer Agency' or @formcontrolname='customer']"));
		  Thread.sleep(4000);
		   
		  agency.sendKeys("James Retail Pvt Ltd");
		 // agency.sendKeys("Robert Retail Pvt Ltd");
				  Thread.sleep(2000);
				  agency.sendKeys(Keys.ARROW_DOWN);
				  Thread.sleep(2000);
				  agency.sendKeys(Keys.ENTER);
				  Thread.sleep(3000);

			   Actions action3=new Actions(driver);
			   action3.moveToElement( driver.findElement(By.xpath("//app-ask-customer-questions/div/div[2]/a/span[contains(text(),'Cancel')]"))).click().build().perform();
				  
			   Thread.sleep(1000);
		   
		   Actions action2=new Actions(driver);
		   action2.moveToElement(driver.findElement(By.xpath("//input[@id=\"mat-input-58\" or @formcontrolname='po']"))).click().build().perform();
		   
		   
		 driver.findElement(By.xpath("//input[@id=\"mat-input-58\" or @formcontrolname='po']")).sendKeys("232548");
		   
		  driver.findElement(By.xpath("//input[@id=\"mat-input-59\" or @formcontrolname='claim']")).sendKeys("MP12");
	   
		   
			 String text5=driver.findElement(By.xpath("//mat-error[contains(text(),'Vehicle Type is required!')]")).getText();
				System.out.println(text5);
				String exp5="Vehicle Type is required!";
				Assert.assertEquals(text5,exp5);
		  		  
		  
		  Thread.sleep(1000);
		  
		  
		  driver.findElement(By.xpath("//*[@id=\"mat-select\"  or @formcontrolname='type' or @placeholder='Vehicle Type']")).click();	
		  
		//  driver.findElement(By.xpath("//*[@id=\"mat-select-1\"]/div/div[1]")).click();		   
		   
			List<WebElement> lst2=  driver.findElements(By.xpath("//mat-option"));
			System.out.println(lst2.size());
			  Thread.sleep(2000);
			
			lst2.get(3).click();  
		  
		
			 driver.findElement(By.xpath("//input[@id=\"mat-input-8\" or @formcontrolname='year' or @data-placeholder='Year']")).sendKeys("!@@AQ"); 
			 
			
			  String text6=driver.findElement(By.xpath("//mat-error[contains(text(),'Only number are allowed!')]")).getText();
				System.out.println(text6);
				String exp6="Only number are allowed!";
				Assert.assertEquals(text6,exp6);

				driver.findElement(By.xpath("//input[@id=\"mat-input-8\" or @formcontrolname='year' or @data-placeholder='Year']")).clear();
				 
			
			 driver.findElement(By.xpath("//input[@id=\"mat-input-8\" or @formcontrolname='year' or @data-placeholder='Year']")).sendKeys("2017"); 
			 
		  
			   String text8=driver.findElement(By.xpath("//mat-error[contains(text(),'Make is required!')]")).getText();
				System.out.println(text8);
				String exp8="Make is required!";
				Assert.assertEquals(text8,exp8);
			 
				
				 driver.findElement(By.xpath("//input[@id=\"mat-input-9\" or @formcontrolname='make' or  @data-placeholder='Make']")).sendKeys("FORD",Keys.ENTER); 
			 
			// driver.findElement(By.xpath("//input[@id=\"mat-input-9\" or @formcontrolname='make' or  @data-placeholder='Make']")).sendKeys("Ford SUV",Keys.ENTER); 
		  
			 
			 String text9=driver.findElement(By.xpath("//mat-error[contains(text(),'Model is required!')]")).getText();
				System.out.println(text9);
				String exp9="Model is required!";
				Assert.assertEquals(text9,exp9);
			 
			 
			  Thread.sleep(1000);
			  
			  String model="Fiesta"+r.nextInt(100);
			  
			  driver.findElement(By.xpath("//input[@id=\"mat-input-10\" or @formcontrolname='model' or @data-placeholder='Model']")).sendKeys(model); 
			  
			  			  
			  
			  driver.findElement(By.xpath("//input[@id=\"mat-input-11\" or @data-placeholder='Color' or  @formcontrolname='color']")).click();
				
			  selectOptionsFromDropdown("Red");
			
			  
		//	  driver.findElement(By.xpath("//input[@id=\"mat-input-10\" or @formcontrolname='model' or @data-placeholder='Model']")).sendKeys("SUV 539"); 
		  
				String vehiclenumber="ABC-"+r.nextInt(1000);
				
			  driver.findElement(By.xpath("//input[@id=\"mat-input-11\" or  @formcontrolname='licensePlatNumber' or @data-placeholder='License Plate Number']")).sendKeys(vehiclenumber); 
	 
	 
			  driver.findElement(By.xpath("//input[@id=\"mat-input-13\" or @formcontrolname='vin' or @data-placeholder='VIN']")).sendKeys("5FNRL38457B016858"); 
	 
	 
			  
			  WebElement element = driver.findElement(By.xpath("//input[@formcontrolname='siteFullAddress']"));
			  ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
			
			  
			  
			  Thread.sleep(1000);
			
			  element.sendKeys("san");			  
					  Thread.sleep(2000);
					  element.sendKeys(Keys.ARROW_DOWN);
					  element.sendKeys(Keys.ARROW_DOWN.ENTER);
			   
					  Thread.sleep(1000);
					  
					  WebElement element1 = driver.findElement(By.xpath("//input[@id=\"mat-input-15\" or @formcontrolname='destinationFullAddress']"));
					  ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
					
					  Thread.sleep(1000);
					
					  element1.sendKeys("c");
							  Thread.sleep(2000);
							  element1.sendKeys(Keys.ARROW_DOWN);
							  element1.sendKeys(Keys.ARROW_DOWN.ENTER);									  
							  
							  Thread.sleep(1000);  
							  
							  
							  Actions action5=new Actions(driver);
							   action5.moveToElement( driver.findElement(By.xpath("//button/span[contains(text(), 'Assign Driver')]"))).click().build().perform();
								  
							   Thread.sleep(7000);
							   
							   Actions action51=new Actions(driver);
							   action51.moveToElement( driver.findElement(By.xpath("//button[@id=\"Driver\"]"))).click().build().perform();
							 
							   Thread.sleep(2000);
							   
							   Actions action514=new Actions(driver);
							   action514.moveToElement( driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='driver' or @data-placeholder='Driver Number, Name, Phone, License Number']"))).click().build().perform();
							 
							   driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='driver' or @data-placeholder='Driver Number, Name, Phone, License Number']")).sendKeys("Jolly");
							  
						
							   try {
							   Thread.sleep(2000);
							   
							   Actions action51411=new Actions(driver);
							   action51411.moveToElement( driver.findElement(By.xpath("//*[@id=\"driverModal\"]/div/div[2]/form/div[2]/div[3]/div/div[2]"))).click().build().perform();
							   }
							   catch(Exception e) {
								   e.printStackTrace();
							   }

							   
							   Thread.sleep(2000);
							   
							   Actions action5141=new Actions(driver);
							   action5141.moveToElement( driver.findElement(By.xpath("//button/span[contains(text(),'Assign Driver')]"))).click().build().perform();
							 
							   
							   WebElement element11 =    driver.findElement(By.xpath("//mat-select[@id=\"mat-select\" or @name='permitTypes' or @formcontrolname='permitType']"));
								  ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element11);  
							   
						   
							   Thread.sleep(2000);
							   
							   driver.findElement(By.xpath("//mat-select[@id=\"mat-select\" or @name='permitTypes' or @formcontrolname='permitType']")).click();
							   
								List<WebElement> lst21=  driver.findElements(By.xpath("//mat-option"));
								System.out.println(lst21.size());
								  Thread.sleep(2000);
								
								lst21.get(3).click();  
							   
								Thread.sleep(2000);
								
								
								 Actions action51421=new Actions(driver);
								   action51421.moveToElement( driver.findElement(By.xpath("//app-resp-popup/div/div[2]/a/span[contains(text(),'Close')]"))).click().build().perform();
				
								   
								   
								   Thread.sleep(2000);
								   
								   
								   
								   Actions action53=new Actions(driver);
								   action53.moveToElement(driver.findElement(By.xpath("//mat-radio-group[2]"))).click().build().perform();
					   
								   Thread.sleep(1000);
								   
								   Actions action54=new Actions(driver);
								   action54.moveToElement(driver.findElement(By.xpath("//input[@id=\"cardBox1\" or @name='cardNumber1']"))).click().build().perform();
					   		   
								   
								   driver.findElement(By.xpath("//input[@id=\"cardBox1\" or @name='cardNumber1']")).sendKeys("3714");
								   
								   driver.findElement(By.xpath("//input[@id=\"cardBox2\" or @name='cardNumber2']")).sendKeys("4963");
								   
								   driver.findElement(By.xpath("//input[@id=\"cardBox3\" or @name='cardNumber3']")).sendKeys("5398");
								   
								   driver.findElement(By.xpath("//input[@id=\"cardBox4\" or @name='cardNumber4']")).sendKeys("431");
								   
								   Thread.sleep(1000);
								   
								   Actions action55=new Actions(driver);
								   action55.moveToElement(driver.findElement(By.xpath("//input[@name=\"expirationDate\" or @data-placeholder='MM/YYYY']"))).click().build().perform();
					   		   
								   driver.findElement(By.xpath("//input[@name=\"expirationDate\" or @data-placeholder='MM/YYYY']")).sendKeys("12");
								   
								   Thread.sleep(1000);
								   
								   driver.findElement(By.xpath("//input[@name=\"expirationDate\" or @data-placeholder='MM/YYYY']")).sendKeys("2024");
								   
								
								   
								   
								   Actions action56=new Actions(driver);
								   action56.moveToElement(driver.findElement(By.xpath("//input[@name=\"cvc\" or @type='password']"))).click().build().perform();
					   		   
								   
								   driver.findElement(By.xpath("//input[@name=\"cvc\" or @type='password']")).sendKeys("643");
								   
								   
								   
								   Thread.sleep(3000);
								   
			  Actions action4=new Actions(driver);
							   action4.moveToElement( driver.findElement(By.xpath("//button/span[contains(text(),'Save')]"))).click().build().perform();
								  
							  // MyScreenRecorder.stopRecording(); //*[@id="service-request-partial"]/form/div[1]/div[2]/button/span[1]
							
							
					  	 }



	
	
	 @Test(priority=3)
		public  void viewServiceRequestDetails() throws Exception {		

//		  Thread.sleep(5000);
//		
//		  try {
//			   WebElement sidebar=	driver.findElement(By.xpath("//*[@id=\"container-1\"]/fuse-sidebar/navbar/navbar-vertical-style-1/div[2]/div[1]/fuse-navigation/div/fuse-nav-vertical-item[4]/a/span"));
//			   Actions action=new Actions(driver);
//			   action.moveToElement(sidebar).click().build().perform();
//		   
//		   }
//		   catch(Exception e ) {
//				  e.printStackTrace();
//			   }

		 
//		  Thread.sleep(5000);
		 
		 
//		  Actions action4=new Actions(driver);
//		   action4.moveToElement( driver.findElement(By.xpath("//*[@id=\"sorting-select\"]/div/span[3]/span[contains(text(),' expand_more ')]"))).click().build().perform();
//			  
//		   Thread.sleep(2000);
//		   
//			List<WebElement> lst21=  driver.findElements(By.xpath("//div[@class='sorting-wrapper m-l-10']//div[@class='sorting-container ng-star-inserted']/div"));
//			System.out.println(lst21.size());
//			  Thread.sleep(2000);
//			
//			lst21.get(5).click(); 
//		   
//		 driver.navigate().refresh();
		 
		   Thread.sleep(12000);
		   Actions action414=new Actions(driver);
		   action414.moveToElement( driver.findElement(By.xpath("//*[@id=\"service-requests\"]/div[2]/div/div[3]/manage-service-requests/app-service-request-table/div/div/mat-table/mat-row[1]/mat-cell/div/div[3]/div[3]/a/mat-icon"))).click().build().perform();
		
		   Thread.sleep(2000);
	 
			 
			 Actions action41=new Actions(driver);
			 action41.moveToElement( driver.findElement(By.xpath("//*[@id=\"forms\"]/div/div[1]/div[1]/div[5]/mat-label[2]/span[3]/mat-icon[1]"))).click().build().perform();
						 
			 
			 Thread.sleep(2000);					 
			 
			 Actions action45=new Actions(driver);
			 action45.moveToElement( driver.findElement(By.xpath("//mat-radio-group[3]"))).click().build().perform();
			 
			 
			 Thread.sleep(2000);
			 
			 Actions action46=new Actions(driver);
			 action46.moveToElement( driver.findElement(By.xpath("//button/span[contains(text(),'Change')]"))).click().build().perform();
		   
		   
			 Thread.sleep(2000);
	
		 String callername=  driver.findElement(By.xpath("//*[@id=\"forms\"]/div/div[1]/div[2]/div/div[2]/mat-label[2]/span")).getText();
		System.out.println(callername);
		 

			 String PhoneNumber=  driver.findElement(By.xpath("//*[@id=\"forms\"]/div/div[1]/div[2]/div/div[3]/mat-label[2]/span")).getText();
			 System.out.println(PhoneNumber);
	

			 String CallerEmail=  driver.findElement(By.xpath("//*[@id=\"forms\"]/div/div[1]/div[2]/div/div[4]/mat-label[2]/span")).getText();
			 System.out.println(CallerEmail);
		 

			 String Agency=  driver.findElement(By.xpath("//*[@id=\"forms\"]/div/div[1]/div[2]/div/div[4]/mat-label[2]/span")).getText();
			 System.out.println(Agency);
		   
			 
			 
			 String service=  driver.findElement(By.xpath("//*[@id=\"forms\"]/div/div[1]/div[1]/div[2]/mat-label[2]")).getText();
			 System.out.println(service);
		   
			 String ServiceRequestStatus=  driver.findElement(By.xpath("//*[@id=\"forms\"]/div/div[1]/div[1]/div[3]/mat-label[2]")).getText();
			 System.out.println(ServiceRequestStatus);
			 
			 
			 String Type=  driver.findElement(By.xpath("//*[@id=\"forms\"]/div/div[1]/div[2]/div/div[8]/mat-label[2]")).getText();
			 System.out.println(Type);
			 
			 String Year=  driver.findElement(By.xpath("//*[@id=\"forms\"]/div/div[1]/div[2]/div/div[9]/mat-label[2]/span[1]")).getText();
			 System.out.println(Year);

			 String companyname=  driver.findElement(By.xpath("//*[@id=\"forms\"]/div/div[1]/div[2]/div/div[9]/mat-label[2]/span[2]")).getText();
			 System.out.println(companyname);
			 
			 String Model=  driver.findElement(By.xpath("//*[@id=\"forms\"]/div/div[1]/div[2]/div/div[9]/mat-label[2]")).getText();
			 System.out.println(Model);
			 
			 String Color=  driver.findElement(By.xpath("//*[@id=\"forms\"]/div/div[1]/div[2]/div/div[9]/mat-label[2]/span[4]")).getText();
			 System.out.println(Color);
			 
		 
			 String VIN=  driver.findElement(By.xpath("//*[@id=\"forms\"]/div/div[1]/div[2]/div/div[11]/mat-label[2]")).getText();
			 System.out.println(VIN);
			 
			 Thread.sleep(2000);
			 
 WebElement element1 = driver.findElement(By.xpath("//*[@id=\"cdk-accordion-child-5\"]/div/div/div/div[1]/mat-label[2]/mat-label/span"));
			 
			 Actions action471=new Actions(driver);
			  action471.moveToElement(element1).click().build().perform();
			  
			 

			  
			 String Driver=  element1.getText();
			 System.out.println(Driver);
			 
			 
			 String Site=  driver.findElement(By.xpath("//*[@id=\"cdk-accordion-child-5\"]/div/div/div/div[3]/mat-label[2]/mat-label/span")).getText();
			 System.out.println(Site);
			 
		
			 
 Thread.sleep(2000);
			 
			 String Vehicle=  driver.findElement(By.xpath("//*[@id=\"cdk-accordion-child-5\"]/div/div/div/div[1]/mat-label[4]/mat-label/span")).getText();
			 System.out.println(Vehicle);
			 
			 String Destination=  driver.findElement(By.xpath("//*[@id=\"cdk-accordion-child-5\"]/div/div/div/div[3]/mat-label[4]/mat-label/span")).getText();
			 System.out.println(Destination);

			 
			 
			 Thread.sleep(2000);
			 
			 WebElement element2 = driver.findElement(By.xpath("//button/span[contains(text(),'Notes')]"));
			  ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element2);
			 
			 
			  element2.click();
			  
			  Thread.sleep(2000);
			  
			  Actions action47=new Actions(driver);
			  action47.moveToElement( driver.findElement(By.xpath("//*[@id=\"mat-input\" or @formcontrolname='note' or @data-placeholder='Add Note']"))).click().build().perform();
			  
			 
			  driver.findElement(By.xpath("//*[@id=\"mat-input\" or @formcontrolname='note' or @data-placeholder='Add Note']")).sendKeys("service started");
			  
			  driver.findElement(By.xpath("//*[@id=\"mat-input\" or @formcontrolname='to']")).sendKeys("jolly smith");
			  Thread.sleep(2000);
			  
			  driver.findElement(By.xpath("//*[@id=\"mat-input\" or @formcontrolname='to']")).sendKeys(Keys.ARROW_DOWN);
			  Thread.sleep(2000);
			  
			  driver.findElement(By.xpath("//*[@id=\"mat-input\" or @formcontrolname='to']")).sendKeys(Keys.ENTER);
			  
			  
			  Actions action48=new Actions(driver);
			  action48.moveToElement( driver.findElement(By.xpath("//button/span[contains(text(),'Add')]"))).click().build().perform();
			  
	 }	 
	
	 
	 @Test(priority=4)
		public  void ManageCharges() throws Exception {		
	 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	
	 @Test(priority=2)
		public  void editServiceRequestDetails() throws Exception {	
		 
		 
	 
		 Thread.sleep(5000);
	 
		 try {
			   WebElement backbutton=	driver.findElement(By.xpath("//*[@id=\"service-request-details\"]/div[1]/div[1]/div/mat-icon[1]"));
			   Actions action=new Actions(driver);
			   action.moveToElement(backbutton).click().build().perform();
		   
		   }
		   catch(Exception e ) {
				  e.printStackTrace();
			   }
		 
		 Thread.sleep(7000);
	 
		 Actions action4=new Actions(driver);
		   action4.moveToElement( driver.findElement(By.xpath("//*[@id=\"service-requests\"]/div[2]/div/div[3]/manage-service-requests/app-service-request-table/div/div/mat-table/mat-row[1]/mat-cell/div/div[3]/div[3]/button[3]/mat-icon"))).click().build().perform();
			
		 
		   Thread.sleep(2000);
		 
		 
			
			WebElement callerdetails=driver.findElement(By.xpath("//input[@id='mat-input' or @data-placeholder='Caller Name' or @formcontrolname='customerName']")); 
		  Actions action1=new Actions(driver);
		   action1.moveToElement(callerdetails).click().build().perform();	 
	   
			String name1="John"+r.nextInt(1000);
			
			 callerdetails.clear();
			
		   callerdetails.sendKeys(name1);
		   
		   
		   
			Faker faker = new Faker(new Locale("en-IND"));
			String num1=	faker.number().digits(10);
			
		WebElement number1=	driver.findElement(By.xpath("//input[@id='mat-input' or @data-placeholder='Callback Number']"));
		   
		 Actions action2=new Actions(driver);
		   action2.moveToElement(number1).click().build().perform();	 
			
			
		   number1.clear();
			
		   number1.sendKeys(num1)  ;
			   
		   String email1="John"+r.nextInt(1000)+"@mailinator.com";
		   
		   driver.findElement(By.xpath("//input[@id='mat-input' or @data-placeholder='Email']")).clear();
		   
		   driver.findElement(By.xpath("//input[@id='mat-input' or @data-placeholder='Email']")).sendKeys(email1);

			   
		   
//		   Thread.sleep(1000);
//		   			
//		   
//		   
//		WebElement checkbox=   driver.findElement(By.xpath("//*[@id=\"mat-checkbox-2\"]/label/span[1]"));
//		   
//		
//
//			   Actions action3=new Actions(driver);
//			   action3.moveToElement(checkbox).click().build().perform();
				  
			   Thread.sleep(1000);
		   
		  
		  driver.findElement(By.xpath("//*[@id=\"mat-select\"  or @formcontrolname='type' or @placeholder='Vehicle Type']")).click();	
		  
		//  driver.findElement(By.xpath("//*[@id=\"mat-select-1\"]/div/div[1]")).click();		   
		   
			List<WebElement> lst2=  driver.findElements(By.xpath("//mat-option"));
			System.out.println(lst2.size());
			  Thread.sleep(2000);
			
			lst2.get(3).click();  
			
			
			Thread.sleep(2000);
			
			
			  WebElement year=	driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='year' or @data-placeholder='Year']"));
			   Actions action=new Actions(driver);
			   action.moveToElement(year).click().build().perform();
		  
			   year.clear();
			 
		
			   year.sendKeys("2017"); 
			 
			 
			 driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='make' or  @data-placeholder='Make']")).clear();
			  
		  
			 driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='make' or  @data-placeholder='Make']")).sendKeys("FORD"); 
		  
			  Thread.sleep(2000);
			  
	
			  String model="Fiesta"+r.nextInt(100);
			  
				
				 driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='model' or @data-placeholder='Model']")).click();
				  
				
				 driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='model' or @data-placeholder='Model']")).clear(); 
				  
			  driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='model' or @data-placeholder='Model']")).sendKeys(model); 
			  
			  
			  Thread.sleep(2000);
			  
			  driver.findElement(By.xpath("//input[@id=\"mat-input\" or @data-placeholder='Color' or  @formcontrolname='color']")).click();
			  
			  
			  driver.findElement(By.xpath("//input[@id=\"mat-input\" or @data-placeholder='Color' or  @formcontrolname='color']")).clear();
				
			  selectOptionsFromDropdown("Red");
	
			  driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='licensePlatNumber' or @data-placeholder='License Plate Number']")).clear();
			
			  String vehiclenumber="ABC-"+r.nextInt(1000);
	 
			  driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='licensePlatNumber' or @data-placeholder='License Plate Number']")).sendKeys(vehiclenumber); 
	 
	 
			  WebElement vin=	  driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='vin' or @data-placeholder='VIN']"));
			   Actions action12=new Actions(driver);
			   action12.moveToElement(vin).click().build().perform();
			  
			   vin.clear();
				 
			   vin.sendKeys("5FNRL38457B016858"); 
	 
	 
			  
			  WebElement element2 = driver.findElement(By.xpath("//input[@formcontrolname='siteFullAddress']"));
			  ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element2);
			
			  Thread.sleep(1000);
	
			  element2.clear();
			  
			  element2.sendKeys("Toronto");			  
					  Thread.sleep(2000);
					  element2.sendKeys(Keys.ARROW_DOWN);
					  element2.sendKeys(Keys.ARROW_DOWN.ENTER);
			   
					  Thread.sleep(1000);
					  
					  WebElement element1 = driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='destinationFullAddress']"));
					  ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
					
					  Thread.sleep(1000);
					

					  element1.clear();
					  
					  element1.sendKeys("Calgary");
							  Thread.sleep(2000);
							  element1.sendKeys(Keys.ARROW_DOWN);
							  element1.sendKeys(Keys.ARROW_DOWN.ENTER);									  
							  
							  Thread.sleep(1000);
							  
							  WebElement element3 = driver.findElement(By.xpath("//*[@id=\"forms\"]/div/div[5]/div[1]/div[1]/span[2]/button"));
							  ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element3);
							  
							  Thread.sleep(2000);
							  
							  element3.click();
						   
							
							   
							  Actions action413=new Actions(driver);
							   action413.moveToElement(driver.findElement(By.xpath("//*[@id=\"mat-input\" or @formcontrolname='side' or @data-placeholder='Side']"))).click().build().perform();
								  
							   driver.findElement(By.xpath("//*[@id=\"mat-input\" or @formcontrolname='side' or @data-placeholder='Side']")).sendKeys("Tyre puncture");
							   
							   Thread.sleep(5000);
								   
			  Actions action41=new Actions(driver);
							   action41.moveToElement( driver.findElement(By.xpath("//*[@id=\"add-edit-service-request\"]/form/div[1]/div[2]/button/span[1]"))).click().build().perform();
								  

		   
	 }

}





	
