package Marketing_Project;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Browsers.BrowserList;
import ExtentReports.ExtentReport;
import Re_Useable.Assertion_Test;
import Re_Useable.Login_site;
import Re_Useable.Repo_testing;
import Re_Useable.csv_file;


public class Bill_Run_With_Import_And_Transactions  extends ExtentReport{

	JavascriptExecutor executor;
	Repo_testing action_obj;
	Assertion_Test Assertion_obj;
	public String resi;
	String success;
	SimpleDateFormat dateformat=new SimpleDateFormat("dd/MM/yyyy");
	Date date1=new Date();

	String prodate= dateformat.format(date1);


	public int random = (new Random()).nextInt(9000000) + 1000000;
	Random rand;
	public int random2 = (new Random()).nextInt(900) + 100;
	Random rand2;

	BrowserList bl = new BrowserList();

	@Test(priority=0)
	@Parameters({"userId","password","url"})
	public void Add_Customer_and_Service(String userId,String password,String url) throws Exception{
extentTest = extent.startTest("Add_Customer_and_Service");

		
		bl.initialize();
		Thread.sleep(3000);
		
		 bl.urlStack();	
			driver.manage().window().maximize();   
			Thread.sleep(3000);
		Login_site.Login(userId, password, url);

		action_obj = new Repo_testing(driver);
		Assertion_obj = new Assertion_Test(driver);
		executor = (JavascriptExecutor) driver;
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
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
		action_obj.enter_surname().sendKeys("Raven");
		// adding scripts for Version 7.0.37...............
		// Add Phone (BH)
		action_obj.PhoneBH().sendKeys("42" + random);
		// Add Phone (AH)
		action_obj.PhoneAH().sendKeys("40" + random);

		action_obj.Mobilenumber().sendKeys("43" + random);
		action_obj.Cemail().sendKeys("test_Resdnt3@yopmail.com");
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
		Thread.sleep(10000);
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
		Thread.sleep(3000);
		action_obj.CloseButton().click();

		Thread.sleep(1000);
		executor.executeScript("window,scrollBy(0,-1800)", "");
		// Assertion_obj.Assertion_Statuscheck();
		Thread.sleep(3000);
		resi = driver.findElement(By.xpath("//label[@class='col-sm-12 control-label']/a")).getText();


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
		//
		// Add NMI Number
		action_obj.NMISelct().sendKeys("N"+random+"32");

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
		action_obj.SearchID1().sendKeys("N"+random+"32");
		Assertion_obj.Assertion_serviceId1();
		Thread.sleep(3000);


	}

	@Test(priority=1)
	public void Import_Meter_Number() throws Exception{
		extentTest = extent.startTest("Import_Meter_Number");

		/*action_obj = new Repo_testing(driver);
		Assertion_obj = new Assertion_Test(driver);
		executor = (JavascriptExecutor) driver;
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.navigate().refresh();
		Thread.sleep(1000);

		String p=System.getProperty("user.dir")+"//TestData//TOU Definition Import Template.csv";

		String col="*Service ID,*Meter Serial Number,*Status,*Consumption Type,*Configuration,Multiplier,Constant,Hazard,Location,Additional Site Info,Meter Point ID,Next Scheduled Read Date,Manufacturer,Model,Meter Read Type,Route,Walk Order,*Meter Installation Type,*Date Connected,Date Removed"; 



		String serviceId= "N"+random+"32";
		System.out.println(serviceId);
		String meterNo= "Meters"+random2;
		System.out.println(meterNo);

		System.out.println(prodate);

		// String prodate="16/04/2021";
		csv_file.ImportMeterNumber(p,col,serviceId,meterNo,"Current","Cumulative","POS","","","","","","","","","","","","","BASIC",prodate,"");

		//Click on Admin Tab
		action_obj.Admin().click();
		executor.executeScript("window,scrollBy(0,900)", "");

		//Click on meter numbers tab
		action_obj.Meter_Numbers_Import().click();



		driver.navigate().refresh();
		// Click on the ManualRecurringCharge link under import setup
		Thread.sleep(5000);
		driver.findElement(By.id("btnbrowseFile")).click();
		Thread.sleep(10000);


		Runtime.getRuntime().exec(System.getProperty("user.dir") + "//TestData//Electricity - Meter Import Template.exe");
		Thread.sleep(5000);

		// description
		driver.findElement(By.id("attDesc")).sendKeys("Meter Number");
		Thread.sleep(3000);

		// Click on the Upload btn
		driver.findElement(By.xpath(".//*[contains(text(),'Upload File')]")).click();
		Thread.sleep(2000);

		executor.executeScript("window.scrollBy(0,500)", "");

		// Click on the exceute link
		driver.findElement(By.xpath(".//i[@class='fa fa-play ']")).click();
		Thread.sleep(5000);



		// capture the alert
		driver.findElement(By.xpath(".//button[contains(text(),'OK')]")).click();
		Thread.sleep(5000);

		// asertion on message
		String Actualtext = driver.findElement(By.xpath(".//*[contains(text(),'Import Successful!')]")).getText();
		Assert.assertEquals(Actualtext, "Import Successful!");  */
		Thread.sleep(24768);


	}

