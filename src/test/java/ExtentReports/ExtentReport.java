package ExtentReports;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Browsers.BrowserList;

public class ExtentReport extends BrowserList{

	public static ExtentReports extent;
	public static ExtentTest extentTest;

	
	@BeforeSuite
	public void setExtent() throws InterruptedException, IOException{
		
		extent = new ExtentReports(System.getProperty("user.dir")+"/test-output/ExtentReportResult.html", true);

//		extent.addSystemInfo("Version", "UI.8.5.017|DB UI.8.5.017|Engine3.4.44.005");
		extent.addSystemInfo("Version", "UI.8.6.003|DB UI.8.6.003|Engine 3.4.47");
	}
	
	@AfterSuite
	public void endReport(){
		extent.flush();
		extent.close();
		
//		driver.quit(); 
		// To close chrome in last.
	}
	
	
/*	
	@BeforeClass
	@Parameters("url")
	public void setup(String url) throws InterruptedException, IOException{
		
	//	System.setProperty("webdriver.chrome.driver", "D:/ExtentReportCode-master/ExtentReportCode-master/chromedriver.exe");	
		driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		driver.get("https://markettest.utilibill.com.au/marketbilling/");
	//
		bl.initialize();
	//	this.driver = sit.Open_Browser(url, driver);
		
	}
*/
	
	
	@AfterMethod
	public void tearDown(ITestResult result) throws IOException{
		
		if(result.getStatus()==ITestResult.FAILURE){
			extentTest.log(LogStatus.FAIL, "TEST CASE FAILED IS "+result.getName()); //to add name in extent report
			extentTest.log(LogStatus.FAIL, "TEST CASE FAILED IS "+result.getThrowable()); //to add error/exception in extent report

		 // The below 
		/*	String screenshotPath = ExtentReportClass.getScreenshot(driver, result.getName());
			extentTest.log(LogStatus.FAIL, extentTest.addScreenCapture(screenshotPath)); //to add screenshot in extent report
			extentTest.log(LogStatus.FAIL, extentTest.addScreencast(screenshotPath));*/ //to add screencast/video in extent report
		}
		else if(result.getStatus()==ITestResult.SKIP){
			extentTest.log(LogStatus.SKIP, "Test Case SKIPPED IS " + result.getName());
		}
		else if(result.getStatus()==ITestResult.SUCCESS){
			extentTest.log(LogStatus.PASS, "Test Case PASSED IS " + result.getName());

		}
		
		
		extent.endTest(extentTest); // ending test and ends the current test and prepare to create html report
	//	driver.quit();BrowserList
	}
	
//  For Screenshot uncomment below:
 	public static String getScreenshot(WebDriver driver, String screenshotName) throws IOException{
	String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
	TakesScreenshot ts = (TakesScreenshot) driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	// after execution, you could see a folder "FailedTestsScreenshots"
	// under src folder
	String destination = System.getProperty("user.dir") + "/test-output/FailedTestsScreenshots/" + screenshotName + dateName + ".png";
	File finalDestination = new File(destination);
	FileUtils.copyFile(source, finalDestination);
	return destination;
}


}




