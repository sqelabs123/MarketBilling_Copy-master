package Marketing_Project;

import java.util.Random;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Re_Useable.Assertion_Test;
import Re_Useable.Login_site;
import Re_Useable.Repo_testing;

public class Add_Customer  extends Login_site{
	 JavascriptExecutor executor;
	 Repo_testing action_obj;
	 Assertion_Test Assertion_obj;
	
	public int random= (new Random()).nextInt(9000000)+1000000; 
	Random rand;
  @Test(priority=0)
  public void CustomerWith_SaveOnly() throws Exception {
	  
		action_obj =new Repo_testing(driver);
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
		action_obj.entr_firstName().sendKeys("Steave");
		action_obj.enter_surname().sendKeys("Morgen");
		action_obj.Mobilenumber().sendKeys("9562325845");
		action_obj.Cemail().sendKeys("test@yopmail.com");
		action_obj.Address1().sendKeys("Madirma Town");
		executor.executeScript("window,scrollBy(0,1800)", "");
		//Save Customer
		action_obj.SaveCustomer().click();
		
		//Select 'Save Only' Option
		action_obj.Select_SaveOnly().click();
		//Assertion on Customer Validation Message
		Assertion_obj.Assertion_Custoemrsave();
		
		//Change Status Details
		executor.executeScript("window,scrollBy(0,1800)", "");
		action_obj.ChangeStatusbtn().click();
		//Assertion On Popup 
		Assertion_obj.Assertion_changestatuspopup();
		Select statustype=new Select(action_obj.ChangeStatuslist());
		statustype.selectByVisibleText("Active");
		
		action_obj.Reasonfields().sendKeys("Only For testing ");
		Thread.sleep(1000);
		action_obj.reasonSave().click();
		Thread.sleep(1000);
		Assertion_obj.Assertion_chngStatusmesg();
	//	Thread.sleep(3000);
	    action_obj.CloseButton().click();
		
			
  }
  @Test(priority=1)
  public void Cust_withSaveandAddProvisioning() throws Exception {
	   
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
public void Add_ProvisioningService() throws Exception

{
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
	action_obj.NMISelct().sendKeys("MAR"+random);
	//Add NMI CheeckSUm
	action_obj.NMi_CheckSum().sendKeys("1");	
	//Add NMi Classification Code 
	action_obj.NMIClasscode().sendKeys("SMALL");
	Select planno=new Select(action_obj.Service_plan());
	planno.selectByVisibleText("Market_Electricity335");
	
	action_obj.SaleDate().click();
	action_obj.Select_saleDate().click();
	
	action_obj.Select_perposeDate().click();
	action_obj.Select_saleDate().click();
	
	/*Select transferread=new Select(action_obj.Transfer_Read_Type());
	transferread.selectByValue("SP");*/
	WebElement transferread1=action_obj.Transfer_Read_Type();
	transferread1.sendKeys("Special Read");
	transferread1.click();
	executor.executeScript("window,scrollBy(0,200)", "");
	
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
	executor.executeScript("window,scrollBy(0,-1500)", "");
    
//	Assertion_obj.Assertion_successmsgservice();

	action_obj.ServicesTab().click();
	
	action_obj.SearchID1().sendKeys("MAR"+random);
	// Assertion_obj.Assertion_serviceId();
	
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





}








