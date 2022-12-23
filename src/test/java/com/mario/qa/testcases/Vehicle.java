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

public class Vehicle extends TestBase1{

	Random r=new Random();
	
	public Vehicle() {
	super();
	}
	
	@BeforeTest
	public void openBrowser() throws Exception {
		initialization();
	}


	 @Test(priority=1)
		public  void addVehicle() throws Exception {
			
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

			   Thread.sleep(2000);
				WebElement vehicles=	driver.findElement(By.xpath("//*[@id=\"container-1\"]/fuse-sidebar/navbar/navbar-vertical-style-1/div[2]/div[1]/fuse-navigation/div/fuse-nav-vertical-collapsable[2]/div/fuse-nav-vertical-item[8]/a/span"));
			   ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", vehicles);
			   Thread.sleep(2000);
			   Actions action1=new Actions(driver);
			   action1.moveToElement(vehicles).click().build().perform();
			   Thread.sleep(2000);   
			   driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			   
			   
			   
			   JavascriptExecutor js = (JavascriptExecutor) driver;
			   js.executeScript("window.scrollBy(0,350)", "");
			   
			   
			   try {
			   
				  Thread.sleep(9000);   
			
				  WebElement addicon=driver.findElement(By.xpath("//button[@id=\"add-vehicle-button\" or @aria-label='add vehicle']/span/mat-icon[contains(text(),'add')]"));
				  
			   Actions action2=new Actions(driver);
			   action2.moveToElement(addicon).click().build().perform();}
			   catch(Exception e) {
				   e.printStackTrace();
			   }
	
			   Thread.sleep(5000);   
			   
			   
			   Actions action7112=new Actions(driver);
			   action7112.moveToElement(driver.findElement(By.xpath("//*[@id=\"vehicle-template\"]/form/div[1]/div[2]/button/span[1]"))).click().build().perform();
			   
  
			   Thread.sleep(1000);   
			   
				WebElement territory= driver.findElement(By.xpath("//input[@id=\"mat-input-75\" or @formcontrolname='territory' or @placeholder='Territory']"));
					   
					   
					   
					   Actions action6=new Actions(driver);
					   action6.moveToElement(territory).click().build().perform();
					   
					   
					   territory.sendKeys("N");
						  Thread.sleep(2000);
						  
						  List<WebElement> lstt1= driver.findElements(By.xpath("//mat-option"));
						  lstt1.get(lstt1.size()-1).click(); 
						  
				   
//					   territory.sendKeys("Nunavut");
//					//   territory.sendKeys("Sola");
//					   Thread.sleep(1000);
//					   
//					   territory.sendKeys(Keys.ARROW_DOWN);
//					   territory.sendKeys(Keys.ENTER);
//					   
					   
					   String text1=driver.findElement(By.xpath("//mat-error[contains(text(),'Vehicle Number is required!')]")).getText();
						System.out.println(text1);
						String exp1="Vehicle Number is required!";
						Assert.assertEquals(text1,exp1);
				   
					   Thread.sleep(1000);   
	
						String vehiclenumber="ABC-"+r.nextInt(1000);
	
					   driver.findElement(By.xpath("//input[@id=\"mat-input-94\" or @formcontrolname='vehicleNumber' or @placeholder='Vehicle Number']")).sendKeys(vehiclenumber);
					
				//	   driver.findElement(By.xpath("//*[@id=\"mat-error-7\"]"))
					   String text2=driver.findElement(By.xpath("//mat-error[contains(text(),'Vehicle Type is required!')]")).getText();
						System.out.println(text2);
						String exp2="Vehicle Type is required!";
						Assert.assertEquals(text2,exp2);
					   
   
					   driver.findElement(By.xpath("//mat-select[@id=\"mat-input\" or @formcontrolname='vehicleType' or @placeholder='Vehicle Type']")).click();
					   
					   
					   
					   Thread.sleep(1000);   
					   selectOptionsFromDropdown("Car Carrier");
			   
					//   driver.findElement(By.xpath("//*[@id=\"mat-error-8\"]"))
					   String text3=driver.findElement(By.xpath("//mat-error[contains(text(),'License plate number is required!')]")).getText();
						System.out.println(text3);
						String exp3="License plate number is required!";
						Assert.assertEquals(text3,exp3);
					   
						driver.findElement(By.xpath("//input[@id=\"mat-input-95\" or @formcontrolname='number' or @placeholder='License Plate Number']")).sendKeys("^&*(((");
	//					driver.findElement(By.xpath("//*[@id=\"mat-error-10\"]"))				   	
						
						String text4=driver.findElement(By.xpath("//mat-error[contains(text(),'Enter valid plate number!')]")).getText();
						System.out.println(text4);
						String exp4="Enter valid plate number!";
						Assert.assertEquals(text4,exp4);
						
						driver.findElement(By.xpath("//input[@id=\"mat-input-95\" or @formcontrolname='number' or @placeholder='License Plate Number']")).clear();
					   
					   driver.findElement(By.xpath("//input[@id=\"mat-input-95\" or @formcontrolname='number' or @placeholder='License Plate Number']")).sendKeys(vehiclenumber);
					   			   
			   
					   driver.findElement(By.xpath("//input[@id=\"mat-input-96\" or @formcontrolname='vin' or @placeholder='Vin']")).sendKeys("5FNRL38457B016858");
					
					   
					   
					   driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='nvw' or @placeholder='NVW']")).sendKeys("ASWE!!!!");
					   
