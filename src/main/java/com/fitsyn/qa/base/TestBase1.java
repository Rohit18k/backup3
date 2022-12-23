package com.fitsyn.qa.base;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.paulhammant.ngwebdriver.ByAngular;
import com.paulhammant.ngwebdriver.NgWebDriver;


public class TestBase1 {
	
	public static  WebDriver driver;
 public static Properties pro;
 public static NgWebDriver ngDriver;
	
public  static void initialization() throws Exception {
 	File src=new File("./Configuration/config.properties");
 	FileInputStream fis=new FileInputStream(src);
 	Properties pro=new  Properties();
 	pro=new Properties();
 	pro.load(fis);
	ChromeOptions options = new ChromeOptions(); 
//	options.addArguments("use-fake-device-for-media-stream");
//	options.addArguments("use-fake-ui-for-media-stream"); 
 	
	options.addArguments("--incognito");
 	
 	
 
 	
 	
 	
 	
 	
 	
 	System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
	driver=new ChromeDriver();
	JavascriptExecutor jsDriver = (JavascriptExecutor) driver;
	 ngDriver = new NgWebDriver(jsDriver); 
	  driver.get("http://mario-demo.demoserver.biz/");
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	  Actions action=new Actions(driver);
	   action.moveToElement(driver.findElement(By.xpath("//input[@id=\"mat-input-0\" or @formcontrolname='username' or @data-placeholder='Email, Phone Number']"))).click().build().perform();
	   
	   driver.findElement(By.xpath("//input[@id=\"mat-input-0\" or @formcontrolname='username' or @data-placeholder='Email, Phone Number']")).sendKeys("kevin@mario.com");
	driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='password' or @data-placeholder='Password']")).sendKeys("123456789");
	driver.findElement(By.xpath("//button/span[@class='mat-button-wrapper']")).click();
	Thread.sleep(2000);
	}



public  static void initializationUsers() throws Exception {
 	File src=new File("./Configuration/config.properties");
 	FileInputStream fis=new FileInputStream(src);
 	Properties pro=new  Properties();
 	pro=new Properties();
 	pro.load(fis);
 	System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
	driver=new ChromeDriver();
	JavascriptExecutor jsDriver = (JavascriptExecutor) driver;
	 ngDriver = new NgWebDriver(jsDriver); 
//	  driver.get("http://juliemr.github.io/protractor-demo/");
//	  driver.manage().window().maximize();
//	  Thread.sleep(2000);
//	  driver.findElement(ByAngular.model("first")).sendKeys("9");
//
//	  
//	Select slt=new Select(driver.findElement(ByAngular.model("operator")));
//	slt.selectByIndex(2);
//	  Thread.sleep(2000);
//	  driver.findElement(ByAngular.model("second")).sendKeys("5");
//	  driver.findElement(ByAngular.buttonText("Go!")).click();
	//  Thread.sleep(2000);
	 
	  driver.get("http://mario-demo.demoserver.biz/");
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	  Actions action=new Actions(driver);
	   action.moveToElement(driver.findElement(By.xpath("//input[@id=\"mat-input-0\" or @formcontrolname='username' or @data-placeholder='Email, Phone Number']"))).click().build().perform();
	   
	   driver.findElement(By.xpath("//input[@id=\"mat-input-0\" or @formcontrolname='username' or @data-placeholder='Email, Phone Number']")).sendKeys("waden83@mailinator.com");
	driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='password' or @data-placeholder='Password']")).sendKeys("789456123");
	driver.findElement(By.xpath("//button/span[@class='mat-button-wrapper']")).click();
	Thread.sleep(2000);

	}


