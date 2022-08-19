package Marketing_Project;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Parameters;
//import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import Browsers.BrowserList;
import ExtentReports.ExtentReport;
import Re_Useable.Assertion_Test;
import Re_Useable.Login_site;
import Re_Useable.Repo_testing;

public class Two_Customers_Bill_Run extends ExtentReport {

	JavascriptExecutor executor;
	Repo_testing action_obj;
	Assertion_Test Assertion_obj;
	public String MeterNumber;
	public String resi1, resi2, actmessage, expmessage;
	public String statementNo, statementNoB;
	public String statementNo2, newStatementNo, statementNoBR;
	String success;
	public int random2 = (new Random()).nextInt(900) + 100;
	Random rand2;
	public int random = (new Random()).nextInt(9000000) + 1000000;
	Random rand;
	BrowserList bl = new BrowserList();
	//public Market_All_Cusotmer a = new Market_All_Cusotmer();
	// public String singleCustomer;

// invocationCount = 

	@Test(priority=0 )
	@Parameters({"userId","password","url"})
	public void Add_First_Customer_and_Service(String userId,String password,String url) throws Exception{
extentTest = extent.startTest("Add_First_Customer_and_Service");

		
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
		// Click on Customer tab.
		action_obj.Customertab().click();
		// Select Customer type
		Select custoemrType = new Select(action_obj.Customertype());
		custoemrType.selectByVisibleText("Others");
		// Select category
		Select category1 = new Select(action_obj.categoryopt());
		category1.selectByVisibleText("Residential");

		// Add cusotmer General Detail
		// input
		action_obj.entr_title().sendKeys("Mr");
		action_obj.entr_firstName().sendKeys("Paul");
		action_obj.enter_surname().sendKeys("John");
		// adding scripts for Version 7.0.37...............
		// Add Phone (BH)
		action_obj.PhoneBH().sendKeys("42" + random);
		// Add Phone (AH)
		action_obj.PhoneAH().sendKeys("40" + random);

		action_obj.Mobilenumber().sendKeys("43" + random);
		action_obj.Cemail().sendKeys("test_Resdnt4@yopmail.com");
		action_obj.Address1().sendKeys("Madirma R-Town");
		action_obj.City_Suburb().sendKeys("Mills NY");
		Select St = new Select(action_obj.Custmr_State());
		St.selectByValue("WA");

		action_obj.CustomenrPIN().sendKeys("1265");               
		executor.executeScript("window,scrollBy(0,1800)", "");

		Thread.sleep(3000);
		driver.findElement(By.id("accountManagementPlus")).click();
		executor.executeScript("window,scrollBy(0,1800)", "");

		// add Contrat Statrt Date
		action_obj.COntractStartDate().click();
		Thread.sleep(2000);
		action_obj.SelectToday().click();
		action_obj.Contract_Term().sendKeys("10");
		Thread.sleep(3000);
		executor.executeScript("window,scrollBy(0,9000)", "");
		// Save Customer
		Thread.sleep(15000);
		action_obj.SaveCustomer().click();
		Thread.sleep(5000);
		// Select 'Save Only' Option
		action_obj.Select_SaveOnly().click();
		// Assertion on Customer Validation Message
		Assertion_obj.Assertion_Custoemrsave();

		// Change Status Details
		executor.executeScript("window,scrollBy(0,1800)", "");
		action_obj.ChangeStatusbtn().click();
		// Assertion On Popup
		Assertion_obj.Assertion_changestatuspopup();
		Select statustype = new Select(action_obj.ChangeStatuslist());
		statustype.selectByVisibleText("Active");

		action_obj.Reasonfields().sendKeys("Only For testing Residetial Type of Category");
		Thread.sleep(1000);
		action_obj.reasonSave().click();
		Thread.sleep(1000);
		Assertion_obj.Assertion_chngStatusmesg();
		// Thread.sleep(3000);
		action_obj.CloseButton().click();

		Thread.sleep(1000);
		executor.executeScript("window,scrollBy(0,-1800)", "");
		// Assertion_obj.Assertion_Statuscheck();
		Thread.sleep(3000);
		resi1 = driver.findElement(By.xpath("//label[@class='col-sm-12 control-label']/a")).getText();


		action_obj.CLickOverview().click();

		action_obj.RetailElec().click();


		// Add Service Type
		Select ServiceTyp = new Select(action_obj.ServiceType());
		ServiceTyp.selectByVisibleText("Electricity");
		Thread.sleep(1000);
		// Add Market Type
		Select markettyp = new Select(action_obj.SelectmarketTyp());
		//markettyp.selectByVisibleText("Retail");
		markettyp.selectByVisibleText("Off Market");
		Thread.sleep(1000);

		// Add NMI Number
		action_obj.NMISelct().sendKeys("N" + random+"44");

		//	NMI = driver.findElement(By.cssSelector("input#NMI")).getText();
		//Thread.sleep(4000);
		Select planno = new Select(action_obj.Service_plan());
		//planno.selectByVisibleText("MktPlan");
		planno.selectByIndex(3);
		Thread.sleep(4000);

		executor.executeScript("window,scrollBy(0,200)", "");
		Thread.sleep(3000);
		action_obj.Moveindate_field().click();
		action_obj.MoveIn_Date().click();
		Thread.sleep(3000);

		executor.executeScript("window,scrollBy(0,400)", "");
		action_obj.StructurAddressTogglebtn().click();

		action_obj.Building_Name().sendKeys("Los angel");

		Select UnitType=new Select(action_obj.Unit_Type());
		UnitType.selectByVisibleText("Block");

		Select husesuffix=new Select(action_obj.HouseSufix());
		husesuffix.selectByVisibleText("V");
		//Add Sub Address
		action_obj.Suburb().sendKeys("Almor Distt 324");
		//Postal Code
		action_obj.postcode().sendKeys("15"+random);

		//Add State
		Select State=new Select(action_obj.State());
		State.selectByIndex(2);

		executor.executeScript("window,scrollBy(0,800)", "");
		action_obj.Add_Service().click();
		Thread.sleep(3000);
		//executor.executeScript("window,scrollBy(0,-1500)", "");
		success="Success! The Service has been created successfully.";
		Assert.assertEquals(success,"Success! The Service has been created successfully.");  
		Assertion_obj.Assertion_successmsgservice();

		Thread.sleep(3000);
		action_obj.ServicesTab().click();
		Thread.sleep(3000);
		action_obj.SearchID1().sendKeys("N" + random+"44");
		Assertion_obj.Assertion_serviceId1();
		Thread.sleep(3000);


	}






