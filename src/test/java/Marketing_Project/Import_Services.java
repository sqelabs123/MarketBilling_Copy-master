package Marketing_Project;

import java.io.IOException;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;

//import org.omg.PortableServer.THREAD_POLICY_ID;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import Re_Useable.Assertion_Test;
import Re_Useable.Login_site;
import Re_Useable.Repo_testing;
//import Re_usable.csv;

public class Import_Services extends Login_site{
	 JavascriptExecutor executor;
	 Repo_testing action_obj;
	 Assertion_Test Assertion_obj;
	 public String Plan="";
	
	public int random= (new Random()).nextInt(9000000)+1000000; 
	Random rand;
	@Test(priority=1)
	  public void Add_Customer() throws Exception {
		   
		Thread.sleep(9562);
		 action_obj =new Repo_testing(driver);
			Assertion_obj = new Assertion_Test(driver);  
			executor = (JavascriptExecutor) driver;
			//driver.navigate().refresh();
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
			action_obj.entr_firstName().sendKeys("Steave");
			action_obj.enter_surname().sendKeys("Morgen");
			action_obj.Mobilenumber().sendKeys("9562325845");
			action_obj.Cemail().sendKeys("test@yopmail.com");
			action_obj.Address1().sendKeys("Madirma Town");
			executor.executeScript("window,scrollBy(0,1800)", "");
			//Save Customer
			action_obj.SaveCustomer().click();
			//Select Save And Add Provisioning
			action_obj.savewithAddProvisioning().click();
			//Assertion on Customer Validation Message
					Assertion_obj.Assertion_Custoemrsave();
				
	  } 
      @Test(priority=2)
	public void Service_AddProvisioning() throws Exception