					  // driver.findElement(By.xpath("//*[@id=\"mat-error-11\"]"))
					   
					   
						 String text40=driver.findElement(By.xpath("//mat-error[contains(text(),'Only number are allowed!')]")).getText();
						System.out.println(text40);
						String exp40="Only number are allowed!";
						Assert.assertEquals(text40,exp40);
		
						  driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='nvw' or @placeholder='NVW']")).clear();
						   
						  Faker faker = new Faker();
							String num=	faker.number().digits(4);
					   
					   driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='nvw' or @placeholder='NVW']")).sendKeys(num);
					  
					   
					   driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='gvw' or @placeholder='GVW']")).sendKeys("KKJU!!@@");
					     
					 //  driver.findElement(By.xpath("//*[@id=\"mat-error-12\"]"))
			   String text5=driver.findElement(By.xpath("//mat-error[contains(text(),'Only number are allowed!')]")).getText();
						System.out.println(text5);
						String exp5="Only number are allowed!";
						Assert.assertEquals(text5,exp5);
					 
						String num4=	faker.number().digits(4);
					   
						 driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='gvw' or @placeholder='GVW']")).clear();
						   
						
					   
					   driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='gvw' or @placeholder='GVW']")).sendKeys(num4);
					   
					   Thread.sleep(1000); 
					   
					   driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='rateClass' or @placeholder='Rate Class']")).sendKeys("UIHj!!@");
					   
					//   driver.findElement(By.xpath("//*[@id=\"mat-error-13\"]"))
					   String text6=driver.findElement(By.xpath("//mat-error[contains(text(),'Only number are allowed!')]")).getText();
						System.out.println(text6);
						String exp6="Only number are allowed!";
						Assert.assertEquals(text6,exp6);
					   
						 driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='rateClass' or @placeholder='Rate Class']")).clear();
			   
						 String num1=	faker.number().digits(1);
						 
					   driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='rateClass' or @placeholder='Rate Class']")).sendKeys(num1);
					   
		
					   driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='tpll' or @placeholder='TPLL']")).sendKeys("Ertyyy!!!");
//					   driver.findElement(By.xpath("//*[@id=\"mat-error-14\"]"))
					   
					   String text7=driver.findElement(By.xpath("//mat-error[contains(text(),'Only number are allowed!')]")).getText();
						System.out.println(text7);
						String exp7="Only number are allowed!";
						Assert.assertEquals(text7,exp7);
					 

						   driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='tpll' or @placeholder='TPLL']")).clear();
						  
						   String num2=	faker.number().digits(2);
						   
						   
						   driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='tpll' or @placeholder='TPLL']")).sendKeys(num2);
						   
						   
						   
			WebElement towcapacity=   driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='towCarryCapacity' or @placeholder='Tow Carrying Capacity']"));
						   
						   JavascriptExecutor executor = (JavascriptExecutor) driver;
						    executor.executeScript("arguments[0].click();", towcapacity);
						   
						   