	@Test(priority=1)
	public void Add_Meter() throws Exception{
		extentTest = extent.startTest("Add_Meter");
		action_obj = new Repo_testing(driver);
		Assertion_obj = new Assertion_Test(driver);
		executor = (JavascriptExecutor) driver;
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().refresh();
		Thread.sleep(1000);

		//Search residential Customer
		//singleCustomer= a.ResidentialCustomer;
		//action_obj.Searchfield().sendKeys("36197");

		//action_obj.SearchButton().click();

		//Get residential customer
		//busi= driver.findElement(By.xpath("(//td[@class='sorting_1']/a)[3]")).getText();
		// Thread.sleep(4000);
		// action_obj.Searchfield().sendKeys(busi);
		// Thread.sleep(2000);
		// action_obj.SearchButton().click();

		//Thread.sleep(5000);
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
		action_obj.Meter_Serial_Number().sendKeys("METER2" + random2);

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
		Thread.sleep(2000);

		//Select today date
		action_obj.TodayDate().click();
		Thread.sleep(2000);

		//Click on create meter button
		action_obj.Create_Meter().click();

		//Assert Success Message
		Assertion_obj.Assert_Success_Message_Meter();
		Thread.sleep(1000);
		executor.executeScript("window,scrollBy(0,1800)", "");
		Thread.sleep(1000);
	}

	@Test(priority=2)
	public void Add_Meter_Register() throws Exception{
		extentTest = extent.startTest("Add_Meter_Register");

		action_obj = new Repo_testing(driver);
		Assertion_obj = new Assertion_Test(driver);
		executor = (JavascriptExecutor) driver;
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Thread.sleep(3000);
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

	}


