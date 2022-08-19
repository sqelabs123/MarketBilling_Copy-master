package Marketing_Project;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Browsers.BrowserList;
import ExtentReports.ExtentReport;
import Re_Useable.Assertion_Test;
import Re_Useable.Login_site;
import Re_Useable.Repo_testing;

public class Market_All_Cusotmer extends ExtentReport {
	JavascriptExecutor executor;
	Repo_testing action_obj;
	Assertion_Test Assertion_obj;
	String success;
	String NMI;
	String serviceid;
	public String ResidentialCustomer ;
	public String BusinessCustomer;
	public String CommercialCustomer;
	public String ResidentialCustomer2;

	public int random = (new Random()).nextInt(9000000) + 1000000;
	Random rand;

	//public Market_All_Cusotmer b= new Market_All_Cusotmer();
	BrowserList bl = new BrowserList();
	@Test(priority = 0)
	@Parameters({"userId","password","url"})
	public void Customer_Type_Residential(String userId,String password,String url) throws Exception {
extentTest = extent.startTest("Customer_Type_Residential");

		
		bl.initialize();
		Thread.sleep(3000);
		
		 bl.urlStack();	
			driver.manage().window().maximize();   
			Thread.sleep(3000);
		// add Customer with Residental Category
			Login_site.Login(userId, password, url);
		action_obj = new Repo_testing(driver);
		Assertion_obj = new Assertion_Test(driver);
		executor = (JavascriptExecutor) driver;
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.navigate().refresh();
		Thread.sleep(1000);
		// Click on Customer tab.
		action_obj.Customertab().click();
		// Select Customer type
		Select custoemrType = new Select(action_obj.Customertype());
		custoemrType.selectByVisibleText("Tenant");
	
		// Select category
		Select category1 = new Select(action_obj.categoryopt());
		category1.selectByVisibleText("Residential");

		// Add cusotmer General Detail
		// input
		action_obj.entr_title().sendKeys("Mr");
		action_obj.entr_firstName().sendKeys("Babar");
		action_obj.enter_surname().sendKeys("Asam");
		// adding scripts for Version 7.0.37...............
		// Add Phone (BH)
		action_obj.PhoneBH().sendKeys("43" + random);
		// Add Phone (AH)
		action_obj.PhoneAH().sendKeys("42" + random);

		action_obj.Mobilenumber().sendKeys("40" + random);
		action_obj.Cemail().sendKeys("test_Resdnt2@yopmail.com");
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
		ResidentialCustomer = driver.findElement(By.xpath("//label[@class='col-sm-12 control-label']/a")).getText();

		//Customer = driver.findElement(By.xpath("html/body/div[5]/div/div[2]/div[2]/div[5]/form[1]/div/div/div[1]/div[2]/div[1]/label/a")).getText();
	}

	@Test(priority = 1)
	public void Customer_Type_Business() throws Exception {
		extentTest = extent.startTest("Customer_Type_Business");
		// Add Customer With Business type of Category under CUstomers
		action_obj = new Repo_testing(driver);
		Assertion_obj = new Assertion_Test(driver);
		executor = (JavascriptExecutor) driver;
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		//Thread.sleep(1000);
		// Click on Customer tab.
		action_obj.Customertab().click();
		// Select Customer type
		Select custoemrType = new Select(action_obj.Customertype());
		custoemrType.selectByVisibleText("Others");
		// Select category
		Select category1 = new Select(action_obj.categoryopt());
		category1.selectByVisibleText("Business");

		// Add Company/Business Details
		action_obj.BusinessCompany().sendKeys("FranklinCovey");
		// abn
		action_obj.CompnayABN().sendKeys("32165485216");
		Thread.sleep(1000);
		// Add cusotmer General Detail
		action_obj.entr_title().sendKeys("Dr.");
		action_obj.entr_firstName().sendKeys("Moien");
		action_obj.enter_surname().sendKeys("Alli");
		// adding scripts for Version 7.0.37...............
		// Add Phone (BH)
		action_obj.PhoneBH().sendKeys("41" + random);
		// Add Phone (AH)
		action_obj.PhoneAH().sendKeys("43" + random);

		action_obj.Mobilenumber().sendKeys("42" + random);
		action_obj.Cemail().sendKeys("testBusiness@yopmail.com");
		action_obj.Address1().sendKeys("Madirma B-Town");

		// For Version 7.0.37
		action_obj.City_Suburb().sendKeys("Saint Augustine,");
		Select St = new Select(action_obj.Custmr_State());
		St.selectByValue("TAS");
		action_obj.CustomenrPIN().sendKeys("6541");           
		executor.executeScript("window,scrollBy(0,4000)", "");
		// Contact Details > Authentication
		//Thread.sleep(2000);
		//

		//add Contrat Statrt Date action_obj.COntractStartDate().click();
		//Thread.sleep(2000); 
		//action_obj.SelectToday().click();
		//  action_obj.Contract_Term().sendKeys("10"); Thread.sleep(3000);


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

		action_obj.Reasonfields().sendKeys("Only For testing with Business Type of Category");
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
		BusinessCustomer = driver.findElement(By.xpath("//label[@class='col-sm-12 control-label']/a")).getText();		

	}

