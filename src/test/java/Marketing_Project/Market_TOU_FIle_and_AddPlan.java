package Marketing_Project;

import java.io.IOException;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Browsers.BrowserList;
import ExtentReports.ExtentReport;
import Re_Useable.Assertion_Test;
import Re_Useable.Login_site;
import Re_Useable.Repo_testing;

public class Market_TOU_FIle_and_AddPlan extends ExtentReport {
	JavascriptExecutor executor;
	Repo_testing action_obj;
	Assertion_Test Assertion_obj;
	public String planno;
	public String planno1;
	public String actmessage, expmessage;
	public int random = (new Random()).nextInt(900) + 100;
	Random rand;
	 
	BrowserList bl = new BrowserList();
	@Test(priority = 0)
	@Parameters({"userId","password","url"})
	public void Import_TOU_Definition(String userId,String password,String url) throws IOException, InterruptedException {
		extentTest = extent.startTest("Import_TOU_Definition");

		
		bl.initialize();
		Thread.sleep(3000);
		
		 bl.urlStack();	
			driver.manage().window().maximize();   
			Thread.sleep(3000);
		Login_site.Login(userId, password, url);
			
       action_obj = new Repo_testing(driver);
		Assertion_obj = new Assertion_Test(driver);
		executor = (JavascriptExecutor) driver;
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		// Click on Admin Tab
		Thread.sleep(5000);
		action_obj.Admin().click();
		Thread.sleep(5000);
		executor.executeScript("window,scrollBy(0,900)", "");
		action_obj.TOU_Import().click();
		
		driver.navigate().refresh();
		// Click on the ManualRecurringCharge link under import setup
		Thread.sleep(5000);
		driver.findElement(By.id("btnbrowseFile")).click();
		Thread.sleep(12000);

		// run autoit to upload file TOUDefinitionImportTemplate.exe
		// D:\A_Projects\Market_Billing\TestData

		Runtime.getRuntime().exec(System.getProperty("user.dir") + "\\TestData\\TOU Definition Import Template.exe");
		Thread.sleep(5000);

		// description
		driver.findElement(By.id("attDesc")).sendKeys("TOU Definition");
		Thread.sleep(3000);

		// Click on the Upload btn
		driver.findElement(By.xpath(".//*[contains(text(),'Upload File')]")).click();
		Thread.sleep(2000);
 
		executor.executeScript("window.scrollBy(0,500)", "");

		// Click on the exceute link
		driver.findElement(By.xpath(".//*[@id='importHistoryTable']/tbody/tr[1]/td[7]/a[1]")).click();
		Thread.sleep(2000);

		// capture the alert
		driver.findElement(By.xpath(".//button[contains(text(),'OK')]")).click();
		Thread.sleep(2000);

		// asertion on message
		String Actualtext = driver.findElement(By.xpath(".//*[contains(text(),'Import Successful!')]")).getText();
		Assert.assertEquals(Actualtext, "Import Successful!");
	//Thread.sleep(58000);
}

	@Test(priority = 1)
	public void Add_Simple_Plan() throws Exception {
		extentTest = extent.startTest("Add_Simple_Plan");


	action_obj = new Repo_testing(driver);
		Assertion_obj = new Assertion_Test(driver);
		executor = (JavascriptExecutor) driver;
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		// Select Rate Plan Tab
		action_obj.Plans().click();
		Assertion_obj.Assert_RatePlan();

		// Create A Plan
		action_obj.CreatePlan().click();

		Assertion_obj.AssertCreatePlan();
		Select useagetype1 = new Select(action_obj.Usages_Type());
		useagetype1.selectByVisibleText("Retail Electricity");
		action_obj.RatePlanname().sendKeys("Market_Plan" + random);

		Select UsageTOU = new Select(action_obj.UsageTypeTOU());
		UsageTOU.selectByIndex(1);

		Select demandTou = new Select(action_obj.Demand_TOU());
		demandTou.selectByIndex(1);

		// Add Date From Valid
		action_obj.Datevalidfrom().click();
		action_obj.TodayDate().click();

		// Add Date To Valid
		action_obj.DateValidTo().click();
		action_obj.TodayDate().click();
		Thread.sleep(3000);
		
		action_obj.Publish_Button().click();
		Thread.sleep(6000);
		action_obj.X().click();

		action_obj.Search_Plan().sendKeys("Market_Plan" + random);

		planno = action_obj.GetPlanNo().getText();
		Assertion_obj.Assertplanno();
	    Thread.sleep(3000);
		
		Thread.sleep(22462);

	}

