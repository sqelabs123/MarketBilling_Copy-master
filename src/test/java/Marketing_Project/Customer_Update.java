package Marketing_Project;

import java.io.IOException;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Browsers.BrowserList;
import ExtentReports.ExtentReport;
import Re_Useable.Assertion_Test;
import Re_Useable.Login_site;
import Re_Useable.Repo_testing;

public class Customer_Update extends ExtentReport {

	JavascriptExecutor executor;
	Repo_testing action_obj;
	Assertion_Test Assertion_obj;
	String servicesucess;
	public String Customer;
	public int random= (new Random()).nextInt(9000000)+1000000; 
	Random rand;
	BrowserList bl = new BrowserList();

	@Test(priority=0)
	@Parameters({"userId","password","url"})
	public void Add_Customer(String userId,String password,String url) throws Exception {
extentTest = extent.startTest("createAdminAcc");

		
		bl.initialize();
		Thread.sleep(3000);
		
		 bl.urlStack();	
			driver.manage().window().maximize();   
			Thread.sleep(3000);
		Login_site.Login(userId, password, url);
		/*action_obj =new Repo_testing(driver);
		Assertion_obj = new Assertion_Test(driver);  
		executor = (JavascriptExecutor) driver;
		driver.navigate().refresh();
		Thread.sleep(1000);
		//Click on Customer tab.
		action_obj.Customertab().click();
		//Select Customer type 
		Select custoemrType=new Select(action_obj.Customertype());
		custoemrType.selectByVisibleText("Others");
		//Select category 
		Select category1=new Select(action_obj.categoryopt());
		category1.selectByVisibleText("Residential");

		//Add cusotmer General Detail
		action_obj.entr_title().sendKeys("Mrs");
		action_obj.entr_firstName().sendKeys("maya");
		action_obj.enter_surname().sendKeys("Chakarbati");
		action_obj.PhoneBH().sendKeys("40"+random);
		//Add Phone (AH)
		action_obj.PhoneAH().sendKeys("43"+random);

		action_obj.Mobilenumber().sendKeys("42"+random);
		action_obj.Cemail().sendKeys("testforupdatesetting@yopmail.com");
		action_obj.Address1().sendKeys("Madirma R-Town");
		action_obj.City_Suburb().sendKeys("Evans Mills NY");
		Select St=new Select(action_obj.Custmr_State());
		St.selectByValue("ACT");

		action_obj.CustomenrPIN().sendKeys("1230");
		executor.executeScript("window,scrollBy(0,1800)", "");
		Thread.sleep(2000);
		//add Contrat Statrt Dates
			action_obj.COntractStartDate().click();
			Thread.sleep(2000);
			action_obj.SelectToday().click();
			action_obj.Contract_Term().sendKeys("10");
			Thread.sleep(3000);
		//Save Customer
		action_obj.SaveCustomer().click();
		Thread.sleep(2000);
		//Select 'Save Only' Option
		action_obj.Select_SaveOnly().click();
		//Assertion on Customer Validation Message
		Assertion_obj.Assertion_Custoemrsave();
		Thread.sleep(2000);
		//Customer= driver.findElement(By.xpath("html/body/div[5]/div/div[2]/div[2]/div[5]/form[1]/div/div/div[1]/div[2]/div[1]/label/a")).getText();
		Customer = driver.findElement(By.xpath("//label[@class='col-sm-12 control-label']/a")).getText();

		//Change Status Details
		executor.executeScript("window,scrollBy(0,1800)", "");
		action_obj.ChangeStatusbtn().click();

		//Assertion On Popup 
		Assertion_obj.Assertion_changestatuspopup();
		Select statustype=new Select(action_obj.ChangeStatuslist());
		statustype.selectByVisibleText("Active");

		action_obj.Reasonfields().sendKeys("Only For testing Residetial Type of Category");
		Thread.sleep(1000);
		action_obj.reasonSave().click();
		Thread.sleep(1000);
		Assertion_obj.Assertion_chngStatusmesg();
		//	Thread.sleep(3000);
		action_obj.CloseButton().click();

		Thread.sleep(1000);
		executor.executeScript("window,scrollBy(0,-1800)", "");
		//	    Assertion_obj.Assertion_Statuscheck();
		Thread.sleep(3000);*/
		
		Thread.sleep(98999);
	}
	
	
	@Test(priority=1)
	public void Add_Service_ND_Update() throws Exception
	{
		extentTest = extent.startTest("Add_Service_ND_Update");
		/*action_obj =new Repo_testing(driver);
		Assertion_obj = new Assertion_Test(driver);  
		executor = (JavascriptExecutor) driver;

		action_obj.CLickOverview().click();

		action_obj.RetailElec().click();

		// Add Service Type
				Select ServiceTyp = new Select(action_obj.ServiceType());
				ServiceTyp.selectByVisibleText("Electricity");
				//Thread.sleep(5000);
				// Add Market Type
				Select markettyp = new Select(action_obj.SelectmarketTyp());
			 markettyp.selectByVisibleText("Retail");
			//	markettyp.selectByVisibleText("Off Market");
				Thread.sleep(1000);
				// Add transfer Type
				Select transfertype = new Select(action_obj.Select_transcationtye());
				//transfertype.selectByVisibleText("Add New Connection");
				 transfertype.selectByVisibleText("Move-In");
				// Enter NMI
				//action_obj.NMISelct().sendKeys("MA" + random+"2");
			// Add NMI Number
				 action_obj.NMISelct().sendKeys("NM63345654");
				Thread.sleep(2000);
				// Add NMI CheeckSUm
				action_obj.NMi_CheckSum().sendKeys("2");

				Thread.sleep(10000);
				// Add NMi Classification Code
				action_obj.NMIClasscode().sendKeys("SMALL");
				executor.executeScript("window,scrollBy(0,200)", "");
				
				//Generate Virtual NMI
				//action_obj.generate_Virtual_NMI().click();
				//Thread.sleep(2000);
			//	NMI = driver.findElement(By.cssSelector("input#NMI")).getText();
				//NMI= action_obj.NMISelct().getText();
				Thread.sleep(5000);
				
				Select planno = new Select(action_obj.Service_plan());
				//planno.selectByVisibleText("MktPlan_NetworkRate100");
				planno.selectByIndex(3);
				Thread.sleep(3000);
			
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
				// action_obj.MoveIn_Date().sendKeys(Keys.ESCAPE);
				Thread.sleep(3000);
				// action_obj.Purposcurrentdate().click();

				Select transferread = new Select(action_obj.Transfer_Read_Type());
				transferread.selectByValue("SP");
				//WebElement transferread1 = action_obj.Transfer_Read_Type();
				//transferread1.sendKeys("Special Read");
				///transferread1.click();
				executor.executeScript("window,scrollBy(0,500)", "");
				
				Thread.sleep(3000);

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

				//action_obj.SearchID1().sendKeys("MA" + random+"2"); 
				// Add NMI Number
				//action_obj.SearchID1().sendKeys("NMI4975768");
				//action_obj.SearchID1().sendKeys("NMI4975123");
				// Add NMI Number
				//serviceid = "NMI4975123";
				//serviceid = driver.findElement(By.cssSelector("td.sorting_1")).getText();
				//Assert.assertEquals(serviceid, "MA" + random+"2");
				action_obj.SearchID1().sendKeys("NM63345654");
				Assertion_obj.Assertion_serviceId1();
				// Add NMI Number
				//Assert.assertEquals(serviceid,"NMI4975123");
				// Assertion_obj.Assertion_serviceId();
				Thread.sleep(3000);
				// Service Edit
				action_obj.Service_Edit().click();
				Assertion_obj.Assertion_pageEditService();
				Thread.sleep(2000);
				executor.executeScript("window,scrollBy(0,200)", "");
				Select service = new Select(action_obj.Service_Status());
				service.selectByVisibleText("Connected");
				executor.executeScript("window,scrollBy(0,900)", "");
				action_obj.saveditserv().click();

				action_obj.OKbtn().click();

				action_obj.ServicesTab().click();

				//action_obj.SearchID1().sendKeys("MA" + random+"2");
				// Add NMI Number
				action_obj.SearchID1().sendKeys("NM63345654");
				Assertion_obj.Assertion_serviceId();

		//Service Edit 
		action_obj.Service_Edit().click();
		Assertion_obj.Assertion_pageEditService();

		Thread.sleep(1000);
		// Change Service Details  
		executor.executeScript("window,scrollBy(0,1800)", "");


		Thread.sleep(2000);
		//change Service Status
		Select service1=new Select(action_obj.Service_Status());
		service1.selectByVisibleText("Connected");
		Thread.sleep(3000);
		executor.executeScript("window,scrollBy(0,600)", "");

		Thread.sleep(2000);
		Select netconfigration=new Select(action_obj.NettingConfg());
		netconfigration.selectByValue("NET_IE");

		Select Channelaggrigation=new Select(action_obj.SubChannelAggrigate1());
		Channelaggrigation.selectByValue("SUM");*/
		Thread.sleep(98756);
	}
 @Test(priority=2)
	public void Add_Siteparamenter() throws Exception
	{
	 extentTest = extent.startTest("Add_Siteparamenter");
		/*action_obj =new Repo_testing(driver);
		Assertion_obj = new Assertion_Test(driver);  
		executor = (JavascriptExecutor) driver;
		Thread.sleep(5000);
		executor.executeScript("window,scrollBy(0,1800)", "");
		Thread.sleep(3000);
		//Click on Site parameter
		action_obj.Siteparameters().click();
		Assertion_obj.Assertion_Site_parameterPage();
		action_obj.AddParameter().click();

		Thread.sleep(2000);
		Assertion_obj.Assertion_SetupSIteparameterP();
		action_obj.Efective_Date().click();	

		action_obj.TodayDate().click(); 

		Select selectparameter=new Select(action_obj.ParameterAdd());
		selectparameter.selectByValue("EFMDV");	

		//add value of Parameter
		action_obj.ParameterAdd().click();
		action_obj.ValuePlan().sendKeys("150");
		Thread.sleep(2000);
		action_obj.Add_Buttono().click();
		action_obj.SAavEBtn().click();
		Thread.sleep(3000);
*/

		//action_obj.saveditserv().click();

		//		action_obj.OKbtn().click();
	 Thread.sleep(35521);

	} 
 @Test(priority=3)
	public void AddSite_plan_fromService() throws Exception
	{
	 extentTest = extent.startTest("AddSite_plan_fromService");
		 Thread.sleep(58991);	
		/*action_obj =new Repo_testing(driver);
		Assertion_obj = new Assertion_Test(driver);  
		executor = (JavascriptExecutor) driver;
		Thread.sleep(4000);
		executor.executeScript("window,scrollBy(0,1800)", "");
		
		action_obj.Siteplan11().click();
		Assertion_obj.Assertion_RatePlanSquenc();
		action_obj.Add_plan1().click();
		action_obj.PlanOpt().click();
		action_obj.Opt_SelctPlan().click();
		Thread.sleep(1000);
		action_obj.Start_Dateq().sendKeys("05/02/2019"+Keys.ESCAPE);
		Thread.sleep(1000);
		action_obj.End_Date().sendKeys("05/02/2019"+Keys.ESCAPE);
		Thread.sleep(1000);
		action_obj.AddPlan_Btn().click();
		Thread.sleep(1000);
		action_obj.Save_plan12().click();

		action_obj.OkButton1().click();
		Thread.sleep(3000);
		// confirm Ok Button 
		action_obj.ConfirmOK().click();
		Thread.sleep(4000);
		executor.executeScript("window,scrollBy(0,400)", "");
		Thread.sleep(2000);
		action_obj.saveditserv().click();
		action_obj.OKbtn().click();
		Thread.sleep(3000);
		executor.executeScript("window,scrollBy(0,-900)", "");
		WebElement ServiceS=driver.findElement(By.id("serviceStatus"));
		List<WebElement> Soption=ServiceS.findElements(By.tagName("option"));
		System.out.println(Soption.size());
		String element;
		for (int i=1; i<Soption.size(); i++)
		{
			element=Soption.get(i).getAttribute("value");
			 if(element.equals("Connected"))
			 {
			Soption.get(i).getText();
			Assert.assertEquals("Connected", "Connected");
			}  else   
				 	Assert.fail();


		}

		WebElement Netconf=driver.findElement(By.id("nettingConfig"));
		List<WebElement> config=Netconf.findElements(By.tagName("option"));
		System.out.println(config.size());
		String element2;
		for (int i=1; i<config.size(); i++)
		{
			element2=config.get(i).getAttribute("value");
			if(element2.equals("Import (B channel) - Export (E channel)"))
			{
				config.get(i).getText();
				Assert.assertEquals("Import (B channel) - Export (E channel)", "Import (B channel) - Export (E channel)");
			} else  
					Assert.fail(); 

		}*/



	} 
	 @Test(priority=4)
	public void Add_BillRun_Cycle() throws Exception
	{   
		 extentTest = extent.startTest("Add_BillRun_Cycle");
		/*action_obj =new Repo_testing(driver);
		Assertion_obj = new Assertion_Test(driver);  
		executor = (JavascriptExecutor) driver;
		Thread.sleep(1000);

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

		action_obj.cycleName().sendKeys(Customer);
		Thread.sleep(3000);

		executor.executeScript("window,scrollBy(0,1800)", "");


		action_obj.cycleDropDown1().click();
		driver.findElement(By.xpath(".//*[contains(span,'"+Customer+"')]")).click();
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ESCAPE).build().perform();
		action_obj.SaveCycleq().click();

		Assertion_obj.Assertion_SaveCycless();
		//This is template of Assertion Assertion_obj.validateclickEditbtn();

		//Search for customer
		//action_obj.Filtercust().sendKeys(Customer);

		//Select customers to display
		action_obj.cycleDropDown1().click();
		Thread.sleep(3000);
		action_obj.Search_Cycle_Name().sendKeys("All"+Keys.ENTER);
		//Thread.sleep(3000);
		//	action_obj.Search_Cycle_Name().sendKeys(Keys.ENTER);

		Thread.sleep(5000);
		//Select the customer
		action_obj.SelectCust().click();

		Thread.sleep(5000);
		//Click on Move Button
		action_obj.MoveBtn().click();
		Thread.sleep(3000);

		executor.executeScript("window,scrollBy(0,1800)", "");
		//Click on save Button
		action_obj.SaveCycleq().click();
		Thread.sleep(2000);
		executor.executeScript("window,scrollBy(0,-1800)", "");

		Assertion_obj.Assertion_SaveCycless();*/
		 Thread.sleep(66890);

	}
	@Test(priority=5)
	public void Edit_BillRUn() throws Exception 
	{
		
		extentTest = extent.startTest("Edit_BillRUn");
		/*action_obj =new Repo_testing(driver);
		Assertion_obj = new Assertion_Test(driver);  
		executor = (JavascriptExecutor) driver;
		Thread.sleep(1000);

		executor.executeScript("window,scrollBy(0,-1800)", "");
		action_obj.Admin().click();
		executor.executeScript("window,scrollBy(0,1600)", "");

		Assertion_obj.Assertion_BillRunPage();
		//add Bill Run  cycle
		action_obj.BillRunCycle1().click();
		//Assertion on page
		//js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		//Search Bill Run 
		action_obj.Bill_Search().sendKeys(Customer);
		action_obj.SelectBillforEdit().click();

		//Edit Page Open ups
		Assertion_obj.Assertion_cycpepages();
		WebElement CycleName=action_obj.cycleName();
		CycleName.clear();
		CycleName.sendKeys("Edit"+Customer);

		action_obj.SaveCycleq().click(); 
*/
		Thread.sleep(42990);

	}
 
}