public  static void initializationDrivers() throws Exception {
 	File src=new File("./Configuration/config.properties");
 	FileInputStream fis=new FileInputStream(src);
 	Properties pro=new  Properties();
 	pro=new Properties();
 	pro.load(fis);
 	System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
	driver=new ChromeDriver();
	JavascriptExecutor jsDriver = (JavascriptExecutor) driver;
	 ngDriver = new NgWebDriver(jsDriver); 
//	  driver.get("http://juliemr.github.io/protractor-demo/");
//	  driver.manage().window().maximize();
//	  Thread.sleep(2000);
//	  driver.findElement(ByAngular.model("first")).sendKeys("9");
//
//	  
//	Select slt=new Select(driver.findElement(ByAngular.model("operator")));
//	slt.selectByIndex(2);
//	  Thread.sleep(2000);
//	  driver.findElement(ByAngular.model("second")).sendKeys("5");
//	  driver.findElement(ByAngular.buttonText("Go!")).click();
	//  Thread.sleep(2000);
	 
	  driver.get("http://mario-demo.demoserver.biz/");
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	  Actions action=new Actions(driver);
	   action.moveToElement(driver.findElement(By.xpath("//input[@id=\"mat-input-0\" or @formcontrolname='username' or @data-placeholder='Email, Phone Number']"))).click().build().perform();
	   
	   driver.findElement(By.xpath("//input[@id=\"mat-input-0\" or @formcontrolname='username' or @data-placeholder='Email, Phone Number']")).sendKeys("louis761@mailinator.com");
	driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='password' or @data-placeholder='Password']")).sendKeys("789456123");
	driver.findElement(By.xpath("//button/span[@class='mat-button-wrapper']")).click();
	Thread.sleep(2000);

	}






public  static void initializationCustomer() throws Exception {
 	File src=new File("./Configuration/config.properties");
 	FileInputStream fis=new FileInputStream(src);
 	Properties pro=new  Properties();
 	pro=new Properties();
 	pro.load(fis);
 	System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
	driver=new ChromeDriver();
	JavascriptExecutor jsDriver = (JavascriptExecutor) driver;
	 ngDriver = new NgWebDriver(jsDriver); 
//	  driver.get("http://juliemr.github.io/protractor-demo/");
//	  driver.manage().window().maximize();
//	  Thread.sleep(2000);
//	  driver.findElement(ByAngular.model("first")).sendKeys("9");
//
//	  
//	Select slt=new Select(driver.findElement(ByAngular.model("operator")));
//	slt.selectByIndex(2);
//	  Thread.sleep(2000);
//	  driver.findElement(ByAngular.model("second")).sendKeys("5");
//	  driver.findElement(ByAngular.buttonText("Go!")).click();
	//  Thread.sleep(2000);
	 
	  driver.get("http://mario-demo.demoserver.biz/");
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	  Actions action=new Actions(driver);
	   action.moveToElement(driver.findElement(By.xpath("//input[@id=\"mat-input-0\" or @formcontrolname='username' or @data-placeholder='Email, Phone Number']"))).click().build().perform();
	   
	   driver.findElement(By.xpath("//input[@id=\"mat-input-0\" or @formcontrolname='username' or @data-placeholder='Email, Phone Number']")).sendKeys("james@mailnator.com");
	driver.findElement(By.xpath("//input[@id=\"mat-input\" or @formcontrolname='password' or @data-placeholder='Password']")).sendKeys("123456789");
	driver.findElement(By.xpath("//button/span[@class='mat-button-wrapper']")).click();
	Thread.sleep(2000);

	}













public static void selectOptionsFromDropdown(String value) throws Exception {
	
	
	
	List<WebElement> lst=driver.findElements(By.xpath("//mat-option"));
	for(int i = 0; i<=lst.size()-1; i++){
		  if(lst.get(i).getText().contains(value)) {
Thread.sleep(2000);					  
			  lst.get(i).click();
	             break;
			  
		  }
	
	}
	
}