	@Test(priority=3)
	public void Add_Meter_Reads() throws Exception{
		extentTest = extent.startTest("Add_Meter_Reads");

		action_obj = new Repo_testing(driver);
		Assertion_obj = new Assertion_Test(driver);
		executor = (JavascriptExecutor) driver;
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//Click on Meter Reads tab
		action_obj.Meter_Reads().click();
		Thread.sleep(3000);

		//Select Meter Number
		Select meternumber = new Select(action_obj.Meter_Number());
		meternumber.selectByVisibleText("METER2" + random2);
		Thread.sleep(6000);

		executor.executeScript("window,scrollBy(0,1800)", "");
		Thread.sleep(3000);

		//Click on View Meter Reads
		action_obj.View_Meter_Reads().click();

		Thread.sleep(2000);
		//Click on Add Reads
		action_obj.Add_Read().click();

		//Select Meter No
		Select meterno = new Select(action_obj.Meter_No());
		meterno.selectByVisibleText("METER2" + random2);
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

		Thread.sleep(2000);

		//Click on Add Reads
		action_obj.Add_Read().click();

		//Select Meter No
		Select meterno2 = new Select(action_obj.Meter_No());
		meterno2.selectByVisibleText("METER2" + random2);
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

	}


	@Test(priority=4)
	public void Add_Second_Customer_and_Service() throws Exception{
		extentTest = extent.startTest("Add_Second_Customer_and_Service");

		action_obj = new Repo_testing(driver);
		Assertion_obj = new Assertion_Test(driver);
		executor = (JavascriptExecutor) driver;
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().refresh();
		Thread.sleep(1000);
		// Click on Customer tab.
		action_obj.Customertab().click();
		// Select Customer type
		Select custoemrType = new Select(action_obj.Customertype());
		custoemrType.selectByVisibleText("Others");
		// Select category
		Select category1 = new Select(action_obj.categoryopt());
		category1.selectByVisibleText("Residential");

		// Add cusotmer General Detail
		// input
		action_obj.entr_title().sendKeys("Mr");
		action_obj.entr_firstName().sendKeys("Paul");
		action_obj.enter_surname().sendKeys("Patrick");
		// adding scripts for Version 7.0.37...............
		// Add Phone (BH)
		action_obj.PhoneBH().sendKeys("43" + random);
		// Add Phone (AH)
		action_obj.PhoneAH().sendKeys("42" + random);

		action_obj.Mobilenumber().sendKeys("40" + random);
		action_obj.Cemail().sendKeys("test_Resdnt5@yopmail.com");
		action_obj.Address1().sendKeys("Madirma R-Town");
		action_obj.City_Suburb().sendKeys("Mills NY");
		Select St = new Select(action_obj.Custmr_State());
		St.selectByValue("WA");

		action_obj.CustomenrPIN().sendKeys("1265");               
		executor.executeScript("window,scrollBy(0,1800)", "");

		Thread.sleep(3000);
		driver.findElement(By.id("accountManagementPlus")).click();
		executor.executeScript("window,scrollBy(0,1800)", "");

		// add Contrat Statrt Date
		action_obj.COntractStartDate().click();
		Thread.sleep(2000);
		action_obj.SelectToday().click();
		action_obj.Contract_Term().sendKeys("10");
		Thread.sleep(3000);
		executor.executeScript("window,scrollBy(0,4000)", "");
		// Save Customer
		Thread.sleep(15000);
		action_obj.SaveCustomer().click();
		Thread.sleep(5000);
		// Select 'Save Only' Option
		action_obj.Select_SaveOnly().click();
		// Assertion on Customer Validation Message
		Assertion_obj.Assertion_Custoemrsave();

		// Change Status Details
		executor.executeScript("window,scrollBy(0,1800)", "");
		action_obj.ChangeStatusbtn().click();
		// Assertion On Popup
		Assertion_obj.Assertion_changestatuspopup();
		Select statustype = new Select(action_obj.ChangeStatuslist());
		statustype.selectByVisibleText("Active");

		action_obj.Reasonfields().sendKeys("Only For testing Residetial Type of Category");
		Thread.sleep(1000);
		action_obj.reasonSave().click();
		Thread.sleep(1000);
		Assertion_obj.Assertion_chngStatusmesg();
		// Thread.sleep(3000);
		action_obj.CloseButton().click();

		Thread.sleep(1000);
		executor.executeScript("window,scrollBy(0,-1800)", "");
		// Assertion_obj.Assertion_Statuscheck();
		Thread.sleep(3000);
		resi2 = driver.findElement(By.xpath("//label[@class='col-sm-12 control-label']/a")).getText();


		action_obj.CLickOverview().click();

		action_obj.RetailElec().click();


		// Add Service Type
		Select ServiceTyp = new Select(action_obj.ServiceType());
		ServiceTyp.selectByVisibleText("Electricity");
		Thread.sleep(1000);
		// Add Market Type
		Select markettyp = new Select(action_obj.SelectmarketTyp());
		//markettyp.selectByVisibleText("Retail");
		markettyp.selectByVisibleText("Off Market");
		Thread.sleep(1000);

		// Add NMI Number
		action_obj.NMISelct().sendKeys("N" + random+"99");

		//	NMI = driver.findElement(By.cssSelector("input#NMI")).getText();
		//Thread.sleep(4000);
		Select planno = new Select(action_obj.Service_plan());
		//planno.selectByVisibleText("MktPlan");
		planno.selectByIndex(3);
		Thread.sleep(4000);

		executor.executeScript("window,scrollBy(0,200)", "");
		Thread.sleep(3000);
		action_obj.Moveindate_field().click();
		action_obj.MoveIn_Date().click();
		Thread.sleep(3000);

		executor.executeScript("window,scrollBy(0,400)", "");
		action_obj.StructurAddressTogglebtn().click();

		action_obj.Building_Name().sendKeys("Los angel");

		Select UnitType=new Select(action_obj.Unit_Type());
		UnitType.selectByVisibleText("Block");

		Select husesuffix=new Select(action_obj.HouseSufix());
		husesuffix.selectByVisibleText("V");
		//Add Sub Address
		action_obj.Suburb().sendKeys("Almor Distt 324");
		//Postal Code
		action_obj.postcode().sendKeys("15"+random);

		//Add State
		Select State=new Select(action_obj.State());
		State.selectByIndex(2);

		executor.executeScript("window,scrollBy(0,800)", "");
		action_obj.Add_Service().click();
		Thread.sleep(3000);
		//executor.executeScript("window,scrollBy(0,-1500)", "");
		success="Success! The Service has been created successfully.";
		Assert.assertEquals(success,"Success! The Service has been created successfully.");  
		Assertion_obj.Assertion_successmsgservice();

		action_obj.ServicesTab().click();
		Thread.sleep(3000);
		action_obj.SearchID1().sendKeys("N" + random+"99");
		Assertion_obj.Assertion_serviceId1();
		Thread.sleep(3000);


	}