	@Test(priority = 2)
	public void Customer_Type_Commercial() throws Exception {
		extentTest = extent.startTest("Customer_Type_Commercial");
		action_obj = new Repo_testing(driver);
		Assertion_obj = new Assertion_Test(driver);
		executor = (JavascriptExecutor) driver;
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		//Thread.sleep(1000);
		// Click on Customer tab.
		action_obj.Customertab().click();
		// Select Customer type
		Select custoemrType = new Select(action_obj.Customertype());
		custoemrType.selectByVisibleText("Others");
		// Select category
		Select category1 = new Select(action_obj.categoryopt());
		category1.selectByVisibleText("Commercial");

		// Add Company Details under Commercial type pf category

		// add Company/Business Name
		action_obj.Companyname().sendKeys("Testing Company SQE");
		action_obj.ABN1().sendKeys("95623111254");

		executor.executeScript("window,scrollBy(0,400)", "");
		Thread.sleep(3000);
		Select title1 = new Select(driver.findElement(By.id("sal")));
		title1.selectByIndex(1);
		// action_obj.entr_Commerial_title().sendKeys("Dr.");
		// Select titleq1 =new Select(action_obj.entr_Commerial_title());
		// titleq1.deselectByValue("Dr.");
		action_obj.GivenName().sendKeys("Siyon");
		Thread.sleep(1000);
		action_obj.Sur_Name().sendKeys("mandis");

		// adding scripts for Version 7.0.37...............
		// Add Phone (BH)
		action_obj.PhoneBH().sendKeys("42" + random);
		// Add Phone (AH)
		action_obj.PhoneAH().sendKeys("41" + random);

		action_obj.Mobilenumber().sendKeys("43" + random);

		// action_obj.Phone_No().sendKeys("69525"+random);
		action_obj.Contact_Email1().sendKeys("testcommercial@yopmail.com");
		// Add cusotmer General Detail
		// action_obj.entr_firstName().sendKeys("Somiya");
		// action_obj.enter_surname().sendKeys("manik");
		// action_obj.Mobilenumber().sendKeys("786"+rand);
		// action_obj.Cemail().sendKeys("testcommercial@yopmail.com");

		Thread.sleep(2000);
		executor.executeScript("window,scrollBy(0,-1800)", "");
		action_obj.Address1().sendKeys("Madirma B-Town");

		// For Version 7.0.37
		action_obj.City_Suburb().sendKeys("Saint Augustine,");

		Select St = new Select(action_obj.Custmr_State());
		St.selectByValue("QLD");
		action_obj.CustomenrPIN().sendKeys("3546");   
		Thread.sleep(1000);
		executor.executeScript("window,scrollBy(0,2000)", "");
		Thread.sleep(2000);
		action_obj.StartContract().click();
		action_obj.TodayDate().click();
		Thread.sleep(1000);
		action_obj.Contract_TEam().sendKeys("10");

		executor.executeScript("window,scrollBy(0,4000)", "");
		// Save Customer
		Thread.sleep(5000);
		action_obj.SaveCustomer().click();
		Thread.sleep(5000);
		// Select 'Save Only' Option
		action_obj.Select_SaveOnly().click();
		// Assertion on Customer Validation Message
		Assertion_obj.Assertion_Custoemrsave();
		Thread.sleep(3000);
		// Change Status Details
		executor.executeScript("window,scrollBy(0,3000)", "");
		Thread.sleep(5000);
		action_obj.ChangeStatusbtn().click();
		// Assertion On Popup
		Assertion_obj.Assertion_changestatuspopup();
		Select statustype = new Select(action_obj.ChangeStatuslist());
		statustype.selectByVisibleText("Active");

		action_obj.Reasonfields().sendKeys("Only For testing with Commercial Type of Category");
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
		CommercialCustomer = driver.findElement(By.xpath("//label[@class='col-sm-12 control-label']/a")).getText();



	}