//				   
//					   Actions action8=new Actions(driver);
//					   action8.moveToElement(driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='towCarryCapacity' or @placeholder='Tow Carrying Capacity']"))).click().build().perform();
//					   
					   
					   driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='towCarryCapacity' or @placeholder='Tow Carrying Capacity']")).sendKeys("QW!!!");
					   Thread.sleep(1000); 
				//	   driver.findElement(By.xpath("//*[@id=\"mat-error-15\"]"))
					   try {
					   String text8=driver.findElement(By.xpath("//mat-error[contains(text(),'Only number are allowed!')]")).getText();
						System.out.println(text8);
						String exp8="Only number are allowed!";
						Assert.assertEquals(text8,exp8);}
					   catch(Exception e) {
						   e.printStackTrace();
					   }
					   
						 Thread.sleep(1000); 
						driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='towCarryCapacity' or @placeholder='Tow Carrying Capacity']")).clear();
						   
						driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='towCarryCapacity' or @placeholder='Tow Carrying Capacity']")).sendKeys("5000");
		
					   Thread.sleep(1000); 
					//   driver.findElement(By.xpath("//*[@id=\"mat-error-2\"]"))   
					   try {
					   String text9=driver.findElement(By.xpath("//mat-error[contains(text(),'Vehicle Make is required!')]")).getText();
						System.out.println(text9);
						String exp9="Vehicle Make is required!";
						Assert.assertEquals(text9,exp9);}
					   catch(Exception e) {
						   e.printStackTrace();
					   }
			   
					   WebElement vehiclemake= driver.findElement(By.xpath("//*[@id=\"mat-select-23\" or @formcontrolname='manufacturerCompany' or @placeholder='Vehicle Make']"));					   
					   
					   Actions action9=new Actions(driver);
					   action9.moveToElement(vehiclemake).click().build().perform();
					   
					   Thread.sleep(1000);
					   vehiclemake.sendKeys("CHEVROLET");
					   
					   //vehiclemake.sendKeys(Keys.ARROW_DOWN);
					   vehiclemake.sendKeys(Keys.ENTER);
					   
					   Thread.sleep(1000);
					   
					   
					   driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='manufacturerModel' or @placeholder='Model']")).sendKeys("!!!!@@#@");
					  
					   //driver.findElement(By.xpath("//*[@id=\"mat-error-16\"]"))
					   
					   String text10=driver.findElement(By.xpath("//mat-error[contains(text(),'Enter valid manufacturer model!')]")).getText();
						System.out.println(text10);
						String exp10="Enter valid manufacturer model!";
						Assert.assertEquals(text10,exp10);
				   
					   
						driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='manufacturerModel' or @placeholder='Model']")).clear();
						  
						String model="Bolt"+r.nextInt(100);
						
						driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='manufacturerModel' or @placeholder='Model']")).sendKeys(model);
					
						
				//		driver.findElement(By.xpath("//*[@id=\"mat-error-9\"]"))		
						 String text111=driver.findElement(By.xpath("//mat-error[contains(text(),'Year is required!')]")).getText();
							System.out.println(text111);
							String exp111="Year is required!";
							Assert.assertEquals(text111,exp111);
					  
						Actions action101=new Actions(driver);
						   action101.moveToElement(driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='year' or @placeholder='Year']"))).click().build().perform();
						
						
						
						
	   driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='year' or @placeholder='Year']")).sendKeys("AQW!!!");
	   
	//   driver.findElement(By.xpath("//*[@id=\"mat-error-17\"]"))
	   
	   String text11=driver.findElement(By.xpath("//mat-error[contains(text(),'Only number are allowed!')]")).getText();
		System.out.println(text11);
		String exp11="Only number are allowed!";
		Assert.assertEquals(text11,exp11);
  
	   
	   
		 driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='year' or @placeholder='Year']")).clear();
		 
		 
		 

		   
		 driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='year' or @placeholder='Year']")).sendKeys("2017");
		   
	   
					   
					   Thread.sleep(1000);
					   