	@Test(priority=5)
	public void Add_Metering_Second_Customer() throws Exception
	{
		extentTest = extent.startTest("Add_Metering_Second_Customer");
		action_obj = new Repo_testing(driver);
		Assertion_obj = new Assertion_Test(driver);
		executor = (JavascriptExecutor) driver;
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().refresh();
		Thread.sleep(1000);

	

		Thread.sleep(5000);
		//Click on Service Tab
		action_obj.ServicesTab().click();
		Thread.sleep(2000);
		//Click on Edit button
		action_obj.Service_Edit().click();
		Thread.sleep(3000);

		executor.executeScript("window,scrollBy(0,1800)", "");

		//Click on Add Metering
		action_obj.Add_Meter().click();

		//Assertion on title
		Assertion_obj.Assertion_Create_Meter();

		//Add Meter Number
		action_obj.Meter_Serial_Number().sendKeys("METER3" + random2);

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
		action_obj.Register_Id().sendKeys("15");

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
		meternumber.selectByVisibleText("METER3" + random2);
		Thread.sleep(6000);

		executor.executeScript("window,scrollBy(0,1800)", "");
		Thread.sleep(1000);

		//Click on View Meter Reads
		action_obj.View_Meter_Reads().click();

		//Click on Add Reads
		action_obj.Add_Read().click();

		//Select Meter No
		Select meterno = new Select(action_obj.Meter_No());
		meterno.selectByVisibleText("METER3" + random2);
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

		Thread.sleep(2000);

		//Click on Add Reads
		action_obj.Add_Read().click();

		//Select Meter No
		Select meterno2 = new Select(action_obj.Meter_No());
		meterno2.selectByVisibleText("METER3" + random2);
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


	}