	@Test(priority = 2)
	public void Add_planWith_NetworkRats() throws Exception {
		extentTest = extent.startTest("Add_planWith_NetworkRats");

		action_obj = new Repo_testing(driver);
		Assertion_obj = new Assertion_Test(driver);
		executor = (JavascriptExecutor) driver;
		// Select Rate Plan Tab
		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		
		Thread.sleep(3000);
		// Create A Plan
		action_obj.CreatePlan().click();

		Thread.sleep(3000);
		
		Assertion_obj.AssertCreatePlan();
		Select useagetype1 = new Select(action_obj.Usages_Type());
		useagetype1.selectByVisibleText("Retail Electricity");

		action_obj.RatePlanname().sendKeys("MktPlan_NetworkRate" + random);

		//Select UsageTOU = new Select(action_obj.UsageTypeTOU());
	    //UsageTOU.selectByIndex(1);

		//Select demandTou = new Select(action_obj.Demand_TOU());
		//demandTou.selectByIndex(1);
		 Thread.sleep(2000);
		 
		// Add Date From Valid
		action_obj.Datevalidfrom().click();
		//action_obj.TodayDate().click();
		action_obj.Month_Popup_From().click();
		action_obj.Select_Month_From().click();
		action_obj.Select_Date_From().click();
		Thread.sleep(3000);
		// action_obj.Datevalidfrom().sendKeys("01/01/2021" + Keys.ESCAPE);
		 Thread.sleep(2000);
		// Add Date To Valid
		action_obj.DateValidTo().click();
		action_obj.Month_Popup_From().click();
		action_obj.Select_Month_To().click();
		action_obj.Select_Date_To().click();
		//action_obj.TodayDate().click();
		//action_obj.DateValidTo().sendKeys("31/12/2021" + Keys.ESCAPE);
		 Thread.sleep(2000);
		// ************************************************************

		// Add Network Volume rateing method
		action_obj.TariffButton().click();

		// Tariff Page
		Assertion_obj.AssertTariffButton();

		// Add Tariff Page information
		//action_obj.Charge_Desc().sendKeys("Flat Rates");
		action_obj.Charge_Desc().sendKeys("Flat Usage");
		action_obj.comptab().click();

		//action_obj.Rollup_Desc().sendKeys("Electricity Charges");
		action_obj.Rollup_Desc().sendKeys("Account Charges");
		action_obj.comptab().click();

		Select chrgtype = new Select(action_obj.charg_Type());
		chrgtype.selectByVisibleText("Electricity Charges");
		Thread.sleep(3000);
		// Rating Method
		Select RatMethod = new Select(action_obj.Rating_method());
		//RatMethod.selectByValue("B9");
		RatMethod.selectByValue("C1");
		// RatMethod.selectByIndex(1);
		Thread.sleep(3000);
		// action_obj.Demand_Threshold().sendKeys("10.45");
		// Thread.sleep(3000);
		Select unit11 = new Select(action_obj.Unit_Type_Plan());
		// unit11.selectByValue("EAB");
		unit11.selectByIndex(1);
		Thread.sleep(3000);
		
		//Select Season
		//Select season = new Select(action_obj.Season());
		//season.selectByVisibleText(" ALL");
		//Thread.sleep(3000);
		

		action_obj.Tariff_Rates().sendKeys("25");
		Thread.sleep(1000);
		// Add Dst Option
		//Select Dst_option = new Select(action_obj.DST());
		//Dst_option.selectByIndex(2);
		//Thread.sleep(3000);
		action_obj.AddButton().click();

		// Check Record
		action_obj.Search_Tariff().clear();
		action_obj.Search_Tariff().sendKeys("25");

		// ****************************Aditi******* add Tarifff 2

		/*// add NEtwork Excess kVAr
		action_obj.TariffButton().click();

		// Tariff Page
		Assertion_obj.AssertTariffButton();

		// Add Tariff Page information
		action_obj.Charge_Desc().sendKeys("Floor Charges");
		action_obj.comptab().click();

		action_obj.Rollup_Desc().sendKeys("Electricity rates");
		action_obj.comptab().click();

		Select chrgetype = new Select(action_obj.charg_Type());
		chrgetype.selectByVisibleText("Electricity Charges");
		Thread.sleep(3000);
		// Rating Method
		Select RateMethod = new Select(action_obj.Rating_method());
		RateMethod.selectByValue("EP");
		Thread.sleep(3000);
		// action_obj.Demand_Threshold().sendKeys("10.45");
		// Thread.sleep(3000);
		Select unit11e = new Select(action_obj.Unit_Type_Plan());
		// unit11e.selectByValue("EAG");
		// 218
		unit11e.selectByIndex(1);
		Thread.sleep(3000);

		action_obj.Tariff_Rates().sendKeys("30");
		Thread.sleep(1000);
		// Add Dst Option
		Select Dste_option = new Select(action_obj.DST());
		Dste_option.selectByIndex(0);
		Thread.sleep(1000);
		action_obj.AddButton().click();

		// Check Record
		action_obj.Search_Tariff().clear();
		action_obj.Search_Tariff().sendKeys("30");*/

		action_obj.Publish_Button().click();
		Thread.sleep(1000);
	//	action_obj.X().click();
		Thread.sleep(3000);
		action_obj.Search_Plan().clear();
		Thread.sleep(3000);
		action_obj.Search_Plan().sendKeys("MktPlan_NetworkRate" + random);

		planno1 = action_obj.GetPlanNo().getText();
		Thread.sleep(2000);
		//Assertion_obj.Assertplanno();
		//Thread.sleep(13000);
		
	//	Thread.sleep(9461);
	}