	{
    	  Thread.sleep(11548);
		executor = (JavascriptExecutor) driver;
		//Add Service Type
		Select ServiceTyp=new Select(action_obj.ServiceType());
		ServiceTyp.selectByVisibleText("Electricity");
		
		//Add Market Type 
		Select markettyp=new Select(action_obj.SelectmarketTyp());
		markettyp.selectByVisibleText("Retail");
		Thread.sleep(1000);
		//Add transfer Type
		Select transfertype=new Select(action_obj.Select_transcationtye());
		transfertype.selectByVisibleText("Add New Connection");
		
		//Enter NMI
		action_obj.NMISelct().sendKeys("SEC"+random);
		//Add NMI CheeckSUm
		action_obj.NMi_CheckSum().sendKeys("1");	
		//Add NMi Classification Code 
		action_obj.NMIClasscode().sendKeys("LARGE");
		Select planno=new Select(action_obj.Service_plan());
		planno.selectByVisibleText("Market_Electricity335");
		
		action_obj.SaleDate().click();
		action_obj.Select_saleDate().click();
		
		action_obj.Select_perposeDate().click();
		action_obj.Select_saleDate().click();
		
		Select transferread=new Select(action_obj.Transfer_Read_Type());
		transferread.selectByValue("SP");
		WebElement transferread1=action_obj.Transfer_Read_Type();
		transferread1.sendKeys("Special Read");
		transferread1.click();
		executor.executeScript("window,scrollBy(0,200)", "");
		
		action_obj.StructurAddressTogglebtn().click();
		
		action_obj.Building_Name().sendKeys("Vancuver");
		
		Select UnitType=new Select(action_obj.Unit_Type());
		UnitType.selectByVisibleText("Block");
		
		Select husesuffix=new Select(action_obj.HouseSufix());
		husesuffix.selectByVisibleText("W");
		//Add Sub Address
		action_obj.Suburb().sendKeys("MallRoad Phase 11C");
		//Postal Code
		action_obj.postcode().sendKeys("15"+random);
		
		//Add State
		Select State=new Select(action_obj.State());
		State.selectByIndex(2);
		
		executor.executeScript("window,scrollBy(0,800)", "");
		action_obj.Add_Service().click();
		executor.executeScript("window,scrollBy(0,-1500)", "");
	    
//		Assertion_obj.Assertion_successmsgservice();

		action_obj.ServicesTab().click();
		
		action_obj.SearchID1().sendKeys("SEC"+random);
		//Assertion_obj.Assertion_serviceId();
		
		//Service Edit 
		action_obj.Service_Edit().click();
		Assertion_obj.Assertion_pageEditService();
		
		//change Service Status
		Select service=new Select(action_obj.Service_Status());
		service.selectByVisibleText("Connected");
		//service.selectByVisibleText("Pending Move-Out");
		executor.executeScript("window,scrollBy(0,900)", "");
		action_obj.saveditserv().click();
		
		action_obj.OKbtn().click();
	}
	@Test(priority=3)
	public void Import_TOU_Definition() throws IOException, InterruptedException
	{
		 action_obj =new Repo_testing(driver);
			Assertion_obj = new Assertion_Test(driver);  
			executor = (JavascriptExecutor) driver;
		//Click on Admin Tab
		action_obj.Admin().click();
		executor.executeScript("window,scrollBy(0,900)", "");
		action_obj.TOU_Import().click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
		//Click on the ManualRecurringCharge link under import setup
		driver.findElement(By.id("btnbrowseFile")).click();
		Thread.sleep(6000);
		
		//run autoit to upload file   TOUDefinitionImportTemplate.exe   D:\A_Projects\Market_Billing\TestData
		
		Runtime.getRuntime().exec(System.getProperty("user.dir")+"\\TestData\\TOU Definition Import Template.exe");
		Thread.sleep(5000);
		
		//description
		driver.findElement(By.id("attDesc")).sendKeys("TOU Definition");
		Thread.sleep(2000);
		
		
		
		//Click on the Upload btn
		driver.findElement(By.xpath(".//*[@id='content']/div[2]/div[2]/div/div/div[2]/div/div[1]/form/div[6]/a/span")).click();
		Thread.sleep(2000);
		
		executor.executeScript("window.scrollBy(0,500)", "");

		//Click on the exceute link
		driver.findElement(By.xpath(".//*[@id='importHistoryTable']/tbody/tr[1]/td[7]/a[1]")).click();
		Thread.sleep(2000);
		
		//capture the alert
		driver.findElement(By.xpath(".//button[contains(text(),'OK')]")).click();
		Thread.sleep(2000); 
		
		//asertion on message 
		String Actualtext = driver.findElement(By.xpath(".//*[contains(text(),'Import Successful!')]")).getText();
		Assert.assertEquals(Actualtext, "Import Successful!");
		Thread.sleep(2000);
	}
	@Test(priority=4)
	public void NMI_service_Import() throws InterruptedException, IOException
	{
	
		// String p=System.getProperty("user.dir")+"//TestData//meternumberimporttemplate.csv";
		//	String col="Customer Number,Alternative Customer Number,*Plan Number,*Meter Number,*Meter Configuration [1-Flat / 2-Peak/OffPeak/Shoulder],*Prorata Date,*Meter Type [HE - Electricity / WT - Water],*Meter Read Type [R-Reads/C-Consumption],Enable Demand Reads? [Yes/No],*Kfactor,Three Phase,Gas Cook,Master Meter,Walk Order,NMI,SubAddress Type,SubAddress Number,Street Number,Street Name,Street type,Suburb,State/County,Post/Zip Code,Special Type [0 - Normal / 1 - Solar]";
		//	long cn=Long.parseLong(customerNumber);
		//	csv.MeterNumber(p, col, cn, Plan,mno+"114" );
		//	System.out.println(mno);
			
		//Click on the Admin link
	driver.findElement(By.linkText("Admin")).click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		//Click on the MeterNumberImport link
		driver.findElement(By.xpath(".//*[@id='content']/div[2]/div[2]/div/div[4]/div/div[2]/div[2]/a")).click();
		//driver.findElement(By.xpath("html/body/div[5]/div/div[2]/div[2]/div[2]/div/div[5]/div/div[2]/div[2]/a")).click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		
		//Click on the MeterNumberImport link under import setup
		driver.findElement(By.id("btnbrowseFile")).click();
		Thread.sleep(2000);
		
		//run autoit to upload file
		Runtime.getRuntime().exec(System.getProperty("user.dir")+"\\TestData\\Meter Number with NMI.exe");
		Thread.sleep(5000);
		
		//description
		driver.findElement(By.id("attDesc")).sendKeys("MeterNumberImport");
		Thread.sleep(2000);
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;	 
		jse.executeScript("window.scrollBy(0,500)", "");
		
		//Click on the Upload btn
		driver.findElement(By.xpath(".//*[@id='content']/div[2]/div[2]/div/div/div[2]/div/div[1]/form/div[6]/a/span")).click();
		
		Thread.sleep(2000);
	    jse.executeScript("window.scrollBy(0,1500)", "");

		//Click on the exceute link
		driver.findElement(By.xpath(".//*[@id='importHistoryTable']/tbody/tr[1]/td[7]/a[1]")).click();
		Thread.sleep(2000);
		
		//capture the alert
		driver.findElement(By.xpath(".//button[contains(text(),'OK')]")).click();
		Thread.sleep(2000);
		//asertion on message 
		String Actualtext = driver.findElement(By.xpath(".//*[contains(text(),'Import Successful!')]")).getText();
		Assert.assertEquals(Actualtext, "Import Successful!");
		Thread.sleep(2000);
		
		//Assertion to validate Successfully saved MeterReadImport charges
		String Actualtext1 = driver.findElement(By.xpath(".//*[@id='importHistoryTable']/tbody/tr[1]/td[6]/span")).getText();
		Assert.assertEquals(Actualtext1, "success");
		System.out.print("\n assertion_method_1 executed"+Actualtext1);
		
	}
}