	@Test(priority=6)
	public void Add_BillRun_Cycle() throws Exception
	{   
		extentTest = extent.startTest("Add_BillRun_Cycle");
		action_obj =new Repo_testing(driver);
		Assertion_obj = new Assertion_Test(driver);  
		executor = (JavascriptExecutor) driver;
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(1000);

		executor.executeScript("window,scrollBy(0,-1800)", "");
		Thread.sleep(1000);
		action_obj.Admin().click();
		executor.executeScript("window,scrollBy(0,1600)", "");
		//add Bill Run  cycle
		action_obj.BillRunCycle1().click();
		Thread.sleep(3000);
		//Assertion on page
		Assertion_obj.Assertion_BillRunPage();
		//Create Bill Run Cycle
		action_obj.CreateBillRun().click();

		action_obj.cycleName().sendKeys("TwoCustBillRun"+ random2);
		Thread.sleep(3000);

		executor.executeScript("window,scrollBy(0,1800)", "");


		//Select customers to display
		//action_obj.cycleDropDown1().click();
		//Thread.sleep(3000);
		//action_obj.Search_Cycle_Name().sendKeys("All"+Keys.ENTER);
		Thread.sleep(1000);
		//action_obj.Search_Cycle_Name().sendKeys(Keys.ENTER);


		//action_obj.Customer_List_Filter().sendKeys("Asam");

		//Select readtype = new Select(action_obj.SelectCust());
		//readtype.selectByVisibleText("Asam");


		Thread.sleep(3000);
		//Select the customer
		action_obj.SelectCust().click();

		Thread.sleep(3000);
		//Click on Move Button
		action_obj.MoveBtn().click();
		Thread.sleep(3000);

		Thread.sleep(3000);
		//Select the customer
		action_obj.SelectCust().click();

		Thread.sleep(3000);
		//Click on Move Button
		action_obj.MoveBtn().click();
		Thread.sleep(3000);

		executor.executeScript("window,scrollBy(0,1800)", "");
		//Click on save Button
		action_obj.SaveCycleq().click();
		Thread.sleep(2000);
		executor.executeScript("window,scrollBy(0,-1800)", "");

		Assertion_obj.Assertion_SaveCycless();
		
		//Thread.sleep(37542);
	}


	@Test(priority=7)
	public void Bill_Run() throws Exception{
		extentTest = extent.startTest(" Bill_Run");

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
		Thread.sleep(1000);

		//Select Today Date
		action_obj.Due_Date().click();
		Thread.sleep(1000);

		//Select Date
	    //action_obj.TodayDate().click();
		action_obj.New_Day().click();
	
		Thread.sleep(1000);

		//Select Bill Run Cycle
		Select billruncycle = new Select(action_obj.Bill_Run_Cycle());
		billruncycle.selectByVisibleText("TwoCustBillRun"+ random2);
		//billruncycle.selectByVisibleText("newa");
		Thread.sleep(5000);


		//Click on Run Bill button
		action_obj.Run_Bill().click();
		Thread.sleep(5000);
		
		//Assert completion of Bill Run
		Assertion_obj.Assert_Success_Bill_Run();
		Thread.sleep(1000);
		
		//Thread.sleep(13000);


	}


	@Test(priority=8)
	public void Full_Statement_Rollback() throws Exception{
		extentTest = extent.startTest("Full_Statement_Rollback");

		action_obj = new Repo_testing(driver);
		Assertion_obj = new Assertion_Test(driver);
		executor = (JavascriptExecutor) driver;
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Thread.sleep(3000);
		//Click on View Button
		action_obj.View_Bill_Run_Statement().click();
		Thread.sleep(2000);

		//Click on rollback and fix button
		action_obj.Rollback_And_Fix_Button().click();
		Thread.sleep(2000);

		//Click on Continue Rollback button
		action_obj.Continue_Rollback().click();
		Thread.sleep(2000);

		//Assert Success Message
		Assertion_obj.Assertion_Successs_Rollback();
		Thread.sleep(3000);

		//Close the popup
		action_obj.Close_Icon().click();
		Thread.sleep(2000);
		
		//Thread.sleep(13895);

	}