	@Test(priority = 3)
	public void Add_PlanWith_RetailRates() throws Exception {
		extentTest = extent.startTest("Add_PlanWith_RetailRates");

		action_obj = new Repo_testing(driver);
		Assertion_obj = new Assertion_Test(driver);
		executor = (JavascriptExecutor) driver;
		// Select Rate Plan Tab
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		// action_obj.Plans().click();
		// Assertion_obj.Assert_RatePlan();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		// Create A Plan
		action_obj.CreatePlan().click();

		Assertion_obj.AssertCreatePlan();
		Select useagetype1 = new Select(action_obj.Usages_Type());
		useagetype1.selectByVisibleText("Retail Electricity");

		action_obj.RatePlanname().sendKeys("MPlan_RetailRate" + random);

		Select UsageTOU = new Select(action_obj.UsageTypeTOU());
		UsageTOU.selectByIndex(1);

		Select demandTou = new Select(action_obj.Demand_TOU());
		demandTou.selectByIndex(1);

		// Add Date From Valid
		action_obj.Datevalidfrom().click();
		action_obj.TodayDate().click();

		// Add Date To Valid
		action_obj.DateValidTo().click();
		action_obj.TodayDate().click();

		// ************************************************************

		Thread.sleep(3000);
		// Add Retail Volume rateing method
		action_obj.TariffButton().click();

		// Tariff Page
		Assertion_obj.AssertTariffButton();

		// Add Tariff Page information
		action_obj.Charge_Desc().sendKeys("Retail Electricity Charges");
		action_obj.comptab().click();

		action_obj.Rollup_Desc().sendKeys("Electricity Usages");
		action_obj.comptab().click();

		Select chrgtype = new Select(action_obj.charg_Type());
		chrgtype.selectByVisibleText("Electricity Charges");
		Thread.sleep(3000);
		// Rating Method
		Select RatMethod = new Select(action_obj.Rating_method());
		RatMethod.selectByValue("GW");
		Thread.sleep(3000);

		// action_obj.Demand_Threshold().sendKeys("10.45");
		// Thread.sleep(3000);
		Select unit11 = new Select(action_obj.Unit_Type_Plan());
		// unit11.selectByValue("EAB");
		Thread.sleep(3000);
		// Add Load percentage under Add Tariff popup window

		// Only for Futureexenergy_UAt xml
		action_obj.Load_percentage().sendKeys("45");

		Thread.sleep(3000);
		action_obj.Tariff_Rates().sendKeys("35");
		Thread.sleep(1000);
		// Add Dst Option
		Select Dst_option = new Select(action_obj.DST());
		Dst_option.selectByIndex(1);
		Thread.sleep(1000);
		action_obj.AddButton().click();

		// Check Record
		action_obj.Search_Tariff().clear();
		action_obj.Search_Tariff().sendKeys("35");

		// *********************************** add Tarifff 2 ****************

		// Add Retail Volume rateing method
		action_obj.TariffButton().click();

		// Tariff Page
		Assertion_obj.AssertTariffButton();

		// Add Tariff Page information
		action_obj.Charge_Desc().sendKeys("Retail Charges");
		action_obj.comptab().click();

		action_obj.Rollup_Desc().sendKeys("Electricity rate");
		action_obj.comptab().click();

		Select chrgtype1 = new Select(action_obj.charg_Type());
		chrgtype1.selectByVisibleText("Electricity Charges");
		Thread.sleep(3000);
		// Rating Method
		Select RatMethod1 = new Select(action_obj.Rating_method());
		RatMethod1.selectByValue("GX");
		Thread.sleep(3000);

		// action_obj.Demand_Threshold().sendKeys("10.45");
		// Thread.sleep(3000);
		Select unit121 = new Select(action_obj.Unit_Type_Plan());
		// unit121.selectByValue("EAB");
		unit121.selectByIndex(1);
		Thread.sleep(3000);
		// Add Load percentage under Add Tariff popup window
		action_obj.Load_percentage().sendKeys("55");
		Thread.sleep(3000);
		action_obj.Tariff_Rates().sendKeys("40");
		Thread.sleep(1000);
		// Add Dst Option
		Select Dst1_option = new Select(action_obj.DST());
		Dst1_option.selectByIndex(1);
		Thread.sleep(2000);
		action_obj.AddButton().click();

		// Check Record
		action_obj.Search_Tariff().clear();
		action_obj.Search_Tariff().sendKeys("40");

		Thread.sleep(3000);
		action_obj.Publish_Button().click();
		Thread.sleep(2000);
		action_obj.X().click();
		action_obj.Search_Plan().clear();
		Thread.sleep(3000);
		action_obj.Search_Plan().sendKeys("MPlan_RetailRate" + random);
		Thread.sleep(3000);
		planno = action_obj.GetPlanNo().getText();
		Assertion_obj.Assertplanno();
		//Thread.sleep(11000);
		
		Thread.sleep(39874);
	}
	
