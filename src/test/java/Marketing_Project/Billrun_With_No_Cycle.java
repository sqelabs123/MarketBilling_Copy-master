package Marketing_Project;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Browsers.BrowserList;
import ExtentReports.ExtentReport;
import Re_Useable.Assertion_Test;
import Re_Useable.Login_site;
import Re_Useable.Repo_testing;

public class Billrun_With_No_Cycle extends ExtentReport {

	JavascriptExecutor executor;
	Repo_testing action_obj;
	Assertion_Test Assertion_obj;
	public String MeterNumber;
	public String resi;
	public String comm;
	public String busi;
	public int random = (new Random()).nextInt(900) + 100;
	Random rand;

	BrowserList bl = new BrowserList();


	@Test(priority=0)
	@Parameters({"userId","password","url"})
	public void Add_Meter(String userId,String password,String url) throws Exception{
extentTest = extent.startTest("Add_Meter");

		
		bl.initialize();
		Thread.sleep(3000);
		
		 bl.urlStack();	
			driver.manage().window().maximize();   
			Thread.sleep(3000);
		Login_site.Login(userId, password, url);
		

		action_obj = new Repo_testing(driver);
		Assertion_obj = new Assertion_Test(driver);
		executor = (JavascriptExecutor) driver;
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().refresh();
		Thread.sleep(1000);

		//Search residential Customer
		//singleCustomer= a.ResidentialCustomer;
		//action_obj.Searchfield().sendKeys("36197");

		action_obj.SearchButton().click();

		//Get residential customer
		resi= driver.findElement(By.xpath("(//td[@class='sorting_1']/a)[3]")).getText();

		Thread.sleep(4000);
		action_obj.Searchfield().sendKeys(resi);
		Thread.sleep(2000);
		action_obj.SearchButton().click();

		Thread.sleep(5000);
		//Click on Service Tab
		action_obj.ServicesTab().click();
		Thread.sleep(3000);
		//Click on Edit button
		action_obj.Service_Edit().click();
		Thread.sleep(3000);

		executor.executeScript("window,scrollBy(0,1800)", "");

		//Click on Add Metering
		action_obj.Add_Meter().click();

		//Assertion on title
		Assertion_obj.Assertion_Create_Meter();

		//Add Meter Number
		action_obj.Meter_Serial_Number().sendKeys("METER" + random);

		MeterNumber = action_obj.Meter_Serial_Number().getText();

		//Select Consumption Type
		//Select consumptionType = new Select(action_obj.Consumption_Type());
		//consumptionType.selectByValue("C");
		//Thread.sleep(1000);

		//Select Configuration Type
		Select configurationType = new Select(action_obj.Configuration_Type());
		configurationType.selectByValue("2");
		Thread.sleep(2000);

		executor.executeScript("window,scrollBy(0,1800)", "");

		//Select Last test date datepicker
		action_obj.Last_Test_Date().click();
		Thread.sleep(2000);
		//Select today date
		action_obj.TodayDate().click();
		Thread.sleep(2000);

		//Select Date Connected datepicker
		action_obj.Date_Connected().click();
		Thread.sleep(1000);

		//Select today date
		action_obj.TodayDate().click();
		Thread.sleep(1000);

		//Click on create meter button
		action_obj.Create_Meter().click();

		//Assert Success Message
		Assertion_obj.Assert_Success_Message_Meter();
		Thread.sleep(1000);
		executor.executeScript("window,scrollBy(0,1800)", "");
		Thread.sleep(1000);
//Thread.sleep(35204);

	}

	@Test(priority=1)
	public void Add_Meter_Register() throws Exception{
		extentTest = extent.startTest("Add_Meter_Register");

		action_obj = new Repo_testing(driver);
		Assertion_obj = new Assertion_Test(driver);
		executor = (JavascriptExecutor) driver;
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);
		
		//Edit Meter
		action_obj.Edit_Meter().click();

		//Assertion of title
		Assertion_obj.Assertion_Metering();

		executor.executeScript("window,scrollBy(0,1800)", "");
		Thread.sleep(3000);

		//Add Meter Register
		action_obj.Meter_Register().click();

		//Assertion of title
		Assertion_obj.Assertion_Meter_Register();

		//Enter Register ID
		action_obj.Register_Id().sendKeys("10");