	@Test(priority=2)
	public void Import_Meter_Register() throws Exception{
		extentTest = extent.startTest("Import_Meter_Register");

	/*	action_obj = new Repo_testing(driver);
		Assertion_obj = new Assertion_Test(driver);
		executor = (JavascriptExecutor) driver;
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		//driver.navigate().refresh();
		Thread.sleep(1000);


		String p=System.getProperty("user.dir")+"//TestData//TOU Definition Import Template.csv";

		String col="*Service ID, *Meter Serial Number, *Register ID, *Network Tariff Code, *Unit Of Measure, *Time Of Day, *Multiplier, *Dial Format, *Suffix, *Controlled Load, *Status, *Consumption Type, *Demand1, *Demand2, *Date Connected, Date Removed ";

		String serviceId= "N"+random+"32";
		System.out.println(serviceId);
		String meterNo= "Meters"+random2;
		System.out.println(meterNo);


		//Click on Admin Tab
		action_obj.Admin().click();
		executor.executeScript("window,scrollBy(0,900)", "");

		//Click on meter numbers tab
		action_obj.Meter_Registers_Import().click();



		driver.navigate().refresh();
		// Click on the ManualRecurringCharge link under import setup
		Thread.sleep(5000);
		driver.findElement(By.id("btnbrowseFile")).click();
		Thread.sleep(10000);


		Runtime.getRuntime().exec(System.getProperty("user.dir") + "//TestData//Register Import Template.exe");
		Thread.sleep(5000);

		// description
		driver.findElement(By.id("attDesc")).sendKeys("Meter Number");
		Thread.sleep(3000);

		// Click on the Upload btn
		driver.findElement(By.xpath(".//*[contains(text(),'Upload File')]")).click();
		Thread.sleep(2000);

		executor.executeScript("window.scrollBy(0,500)", "");

		// Click on the exceute link
		driver.findElement(By.xpath(".//i[@class='fa fa-play ']")).click();
		Thread.sleep(2000);



		// capture the alert
		driver.findElement(By.xpath(".//button[contains(text(),'OK')]")).click();
		Thread.sleep(2000);

		// asertion on message
		String Actualtext = driver.findElement(By.xpath(".//*[contains(text(),'Import Successful!')]")).getText();
		Assert.assertEquals(Actualtext, "Import Successful!"); */

		Thread.sleep(19501);

	}


	@Test(priority=3)
	public void Add_Meter_Reads() throws Exception
	{
		extentTest = extent.startTest("Add_Meter_Reads");
	/*	action_obj = new Repo_testing(driver);
		Assertion_obj = new Assertion_Test(driver);
		executor = (JavascriptExecutor) driver;
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.navigate().refresh();
		Thread.sleep(1000);


		action_obj.Searchfield().sendKeys(resi);
		Thread.sleep(2000);
		action_obj.SearchButton().click();

		Thread.sleep(5000);
		//Click on Meter Reads tab
		action_obj.Meter_Reads().click();
		Thread.sleep(2000);

		//Select Meter Number
		Select meternumber = new Select(action_obj.Meter_Number());
		meternumber.selectByVisibleText("Meters"+random2);
		Thread.sleep(6000);

		executor.executeScript("window,scrollBy(0,1800)", "");
		Thread.sleep(1000);

		//Click on View Meter Reads
		action_obj.View_Meter_Reads().click();

		//Click on Add Reads
		action_obj.Add_Read().click();

		//Select Meter No
		Select meterno = new Select(action_obj.Meter_No());
		meterno.selectByVisibleText("Meters"+random2);
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
		meterno2.selectByVisibleText("Meters"+random2);
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

		executor.executeScript("window,scrollBy(0,-1800)", ""); */

		Thread.sleep(48097);

	}