	@Test(priority = 3)
	public void Add_Provisional_Service() throws Exception {
		extentTest = extent.startTest("Provisional_Service");
		action_obj = new Repo_testing(driver);
		Assertion_obj = new Assertion_Test(driver);
		executor = (JavascriptExecutor) driver;
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		// Search Customer From Search Option
		// Customer
		action_obj.Searchfield().sendKeys(ResidentialCustomer);
		//action_obj.Searchfield().sendKeys("36180");
		action_obj.SearchButton().click();

		action_obj.CLickOverview().click();

		action_obj.RetailElec().click();
		// Add Service Type
		Select ServiceTyp = new Select(action_obj.ServiceType());
		ServiceTyp.selectByVisibleText("Electricity");
		//Thread.sleep(5000);
		// Add Market Type
		Select markettyp = new Select(action_obj.SelectmarketTyp());
		//markettyp.selectByVisibleText("Retail");
		markettyp.selectByVisibleText("Off Market");
		Thread.sleep(1000);
		// Add transfer Type
		//Select transfertype = new Select(action_obj.Select_transcationtye());
		//transfertype.selectByVisibleText("Add New Connection");
		// transfertype.selectByVisibleText("Move-In Transfer");
		// Enter NMI
		//action_obj.NMISelct().sendKeys("MA" + random+"2");
		// Add NMI Number
		action_obj.NMISelct().sendKeys("N" + random+"11");
		Thread.sleep(2000);
		// Add NMI CheeckSUm
		//	action_obj.NMi_CheckSum().sendKeys("3");

		//Thread.sleep(10000);
		// Add NMi Classification Code
		//	action_obj.NMIClasscode().sendKeys("SMALL");

		//Generate Virtual NMI
		//action_obj.generate_Virtual_NMI().click();
		//Thread.sleep(2000);
		//	NMI = driver.findElement(By.cssSelector("input#NMI")).getText();
		//NMI= action_obj.NMISelct().getText();
		Thread.sleep(5000);

		Select planno = new Select(action_obj.Service_plan());
		//planno.selectByVisibleText("MktPlan");
		planno.selectByIndex(3);
		Thread.sleep(5000);

		//planno.selectByVisibleText("MPlan_RetailRate994");
		// action_obj.SaleDate().click();
		// action_obj.Select_saleDate().click();
		executor.executeScript("window,scrollBy(0,200)", "");
		Thread.sleep(3000);
		//action_obj.Select_perposeDate().click();
		// action_obj.SaleDate().clear();
		// action_obj.SaleDate().sendKeys("10/02/2021" + Keys.ESCAPE);
		action_obj.Moveindate_field().click();
		action_obj.MoveIn_Date().click();
		Thread.sleep(2000);
		// action_obj.Purposcurrentdate().click();

		//Select transferread = new Select(action_obj.Transfer_Read_Type());
		//transferread.selectByValue("SP");
		//WebElement transferread1 = action_obj.Transfer_Read_Type();
		//transferread1.sendKeys("Special Read");
		///transferread1.click();
		executor.executeScript("window,scrollBy(0,400)", "");

		action_obj.StructurAddressTogglebtn().click();

		action_obj.Building_Name().sendKeys("Los angel");

		Select UnitType = new Select(action_obj.Unit_Type());
		UnitType.selectByVisibleText("Block");

		Select husesuffix = new Select(action_obj.HouseSufix());
		husesuffix.selectByVisibleText("V");
		// Add Sub Address
		action_obj.Suburb().sendKeys("Almor Distt 324");
		// Postal Code
		action_obj.postcode().sendKeys("15" + random);

		// Add State
		Select State = new Select(action_obj.State());
		State.selectByIndex(2);

		executor.executeScript("window,scrollBy(0,800)", "");
		Thread.sleep(2000);
		action_obj.Add_Service().click();
		// executor.executeScript("window,scrollBy(0,-1500)", "");
		Assertion_obj.Assertion_successmsgservice();
		String success = "Success! The Service has been created successfully.";
		Assert.assertEquals(success, "Success! The Service has been created successfully.");
		Thread.sleep(3000);
		// Assert.assertEquals(success, "Success! The Service has been created
		// successfully.");

		action_obj.ServicesTab().click();
		Thread.sleep(2000);
		//action_obj.SearchID1().sendKeys("MA" + random+"2"); 
		// Add NMI Number
		//action_obj.SearchID1().sendKeys("NMI4975768");
		//action_obj.SearchID1().sendKeys("NMI4975123");
		// Add NMI Number
		//serviceid = "NMI4975123";
		//serviceid = driver.findElement(By.cssSelector("td.sorting_1")).getText();
		//Assert.assertEquals(serviceid, "MA" + random+"2");
		action_obj.SearchID1().sendKeys("N" + random+"11");
		Assertion_obj.Assertion_serviceId1();
		// Add NMI Number
		//Assert.assertEquals(serviceid,"NMI4975123");
		// Assertion_obj.Assertion_serviceId();
		Thread.sleep(3000);
		// Service Edit
		action_obj.Service_Edit().click();
		
		//Assertion_obj.Assertion_pageEditService();   ///////////////////////////////////////////////////////////
		Thread.sleep(2000);
		executor.executeScript("window,scrollBy(0,200)", "");
		Select service = new Select(action_obj.Service_Status());
		service.selectByVisibleText("Connected");
		//service.selectByVisibleText("Pending Move-Out");
		executor.executeScript("window,scrollBy(0,3000)", "");
		action_obj.saveditserv().click();

		action_obj.OKbtn().click();

		action_obj.ServicesTab().click();

		//action_obj.SearchID1().sendKeys("MA" + random+"2");
		// Add NMI Number
		action_obj.SearchID1().sendKeys("N" + random+"11");
		//Assertion_obj.Assertion_serviceId();
	}