public static void createMultipleUsers(String first, String last, String number, String email) throws Exception {
	
	//driver.findElement(By.xpath("//mat-error[ @role='alert'][1]"))
	
	String text1=driver.findElement(By.xpath("//mat-error[contains(text(),'First Name is required!')]")).getText();
	System.out.println(text1);
	String exp1="First Name is required!";
	Assert.assertEquals(text1,exp1);
	 
	
	 WebElement firstname= driver.findElement(By.xpath("//input[@id=\"mat-input-10\" or @formcontrolname='firstName' or @placeholder='First Name']"));
	   Actions action3=new Actions(driver);
	   action3.moveToElement(firstname).click().build().perform();
	   
	   firstname.sendKeys(first);
	   
//	   driver.findElement(By.xpath("//*[@id=\"mat-error-5\"]
	   String text2=driver.findElement(By.xpath("//mat-error[contains(text(),'Last Name is required!')]")).getText();
		System.out.println(text2);
		String exp2="Last Name is required!";
		Assert.assertEquals(text2,exp2);
   
		 driver.findElement(By.xpath("//input[@id=\"mat-input-11\" or @formcontrolname='lastName' or @placeholder='Last Name']")).sendKeys(last);
		 
		 
	//	 driver.findElement(By.xpath("//*[@id=\"mat-error-6\"]		 
		 
		 String text3=driver.findElement(By.xpath("//mat-error[contains(text(),'Mobile Number is required!')]")).getText();
			System.out.println(text3);
			String exp3="Mobile Number is required!";
			Assert.assertEquals(text3,exp3);
		   
			
			driver.findElement(By.xpath("//input[@id=\"mat-input-12\" or @formcontrolname='mobile' or @placeholder='Mobile Number']")).sendKeys("&&*^");
		//	driver.findElement(By.xpath("//*[@id=\"mat-error-8\"]"))	 
			
			 String text4=driver.findElement(By.xpath("//mat-error[contains(text(),'Only number are allowed!')]")).getText();
				System.out.println(text4);
				String exp4="Only number are allowed!";
				Assert.assertEquals(text4,exp4);
			 
				 driver.findElement(By.xpath("//input[@id=\"mat-input-12\" or @formcontrolname='mobile' or @placeholder='Mobile Number']")).clear();
				 
				 driver.findElement(By.xpath("//input[@id=\"mat-input-12\" or @formcontrolname='mobile' or @placeholder='Mobile Number']")).sendKeys("8971");
		
		//		 driver.findElement(By.xpath("//*[@id=\"mat-error-9\"]"))		 
				 
				 String text5=driver.findElement(By.xpath("//mat-error[contains(text(),'Mobile is minimum 10 digit long!')]")).getText();
					System.out.println(text5);
					String exp5="Mobile is minimum 10 digit long!";
					Assert.assertEquals(text5,exp5);
				 
					 driver.findElement(By.xpath("//input[@id=\"mat-input-12\" or @formcontrolname='mobile' or @placeholder='Mobile Number']")).clear();
					  
		 driver.findElement(By.xpath("//input[@id=\"mat-input-12\" or @formcontrolname='mobile' or @placeholder='Mobile Number']")).sendKeys(number);
		 
		 
		// driver.findElement(By.xpath("//*[@id=\"mat-error-7\"]"))
		 
		 String text6=driver.findElement(By.xpath("//mat-error[contains(text(),'Email is required!')]")).getText();
			System.out.println(text6);
			String exp6="Email is required!";
			Assert.assertEquals(text6,exp6);
		 
			 driver.findElement(By.xpath("//input[@id=\"mat-input-13\" or @formcontrolname='email' or @placeholder='Email']")).sendKeys("@#WE$");
		//	 driver.findElement(By.xpath("//*[@id=\"mat-error-10\"]"))
			 
			 String text7=driver.findElement(By.xpath("//mat-error[contains(text(),'Please enter a valid email address!')]")).getText();
				System.out.println(text7);
				String exp7="Please enter a valid email address!";
				Assert.assertEquals(text7,exp7);
	 
				
				 driver.findElement(By.xpath("//input[@id=\"mat-input-13\" or @formcontrolname='email' or @placeholder='Email']")).clear();

				
				
		 driver.findElement(By.xpath("//input[@id=\"mat-input-13\" or @formcontrolname='email' or @placeholder='Email']")).sendKeys(email);

	
}








public  static void initializationdriver() throws Exception {
 	File src=new File("./Configuration/config.properties");
 	FileInputStream fis=new FileInputStream(src);
 	Properties pro=new  Properties();
 	pro=new Properties();
 	pro.load(fis);
 	System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
 	ChromeOptions options = new ChromeOptions();
 	options.addArguments("incognito");
	driver = new ChromeDriver(options);
	  driver.get("https://test.wazecapital.com/");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"login-section\"]/div[1]//input")).sendKeys("rakesh@fitsyn.com");
			driver.findElement(By.xpath("//*[@id=\"validation-password\"]")).sendKeys("Admin@2021");
			driver.findElement(By.xpath("//*[@id=\"login-section\"]/div[3]/div/label/span[1]/input")).click();
			driver.findElement(By.xpath("//*[@id=\"sign-in-request\"]")).click();
	}