WebElement purchasedate= driver.findElement(By.xpath("//*[@id=\"mat-input-104\" or @formcontrolname='purchaseDate' or @placeholder='Purchase Date']"));					   
					   
					   Actions action10=new Actions(driver);
					   action10.moveToElement(purchasedate).click().build().perform();
					   Thread.sleep(2000);
					   
					   while(true){	  
							  String mon=driver.findElement(By.xpath("//mat-calendar-header/div/div/button[1]/span")).getText();

						if(mon.equalsIgnoreCase("OCT 2020")){
							break;}
						else {
							driver.findElement(By.xpath("//mat-calendar-header/div/div/button[2]")).click();
							 Thread.sleep(2000);
						}
					   
	 }
	    driver.findElement(By.xpath("//mat-month-view/table/tbody/tr[2]/td[7]")).click();
			
	    Thread.sleep(1000);
	
	    driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='purchaseAmount' or @placeholder='Purchase Amount']")).sendKeys("5.34");
	    
	    Thread.sleep(1000);
	    
	    
	    WebElement registrationdate= driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='registrationDate' or @placeholder='Registration Date']"));					   
		   
		   Actions action1011=new Actions(driver);
		   action1011.moveToElement(registrationdate).click().build().perform();
		   Thread.sleep(2000);
		   
		   while(true){	  
				  String mon=driver.findElement(By.xpath("//mat-calendar-header/div/div/button[1]/span")).getText();

			if(mon.equalsIgnoreCase("OCT 2020")){
				break;}
			else {
				driver.findElement(By.xpath("//mat-calendar-header/div/div/button[2]")).click();
				 Thread.sleep(2000);
			}
		   
}  
	    
		   driver.findElement(By.xpath("//mat-month-view/table/tbody/tr[2]/td[7]")).click();
	    
	    
	    
		   Thread.sleep(1000);
			
		    driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='registrationNumber' or @placeholder='Registration Number']")).sendKeys("CAGA723");
		    
		    Thread.sleep(5000);
		    
		    Actions action7111=new Actions(driver);
			   action7111.moveToElement(driver.findElement(By.xpath("//*[@id=\"vehicle-template\"]/form/div[1]/div[2]/button/span[1]"))).click().build().perform();

}
	 

	
@Test(priority=3) 	
public void editVehicle() throws Exception {
//	Thread.sleep(3000);		
//	WebElement sidebar=	driver.findElement(By.xpath("//*[@id=\"container-1\"]/fuse-sidebar/navbar/navbar-vertical-style-1/div[2]/div[1]/fuse-navigation/div/fuse-nav-vertical-collapsable[2]/a/span"));
//		   Actions action=new Actions(driver);
//		   action.moveToElement(sidebar).click().build().perform();
//		   Thread.sleep(2000);
//			WebElement vehicles=	driver.findElement(By.xpath("//*[@id=\"container-1\"]/fuse-sidebar/navbar/navbar-vertical-style-1/div[2]/div[1]/fuse-navigation/div/fuse-nav-vertical-collapsable[2]/div/fuse-nav-vertical-item[8]/a/span"));
//		   ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", vehicles);
//		   Thread.sleep(2000);
//		   Actions action1=new Actions(driver);
//		   action1.moveToElement(vehicles).click().build().perform();
//			   driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			   
			   Thread.sleep(5000);  

	  Actions action2=new Actions(driver);

	  action2.moveToElement(driver.findElement(By.xpath("//*[@id=\"vehicles\"]/div[2]/div/div[3]/manage-vehicles/div[2]/div/div[2]/div[7]/div[2]/a[2]"))).click().build().perform();
	 
	  
	  
	  Thread.sleep(1000);   
	   
		WebElement territory= driver.findElement(By.xpath("//input[@id=\"mat-input-75\" or @formcontrolname='territory' or @placeholder='Territory']"));
			   
			   
			   
			   Actions action6=new Actions(driver);
			   action6.moveToElement(territory).click().build().perform();
			   
			   
			   territory.clear();
			   
			   territory.sendKeys("N");
				  Thread.sleep(2000);
				  
				  List<WebElement> lstt1= driver.findElements(By.xpath("//mat-option"));
				  lstt1.get(lstt1.size()-1).click(); 
				  
		   
			   
//			   territory.sendKeys("Nunavut");
//			 //  territory.sendKeys("Boston Bar");
//			   Thread.sleep(1000);
//			   
//			   territory.sendKeys(Keys.ARROW_DOWN);
//			   territory.sendKeys(Keys.ENTER);
//			   

			   Thread.sleep(1000);   
	  
			   driver.findElement(By.xpath("//input[@id=\"mat-input-94\" or @formcontrolname='vehicleNumber' or @placeholder='Vehicle Number']")).clear();
			   
			   
			   String vehiclenumber="ASD-"+r.nextInt(1000);
			   
				
			   driver.findElement(By.xpath("//input[@id=\"mat-input-94\" or @formcontrolname='vehicleNumber' or @placeholder='Vehicle Number']")).sendKeys(vehiclenumber);
			   
			   
			   driver.findElement(By.xpath("//mat-select[@id=\"mat-input\" or @formcontrolname='vehicleType' or @placeholder='Vehicle Type']")).click();
			   
			   
			   
			   Thread.sleep(1000);   
			   selectOptionsFromDropdown("Service Van");
	   
	  
			   driver.findElement(By.xpath("//input[@id=\"mat-input-95\" or @formcontrolname='number' or @placeholder='License Plate Number']")).clear();
   			   
		   
			   driver.findElement(By.xpath("//input[@id=\"mat-input-95\" or @formcontrolname='number' or @placeholder='License Plate Number']")).sendKeys(vehiclenumber);
   			   
			   driver.findElement(By.xpath("//input[@id=\"mat-input-96\" or @formcontrolname='vin' or @placeholder='Vin']")).clear();
			   	   
			   driver.findElement(By.xpath("//input[@id=\"mat-input-96\" or @formcontrolname='vin' or @placeholder='Vin']")).sendKeys("5FNRL38457B016858");
			   
			   
			  driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='nvw' or @placeholder='NVW']")).clear();
			   
			  
			  Faker faker = new Faker();
			   String num2=	faker.number().digits(4);
			   
			   driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='nvw' or @placeholder='NVW']")).sendKeys(num2);
			   
			   
			   driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='gvw' or @placeholder='GVW']")).clear();
			   
			   String num21=	faker.number().digits(4);
			   
			   
			   driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='gvw' or @placeholder='GVW']")).sendKeys(num21);
			   
			   Thread.sleep(1000); 
			   
			   driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='rateClass' or @placeholder='Rate Class']")).clear();
			   
			   String num3=	faker.number().digits(1);
			   
			   driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='rateClass' or @placeholder='Rate Class']")).sendKeys(num3);
			   

			   
			   driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='tpll' or @placeholder='TPLL']")).clear();
			   
			   String num4=	faker.number().digits(2);
			   
			   driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='tpll' or @placeholder='TPLL']")).sendKeys(num4);
			   
			   
			   Actions action8=new Actions(driver);
			   action8.moveToElement(driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='towCarryCapacity' or @placeholder='Tow Carrying Capacity']"))).click().build().perform();
			   
			   driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='towCarryCapacity' or @placeholder='Tow Carrying Capacity']")).clear();
			   
			   driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='towCarryCapacity' or @placeholder='Tow Carrying Capacity']")).sendKeys("6000");
			   
			   
			   Thread.sleep(1000); 
			   
			   WebElement vehiclemake= driver.findElement(By.xpath("//*[@id=\"mat-select-23\" or @formcontrolname='manufacturerCompany' or @placeholder='Vehicle Make']"));					   
			   
			   Actions action9=new Actions(driver);
			   action9.moveToElement(vehiclemake).click().build().perform();
			   
			   Thread.sleep(1000);
			//   vehiclemake.clear();
			   
			   vehiclemake.sendKeys("FORD");
			   
			   //vehiclemake.sendKeys(Keys.ARROW_DOWN);
			   vehiclemake.sendKeys(Keys.ENTER);
			   
			   Thread.sleep(1000);
			   
			   driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='manufacturerModel' or @placeholder='Model']")).clear();
			   
			   
				String model="Fiesta"+r.nextInt(100);
			   
			   driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='manufacturerModel' or @placeholder='Model']")).sendKeys(model);
			   
			   driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='year' or @placeholder='Year']")).sendKeys("2017");
			   
			   Thread.sleep(1000);
			   