	@Test(priority=4)
	public void Add_Service_ND_Update() throws Exception
	{
		extentTest = extent.startTest("Add_Service_ND_Update");
		action_obj =new Repo_testing(driver);
		Assertion_obj = new Assertion_Test(driver);  
		executor = (JavascriptExecutor) driver;
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		action_obj.Searchfield().sendKeys(BusinessCustomer);
		action_obj.SearchButton().click();
		action_obj.CLickOverview().click();

		action_obj.RetailElec().click();


		// Add Service Type
		Select ServiceTyp = new Select(action_obj.ServiceType());
		ServiceTyp.selectByVisibleText("Electricity");
		//Thread.sleep(1000);
		// Add Market Type
		Select markettyp = new Select(action_obj.SelectmarketTyp());
		//markettyp.selectByVisibleText("Retail");
		markettyp.selectByVisibleText("Off Market");
		Thread.sleep(1000);
		// Add transfer Type
		//Select transfertype = new Select(action_obj.Select_transcationtye());
		//transfertype.selectByVisibleText("Move-In");
		// transfertype.selectByVisibleText("Move-In Transfer");
		// Enter NMI
		//action_obj.NMISelct().sendKeys("MA" + random + "3");

		// Add NMI Number
		action_obj.NMISelct().sendKeys("N" + random+"33");
		//Thread.sleep(2000);
		// Add NMI CheeckSUm
		//action_obj.NMi_CheckSum().sendKeys("8");
		//Thread.sleep(10000);// Add NMi Classification Code
		//action_obj.NMIClasscode().sendKeys("SMALL");
		//action_obj.generate_Virtual_NMI().click();
		//NMI = driver.findElement(By.cssSelector("input#NMI")).getText();
		Thread.sleep(4000);
		Select planno = new Select(action_obj.Service_plan());
		//planno.selectByVisibleText("MktPlan");
		planno.selectByIndex(3);
		Thread.sleep(3000);
		// planno.selectByVisibleText("MPlan_RetailRate994");
		//planno.selectByIndex(1);
		// action_obj.SaleDate().click();
		// action_obj.Select_saleDate().click();
		executor.executeScript("window,scrollBy(0,200)", "");
		Thread.sleep(3000);
		//action_obj.Select_perposeDate().sendKeys("07/02/2019" + Keys.ESCAPE);
		// action_obj.SaleDate().clear();
		// action_obj.SaleDate().sendKeys("10/02/2021"+ Keys.ESCAPE);
		action_obj.Moveindate_field().click();
		action_obj.MoveIn_Date().click();
		Thread.sleep(3000);
		// action_obj.Select_saleDate().click();
		//Thread.sleep(4000);
		// action_obj.Purposcurrentdate().click();

		/*
		 * Select transferread=new Select(action_obj.Transfer_Read_Type());
		 * transferread.selectByValue("SP"); WebElement
		 * transferread1=action_obj.Transfer_Read_Type();
		 * transferread1.sendKeys("Special Read"); transferread1.click();
		 */
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
		action_obj.SearchID1().sendKeys("N" + random+"33");
		Assertion_obj.Assertion_serviceId1();

		Thread.sleep(2000);
		//Service Edit 
		action_obj.Service_Edit().click();
	//	Assertion_obj.Assertion_pageEditService();

		Thread.sleep(1000);
		// Change Service Details  
		executor.executeScript("window,scrollBy(0,1800)", "");


		Thread.sleep(2000);
		//change Service Status
		Select service=new Select(action_obj.Service_Status());
		service.selectByVisibleText("Connected");
		//service.selectByVisibleText("Pending Move-Out");
		Thread.sleep(3000);
		executor.executeScript("window,scrollBy(0,600)", "");

		Thread.sleep(2000);
		Select netconfigration=new Select(action_obj.NettingConfg());
		netconfigration.selectByValue("NET_IE");

		Select Channelaggrigation=new Select(action_obj.SubChannelAggrigate1());
		Channelaggrigation.selectByValue("SUM");


	}