	@Test(priority = 4)
	public void Other_plan() throws Exception {
		extentTest = extent.startTest("Other_plan");

		action_obj = new Repo_testing(driver);
		Assertion_obj = new Assertion_Test(driver);
		executor = (JavascriptExecutor) driver;
		// Select Rate Plan Tab
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		// action_obj.Plans().click();
		// Assertion_obj.Assert_RatePlan();
		driver.navigate().refresh();
		Thread.sleep(3000);
		// Create A Plan
		action_obj.CreatePlan().click();

		Assertion_obj.AssertCreatePlan();
		Select useagetype1 = new Select(action_obj.Usages_Type());
		useagetype1.selectByVisibleText("Retail Electricity");

		action_obj.RatePlanname().sendKeys("OtherPlan" + random);

		Select UsageTOU = new Select(action_obj.UsageTypeTOU());
		UsageTOU.selectByIndex(1);

		Select demandTou = new Select(action_obj.Demand_TOU());
		demandTou.selectByIndex(1);

		// Add Date From Valid
		action_obj.Datevalidfrom().click();
		action_obj.TodayDate().click();

		// Add Date To Valid
		action_obj.DateValidTo().click();
		action_obj.TodayDate().click();

		// ************************************************************

		// 11111 Add Account Charges with Connection unit rating method
		action_obj.TariffButton().click();

		// Tariff Page
		Assertion_obj.AssertTariffButton();

		// Add Tariff Page information
		action_obj.Charge_Desc().sendKeys("Other Charges");
		action_obj.comptab().click();

		action_obj.Rollup_Desc().sendKeys("All USages rates");
		action_obj.comptab().click();

		Select chrgtype = new Select(action_obj.charg_Type());
		chrgtype.selectByVisibleText("Account Level Charges");
		Thread.sleep(3000);
		// Rating Method
		Select RatMethod = new Select(action_obj.Rating_method());
		// RatMethod.selectByValue("O4");
		RatMethod.selectByIndex(1);
		Thread.sleep(3000);

		// action_obj.Demand_Threshold().sendKeys("10.45");
		// Thread.sleep(3000);
		// Select unit11=new Select(action_obj.Unit_Type_Plan());
		// unit11.selectByValue("AAA");
		Thread.sleep(3000);
		// Add Load percentage under Add Tariff popup window
		// action_obj.Load_percentage().sendKeys("45");
		// Thread.sleep(3000);
		Select unit1 = new Select(driver.findElement(By.id("unit-type")));
		unit1.selectByIndex(1);
		action_obj.Tariff_Rates().sendKeys("20");
		Thread.sleep(1000);
		// Add Dst Option
		Select Dst_option = new Select(action_obj.DST());
		Dst_option.selectByIndex(1);
		Thread.sleep(3000);
		action_obj.AddButton().click();
		Thread.sleep(3000);
		// Check Record
		action_obj.Search_Tariff().clear();
		Thread.sleep(3000);
		action_obj.Search_Tariff().sendKeys("20");
		Thread.sleep(4000);
		action_obj.Publish_Button().click();
		Thread.sleep(4000);
		action_obj.X().click();
		action_obj.Search_Plan().clear();
		action_obj.Search_Plan().sendKeys("OtherPlan" + random);

		planno = action_obj.GetPlanNo().getText();
		Assertion_obj.Assertplanno();
		//Thread.sleep(10000);
		
		Thread.sleep(38650);
	}
	