WebElement purchasedate= driver.findElement(By.xpath("//*[@id=\"mat-input-104\" or @formcontrolname='purchaseDate' or @placeholder='Purchase Date']"));					   
			   
			   Actions action10=new Actions(driver);
			   action10.moveToElement(purchasedate).click().build().perform();
			   Thread.sleep(2000);
			   
			   while(true){	  
					  String mon=driver.findElement(By.xpath("//mat-calendar-header/div/div/button[1]/span")).getText();

				if(mon.equalsIgnoreCase("JUN 2021")){
					break;}
				else {
					driver.findElement(By.xpath("//mat-calendar-header/div/div/button[3] ")).click();
					 Thread.sleep(2000);
				}
			   
}
driver.findElement(By.xpath("//mat-month-view/table/tbody/tr[3]/td[6]")).click();
	
Thread.sleep(1000);

driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='purchaseAmount' or @placeholder='Purchase Amount']")).clear();


driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='purchaseAmount' or @placeholder='Purchase Amount']")).sendKeys("5.34");

Thread.sleep(1000);


WebElement registrationdate= driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='registrationDate' or @placeholder='Registration Date']"));					   
   
   Actions action101=new Actions(driver);
   action101.moveToElement(registrationdate).click().build().perform();
   Thread.sleep(2000);
   
   while(true){	  
		  String mon=driver.findElement(By.xpath("//mat-calendar-header/div/div/button[1]/span")).getText();

	if(mon.equalsIgnoreCase("JUN 2021")){
		break;}
	else {
		driver.findElement(By.xpath("//mat-calendar-header/div/div/button[3]")).click();
		 Thread.sleep(2000);
	}
   
}  

   driver.findElement(By.xpath("//mat-month-view/table/tbody/tr[3]/td[6]")).click();



   Thread.sleep(1000);
   
   driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='registrationNumber' or @placeholder='Registration Number']")).clear();
   
	
    driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='registrationNumber' or @placeholder='Registration Number']")).sendKeys("CAGA723");
    
    
    
    Thread.sleep(5000);

    Actions action7111=new Actions(driver);
	   action7111.moveToElement(driver.findElement(By.xpath("//*[@id=\"vehicle-template\"]/form/div[1]/div[2]/button/span[1]"))).click().build().perform();
	  
}