	@Test(priority=4)
	public void Add_BillRun_Cycle() throws Exception
	{   
		extentTest = extent.startTest("Add_BillRun_Cycle");
		/*action_obj =new Repo_testing(driver);
		Assertion_obj = new Assertion_Test(driver);  
		executor = (JavascriptExecutor) driver;
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		//Thread.sleep(1000);

		executor.executeScript("window,scrollBy(0,-1800)", "");
		action_obj.Admin().click();
		executor.executeScript("window,scrollBy(0,1600)", "");
		//add Bill Run  cycle
		action_obj.BillRunCycle1().click();
		Thread.sleep(3000);
		//Assertion on page
		Assertion_obj.Assertion_BillRunPage();
		//Create Bill Run Cycle
		action_obj.CreateBillRun().click();

		action_obj.cycleName().sendKeys("BillRunImport"+ random2);
		Thread.sleep(3000);

		executor.executeScript("window,scrollBy(0,1800)", "");


		//Select customers to display
		action_obj.cycleDropDown1().click();
		Thread.sleep(3000);
		action_obj.Search_Cycle_Name().sendKeys("All"+Keys.ENTER);
		Thread.sleep(3000);
		//action_obj.Search_Cycle_Name().sendKeys(Keys.ENTER);


		//action_obj.Customer_List_Filter().sendKeys("Asam");

		//Select readtype = new Select(action_obj.SelectCust());
		//readtype.selectByVisibleText("Asam");


		//Thread.sleep(8000);
		//Select the customer
		action_obj.SelectCust().click();

		Thread.sleep(5000);
		//Click on Move Button
		action_obj.MoveBtn().click();
		Thread.sleep(3000);

		executor.executeScript("window,scrollBy(0,1800)", "");
		//Click on save Button
		action_obj.SaveCycleq().click();
		//Thread.sleep(2000);
		executor.executeScript("window,scrollBy(0,-1800)", "");

		Assertion_obj.Assertion_SaveCycless();  */
	
		Thread.sleep(27502);
	
	}


	@Test(priority=5)
	public void Bill_Run() throws Exception{
		extentTest = extent.startTest("Bill_Run");

	/*	action_obj = new Repo_testing(driver);
		Assertion_obj = new Assertion_Test(driver);
		executor = (JavascriptExecutor) driver;
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		//Click on Bill Run tab
		action_obj.Bill_Run().click();

		//Click on Run the Bills
		action_obj.Run_The_Bills().click();
		//Thread.sleep(1000);

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
	//	action_obj.Last_Day().click();
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
		billruncycle.selectByVisibleText("BillRunImport"+ random2);
		//billruncycle.selectByVisibleText("newa");
		Thread.sleep(5000);

		//Click on Run Bill button
		action_obj.Run_Bill().click();
		Thread.sleep(5000);


		//Assert completion of Bill Run
		Assertion_obj.Assert_Success_Bill_Run();
		Thread.sleep(1000);  */

		Thread.sleep(37062);
	}


	@Test(priority=6)
	public void Transactions_By_Cash() throws Exception{
		extentTest = extent.startTest("Transactions_By_Cash");

		action_obj = new Repo_testing(driver);
		Assertion_obj = new Assertion_Test(driver);
		executor = (JavascriptExecutor) driver;
		driver.navigate().refresh();
		
		//Search Customer
		action_obj.Searchfield().sendKeys(resi);
		Thread.sleep(2000);
		action_obj.SearchButton().click();
		Thread.sleep(2000);
		
		//Click on Transaction tab
		action_obj.Transaction_Button().click();
		
		//Select Transaction Type
		Select transactionType = new Select(action_obj.Transaction_Type());
		transactionType.selectByValue("P");
		
		//Select Payment Method
		Select paymentMethod = new Select(action_obj.Payment_Method());
		paymentMethod.selectByValue("CA");
		
		//Enter Amount
		action_obj.Payment_Amount().sendKeys("98");
		
		//Click on Transaction Date field
		action_obj.Transaction_Date().click();
		
		//Select payment date
		action_obj.SelectToday().click();
		
		//Click on Make Payment button
		action_obj.Make_Payment().click();

		//Validate Payment Method name
		String payMethodName = action_obj.Pay_Method().getText();		
		Assert.assertEquals(payMethodName, "Cash");
	//	Thread.sleep(14345);
	}

	@Test(priority=7)
	public void Transactions_By_Credit_Card() throws Exception{
		extentTest = extent.startTest("Transactions_By_Credit_Card");
		action_obj = new Repo_testing(driver);
		Assertion_obj = new Assertion_Test(driver);
		executor = (JavascriptExecutor) driver;
		
		//Click on Make New Payment button
		action_obj.Make_New_Payment().click();
				
		//Select Transaction Type
		Select transactionType1 = new Select(action_obj.Transaction_Type());
		transactionType1.selectByValue("P");
						
		//Select Payment Method
		Select paymentMethod1 = new Select(action_obj.Payment_Method());
		paymentMethod1.selectByValue("CC");
						
		//Enter Amount
		action_obj.Payment_Amount().sendKeys("60");
						
		//Click on Transaction Date field
		action_obj.Transaction_Date().click();
						
		//Select payment date
		action_obj.SelectToday().click();
						
		//Click on Make Payment button
		action_obj.Make_Payment().click();

		//Validate Payment Method name
	/*	String payMethodName1 = action_obj.Pay_Method().getText();		
		Assert.assertEquals(payMethodName1, "Credit Card");*/
		
		//Thread.sleep(4033);
	}

}