	//Updated new testcases by Aditi
	
//	@Test(priority= 5)
//	
//	public void Add_ProRated_Rates() throws Exception {
//		extentTest = extent.startTest("Add_ProRated_Rates");
//
//	/*action_obj = new Repo_testing(driver);                                                  //// aDITI commented
//	Assertion_obj = new Assertion_Test(driver);
//    executor = (JavascriptExecutor) driver;
//    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
//      
//    action_obj.Search_Plan().clear();
//    Thread.sleep(1000);
//       
//    //Search Plan
//	action_obj.Search_Plan().sendKeys("MktPlan_NetworkRate" + random);
//	Thread.sleep(1000);
//	
//	//Edit Plan
//	action_obj.Edit_Button().click();
//	Thread.sleep(3000);
//	
//	// Store the current window handle
//	
//	// Continue with original browser (first window)
//	
//	executor.executeScript("window.scrollBy(0,1000)", "");
//	//WebElement Prorata_Button = driver.findElement(By.id("my-id"));
//	Actions actions = new Actions(driver);
//	actions.moveToElement(driver.findElement(By.cssSelector("i.icon-calendar")));
//	actions.click();
//	//JavascriptExecutor jsx = (JavascriptExecutor)driver;
//	//jsx.executeScript("window.scrollBy(0,1000)", "");
//	
//	executor.executeScript("window.scrollBy(0,2000)", ""); /////////////////////////////////
//	WebDriverWait wait = new WebDriverWait(driver,30);
//	wait.until(ExpectedConditions.elementToBeClickable(action_obj.Prorata_Button()));
//	//executor.executeScript("window.scrollBy(0,2000)", "");
//	Thread.sleep(8000);
//	
//	//Click on Prorata button
//	action_obj.Prorata_Button().click();
//	Thread.sleep(2000);
//	//Enable toggle
//	action_obj.Enable_Prorata().click();
//	//Select from date
//	action_obj.Date_From_Field().click();
//	//action_obj.TodayDate().click();
//	action_obj.Month_Popup_From().click();
//	action_obj.Select_Month_From().click();
//	action_obj.Select_Date_From().click();
//	Thread.sleep(3000);
//	//Select to date
//	action_obj.Date_To_Field().click();
//	//action_obj.TodayDate().click();
//	action_obj.Month_Popup_To().click();
//	action_obj.Select_Month_To().click();
//	action_obj.Select_Date_To().click();
//	Thread.sleep(3000);
//	//Enter Rate
//	action_obj.Prorata_Rate().sendKeys("45");
//	//Add Prorata rates
//	action_obj.Add_Prorata().click();
//	Thread.sleep(3000);
//	//Close popup
//	action_obj.Close_Button().click();
//	Thread.sleep(5000);
//	//executor.executeScript("window,scrollBy(0,1800)", "");
//	//Thread.sleep(3000);
//	//Publish Plan
//	action_obj.Publish_Button().click();
//	Thread.sleep(2000);
//	
//	//assert success message
//	//Assertion_obj.Assertion_Success_Plan();
//	
//	actmessage = driver.findElement(By.xpath("(//p[@class='error']/strong)[1]")).getText();
//	expmessage = "MktPlan_NetworkRate" + random + " has been successfully updated.";
//	
//	Assert.assertEquals(actmessage, expmessage);
//	Thread.sleep(1000);
//	
//		action_obj.X().click();            */                                                          ///// ashima
//	
//	
//		Thread.sleep(22458);
	
//	}
}