/*

@Test(priority=4) 	
public void DeleteVehicle() throws Exception {

	Thread.sleep(3000);		
//	WebElement sidebar=	driver.findElement(By.xpath("//*[@id=\"container-1\"]/fuse-sidebar/navbar/navbar-vertical-style-1/div[2]/div[1]/fuse-navigation/div/fuse-nav-vertical-collapsable[3]/a/span"));
//		   Actions action=new Actions(driver);
//		   action.moveToElement(sidebar).click().build().perform();
//		   Thread.sleep(2000);
//			WebElement vehicles=	driver.findElement(By.xpath("//*[@id=\"container-1\"]/fuse-sidebar/navbar/navbar-vertical-style-1/div[2]/div[1]/fuse-navigation/div/fuse-nav-vertical-collapsable[3]/div/fuse-nav-vertical-item[8]/a/span"));
//		   ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", vehicles);
//		   Thread.sleep(2000);
//		   Actions action1=new Actions(driver);
//		   action1.moveToElement(vehicles).click().build().perform();
//			   driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
//
//			   Thread.sleep(5000);
				
			   Actions action5=new Actions(driver);
			  
				WebElement sort=	driver.findElement(By.xpath("//*[@id=\"vehicles\"]/div[2]/div/div[3]/manage-vehicles/div[2]/div/div[2]/div[7]/div[2]/button[2]"));
				action5.moveToElement(sort).click().build().perform();
				
				  Thread.sleep(2000);
				  
				  Actions action6=new Actions(driver);
				  
					WebElement sort1=	driver.findElement(By.xpath("//*[@id=\"mat-dialog-0\"]/fuse-confirm-dialog/mat-dialog-actions/button"));
					action6.moveToElement(sort1).click().build().perform();
					  
		
}

*/

@Test(priority=2) 	
public void sortVehicle() throws Exception {

//	Thread.sleep(3000);		
//	WebElement sidebar=	driver.findElement(By.xpath("//*[@id=\"container-1\"]/fuse-sidebar/navbar/navbar-vertical-style-1/div[2]/div[1]/fuse-navigation/div/fuse-nav-vertical-collapsable[2]/a/span"));
//		   Actions action=new Actions(driver);
//		   action.moveToElement(sidebar).click().build().perform();
//		   Thread.sleep(2000);
//			WebElement vehicles=	driver.findElement(By.xpath("//*[@id=\"container-1\"]/fuse-sidebar/navbar/navbar-vertical-style-1/div[2]/div[1]/fuse-navigation/div/fuse-nav-vertical-collapsable[2]/div/fuse-nav-vertical-item[8]/a/span"));
//		   ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", vehicles);
//		   Thread.sleep(2000);
//		   Actions action1=new Actions(driver);
//		   action1.moveToElement(vehicles).click().build().perform();
//			   driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
//			   
			   Thread.sleep(9000);
			
			   
			   
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
	
//   driver.navigate().refresh();
}



}