public  static void initialization1() throws Exception {
 	File src=new File("./Configuration/config.properties");
 	FileInputStream fis=new FileInputStream(src);
 	Properties pro=new  Properties();
 	pro=new Properties();
 	pro.load(fis);
 	System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
 	ChromeOptions options = new ChromeOptions();
// 	options.addArguments("incognito");
//	driver = new ChromeDriver(options);
//	  driver.get("https://test.wazecapital.com/");
	driver=new ChromeDriver();
	  driver.get("https://test.wazecapital.com/");
			Thread.sleep(5000);			
			driver.findElement(By.xpath("//*[@id=\"login-section\"]/div[1]//input")).sendKeys("global@fitsyn.com");
			driver.findElement(By.xpath("//*[@id=\"validation-password\"]")).sendKeys("Admin@2021");
			driver.findElement(By.xpath("//*[@id=\"login-section\"]/div[3]/div/label/span[1]/input")).click();
			driver.findElement(By.xpath("//*[@id=\"sign-in-request\"]")).click();
			Thread.sleep(5000);	
			  driver.get("https://test.wazecapital.com/rails");
			  driver.manage().window().maximize();
			  Thread.sleep(1000);	
			  Actions action=new Actions(driver);
			   action.moveToElement( driver.findElement(By.xpath("//*[@id=\"lenders_list\"]/tbody/tr[6]/td[3]/a"))).click().build().perform();
			   Thread.sleep(1000);	
			   driver.findElement(By.xpath("//*[@id=\"min_loan\"]")).sendKeys("20000");
			   driver.findElement(By.xpath("//*[@id=\"max_loan\"]")).sendKeys("40000");
			   Thread.sleep(1000);	
			   driver.findElement(By.xpath("//*[@id=\"min_income\"]")).sendKeys("35000");
			   driver.findElement(By.xpath("//*[@id=\"max_income\"]")).sendKeys("50000");
			   Thread.sleep(2000);	
			   driver.findElement(By.xpath("//*[@id=\"railsFilters\"]/div[3]/div/span/span[1]/span/ul/li/input")).click();
			   Thread.sleep(2000); 
			   driver.findElement(By.xpath("//ul[@id=\"select2-states-results\"]/li[2]")).click();
			   
//	List<WebElement>	elements=  driver.findElements(By.xpath("//ul[@id=\"select2-states-results\"]/li"));
//	  Thread.sleep(1000); 
//	  elements.get(1).click();

	  Thread.sleep(3000);
	  try {
		  Actions action1=new Actions(driver);
		   action1.moveToElement(driver.findElement(By.xpath("//form[@id='railsFilters']/button[@id='rail_submit']"))).click().build().perform();
		   Thread.sleep(3000);
		
	  }
	  catch(Exception e) {
		  e.printStackTrace();
	  }
		driver.navigate().back();
		
		driver.navigate().refresh();
		Thread.sleep(2000);
		  Actions action1=new Actions(driver);
		   action1.moveToElement( driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[2]/div/a/div/span"))).click().build().perform();
		   Thread.sleep(2000);
		   Actions action2=new Actions(driver);
		   action2.moveToElement( driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[2]/div/div/a[2]"))).click().build().perform();		
		 Thread.sleep(3000);
		 driver.switchTo().newWindow(WindowType.TAB);
		  driver.get("https://test.wazecapital.com/");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"login-section\"]/div[1]//input")).sendKeys("rakesh@fitsyn.com");
			driver.findElement(By.xpath("//*[@id=\"validation-password\"]")).sendKeys("Admin@2021");
			driver.findElement(By.xpath("//*[@id=\"login-section\"]/div[3]/div/label/span[1]/input")).click();
			driver.findElement(By.xpath("//*[@id=\"sign-in-request\"]")).click();
	}



//note: to check why not clicking in submit button





public static void setIntialization() throws Exception {
 	File src=new File("./Configuration/config.properties");
 	FileInputStream fis=new FileInputStream(src);
 	Properties pro=new  Properties();
 	pro=new Properties();
 	pro.load(fis);
 String filepath="/Fitsyn/CSVFile";
 HashMap<String,Object> chromepref=new HashMap<String,Object>();
 chromepref.put("profile.default_content_setting.popups",0);
 chromepref.put("download.default_directory",filepath);
ChromeOptions options=new ChromeOptions();
 options.setExperimentalOption("prefs",chromepref);
System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe"); 
  driver=new ChromeDriver(options);
driver.get("https://demo.fitsyn.com");
Thread.sleep(5000);
driver.findElement(By.xpath("//*[@id=\"login_form\"]/div[1]/input")).sendKeys("admin@uat.com");
driver.findElement(By.xpath("//*[@id=\"validation-password\"]")).sendKeys("fitsyn@wcg");//action
driver.findElement(By.xpath("//*[@id=\"login_form\"]/div[3]/div/label/span[1]/input")).click();//action
driver.findElement(By.xpath("//*[@id=\"sign-in-request\"]")).click();//action
}

}