	@Test(priority=5)
	public void Update_service_Commercial() throws Exception
	{
		extentTest = extent.startTest("Update_service_Commercial");
		action_obj =new Repo_testing(driver);
		Assertion_obj = new Assertion_Test(driver);  
		executor = (JavascriptExecutor) driver;
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		action_obj.Searchfield().sendKeys(CommercialCustomer);
		action_obj.SearchButton().click();
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
		// Add transfer Type
		//Select transfertype = new Select(action_obj.Select_transcationtye());
		//transfertype.selectByVisibleText("Move-In");
		// transfertype.selectByVisibleText("Move-In Transfer");
		// Enter NMI
		//action_obj.NMISelct().sendKeys("MA" + random + "3");

		// Add NMI Number
		action_obj.NMISelct().sendKeys("N" + random+"44");
		//Thread.sleep(2000);
		// Add NMI CheeckSUm
		//action_obj.NMi_CheckSum().sendKeys("8");
		//Thread.sleep(10000);// Add NMi Classification Code
		//action_obj.NMIClasscode().sendKeys("SMALL");
		//action_obj.generate_Virtual_NMI().click();
		//NMI = driver.findElement(By.cssSelector("input#NMI")).getText();
		//Thread.sleep(4000);
		Select planno = new Select(action_obj.Service_plan());
		//planno.selectByVisibleText("MktPlan");
		planno.selectByIndex(3);
		Thread.sleep(4000);

		// planno.selectByVisibleText("MPlan_RetailRate994");
		//planno.selectByIndex(1);
		// action_obj.SaleDate().click();
		// action_obj.Select_saleDate().click();
		executor.executeScript("window,scrollBy(0,200)", "");
		Thread.sleep(3000);
		//action_obj.Select_perposeDate().sendKeys("07/02/2019" + Keys.ESCAPE);
		// action_obj.SaleDate().clear();
		// action_obj.SaleDate().sendKeys("10/02/2021"+ Keys.ESCAPE);
		action_obj.Moveindate_field().click();
		action_obj.MoveIn_Date().click();
		Thread.sleep(3000);
		// action_obj.Select_saleDate().click();
		//Thread.sleep(4000);
		// action_obj.Purposcurrentdate().click();

		/*
		 * Select transferread=new Select(action_obj.Transfer_Read_Type());
		 * transferread.selectByValue("SP"); WebElement
		 * transferread1=action_obj.Transfer_Read_Type();
		 * transferread1.sendKeys("Special Read"); transferread1.click();
		 */
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
		action_obj.SearchID1().sendKeys("N" + random+"44");
		Assertion_obj.Assertion_serviceId1();
		Thread.sleep(2000);

		
	}



}
