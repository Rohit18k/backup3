//import java.util.Properties;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//
//import com.fitsyn.qa.testcases.TestBase1;
//
//public class DownloadCSVFileInLeadPage extends TestBase1{
//
//	public DownloadCSVFileInLeadPage() {
//		super();
//		}
//	
////		@BeforeTest
////		public void openBrowser() throws Exception {
////			setIntialization();
////		}
//
//	
//	@Test(priority=1)
//	public void downloadCSV() throws Exception {
//		Thread.sleep(7000);
//	    driver.navigate().to("https://demo.fitsyn.com/leads");
//	    driver.manage().window().maximize();
//	    Thread.sleep(5000);
//	    driver.findElement(By.xpath("//*[@id=\"leads_filter_form\"]/div/div[8]/div/div/a")).click();
//	    Thread.sleep(10000);
//	    driver.navigate().to("https://demo.fitsyn.com/reports/report_request");
//	    
//	    Thread.sleep(180000);
//	    driver.navigate().refresh();
//	    driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[6]/a/i")).click();
//	    Thread.sleep(7000);
//		
//}
//}