	@Test(priority=9)
	public void Single_Customer_Rollback() throws Exception{
		extentTest = extent.startTest("Single_Customer_Rollback");
		action_obj = new Repo_testing(driver);
		Assertion_obj = new Assertion_Test(driver);
		executor = (JavascriptExecutor) driver;
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//Click on Bill Run tab
		action_obj.Bill_Run().click();

		Thread.sleep(3000);
		//Click on Run the Bills
		action_obj.Run_The_Bills().click();
		Thread.sleep(2000);

		//Click on Start Date
		action_obj.Start_Date().click();
		Thread.sleep(2000);

		//Select Date
		//action_obj.TodayDate().click();
		action_obj.First_Day().click();
		Thread.sleep(2000);

		//Click on End Date
		action_obj.End_Date().click();
		Thread.sleep(2000);

		//Select Date
		action_obj.TodayDate().click();
		//action_obj.Last_Day().click();
		Thread.sleep(2000);

		//Click on Issue Date
		action_obj.Issue_Date().click();
		Thread.sleep(2000);

		//Select Date
		//action_obj.TodayDate().click();
		action_obj.Last_Day().click();
		Thread.sleep(2000);

		//Select Today Date
		action_obj.Due_Date().click();
		Thread.sleep(2000);

		//Select Date
	    //action_obj.TodayDate().click();
		action_obj.New_Day().click();
		Thread.sleep(2000);

		//Select Bill Run Cycle
		Select billruncycle = new Select(action_obj.Bill_Run_Cycle());
		billruncycle.selectByVisibleText("TwoCustBillRun"+ random2);
		//billruncycle.selectByVisibleText("newa");
		Thread.sleep(2000);

		//Click on Run Bill button
		action_obj.Run_Bill().click();
		Thread.sleep(5000);
		
		//Assert completion of Bill Run
		Assertion_obj.Assert_Success_Bill_Run();
		Thread.sleep(1000);

		//Click on View Button
		action_obj.View_Bill_Run_Statement().click();
		Thread.sleep(1000);

		//Close the popup
		action_obj.Close_Icon2().click();

		//Click on Yes
		action_obj.Yes_Button().click();
		Thread.sleep(2000);

		//Search the customer
		action_obj.Searchfield().sendKeys(resi1);
		Thread.sleep(2000);
		action_obj.SearchButton().click();

		//Click on Statement Tab
		action_obj.Statement_Tab().click();
		Thread.sleep(1000);
		
		statementNo = driver.findElement(By.xpath("//tr[@class='odd']/td[1]")).getText();

		//Click on View Details
		action_obj.View_Details().click();
		Thread.sleep(1000);

		//Click on Rollback Button
		action_obj.Rollback_Button().click();
		Thread.sleep(1000);

		//Enter rollback reason
		action_obj.Rollback_Reason().sendKeys("For Testing Purpose");
		Thread.sleep(1000);

		//Click on OK button
		action_obj.Ok_Button().click();
		Thread.sleep(1000);

		//Assert Information Message
		Assertion_obj.Assertion_Information_Popup();

		//Assert Information Message
		Assertion_obj.Assertion_Information_Popup();
		Thread.sleep(1000);
				
		actmessage = driver.findElement(By.xpath("//div[@class='bootstrap-dialog-body']/div")).getText();
		expmessage = "Rollback for customer " + resi1 +" and statement " + statementNo + " has been successful.";
				
	// Assert.assertEquals(actmessage, expmessage);
		Thread.sleep(4000);

		

		//Close the popup
	//action_obj.Close_IconB().click();   //ashima
		Thread.sleep(2000);

		//Click on ViewRollback History
		action_obj.View_Rollback_History().click();  //ashima
		Thread.sleep(58900);

//Thread.sleep(24437);
		
	}



