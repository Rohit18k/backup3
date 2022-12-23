package com.fitsyn.qa.testcases;
//import java.util.List;
//import java.util.Properties;
//import java.util.stream.Collectors;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
//
//public class SMSTemplate {
//
//	WebDriver driver;
//	Properties pro=new  Properties();
//	
//	
//	
//	public SMSTemplate(WebDriver driver) {
//		this.driver=driver;
//	}
//	public static void main(String[] args) {
//		
//
//	}
//
//	public void createSMStemplate() throws Exception {
//		  Thread.sleep(5000);
//		driver.navigate().to("https://demo.fitsyn.com/drip_logic/sms_templates/");
//		  Thread.sleep(5000);
//		  driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/nav/div/div[2]/a/strong")).click();
//		  Thread.sleep(5000);
//		   Actions actn=new Actions(driver);
//		   actn.moveToElement(driver.findElement(By.xpath("//*[@id=\"template_name\"]"))).click().build().perform();
//		   driver.findElement(By.xpath("//*[@id=\"template_name\"]")).sendKeys("SMS");
//		   Thread.sleep(2000);
//		   driver.findElement(By.xpath("//*[@id=\"template_body\"]")).sendKeys("Hello [[first_name]] [[last_name]],you will be contacted by [[mobile]] or [[email]]");
//		   Thread.sleep(2000);
//		   driver.findElement(By.xpath("//*[@id=\"add-sms-template-btn\"]")).click();
//		   
//	}
//	public void editAndremove() throws Exception {
//		  Thread.sleep(5000);
//		  driver.navigate().to("https://demo.fitsyn.com/drip_logic/sms_templates/");
//		  Thread.sleep(5000);////*[@id="table_content"]/div/table/tbody/tr[1]/td[5]/div//button
//		 driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[5]/div//button")).click();//Action
//		 Thread.sleep(5000);
//		 driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[5]/div/div//a[1]")).click();//edit
//		 Thread.sleep(5000);
//		   Actions actn=new Actions(driver);
//		   actn.moveToElement(driver.findElement(By.xpath("//*[@id=\"template_name\"]"))).click().build().perform();
//		   driver.findElement(By.xpath("//*[@id=\"template_name\"]")).clear();
//		   driver.findElement(By.xpath("//*[@id=\"template_name\"]")).sendKeys("SMS");
//		   Thread.sleep(2000);
//		   driver.findElement(By.xpath("//*[@id=\"template_body\"]")).clear();
//		   driver.findElement(By.xpath("//*[@id=\"template_body\"]")).sendKeys("Hello [[first_name]] [[last_name]],you will be contacted by [[mobile]] or [[email]]");
//		   Thread.sleep(2000);
//		 driver.findElement(By.xpath("//*[@id=\"add-sms-template-btn\"]")).click();
//		 driver.manage().window().maximize();
//		 Thread.sleep(7000);
//		 driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[4]/button")).click();//InActive
//		 Thread.sleep(7000);
//		 driver.findElement(By.xpath("/html/body/div[10]/div[7]/div//button[contains(text(),'Yes, inactive it')]")).click();
//		   Thread.sleep(7000);
//		 driver.findElement(By.xpath("/html/body/div[10]/div[7]/div//button[contains(text(),'OK')]")).click();
//		 Thread.sleep(9000);
//		 driver.navigate().refresh();
//		 Thread.sleep(5000);
//		 Actions actn2=new Actions(driver);
//		 actn2.moveToElement(driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[4]//button[contains(text(),'Inactive')]"))).click().build().perform();
//		 Thread.sleep(7000);
//		 driver.findElement(By.xpath("/html/body/div[10]/div[7]/div//button[contains(text(),'Yes, active it')]")).click();
//		   Thread.sleep(7000);
//		 driver.findElement(By.xpath("/html/body/div[10]/div[7]//button[contains(text(),'OK')]")).click();		 
//		  Thread.sleep(7000);
//	 
//	}
//	public void remove() throws Exception {
//		 Thread.sleep(5000);
//		  driver.navigate().to("https://demo.fitsyn.com/drip_logic/sms_templates/");
//		  Thread.sleep(5000);////*[@id="table_content"]/div/table/tbody/tr[1]/td[5]/div//button
//		 driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[5]/div//button")).click();//Action
//		 Thread.sleep(5000);
//		 driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[5]/div/div//a[2]")).click();//edit
//		 Thread.sleep(5000);
//		  Thread.sleep(5000);
//			driver.findElement(By.xpath("/html/body/div[10]/div[7]/div//button")).click();
//			 Thread.sleep(5000);
//			 driver.findElement(By.xpath("/html/body/div[10]/div[7]/div//button[contains(text(),'OK')]")).click();
//			 Thread.sleep(5000);
//}
//	public void sortingdata() throws Exception {
//		
//		Thread.sleep(5000);
//		  driver.navigate().to("https://demo.fitsyn.com/drip_logic/sms_templates/");
//		  driver.manage().window().maximize();
//		  Thread.sleep(5000);
//		driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/thead/tr/th[2]/a")).click();//name
//		List<WebElement> elemntlist1=driver.findElements(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr/td[2]"));
//		List<String>orignallist1=elemntlist1.stream().map(s->s.getText()).collect(Collectors.toList());
//		System.out.println(orignallist1);
//		
//		List<String>sortedlist1=orignallist1.stream().sorted().collect(Collectors.toList());
//		System.out.println(sortedlist1);
//		Thread.sleep(5000);
//		
//		Thread.sleep(5000);
//		List<WebElement> elemntlist2=driver.findElements(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr/td[1]"));//date
//		List<String>orignallist2=elemntlist2.stream().map(s->s.getText()).collect(Collectors.toList());
//		System.out.println(orignallist2);
//		
//		List<String>sortedlist2=orignallist2.stream().sorted().collect(Collectors.toList());
//		System.out.println(sortedlist2);
//		Thread.sleep(5000);
//		
//		Thread.sleep(5000);
//		List<WebElement> elemntlist5=driver.findElements(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr/td[3]"));//Attributes
//		List<String>orignallist5=elemntlist5.stream().map(s->s.getText()).collect(Collectors.toList());
//		System.out.println(orignallist5);
//		
//		List<String>sortedlist5=orignallist5.stream().sorted().collect(Collectors.toList());
//		System.out.println(sortedlist5);
//		Thread.sleep(5000);
//		
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/thead/tr/th[4]/a")).click();//status
//		List<WebElement> elemntlist6=driver.findElements(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr/td[4]"));
//		List<String>orignallist6=elemntlist6.stream().map(s->s.getText()).collect(Collectors.toList());
//		System.out.println(orignallist6);
//		
//		List<String>sortedlist6=orignallist6.stream().sorted().collect(Collectors.toList());
//		System.out.println(sortedlist6);
//		Thread.sleep(5000);
//		
//	}
//	
//	public void search() throws Exception {
//		 Thread.sleep(5000);
//		  driver.navigate().to("https://demo.fitsyn.com/drip_logic/sms_templates/");
//		  driver.manage().window().maximize();
//		  Thread.sleep(5000);////*[@id="table_content"]/div/table/tbody/tr[1]/td[5]/div//button
//		 driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[1]/form/div/div[1]//input")).sendKeys("SMS");//Action
//		 Thread.sleep(5000);
//		 driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[1]/form/div/div[2]//button")).click();//Action
//		 Thread.sleep(5000);
//		 driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[1]/form/div/div[3]//a")).click();//Action
//		 Thread.sleep(5000);
//	}
//	
//	
//	
//	
//	
//	
//	
//}