		//Enter Network Tariff Code
		action_obj.Network_Tariff_Code().sendKeys("NA");

		//Enter Unit of Measure
		action_obj.Unit_Of_Measure().sendKeys("KWH");

		//Enter Time of Day
		action_obj.Time_Of_Day().sendKeys("ALLDAY");

		//Enter Dail Format
		action_obj.Dail_Format().sendKeys("5");

		//Enter Controlled Load
		action_obj.Controlled_Load().clear();
		Thread.sleep(1000);
		action_obj.Controlled_Load().sendKeys("No");;
		Thread.sleep(1000);

		//Select Consumption Type
		//Select consumptionType = new Select(action_obj.Consumption_Type());
		//consumptionType.selectByValue("C");
		//Thread.sleep(1000);

		//Enter Demand1 value
		action_obj.Demand_1().sendKeys("0");

		//Enter Demand2 value
		action_obj.Demand_2().sendKeys("0");

		//Enter NMI Suffix
		action_obj.NMI_Suffix().sendKeys("11");

		executor.executeScript("window,scrollBy(0,1800)", "");

		//Select Date Connected
		action_obj.Register_date_Connected().click();

		//Select Today date
		action_obj.TodayDate().click();

		//Click on Create Register button
		action_obj.Create_Register().click();

		//Success message
		Assertion_obj.Assert_Success_Meter_Register();