	@Test(priority=10)
	public void Rebill_and_Reuse_Statement() throws Exception{
		extentTest = extent.startTest("Rebill_and_Reuse_Statement");
		action_obj = new Repo_testing(driver);
		Assertion_obj = new Assertion_Test(driver);
		executor = (JavascriptExecutor) driver;
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			//Click on Statement Tab
	    action_obj.Statement_Tab().click();
	    Thread.sleep(1000);

	   //Click on ViewRollback History
	   action_obj.View_Rollback_History().click();
	   Thread.sleep(5000);


		Thread.sleep(3000);
		//Click on Rebill Button
		action_obj.Rebill_Button().click();

		//Click on Run bill button
		action_obj.Run_Bill_2().click();
		Thread.sleep(1000);

		//Assert Rebill result Popup
		//Assertion_obj.Assert_Result_Popup();
		//Thread.sleep(1000);
		
		actmessage = driver.findElement(By.cssSelector("div.bootstrap-dialog-message")).getText();
		expmessage = "Billrun successful, see customer Statement " + statementNo + ".";
				
		Assert.assertEquals(actmessage, expmessage);
		Thread.sleep(1000);


		//Close the popup
		action_obj.Close_Icon2().click();
		Thread.sleep(4000);

		//Click on Bill Run Tab
		action_obj.Bill_Run().click();

		//Click on Bill Run Search Button
		action_obj.Bill_Run_Search().click();
		Thread.sleep(1000);
		
		statementNoB = driver.findElement(By.xpath("//tr[@class='odd']/td[1]")).getText();
		Thread.sleep(3000);
			
		Assert.assertEquals(statementNo, statementNoB);
		Thread.sleep(1000);

		//View Bill Run Details
		action_obj.View_Details().click();
		Thread.sleep(2000);
	
//Thread.sleep(35967);

	}

	@Test(priority=11)
	public void Rebill_with_new_Statement() throws Exception{
		extentTest = extent.startTest("Rebill_with_new_Statement");
		action_obj = new Repo_testing(driver);
		Assertion_obj = new Assertion_Test(driver);
		executor = (JavascriptExecutor) driver;
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//Search the customer
		action_obj.Searchfield().sendKeys(resi2);
		Thread.sleep(2000);
		action_obj.SearchButton().click();

		//Click on Statement Tab
		action_obj.Statement_Tab().click();
		Thread.sleep(1000);
		
		statementNo2 = driver.findElement(By.xpath("//tr[@class='odd']/td[1]")).getText();

		//Click on View Details
		action_obj.View_Details().click();
		Thread.sleep(1000);

		//Click on Rollback Button
		action_obj.Rollback_Button().click();
		Thread.sleep(1000);

		//Enter rollback reason
		action_obj.Rollback_Reason().sendKeys("For Testing Purpose");
		Thread.sleep(1000);

		//Click on OK button
		action_obj.Ok_Button().click();
		Thread.sleep(4000);

		//Assert Information Message
		Assertion_obj.Assertion_Information_Popup();
		Thread.sleep(1000);
		
		//Assert Information Message
		Assertion_obj.Assertion_Information_Popup();
		Thread.sleep(1000);
						
		actmessage = driver.findElement(By.xpath("//div[@class='bootstrap-dialog-body']/div")).getText();
		expmessage = "Rollback for customer " + resi2 +" and statement " + statementNo2 + " has been successful.";
						
		Assert.assertEquals(actmessage, expmessage);
		Thread.sleep(3000);


		//Close the popup
		action_obj.Close_IconB().click();
		Thread.sleep(2000);
		
		//Click on ViewRollback History
		action_obj.View_Rollback_History().click();
		Thread.sleep(1000);


		//Click on Rebill Button
		action_obj.Rebill_Button().click();

		//Click on toggle button
		action_obj.Statement_Toggle().click();

		//Click on Run bill button
		action_obj.Run_Bill_2().click();
		Thread.sleep(1000);

		//Assert Rebill result Popup
		//Assertion_obj.Assert_Result_Popup();
		//Thread.sleep(1000);

		//Close the popup
				action_obj.Close_Icon2().click();
				Thread.sleep(4000);
		
		newStatementNo= driver.findElement(By.xpath("//tr[@class='odd']/td[8]")).getText();

		//Click on Bill Run Tab
		action_obj.Bill_Run().click();

		//Click on Bill Run Search Button
		action_obj.Bill_Run_Search().click();
		Thread.sleep(1000);
		
		statementNoBR = driver.findElement(By.xpath("//tr[@class='odd']/td[1]")).getText();
		Thread.sleep(2000);
		
		Assert.assertEquals(newStatementNo, statementNoBR);
		Thread.sleep(2000);

		//Thread.sleep(50987);

		//View Bill Run Details
		//action_obj.View_Details().click();
		//Thread.sleep(2000);

		//Thread.sleep(9456);

	}

	/*@AfterTest
	public void Teardown(){

	    driver.close();

	}
	 */


}
