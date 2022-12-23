//import java.util.ArrayList;
//
//import java.util.List;
//import java.util.Properties;
//import java.util.Set;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WindowType;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.Select;
//import org.testng.Assert;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//
//import com.fitsyn.qa.testcases.TestBase1;
//
//public class Campaign extends TestBase1{
//
//
//	public Campaign() {
//	super();
//	}
//	
//	@BeforeTest
//	public void openBrowser() throws Exception {
//		initialization();
//	}
//	  @Test(priority=1)
//   public void assignAgent() throws Exception {
////	   Thread.sleep(5000);
////	   driver.navigate().to("https://demo.fitsyn.com/number/call");
////		JavascriptExecutor js = (JavascriptExecutor) driver;
////	   js.executeScript("window.scrollBy(0,4000)");
////	   driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/div/div/div/section/div/div/div/div/table/tbody/tr[19]/td[5]/button")).click();
////	   Thread.sleep(5000);
////	   Select slt=new Select(driver.findElement(By.xpath("//*[@id=\"assign_user_select_box\"]")));
////	   Thread.sleep(5000);
////	   slt.selectByVisibleText("Chris Brows (Manager)");
////	   driver.findElement(By.xpath("//*[@id=\"assign-user-btn\"]")).click();
////	   Thread.sleep(5000);
////	   driver.navigate().to("https://demo.fitsyn.com/agent_groups/");
////	   driver.manage().window().maximize();
////	   driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/nav/div/a/strong")).click();
////	   Thread.sleep(5000);
////	   Actions actn=new Actions(driver);
////	   actn.moveToElement(driver.findElement(By.xpath("//*[@id=\"createAgentForm\"]/div[1]/div/div[1]/div/input"))).click().build().perform();
////	   driver.findElement(By.xpath("//*[@id=\"createAgentForm\"]/div[1]/div/div[1]/div/input")).sendKeys("Chris ");	   
////	   driver.findElement(By.xpath("//*[@id=\"602b8a79d88f3e0030149ee0\"]")).click();
////	   driver.findElement(By.xpath("//*[@id=\"createGroupBtn\"]")).click();
//	   Thread.sleep(5000);
//	   driver.navigate().to("https://demo.fitsyn.com/campaigns/");
//	   driver.manage().window().maximize();
//	   driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/nav/div/a/strong")).click();
//	   Thread.sleep(5000);
//	   Actions actn1=new Actions(driver);
//	   actn1.moveToElement(driver.findElement(By.xpath("//*[@id=\"createCampaignForm\"]/div[1]/div[1]/div/div/input"))).click().build().perform();
//	   driver.findElement(By.xpath("//*[@id=\"createCampaignForm\"]/div[1]/div[1]/div/div/input")).sendKeys("Test_Campign_Test");	
//	   Thread.sleep(5000);
//	   driver.findElement(By.xpath("//*[@id=\"createCampaignForm\"]/div[1]/div[2]/div[2]/div/span/span[1]/span/ul/li/input")).click();
//	   Thread.sleep(5000);
//	   driver.findElement(By.xpath("/html/body/span/span/span/ul/li")).click();
////	   Actions actn2=new Actions(driver);////*[@id="select2-inbound_number-result-pck2-6011053aeb56d70030969cbb"]
////	   actn2.moveToElement(driver.findElement(By.xpath("//*[@id=\"select2-inbound_number-result-pck2-6011053aeb56d70030969cbb\"]"))).click().build().perform();
//	   Thread.sleep(5000);
//	   Select slt1=new Select(driver.findElement(By.xpath("//*[@id=\"createCampaignForm\"]/div[1]/div[3]/div[3]/div/select")));
//	   Thread.sleep(5000);
//	         slt1.selectByVisibleText("Chris");
//	         driver.findElement(By.xpath("//*[@id=\"text\"]")).click();
//	         driver.findElement(By.xpath("//*[@id=\"createCampaignForm\"]/div[1]/div[3]/div[7]/div/textarea")).sendKeys("available");
//	         Thread.sleep(5000);
//	         driver.findElement(By.xpath("//*[@id=\"scheduler\"]")).click();
//	         driver.findElement(By.xpath("//*[@id=\"createCampaignForm\"]/div[1]/div[3]/div[11]/div/div[1]/div/input")).click();
//	         driver.findElement(By.xpath("//*[@id=\"createCampaignForm\"]/div[1]/div[3]/div[11]/div/div[1]/div/input")).clear();
//	         driver.findElement(By.xpath("//*[@id=\"createCampaignForm\"]/div[1]/div[3]/div[11]/div/div[1]/div/input")).sendKeys("07/07/2021");
//	         Thread.sleep(5000);
//	   WebElement starttime= driver.findElement(By.xpath("//*[@id=\"createCampaignForm\"]/div[1]/div[3]/div[11]/div/div[2]/div/input"));  
//	   starttime.click();
//	   
//	   JavascriptExecutor js = (JavascriptExecutor)driver;
//	   js.executeScript("arguments[0].value = '';", starttime);
//	   starttime.sendKeys("0431AM");//5:3510:30 pm1:00 pm
//	         Thread.sleep(5000);
//	WebElement enddate=  driver.findElement(By.xpath("//*[@id=\"createCampaignForm\"]/div[1]/div[3]/div[11]/div/div[3]/div/input"));
//	enddate.click();
//	JavascriptExecutor js1 = (JavascriptExecutor)driver;
//	   js1.executeScript("arguments[0].value = '';", enddate);
//	   enddate.sendKeys("07/09/2021");
//	   
//	         Thread.sleep(5000);
//	         
//	      WebElement endtime= driver.findElement(By.xpath("//*[@id=\"createCampaignForm\"]/div[1]/div[3]/div[11]/div/div[4]/div/input"));
//	      endtime.click();
//	      
//	      JavascriptExecutor js2 = (JavascriptExecutor)driver;
//		   js2.executeScript("arguments[0].value = '';", endtime);
//		   endtime.sendKeys("0400AM");//6:00//9:30 am
//		   
//	         Thread.sleep(5000);
//	         Select slt2=new Select(driver.findElement(By.xpath("//*[@id=\"createCampaignForm\"]/div[1]/div[3]/div[11]/div/div[6]/div/select")));
//	  	   Thread.sleep(5000);
//	  	         slt2.selectByVisibleText("10");
//	  	       Thread.sleep(5000);
//	         driver.findElement(By.xpath("//*[@id=\"createCampaignBtn\"]")).click();
//	         Thread.sleep(5000);
//	   
//	   
//   }
//	/*
//	public void uploadLeads() throws Exception {
//		 Thread.sleep(5000);
//		 driver.navigate().to("https://demo.fitsyn.com/campaigns/");
//		 Thread.sleep(5000);
//		 driver.findElement(By.xpath("//*[@id=\"assign_lead\"]/div/table/tbody/tr[1]/td[8]/div/button")).click();
//		 Thread.sleep(5000);
//		 Actions actn3=new Actions(driver);
//		   actn3.moveToElement(driver.findElement(By.xpath("//*[@id=\"assign_lead\"]/div/table/tbody/tr[1]/td[8]/div/div/a[2]"))).click().build().perform();
//
//		 Thread.sleep(5000);
//		 driver.findElement(By.xpath("//*[@id=\"upload_csv_file\"]")).sendKeys("C:\\Users\\Hema Sahoo\\Desktop\\userslisttt.csv");
//		 Thread.sleep(5000);
//		 driver.findElement(By.xpath("//*[@id=\"upload_csv_lead_btn\"]")).click();
//		 Thread.sleep(5000);
//		 Actions actn4=new Actions(driver);
//		   actn4.moveToElement(driver.findElement(By.xpath("//*[@id=\"mapping_table\"]/tr[1]/td[3]/select"))).click().build().perform();
//		   
//		 Select slt3=new Select(driver.findElement(By.xpath("//*[@id=\"mapping_table\"]/tr[1]/td[3]/select")));
//	  	   Thread.sleep(5000);
//	  	         slt3.selectByVisibleText("First Name");
//	  	       Thread.sleep(5000);
//	  		 Select slt4=new Select(driver.findElement(By.xpath("//*[@id=\"mapping_table\"]/tr[2]/td[3]/select")));
//	  	  	   Thread.sleep(5000);
//	  	  	         slt4.selectByVisibleText("Last Name");
//	  	  	     Thread.sleep(5000);
//		  		 Select slt5=new Select(driver.findElement(By.xpath("//*[@id=\"mapping_table\"]/tr[3]/td[3]/select")));
//		  	  	   Thread.sleep(5000);
//		  	  	         slt5.selectByVisibleText("Mobile");
//		  	  	     driver.findElement(By.xpath("//*[@id=\"mapping_table\"]/tr[3]/td[4]/label/span")).click();
//		  	  	     Thread.sleep(5000);
//			  		 Select slt6=new Select(driver.findElement(By.xpath("//*[@id=\"mapping_table\"]/tr[4]/td[3]/select")));
//			  	  	   Thread.sleep(5000);
//			  	  	         slt6.selectByVisibleText("Email");
//			  	  	     driver.findElement(By.xpath("//*[@id=\"mapping_table\"]/tr[4]/td[5]/label/span")).click();
//			  	  	     Thread.sleep(5000);
//			  	  	 driver.findElement(By.xpath("//*[@id=\"mapping_table_footer\"]/td[1]/label/span")).click();
//			  	   Thread.sleep(5000);
//			  	 driver.findElement(By.xpath("//*[@id=\"field-mapping-submit-btn\"]")).click();
//	//		  	 Thread.sleep(5000);
//			  	 Thread.sleep(7000);
//				 
////				 driver.navigate().to("https://demo.fitsyn.com/call_scheduler");
////				 
////				 Thread.sleep(7000);
////				 driver.findElement(By.xpath("//*[@id=\"assign_lead\"]/div/table/tbody/tr[1]/td[6]/a")).click();
//				 
//	}
//	
//	public void switchtoAgentAccount() throws Exception {
//		 Thread.sleep(7000);
//		 driver.switchTo().newWindow(WindowType.TAB);
//		 
//	Set<String>	handles= driver.getWindowHandles();
//	List<String> ls=new ArrayList<String>(handles);
//	String parentwindowid=ls.get(0);
//	String childwindowid=ls.get(1);
//	System.out.println(parentwindowid);
//	System.out.println(childwindowid);
//	
//	 driver.get("https://demo.fitsyn.com/users");
//		 driver.manage().window().maximize();
//		 Thread.sleep(7000);
//		 driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[1]/form/div/div[1]/input")).sendKeys("chris");
//		 driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[1]/form/div/div[2]/button")).click();
//		 Thread.sleep(7000);
//		 driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[7]/div/a")).click();
//		 Thread.sleep(15000);
//		 driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[2]/button")).click();
//		 Thread.sleep(7000);
//		 
//	}
//		*/ 
////		 driver.switchTo().window(parentwindowid);
////		 Thread.sleep(7000);
////		 
////		 driver.get("https://demo.fitsyn.com/call_scheduler");
////		 driver.manage().window().maximize();
////		 Thread.sleep(7000);
////		 driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[6]/div/a/div/span")).click();
////		 Thread.sleep(7000);
////		 driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[6]/div/div/a[3]")).click();
////		 Thread.sleep(7000);
////		 driver.findElement(By.xpath("//*[@id=\"login_form\"]/div[1]/input")).sendKeys("admin@uat.com");
////		 Thread.sleep(3000);
////		 driver.findElement(By.xpath("//*[@id=\"validation-password\"]")).sendKeys("fitsyn@wcg");
////		 Thread.sleep(3000);
////		 driver.findElement(By.xpath("//*[@id=\"login_form\"]/div[3]/div/label/span[1]/input")).click();
////		 Thread.sleep(3000);
////		 driver.findElement(By.xpath("//*[@id=\"sign-in-request\"]")).click();
////		 Thread.sleep(7000);
////		 driver.get("https://demo.fitsyn.com/call_scheduler");
////		 Thread.sleep(7000);
////		 driver.findElement(By.xpath("//*[@id=\"assign_lead\"]/div/table/tbody/tr[1]/td[6]/a")).click();
////		 Thread.sleep(7000);
////		 driver.switchTo().window(childwindowid);
////		 Thread.sleep(500000);
////		 driver.switchTo().window(parentwindowid);
////		 driver.navigate().refresh();
//		 
//		 
//		 
//		 
//		
//	}
//	
//	
//   
//	
//
//
//	
//	
//