		Thread.sleep(2000);
		//Thread.sleep(47995);

	}


	@Test(priority=2)
	public void Add_Meter_Reads() throws Exception{
		extentTest = extent.startTest("Add_Meter_Reads");

		action_obj = new Repo_testing(driver);
		Assertion_obj = new Assertion_Test(driver);
		executor = (JavascriptExecutor) driver;
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//Click on Meter Reads tab
		action_obj.Meter_Reads().click();
		Thread.sleep(2000);

		//Select Meter Number
		Select meternumber = new Select(action_obj.Meter_Number());
		meternumber.selectByVisibleText("METER" + random);
		Thread.sleep(6000);

		executor.executeScript("window,scrollBy(0,1800)", "");
		Thread.sleep(1000);

		//Click on View Meter Reads
		action_obj.View_Meter_Reads().click();

		//Click on Add Reads
		action_obj.Add_Read().click();

		//Select Meter No
		Select meterno = new Select(action_obj.Meter_No());
		meterno.selectByVisibleText("METER" + random);
		Thread.sleep(3000);

		//Select Read Type
		Select readtype = new Select(action_obj.readType());
		readtype.selectByVisibleText("Initial");
		Thread.sleep(5000);

		//Open Read Date Datepicker
		action_obj.Read_Date().click();
		Thread.sleep(1000);
		//Select Today Date
		action_obj.SelectToday().click();
		Thread.sleep(1000);

		executor.executeScript("window,scrollBy(0,1800)", "");

		//Enter Meter Read(Peak)
		action_obj.Meter_Read_P().sendKeys("150");
		Thread.sleep(1000);

		//Enter Meter Read(Off Peak)
		action_obj.Meter_Read_O().sendKeys("200");
		Thread.sleep(1000);
		//Enter Meter Read(Shoulder)
		action_obj.Meter_Read_S().sendKeys("300");
		Thread.sleep(1000);
		//Click on Save button
		action_obj.Save().click();

		Thread.sleep(5000);

		//Click on Add Reads
		action_obj.Add_Read().click();

		//Select Meter No
		Select meterno2 = new Select(action_obj.Meter_No());
		meterno2.selectByVisibleText("METER" + random);
		Thread.sleep(3000);

		//Select Read Type
		Select readtype2 = new Select(action_obj.readType());
		readtype2.selectByVisibleText("Actual Read");
		Thread.sleep(5000);

		//Open Read Date Datepicker
		action_obj.Read_Date().click();
		Thread.sleep(1000);
		//Select Today Date
		action_obj.SelectToday().click();
		Thread.sleep(1000);


		executor.executeScript("window,scrollBy(0,1800)", "");


		//Enter Meter Read(Peak)
		action_obj.Meter_Read_P().sendKeys("200");
		Thread.sleep(1000);	

		//Enter Meter Read(Off Peak)
		action_obj.Meter_Read_O().sendKeys("400");
		Thread.sleep(1000);	
		//Enter Meter Read(Shoulder)
		action_obj.Meter_Read_S().sendKeys("650");

		//Click on Save button
		action_obj.Save().click();
		Thread.sleep(1000);
		executor.executeScript("window,scrollBy(0,-1800)", "");
		
	//	Thread.sleep(13354);

	}


	@Test(priority=3)
	public void Add_Metering_Commercial_Customer() throws Exception
	{
		extentTest = extent.startTest("Add_Metering_Commercial_Customer");
		action_obj = new Repo_testing(driver);
		Assertion_obj = new Assertion_Test(driver);
		executor = (JavascriptExecutor) driver;
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().refresh();
		Thread.sleep(1000);

		action_obj.SearchButton().click();

		//Get residential customer
		comm= driver.findElement(By.xpath("(//td[@class='sorting_1']/a)[1]")).getText();
		Thread.sleep(4000);
		action_obj.Searchfield().sendKeys(comm);
		Thread.sleep(2000);
		action_obj.SearchButton().click();

		Thread.sleep(5000);
		//Click on Service Tab
		action_obj.ServicesTab().click();
		Thread.sleep(1000);
		//Click on Edit button
		action_obj.Service_Edit().click();
		Thread.sleep(1000);

		executor.executeScript("window,scrollBy(0,1800)", "");

		//Click on Add Metering
		action_obj.Add_Meter().click();

		//Assertion on title
		Assertion_obj.Assertion_Create_Meter();

		//Add Meter Number
		action_obj.Meter_Serial_Number().sendKeys("METER" + random);

		MeterNumber = action_obj.Meter_Serial_Number().getText();

		//Select Consumption Type
		//Select consumptionType = new Select(action_obj.Consumption_Type());
		//consumptionType.selectByValue("C");
		//Thread.sleep(1000);

		//Select Configuration Type
		Select configurationType = new Select(action_obj.Configuration_Type());
		configurationType.selectByValue("2");
		Thread.sleep(1000);

		executor.executeScript("window,scrollBy(0,1800)", "");

		//Select Last test date datepicker
		action_obj.Last_Test_Date().click();
		Thread.sleep(1000);
		//Select today date
		action_obj.TodayDate().click();
		Thread.sleep(1000);

		//Select Date Connected datepicker
		action_obj.Date_Connected().click();
		Thread.sleep(1000);

		//Select today date
		action_obj.TodayDate().click();
		Thread.sleep(1000);

		//Click on create meter button
		action_obj.Create_Meter().click();

		//Assert Success Message
		Assertion_obj.Assert_Success_Message_Meter();
		Thread.sleep(1000);
		executor.executeScript("window,scrollBy(0,1800)", "");
		Thread.sleep(3000);

		//Edit Meter
		action_obj.Edit_Meter().click();

		//Assertion of title
		Assertion_obj.Assertion_Metering();

		executor.executeScript("window,scrollBy(0,1800)", "");
		Thread.sleep(1000);

		//Add Meter Register
		action_obj.Meter_Register().click();

		//Assertion of title
		Assertion_obj.Assertion_Meter_Register();

		//Enter Register ID
		action_obj.Register_Id().sendKeys("1");

		//Enter Network Tariff Code
		action_obj.Network_Tariff_Code().sendKeys("NA");

		//Enter Unit of Measure
		action_obj.Unit_Of_Measure().sendKeys("KWH");

		//Enter Time of Day
		action_obj.Time_Of_Day().sendKeys("ALLDAY");

		//Enter Dail Format
		action_obj.Dail_Format().sendKeys("5");

		//Enter Controlled Load
		action_obj.Controlled_Load().clear();
		Thread.sleep(1000);
		action_obj.Controlled_Load().sendKeys("No");;
		Thread.sleep(1000);

		//Select Consumption Type
		//Select consumptionType2 = new Select(action_obj.Consumption_Type());
		//consumptionType2.selectByValue("C");
		//Thread.sleep(1000);

		//Enter Demand1 value
		action_obj.Demand_1().sendKeys("0");

		//Enter Demand2 value
		action_obj.Demand_2().sendKeys("0");

		//Enter NMI Suffix
		action_obj.NMI_Suffix().sendKeys("11");

		executor.executeScript("window,scrollBy(0,1800)", "");

		//Select Date Connected
		action_obj.Register_date_Connected().click();

		//Select Today date
		action_obj.TodayDate().click();

		//Click on Create Register button
		action_obj.Create_Register().click();

		//Success message
		Assertion_obj.Assert_Success_Meter_Register();

		Thread.sleep(2000);

		//Click on Meter Reads tab
		action_obj.Meter_Reads().click();
		Thread.sleep(2000);

		//Select Meter Number
		Select meternumber = new Select(action_obj.Meter_Number());
		meternumber.selectByVisibleText("METER" + random);
		Thread.sleep(6000);

		executor.executeScript("window,scrollBy(0,1800)", "");
		Thread.sleep(1000);

		//Click on View Meter Reads
		action_obj.View_Meter_Reads().click();

		//Click on Add Reads
		action_obj.Add_Read().click();

		//Select Meter No
		Select meterno = new Select(action_obj.Meter_No());
		meterno.selectByVisibleText("METER" + random);
		Thread.sleep(3000);

		//Select Read Type
		Select readtype = new Select(action_obj.readType());
		readtype.selectByVisibleText("Initial");
		Thread.sleep(5000);

		//Open Read Date Datepicker
		action_obj.Read_Date().click();
		Thread.sleep(1000);
		//Select Today Date
		action_obj.SelectToday().click();
		Thread.sleep(1000);

		executor.executeScript("window,scrollBy(0,1800)", "");

		//Enter Meter Read(Peak)
		action_obj.Meter_Read_P().sendKeys("150");
		Thread.sleep(1000);

		//Enter Meter Read(Off Peak)
		action_obj.Meter_Read_O().sendKeys("200");
		Thread.sleep(1000);
		//Enter Meter Read(Shoulder)
		action_obj.Meter_Read_S().sendKeys("300");
		Thread.sleep(1000);
		//Click on Save button
		action_obj.Save().click();

		Thread.sleep(5000);

		//Click on Add Reads
		action_obj.Add_Read().click();

		//Select Meter No
		Select meterno2 = new Select(action_obj.Meter_No());
		meterno2.selectByVisibleText("METER" + random);
		Thread.sleep(3000);

		//Select Read Type
		Select readtype2 = new Select(action_obj.readType());
		readtype2.selectByVisibleText("Actual Read");
		Thread.sleep(5000);

		//Open Read Date Datepicker
		action_obj.Read_Date().click();
		Thread.sleep(1000);
		//Select Today Date
		action_obj.SelectToday().click();
		Thread.sleep(1000);


		executor.executeScript("window,scrollBy(0,1800)", "");


		//Enter Meter Read(Peak)
		action_obj.Meter_Read_P().sendKeys("200");
		Thread.sleep(1000);	

		//Enter Meter Read(Off Peak)
		action_obj.Meter_Read_O().sendKeys("400");
		Thread.sleep(1000);	
		//Enter Meter Read(Shoulder)
		action_obj.Meter_Read_S().sendKeys("650");

		//Click on Save button
		action_obj.Save().click();
		Thread.sleep(1000);

		executor.executeScript("window,scrollBy(0,-1800)", "");

	//	Thread.sleep(112933);

	}


	@Test(priority=4)
	public void Add_Metering_Business_Customer() throws Exception
	{
		extentTest = extent.startTest("Add_Metering_Business_Customer");
		action_obj = new Repo_testing(driver);
		Assertion_obj = new Assertion_Test(driver);
		executor = (JavascriptExecutor) driver;
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().refresh();
		Thread.sleep(1000);

		action_obj.SearchButton().click();

		//Get residential customer
		busi= driver.findElement(By.xpath("(//td[@class='sorting_1']/a)[2]")).getText();
		Thread.sleep(4000);
		action_obj.Searchfield().sendKeys(busi);
		Thread.sleep(2000);
		action_obj.SearchButton().click();

		Thread.sleep(5000);
		//Click on Service Tab
		action_obj.ServicesTab().click();
		Thread.sleep(1000);
		//Click on Edit button
		action_obj.Service_Edit().click();
		Thread.sleep(1000);

		executor.executeScript("window,scrollBy(0,1800)", "");

		//Click on Add Metering
		action_obj.Add_Meter().click();

		//Assertion on title
		Assertion_obj.Assertion_Create_Meter();

		//Add Meter Number
		action_obj.Meter_Serial_Number().sendKeys("METER" + random);

		MeterNumber = action_obj.Meter_Serial_Number().getText();

		//Select Consumption Type
		//Select consumptionType = new Select(action_obj.Consumption_Type());
		//consumptionType.selectByValue("C");
		//Thread.sleep(1000);

		//Select Configuration Type
		Select configurationType = new Select(action_obj.Configuration_Type());
		configurationType.selectByValue("2");
		Thread.sleep(1000);

		executor.executeScript("window,scrollBy(0,1800)", "");

		//Select Last test date datepicker
		action_obj.Last_Test_Date().click();
		Thread.sleep(1000);
		//Select today date
		action_obj.TodayDate().click();
		Thread.sleep(1000);

		//Select Date Connected datepicker
		action_obj.Date_Connected().click();
		Thread.sleep(1000);

		//Select today date
		action_obj.TodayDate().click();
		Thread.sleep(1000);

		//Click on create meter button
		action_obj.Create_Meter().click();

		//Assert Success Message
		Assertion_obj.Assert_Success_Message_Meter();
		Thread.sleep(1000);
		executor.executeScript("window,scrollBy(0,1800)", "");
		Thread.sleep(3000);

		//Edit Meter
		action_obj.Edit_Meter().click();

		//Assertion of title
		Assertion_obj.Assertion_Metering();

		executor.executeScript("window,scrollBy(0,1800)", "");
		Thread.sleep(1000);

		//Add Meter Register
		action_obj.Meter_Register().click();

		//Assertion of title
		Assertion_obj.Assertion_Meter_Register();

		//Enter Register ID
	
		action_obj.Register_Id().sendKeys("1");///////////////////////////////////////////////////////

		//Enter Network Tariff Code
		action_obj.Network_Tariff_Code().sendKeys("NA");

		//Enter Unit of Measure
		action_obj.Unit_Of_Measure().sendKeys("KWH");

		//Enter Time of Day
		action_obj.Time_Of_Day().sendKeys("ALLDAY");

		//Enter Dail Format
		action_obj.Dail_Format().sendKeys("5");

		//Enter Controlled Load
		action_obj.Controlled_Load().clear();
		Thread.sleep(1000);
		action_obj.Controlled_Load().sendKeys("No");;
		Thread.sleep(1000);

		//Select Consumption Type
		//Select consumptionType2 = new Select(action_obj.Consumption_Type());
		//consumptionType2.selectByValue("C");
		//Thread.sleep(1000);

		//Enter Demand1 value
		action_obj.Demand_1().sendKeys("0");

		//Enter Demand2 value
		action_obj.Demand_2().sendKeys("0");

		//Enter NMI Suffix
		action_obj.NMI_Suffix().sendKeys("11");

		executor.executeScript("window,scrollBy(0,1800)", "");

		//Select Date Connected
		action_obj.Register_date_Connected().click();

		//Select Today date
		action_obj.TodayDate().click();

		//Click on Create Register button
		action_obj.Create_Register().click();

		//Success message
		Assertion_obj.Assert_Success_Meter_Register();

		Thread.sleep(2000);

		//Click on Meter Reads tab
		action_obj.Meter_Reads().click();
		Thread.sleep(2000);

		//Select Meter Number
		Select meternumber = new Select(action_obj.Meter_Number());
		meternumber.selectByVisibleText("METER" + random);
		Thread.sleep(6000);

		executor.executeScript("window,scrollBy(0,1800)", "");
		Thread.sleep(1000);

		//Click on View Meter Reads
		action_obj.View_Meter_Reads().click();

		//Click on Add Reads
		action_obj.Add_Read().click();

		//Select Meter No
		Select meterno = new Select(action_obj.Meter_No());
		meterno.selectByVisibleText("METER" + random);
		Thread.sleep(3000);

		//Select Read Type
		Select readtype = new Select(action_obj.readType());
		readtype.selectByVisibleText("Initial");
		Thread.sleep(5000);

		//Open Read Date Datepicker
		action_obj.Read_Date().click();
		Thread.sleep(1000);
		//Select Today Date
		action_obj.SelectToday().click();
		Thread.sleep(1000);

		executor.executeScript("window,scrollBy(0,1800)", "");

		//Enter Meter Read(Peak)
		action_obj.Meter_Read_P().sendKeys("150");
		Thread.sleep(1000);

		//Enter Meter Read(Off Peak)
		action_obj.Meter_Read_O().sendKeys("200");
		Thread.sleep(1000);
		//Enter Meter Read(Shoulder)
		action_obj.Meter_Read_S().sendKeys("300");
		Thread.sleep(1000);
		//Click on Save button
		action_obj.Save().click();

		Thread.sleep(5000);

		//Click on Add Reads
		action_obj.Add_Read().click();

		//Select Meter No
		Select meterno2 = new Select(action_obj.Meter_No());
		meterno2.selectByVisibleText("METER" + random);
		Thread.sleep(3000);

		//Select Read Type
		Select readtype2 = new Select(action_obj.readType());
		readtype2.selectByVisibleText("Actual Read");
		Thread.sleep(5000);

		//Open Read Date Datepicker
		action_obj.Read_Date().click();
		Thread.sleep(1000);
		//Select Today Date
		action_obj.SelectToday().click();
		Thread.sleep(1000);


		executor.executeScript("window,scrollBy(0,1800)", "");


		//Enter Meter Read(Peak)
		action_obj.Meter_Read_P().sendKeys("200");
		Thread.sleep(1000);	

		//Enter Meter Read(Off Peak)
		action_obj.Meter_Read_O().sendKeys("400");
		Thread.sleep(1000);	
		//Enter Meter Read(Shoulder)
		action_obj.Meter_Read_S().sendKeys("650");

		//Click on Save button
		action_obj.Save().click();
		Thread.sleep(1000);

		executor.executeScript("window,scrollBy(0,-1800)", "");

		//Thread.sleep(96987);


	}




	@Test(priority=5)
	public void Bill_Run_Without_Selecting_Cycle() throws Exception{
		extentTest = extent.startTest("Bill_Run_Without_Selecting_Cycle");

		action_obj = new Repo_testing(driver);
		Assertion_obj = new Assertion_Test(driver);
		executor = (JavascriptExecutor) driver;
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//Click on Bill Run tab
		action_obj.Bill_Run().click();

		//Click on Run the Bills
		action_obj.Run_The_Bills().click();
		Thread.sleep(1000);

		//Click on Start Date
		action_obj.Start_Date().click();
		Thread.sleep(1000);

		//Select Date
		//action_obj.TodayDate().click();
		action_obj.First_Day().click();
		Thread.sleep(1000);

		//Click on End Date
		action_obj.End_Date().click();
		Thread.sleep(1000);

		//Select Date
		action_obj.TodayDate().click();
		//action_obj.Last_Day().click();
		Thread.sleep(1000);

		//Click on Issue Date
		action_obj.Issue_Date().click();
		Thread.sleep(1000);

		//Select Date
		//action_obj.TodayDate().click();
		action_obj.Last_Day().click();
		Thread.sleep(3000);

		//Select Today Date
		action_obj.Due_Date().click();
		Thread.sleep(2000);

		//Select Date
	    //action_obj.TodayDate().click();
		//action_obj.Last_Day().click();
		action_obj.New_Day().click();
		Thread.sleep(2000);

		//Select Bill Run Cycle
		//Select billruncycle = new Select(action_obj.Bill_Run_Cycle());
		//billruncycle.selectByVisibleText("Bill"+ random);
		//billruncycle.selectByVisibleText("newa");
		//	Thread.sleep(5000);


		//Click on Run Bill button
		action_obj.Run_Bill().click();
		Thread.sleep(35000);
		
		//Assert Process All Customers popup
	    Assertion_obj.Assertion_Process_All_Customers();
	    Thread.sleep(1000);
	    
	    //Click on continue button
	    action_obj.Continue_Button().click();
	    Thread.sleep(11000);
		
		
		//Assert completion of Bill Run
		Assertion_obj.Assert_Success_Bill_Run();
		Thread.sleep(1000);

		//Click on View Button
		//action_obj.View_Bill_Run_Statement().click();
		//Thread.sleep(1000);
	
		//Thread.sleep(82678);

	}
	
	
	
	/*@AfterTest
	public void Teardown(){

	    driver.close();

	}

	 */





}
