package Re_Useable;

import java.util.Date;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;



public class Repo_testing 
{

	public WebDriver driver;
	public static String last="";
	JavascriptExecutor executor = (JavascriptExecutor)driver;




	public Repo_testing(WebDriver driver)
	{
		// TODO Auto-generated constructor stub
		this.driver=driver; 		
	}


	Properties prop;


	String  path = System.getProperty("user.dir") + "\\TestData\\UI.Properties";
	ObjMap_test objMap = new ObjMap_test(path);

	public String date()
	{
		Date date = new Date();
		//current date user entry
		last=date.toString();
		System.out.println("The Time Is :-----------"+last);
		last= last.replace(":", "");
		last=last.replace(" ", "");

		// display time and date using toString()
		System.out.println(last);
		return last;

	}
	//Click Login page
	public WebElement useranme()   
	{		
		try {
			WebDriverWait wait= new WebDriverWait(driver,80);
			System.out.println("**UserName field should be displayed");
			WebElement ele =  wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("Userenter")));
			return   ele; 
		} catch (Exception e) {
			Reporter.log("UserName field icon not displayed-----"+e.getLocalizedMessage());
			System.out.println("*UserName field icon not displayed-----");

		}
		return null;
	}

	//Login page assertion 
	public WebElement Password() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Login page should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("enterpassword")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Login Page not displayed------"+e.getLocalizedMessage());
			System.out.println("Login Page not displayed-----");
		}
		return null;
	}
	//	loginbutton	
	public WebElement loginbutton() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Login button should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("loginbtn")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Login button not displayed----"+e.getLocalizedMessage());
			System.out.println("Login button not displayed-----");
		}
		return null;
	}
	//user_icon_logout
	public WebElement user_icon_logout() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Logout  icon should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("logouticon")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Logout  icon  not displayed-----"+e.getLocalizedMessage());
			System.out.println("Logout  icon  not displayed-----");
		}
		return null;
	}
	//logout 
	public WebElement logout() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Logout button should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("logoutbtn")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Logout  icon  not displayed-----"+e.getLocalizedMessage());
			System.out.println("Logout  button  not displayed-----");
		}
		return null;
	}
	
//	select Group
	public WebElement Select_newGroup() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("select group dropdown should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("selectGroup")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("select group dropdown not displayed-----"+e.getLocalizedMessage());
			System.out.println("select group dropdown not displayed-----");
		}
		return null;
	}
	
//	Login button	
	public WebElement Login_button() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Login button should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("loginButton")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Login button not displayed----"+e.getLocalizedMessage());
			System.out.println("Login button not displayed-----");
		}
		return null;
	}
	
	
	
	
	
	
	
	

	//click on 'Customers' tab
	public WebElement Customertab1() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Logout button should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("clickcustomersbtn1")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Logout  icon  not displayed-----"+e.getLocalizedMessage());
			System.out.println("Logout  button  not displayed-----");
		}
		return null;
	}
	//.//*[@id='navbar-menu']/div/ul/li[2]
	public WebElement Customertab() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Logout button should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("clickcustomersbtn")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Logout  icon  not displayed-----"+e.getLocalizedMessage());
			System.out.println("Logout  button  not displayed-----");
		}
		return null;
	}





	//custTypeE
	public WebElement Customertype() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Customer  type dropdown should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("custTypeE")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Customer  type dropdown  not displayed-----"+e.getLocalizedMessage());
			System.out.println("Customer  type dropdown  not displayed-----");
		}
		return null;
	}
	//category
	public WebElement categoryopt() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Customer  type dropdown should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("category")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Customer  type dropdown  not displayed-----"+e.getLocalizedMessage());
			System.out.println("Customer category  dropdown  not displayed-----");
		}
		return null;
	}
	//     //input[@id='sal'] //*[@id="sal"]
	public WebElement entr_title() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Title field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("titleofcust")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("firstName field  not displayed-----"+e.getLocalizedMessage());
			System.out.println("Title field  not displayed-----");
		}
		return null;
	}
	//  titlecommerial
	public WebElement entr_Commerial_title() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Title field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("titlecommerial")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("firstName field  not displayed-----"+e.getLocalizedMessage());
			System.out.println("Title field  not displayed-----");
		}
		return null;
	}
	//firstName
	public WebElement entr_firstName() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("firstName field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("firstName")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("firstName field  not displayed-----"+e.getLocalizedMessage());
			System.out.println("firstName field  not displayed-----");
		}
		return null;
	}	
	//	surname	
	public WebElement enter_surname() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Surname field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("Surname")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Surname field  not displayed-----"+e.getLocalizedMessage());
			System.out.println("Surname field  not displayed-----");
		}
		return null;
	}

	public WebElement PhoneBH() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Surname field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("Phone_BH")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Surname field  not displayed-----"+e.getLocalizedMessage());
			System.out.println("Surname field  not displayed-----");
		}
		return null;
	}


	public WebElement PhoneAH() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Surname field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("Phone_AH")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Surname field  not displayed-----"+e.getLocalizedMessage());
			System.out.println("Surname field  not displayed-----");
		}
		return null;
	}
	//mobile
	public WebElement Mobilenumber() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("mobile field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("mobile")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("mobile field  not displayed-----"+e.getLocalizedMessage());
			System.out.println("mobile field  not displayed-----");
		}
		return null;
	}	
	//contact_email
	public WebElement Cemail() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Contact Email field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("cont_email")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Contact Email field  not displayed-----"+e.getLocalizedMessage());
			System.out.println("Contact Email field  not displayed-----");
		}
		return null;
	}	
	//hAddress
	public WebElement Address1() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Address field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("Address")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Address field  not displayed-----"+e.getLocalizedMessage());
			System.out.println("Address field  not displayed-----");
		}
		return null;
	}	
	// hSuburb
	public WebElement City_Suburb() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Address field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("CityorSuburb")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Address field  not displayed-----"+e.getLocalizedMessage());
			System.out.println("Address field  not displayed-----");
		}
		return null;
	}

	//*[@id="hState"]
	public WebElement Custmr_State() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Address field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("Customer_State")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Address field  not displayed-----"+e.getLocalizedMessage());
			System.out.println("Address field  not displayed-----");
		}
		return null;
	}
	//   //*[@id="content"]/div[2]/div[3]/form/div/div[2]/div[1]/div[2]/div[5]/div/input

	public WebElement CustomenrPIN() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Address field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("CustomerPIN")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Address field  not displayed-----"+e.getLocalizedMessage());
			System.out.println("Address field  not displayed-----");
		}
		return null;
	}

	// contract_start_date
	public WebElement COntractStartDate() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Contract Start date field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("Contractdate")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Contract Start date field not displayed-----"+e.getLocalizedMessage());
			System.out.println("Contract Start date field not displayed-----");
		}
		return null;
	}	

	//   	
	public WebElement SelectToday() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Today date should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("SelectTodaydate")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Today date not displayed-----"+e.getLocalizedMessage());
			System.out.println("Today date  not displayed-----");
		}
		return null;
	}

	//  
	public WebElement Contract_Term() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Contract Term Field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("ContractTerm")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Contract Term Field not displayed-----"+e.getLocalizedMessage());
			System.out.println("Contract Term Field not displayed-----");
		}
		return null;
	}
	//
	public WebElement BusinessCompany() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Company Name Field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("companyname")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Company Name Field not displayed-----"+e.getLocalizedMessage());
			System.out.println("Company Name Field not displayed-----");
		}
		return null;
	}

	//add abn 
	public WebElement CompnayABN() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("ABN Field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("comp_abn")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("ABN Field not displayed-----"+e.getLocalizedMessage());
			System.out.println("ABN Field not displayed-----");
		}
		return null;
	}

	//	Savecustomer
	public WebElement SaveCustomer() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Save Customer Button should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("Savecustomer")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("firstName field  not displayed-----"+e.getLocalizedMessage());
			System.out.println("firstName Button  not displayed-----");
		}
		return null;
	}	
	//saveonlybtn
	public WebElement Select_SaveOnly() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Save Only Button should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("saveonlybtn")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Save Only Button  not displayed-----"+e.getLocalizedMessage());
			System.out.println("Save Only Button  not displayed-----");
		}
		return null;
	}		
	//Save Customer   Assertion_Custoemrsave
	public WebElement Assertion_Custoemrsave() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Assertion on Customet Save Validation should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("assertCustoemrsave")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Assertion on Customet Save Validation  not displayed-----"+e.getLocalizedMessage());
			System.out.println("Assertion on Customet Save Validation  not displayed-----");
		}
		return null;
	}	
	//savewthAdProvisioning
	public WebElement savewithAddProvisioning() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Save and Add Provicioning  field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("savewthAdProvisioning")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Save and Add Provicioning  field not displayed-----"+e.getLocalizedMessage());
			System.out.println("Save and Add Provicioning  field not displayed-----");
		}
		return null;
	}	
	//     //*[@id="notification"]/center





	//serviceType
	public WebElement ServiceType() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Service Tpye dropdown list should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("serviceType")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Service Tpye dropdown list not displayed-----"+e.getLocalizedMessage());
			System.out.println("Service Tpye dropdown list not displayed-----");
		}
		return null;
	}	

	//marketType 

	public WebElement SelectmarketTyp() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Market Tpye dropdown list should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("market_type")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Market Tpye dropdown list not displayed-----"+e.getLocalizedMessage());
			System.out.println("Market Tpye dropdown list not displayed-----");
		}
		return null;
	}	
	//transferType
	public WebElement Select_transcationtye() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Transfer Tpye dropdown list should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("transfer_typ")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Transfer Tpye dropdown list not displayed-----"+e.getLocalizedMessage());
			System.out.println("Transfer Tpye dropdown list not displayed-----");
		}
		return null;
	}	

	//Generate Virtual NMI
		public WebElement generate_Virtual_NMI() 
		{
			try {
				WebDriverWait wait= new WebDriverWait(driver,60);
				System.out.println("Generate virtual NMI button should be displayed");
				WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("generateVirtualNMI")));
				return ele;	
			} catch (Exception e) {
				Reporter.log("Generate virtual NMI button not displayed-----"+e.getLocalizedMessage());
				System.out.println("Generate virtual NMI button not displayed-----");
			}
			return null;
		}	
	
	
	
	//NMI
	public WebElement NMISelct() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("NMI Fields should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("NMI")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("NMI Fields not displayed-----"+e.getLocalizedMessage());
			System.out.println("NMI fields not displayed-----");
		}
		return null;
	}	
	//NMICHECKSUM
	public WebElement NMi_CheckSum() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("NMI CheckSum Fields should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("NMICheckSum")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("NMI checksum Fields not displayed-----"+e.getLocalizedMessage());
			System.out.println("NMI Checksum fields not displayed-----");
		}
		return null;
	}	

	//	nmiclassCode
	public WebElement NMIClasscode() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("NMI Class Code Drop down List should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("nmiclassCode")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("NMI Class Code Drop down List not displayed-----"+e.getLocalizedMessage());
			System.out.println("NMI Class Code Drop down List not displayed-----");
		}
		return null;
	}		
	//Plan number  planNo
	public WebElement Service_plan() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Service Plan Drop down List should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("Serviceplan")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Service Plan Drop down List not displayed-----"+e.getLocalizedMessage());
			System.out.println("Service Plan Drop down List not displayed-----");
		}
		return null;
	}	
	//saleDate	
	public WebElement SaleDate() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Sale Date field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("Sale_date")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Sale Date field not displayed-----"+e.getLocalizedMessage());
			System.out.println("Sale Date field not displayed-----");
		}
		return null;
	}	

	//currentdate
	public WebElement Select_saleDate() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("calender field and Today icons should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("currentdate")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("calender field and Today icons not displayed-----"+e.getLocalizedMessage());
			System.out.println("calender field and Today icons  not displayed-----");
		}
		return null;
	}	
	//proposedDate
	public WebElement Select_perposeDate() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("perpose date field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("perposedate")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("perpose date field not displayed-----"+e.getLocalizedMessage());
			System.out.println("perpose date field not displayed-----");
		}
		return null;
	}
	//Purposcurrentdate
	public WebElement Purposcurrentdate() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("perpose date field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("P_currentdate")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("perpose date field not displayed-----"+e.getLocalizedMessage());
			System.out.println("perpose date field not displayed-----");
		}
		return null;
	}

	//MoveIndate field
	public WebElement Moveindate_field() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("MoveIn date field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("moveindate_field")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("MoveIn date field not displayed-----"+e.getLocalizedMessage());
			System.out.println("MoveIn date field not displayed-----");
		}
		return null;
	}

	//MoveIndate
		public WebElement MoveIn_Date() 
		{
			try {
				WebDriverWait wait= new WebDriverWait(driver,60);
				System.out.println("MoveIn date should be displayed");
				WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("MoveIn_date")));
				return ele;	
			} catch (Exception e) {
				Reporter.log("MoveIn date not displayed-----"+e.getLocalizedMessage());
				System.out.println("MoveIn date not displayed-----");
			}
			return null;
		}








	//Transfermeter
	public WebElement Transfer_Read_Type() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Transfer Read Type dropdown field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("Transfermeter")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Transfer Read Type dropdown field not displayed-----"+e.getLocalizedMessage());
			System.out.println("Transfer Read Type dropdown field not displayed-----");
		}
		return null;
	}
	//Use Structured Address
	//switch-label
	public WebElement StructurAddressTogglebtn() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Use Structure Toggle button should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("useStructuretoggle")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Use Structure Toggle button not displayed-----"+e.getLocalizedMessage());
			System.out.println("Use Structure Toggle button not displayed-----");
		}
		return null;
	}
	//buildingName
	public WebElement Building_Name() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Building field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("Building")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Building field not displayed-----"+e.getLocalizedMessage());
			System.out.println("Building field not displayed-----");
		}
		return null;
	}
	//Unittyp 

	public WebElement Unit_Type() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Unit Type field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("Unittyp")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Unit Type field not displayed-----"+e.getLocalizedMessage());
			System.out.println("Unit Type field not displayed-----");
		}
		return null;
	}
	//houseNBRSuffix

	public WebElement HouseSufix() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Unit Type field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("housesufix")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Unit Type field not displayed-----"+e.getLocalizedMessage());
			System.out.println("Unit Type field not displayed-----");
		}
		return null;
	}
	//Sub Address

	public WebElement Suburb() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Suburb field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("Suburb_address")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Suburb field not displayed-----"+e.getLocalizedMessage());
			System.out.println("Suburb field not displayed-----");
		}
		return null;
	}
	//postCode
	public WebElement postcode() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Suburb field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("Post_Code")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Suburb field not displayed-----"+e.getLocalizedMessage());
			System.out.println("Suburb field not displayed-----");
		}
		return null;
	}
	//state
	public WebElement State() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("State field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("Enter_State")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("State field not displayed-----"+e.getLocalizedMessage());
			System.out.println("State field not displayed-----");
		}
		return null;
	}

	//Service Save under project  submitBttn
	public WebElement Add_Service() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("State field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("ServiceAdd")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("State field not displayed-----"+e.getLocalizedMessage());
			System.out.println("State field not displayed-----");
		}
		return null;
	}	

	public WebElement ChangeStatusbtn() 
	{
		try {

			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Change Status field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("Change_Status")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Change Status field not displayed-----"+e.getLocalizedMessage());
			System.out.println("Change Status field not displayed-----");
		}
		return null;
	}
	//	Assertion_chngstsbtn()	
	public WebElement Assertion_chngstsbtn() 
	{
		try {

			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Change Status popup should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("Change_Statuspopup")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Change Status popup not displayed-----"+e.getLocalizedMessage());
			System.out.println("Change Status popup not displayed-----");
		}
		return null;
	}

	//statustype	
	public WebElement ChangeStatuslist() 
	{
		try {

			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Statuts Type dropdown list should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("statustype")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Statuts Type dropdown list not displayed-----"+e.getLocalizedMessage());
			System.out.println("Statuts Type dropdown list not displayed-----");
		}
		return null;
	}

	//statusReason	
	public WebElement Reasonfields() 
	{
		try {

			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Statuts Type dropdown list should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("reason")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Statuts Type dropdown list not displayed-----"+e.getLocalizedMessage());
			System.out.println("Statuts Type dropdown list not displayed-----");
		}
		return null;
	}

	//save

	public WebElement reasonSave() 
	{
		try {

			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Statuts Type dropdown list should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("savereson")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Statuts Type dropdown list not displayed-----"+e.getLocalizedMessage());
			System.out.println("Statuts Type dropdown list not displayed-----");
		}
		return null;
	}
	//Assertion on Popup 
	public WebElement Assertion_chngStatus() 
	{
		try {

			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Change Status information message should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("popupchagestatus")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Change Status information message not displayed-----"+e.getLocalizedMessage());
			System.out.println("Change Status information message not displayed-----");
		}
		return null;
	}
	//close	
	public WebElement CloseButton() 
	{
		try {

			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Change Status information message should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("closebtn")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Change Status information message not displayed-----"+e.getLocalizedMessage());
			System.out.println("Change Status information message not displayed-----");
		}
		return null;
	}

	// Validation Message     success!  	
	public WebElement successmsgservice() 
	{
		try {

			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("validation message should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("successservice")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("validation message not displayed-----"+e.getLocalizedMessage());
			System.out.println("validation message not displayed-----");
		}
		return null;
	}
	//servicetab

	public WebElement ServicesTab() 
	{
		try {

			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Services Tab should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("servicetab")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Services Tab not displayed-----"+e.getLocalizedMessage());
			System.out.println("Services Tab not displayed-----");
		}
		return null;
	}

	//SurviceID
	public WebElement SurviceID1() 
	{
		try {

			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Services Tab should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("service_id1")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Services Tab not displayed-----"+e.getLocalizedMessage());
			System.out.println("Services Tab not displayed-----");
		}
		return null;
	}

	public WebElement SurviceID() 
	{
		try {

			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Services Tab should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("service_id")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Services Tab not displayed-----"+e.getLocalizedMessage());
			System.out.println("Services Tab not displayed-----");
		}
		return null;
	}

	//searchservice
	public WebElement SearchID1() 
	{
		try {

			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("search field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("searchservice")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Search Filed not displayed-----"+e.getLocalizedMessage());
			System.out.println("Search field not displayed-----");
		}
		return null;
	}

	//	(.//*[@class='box-content'])[1]/div/table/tbody/tr/td[10]/button/i	

	public WebElement Service_Edit() 
	{
		try {

			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("search field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("marketbtn")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Search Filed not displayed-----"+e.getLocalizedMessage());
			System.out.println("Search field not displayed-----");
		}
		return null;
	}

	//ServiceStatus
	public WebElement Service_Status() 
	{
		try {

			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("ServiceStatus dropdown list should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("ServiceStatus")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Service Status dropdown list not displayed-----"+e.getLocalizedMessage());
			System.out.println("Service Status dropdown list not displayed-----");
		}
		return null;
	}
	//	assertEditService
	public WebElement Serviceedit() 
	{
		try {

			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Retail Electricity Service edit page should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("assertEditService")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Retail Electricity Service edit page not displayed-----"+e.getLocalizedMessage());
			System.out.println("Retail Electricity Service edit page not displayed-----");
		}
		return null;
	}

	//editsaveservice

	public WebElement saveditserv() 
	{
		try {

			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Save button should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("editsaveservice")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Save button not displayed-----"+e.getLocalizedMessage());
			System.out.println("Save button not displayed-----");
		}
		return null;
	}
	//OK
	public WebElement OKbtn() 
	{
		try {

			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Ok button should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("OK")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("OK button not displayed-----"+e.getLocalizedMessage());
			System.out.println("OK button not displayed-----");
		}
		return null;
	}
	//RatePlantab
	public WebElement Plans() 
	{
		try {

			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Plans tab should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("RatePlantab")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Plans tab not displayed-----"+e.getLocalizedMessage());
			System.out.println("Plans Tab not displayed-----");
		}
		return null;
	}

	// Plan Page Assertion
	// AssertPlans
	public WebElement Assertion_Plans() 
	{
		try {

			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Plans tab should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("AssertPlans")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Plans tab not displayed-----"+e.getLocalizedMessage());
			System.out.println("Plans Tab not displayed-----");
		}
		return null;
	}

	//Addplan	
	public WebElement CreatePlan() 
	{
		try {

			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Create Plans button should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("Addplan")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Create Plans button not displayed-----"+e.getLocalizedMessage());
			System.out.println("Create Plans Button not displayed-----");
		}
		return null;
	}

	//rateplanpage

	public WebElement AssertPlanpage() 
	{
		try {

			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Create Rate Plan page should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("rateplanpage")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Create Rate Plan page not displayed-----"+e.getLocalizedMessage());
			System.out.println("Create Rate Plan page not displayed-----");
		}
		return null;
	}

	//UsageType
	public WebElement Usages_Type() 
	{
		try {

			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Usage Type dropdownlist should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("UsageType")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Usages Type dropdownlist not displayed-----"+e.getLocalizedMessage());
			System.out.println("Usages Type dropdownlist not displayed-----");
		}
		return null;
	}
	//name
	public WebElement RatePlanname() 
	{
		try {

			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("name field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("name")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("name field not displayed-----"+e.getLocalizedMessage());
			System.out.println("name field not displayed-----");
		}
		return null;
	}
	//usageTou
	public WebElement UsageTypeTOU() 
	{
		try {

			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Usages TOU dropdown list should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("usageTou")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Usages TOU dropdown list not displayed-----"+e.getLocalizedMessage());
			System.out.println("Usages TOU dropdown list not displayed-----");
		}
		return null;
	}	

	//	demantou	
	public WebElement Demand_TOU() 
	{
		try {

			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Demand TOU dropdown list should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("demantou")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Demand TOU dropdown list not displayed-----"+e.getLocalizedMessage());
			System.out.println("Demand TOU dropdown list not displayed-----");
		}
		return null;
	}		
	//DVF	
	public WebElement Datevalidfrom() 
	{
		try {

			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Date valid from field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("DVF")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Date valid from field not displayed-----"+e.getLocalizedMessage());
			System.out.println("Date valid from field not displayed-----");
		}
		return null;
	}	
	//Todaydate
	public WebElement TodayDate() 
	{
		try {

			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Date valid to field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("Todaydate")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Date valid to field not displayed-----"+e.getLocalizedMessage());
			System.out.println("Date valid to field not displayed-----");
		}
		return null;
	}	

	//DVT	
	public WebElement DateValidTo() 
	{
		try {

			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Today Field under Calender should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("DVT")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Today Field under Calender not displayed-----"+e.getLocalizedMessage());
			System.out.println("Today Field under Calender not displayed-----");
		}
		return null;
	}
	//	tariffbtn
	public WebElement TariffButton() 
	{
		try {

			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Tariff Button should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("tariffbtn")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Tariff Button not displayed-----"+e.getLocalizedMessage());
			System.out.println("Triff Button not displayed-----");
		}
		return null;
	}

	//TariffPlanPage	
	public WebElement Tariff_PlanPage() 
	{
		try {

			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Tariff Button should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("TariffPlanpage")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Tariff Button not displayed-----"+e.getLocalizedMessage());
			System.out.println("Triff Button not displayed-----");
		}
		return null;
	}

	//chrgdesc
	public WebElement Charge_Desc() 
	{
		try {

			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("chrgdesc Field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("chrgdesc")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("chrgdesc Field not displayed-----"+e.getLocalizedMessage());
			System.out.println("chrgdesc field not displayed-----");
		}
		return null;
	}
	//	tab	

	public WebElement comptab() 
	{
		try {

			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("extra should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("tab")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("extra not displayed-----"+e.getLocalizedMessage());
			System.out.println("extra   not displayed-----");
		}
		return null;
	}

	//	rollupdesc	
	public WebElement Rollup_Desc() 
	{
		try {

			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("rollupdesc field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("rollupdesc")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("rollupdesc field not displayed-----"+e.getLocalizedMessage());
			System.out.println("rollupdesc field   not displayed-----");
		}
		return null;
	}

	//	chargTyp	
	public WebElement charg_Type() 
	{
		try {

			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Charge Type dropdown list should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("chargTyp")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Charge Type dropdown list not displayed-----"+e.getLocalizedMessage());
			System.out.println("Charge Type dropdown list   not displayed-----");
		}
		return null;
	}

	//ratingmethod	

	public WebElement Rating_method() 
	{
		try {

			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Rating Type dropdown list should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("ratingmethod")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Rating Type dropdown list not displayed-----"+e.getLocalizedMessage());
			System.out.println("Rating Type dropdown list   not displayed-----");
		}
		return null;
	}

	//demandthreshold

	public WebElement Demand_Threshold() 
	{
		try {

			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Demand Threshold Field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("demandthreshold")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Demand Threshold Field not displayed-----"+e.getLocalizedMessage());
			System.out.println("Demand Threshold Field  not displayed-----");
		}
		return null;
	}
	//unittype
	public WebElement Unit_Type_Plan() 
	{
		try {

			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Unit Type dropdown list should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("unittype")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Unit Type dropdown list not displayed-----"+e.getLocalizedMessage());
			System.out.println("Unit Type dropdown list  not displayed-----");
		}
		return null;
	}
	
	//SelectSeason
		public WebElement Season() 
		{
			try {

				WebDriverWait wait= new WebDriverWait(driver,60);
				System.out.println("Season dropdown list should be displayed");
				WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("season")));
				return ele;	
			} catch (Exception e) {
				Reporter.log("Season dropdown list not displayed-----"+e.getLocalizedMessage());
				System.out.println("Season dropdown list  not displayed-----");
			}
			return null;
		}
	
	//rateTariff
	public WebElement Tariff_Rates() 
	{
		try {

			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Rate field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("rateTariff")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Rate field  not displayed-----"+e.getLocalizedMessage());
			System.out.println("Rate field  not displayed-----");
		}
		return null;
	}
	//DSO
	public WebElement DST() 
	{
		try {

			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Daylight Saving option dropdown list should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("DSO")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Daylight Saving option dropdown list not displayed-----"+e.getLocalizedMessage());
			System.out.println("RDaylight Saving option dropdown list not displayed-----");
		}
		return null;
	}

	//RatTariffAdd
	public WebElement AddButton() 
	{
		try {

			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Add Button should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("RatTariffAdd")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Add Button  not displayed-----"+e.getLocalizedMessage());
			System.out.println("Add Button  not displayed-----");
		}
		return null;
	}
	//searchTariff
	public WebElement Search_Tariff() 
	{
		try {

			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Search_Tariff field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("searchTariff")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Search_Tariff field not displayed-----"+e.getLocalizedMessage());
			System.out.println("Search_Tariff field not displayed-----");
		}
		return null;
	}
	//planPublish
	public WebElement Publish_Button() 
	{
		try {

			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Publish Button should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("planPublish")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Publish Button not displayed-----"+e.getLocalizedMessage());
			System.out.println("Publish Button not displayed-----");
		}
		return null;
	}

	public WebElement X() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* X should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("close")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*X not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*X not displayed-----");
		}
		return null;
	}	
	//		SearchPlan
	public WebElement Search_Plan() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Search Plan field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("SearchPlan")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Search Plan field not displayed-----"+e.getLocalizedMessage());
			System.out.println("Search Plan field not displayed-----");
		}
		return null;
	}	
	//getplanno

	public WebElement GetPlanNo() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Plan Number Get should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("getplanno")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("No Plan Name Get-----"+e.getLocalizedMessage());
			System.out.println("No Plan number Get-----");
		}
		return null;
	}	
	//Updated test cases ------------------------------------------------------------------->
	
	//Prorata tariff
	//EditButton
	public WebElement Edit_Button() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Edit button should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("editButton")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Edit Button not displayed -----"+e.getLocalizedMessage());
			System.out.println("Edit Button not displayed-----");
		}
		return null;
	}	
	
	
	//ProrataButton
	public WebElement Prorata_Button() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Prorata button should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("prorataButton")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Prorata Button not displayed -----"+e.getLocalizedMessage());
			System.out.println("Prorata Button not displayed-----");
		}
		return null;
	}	
	
	
	//EnableProrata
	public WebElement Enable_Prorata() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Prorata toggle should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("enableProrata")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Prorata toggle not displayed -----"+e.getLocalizedMessage());
			System.out.println("Prorata toggle not displayed-----");
		}
		return null;
	}	
	
	
	//DateFrom Field
	public WebElement Date_From_Field() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("From date field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("dateFromField")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("From date field not displayed -----"+e.getLocalizedMessage());
			System.out.println("From date field not displayed-----");
		}
		return null;
	}	
	
	//MonthPopupFrom
		public WebElement Month_Popup_From() 
		{
			try {
				WebDriverWait wait= new WebDriverWait(driver,60);
				System.out.println("Month Popup should be displayed");
				WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("monthPopupFrom")));
				return ele;	
			} catch (Exception e) {
				Reporter.log("Month Popup not displayed -----"+e.getLocalizedMessage());
				System.out.println("Month Popup not displayed-----");
			}
			return null;
		}	
		
		
		//SelectMonthFrom
		public WebElement Select_Month_From() 
		{
			try {
				WebDriverWait wait= new WebDriverWait(driver,60);
				System.out.println("Month should be displayed");
				WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("monthFrom")));
				return ele;	
			} catch (Exception e) {
				Reporter.log("Month not displayed -----"+e.getLocalizedMessage());
				System.out.println("Month not displayed-----");
			}
			return null;
		}
		
	

	
	
	//SelectDateFrom
	public WebElement Select_Date_From() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Date should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("dateFrom")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Date not displayed -----"+e.getLocalizedMessage());
			System.out.println("Date not displayed-----");
		}
		return null;
	}	
	
	
	//DateToField
	public WebElement Date_To_Field() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("To date field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("dateToField")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("To date field not displayed -----"+e.getLocalizedMessage());
			System.out.println("To date field not displayed-----");
		}
		return null;
	}	
	
	
	//MonthPopupTo
	public WebElement Month_Popup_To() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Month Popup should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("monthPopupTo")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Month Popup not displayed -----"+e.getLocalizedMessage());
			System.out.println("Month Popup not displayed-----");
		}
		return null;
	}	
	
	
	//SelectMonthTo
	public WebElement Select_Month_To() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Month should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("monthTo")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Month not displayed -----"+e.getLocalizedMessage());
			System.out.println("Month not displayed-----");
		}
		return null;
	}
	
	//SelectDateTo
	public WebElement Select_Date_To() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Date should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("dateTo")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Date not displayed -----"+e.getLocalizedMessage());
			System.out.println("Date not displayed-----");
		}
		return null;
	}	
	
	//ProrataRate
	public WebElement Prorata_Rate() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Rate field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("prorataRate")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Rate field not displayed -----"+e.getLocalizedMessage());
			System.out.println("Rate field not displayed-----");
		}
		return null;
	}	
	
	//AddProrata
	public WebElement Add_Prorata() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Add button should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("addProrata")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Add button not displayed -----"+e.getLocalizedMessage());
			System.out.println("Add button not displayed-----");
		}
		return null;
	}
	
	//CloseButton
	public WebElement Close_Button() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Close button should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("closeButton")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Close button not displayed -----"+e.getLocalizedMessage());
			System.out.println("Close button not displayed-----");
		}
		return null;
	}
	
	//SuccessPlan
		public WebElement Success_Plan() 
		{
			try {
				WebDriverWait wait= new WebDriverWait(driver,60);
				System.out.println("Success Message should be displayed");
				WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("successPlan")));
				return ele;	
			} catch (Exception e) {
				Reporter.log("Success Message not displayed -----"+e.getLocalizedMessage());
				System.out.println("Success Message not displayed-----");
			}
			return null;
		}
	
	
	//=------------------------------------------------------------------------------------------------->

	//admin

	public WebElement Admin() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Admin Tab should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("admin")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Admin Tab not displayed -----"+e.getLocalizedMessage());
			System.out.println("Admin Tab not displayed-----");
		}
		return null;
	}	

	//TOU_def	
	public WebElement TOU_Import() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("TOU Definitions button should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("TOU_def")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("TOU Definitions button not displayed -----"+e.getLocalizedMessage());
			System.out.println("Admin Tab not displayed-----");
		}
		return null;
	}	
	//TOUdefination
	public WebElement AssertTOUpage() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("TOU Definitions button should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("TOUdefination")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("TOU Definitions button not displayed -----"+e.getLocalizedMessage());
			System.out.println("Admin Tab not displayed-----");
		}
		return null;
	}	

	//  Assert_planno	

	public WebElement Assert_planno() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Plan Number should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("PlanNumberget")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Plan number not displayed -----"+e.getLocalizedMessage());
			System.out.println("Plan Number not displayed-----");
		}
		return null;
	}	
	public WebElement Load_percentage() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Load % field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("PercentageOfLoad")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Load % field not displayed -----"+e.getLocalizedMessage());
			System.out.println("Load % field not displayed-----");
		}
		return null;
	}

	//	from  ulow 
	public WebElement FromTiredrate() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("From field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("FromTired")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("From field not displayed -----"+e.getLocalizedMessage());
			System.out.println("From field not displayed-----");
		}
		return null;

	}
	public WebElement ToTiredrate() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("to field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("toTired")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("to field not displayed -----"+e.getLocalizedMessage());
			System.out.println("to field not displayed-----");
		}
		return null;
	}

	public WebElement Rate_R() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Rate field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("RateR")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Rate field not displayed -----"+e.getLocalizedMessage());
			System.out.println("Rate field not displayed-----");
		}
		return null;
	}
	//		rangbtn

	public WebElement RangButton() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Add Rang Button should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("rangbtn")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Add Rang Button not displayed -----"+e.getLocalizedMessage());
			System.out.println("Add Rang Button not displayed-----");
		}
		return null;
	}

	public WebElement MinimumDemand() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Minimum Demand Read field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("minReads")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Minimum Demand field not displayed -----"+e.getLocalizedMessage());
			System.out.println("Minimum Demand field not displayed-----");
		}
		return null;
	}
	// daysFrom
	public WebElement DayFrom() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("From date filed should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("fromday")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("From date field not displayed -----"+e.getLocalizedMessage());
			System.out.println("From date field not displayed-----");
		}
		return null;
	}
	//daysTo

	public WebElement Dayto() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("From date filed should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("to_day")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("From date field not displayed -----"+e.getLocalizedMessage());
			System.out.println("From date field not displayed-----");
		}
		return null;
	}
	//

	public WebElement Assert_Stauts() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Status Text should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("checkStatus")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Status Text field not displayed -----"+e.getLocalizedMessage());
			System.out.println("Status text field not displayed-----");
		}
		return null;			
	}
	//companyBusinessname	
	public WebElement Companyname() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Comany Business field  should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("companyBusinessname")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Comany Business field  not displayed -----"+e.getLocalizedMessage());
			System.out.println("Comany Business field  not displayed-----");
		}
		return null;	
	}
	//ABN_number
	public WebElement ABN1() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("ABN Numeric Field  should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("ABN_number")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("ABN Numeric Field  not displayed -----"+e.getLocalizedMessage());
			System.out.println("ABN Numeric Field   not displayed-----");
		}
		return null;
	}
	//ContractStartdt	
	public WebElement StartContract() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Contract Start Date field  should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("ContractStartdt")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Contract Start Date field not displayed -----"+e.getLocalizedMessage());
			System.out.println("Contract Start Date field not displayed-----");
		}
		return null;
	}
	//contractTeam
	public WebElement Contract_TEam() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Contract team field  should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("contractTeam")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Contract team field not displayed -----"+e.getLocalizedMessage());
			System.out.println("Contract team field not displayed-----");
		}
		return null;	
	}	//searchCustmer

	public WebElement Searchfield() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Search field  should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("searchCustmer")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Search field not displayed -----"+e.getLocalizedMessage());
			System.out.println("Search field not displayed-----");
		}
		return null;	
	}
	//searchbtn	

	public WebElement SearchButton() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Search field  should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("searchbtn")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Search field not displayed -----"+e.getLocalizedMessage());
			System.out.println("Search field not displayed-----");
		}
		return null;

	}
	//GivenName 
	public WebElement GivenName() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Given Name field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("GivenName")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Given Name field not displayed -----"+e.getLocalizedMessage());
			System.out.println("Given Name field not displayed-----");
		}
		return null;			
	}	
	//Surname		
	public WebElement Sur_Name() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("SurName field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("Surname1")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("SurName field not displayed -----"+e.getLocalizedMessage());
			System.out.println("SurName field not displayed-----");
		}
		return null;
	}

	//phnNumber
	public WebElement Phone_No() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Phone Number field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("phnNumber")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Phone Number field not displayed -----"+e.getLocalizedMessage());
			System.out.println("Phone Number field not displayed-----");
		}
		return null;
	}
	//	ContEmail	
	public WebElement Contact_Email1() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Contact Email field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("ContEmail")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Contact Email field not displayed -----"+e.getLocalizedMessage());
			System.out.println("Contact Email field not displayed-----");
		}
		return null;
	}
	//Add Customer Service 	

	// Overview11()
	public WebElement CLickOverview() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Overview field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("Overview11")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Overview field not displayed -----"+e.getLocalizedMessage());
			System.out.println("Overview field not displayed-----");
		}
		return null;
	}
	//ClickRetailElec		
	public WebElement RetailElec() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Add Retail Electricity icon should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("ClickRetailElec")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Add Retail Electricity icon not displayed -----"+e.getLocalizedMessage());
			System.out.println("Add Retail Electricity icon not displayed-----");
		}
		return null;
	}
	//   nettConfig
	public WebElement NettingConfg() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Netting Config option should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("nettConfig")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Netting Config option not displayed -----"+e.getLocalizedMessage());
			System.out.println("Netting Config option not displayed-----");
		}
		return null;			
	}

	//SubChannelAggr		
	public WebElement SubChannelAggrigate1() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Sub Channel Aggregation option should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("SubChannelAggr")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Sub Channel Aggregation option not displayed -----"+e.getLocalizedMessage());
			System.out.println("Sub Channel Aggregation option not displayed-----");
		}
		return null;

	}

	public WebElement Siteparameters() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Site Parameters button should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("SiteParameters")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Site Parameters Button not displayed -----"+e.getLocalizedMessage());
			System.out.println("Site Parameters Button not displayed-----");
		}
		return null;
	}
	//	AssertSiteParameter
	public WebElement Asssert_Siteparamneterpage() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Site Parameters page title should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("AssertSiteParameter")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Site Parameters page title not displayed -----"+e.getLocalizedMessage());
			System.out.println("Site Parameters page title not displayed-----");
		}
		return null;
	}
	//  Add_parameter
	public WebElement AddParameter() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Add Parameter button should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("Add_parameter")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Add parameter button not displayed -----"+e.getLocalizedMessage());
			System.out.println("Add_parameter button not displayed-----");
		}
		return null;
	}

	//SetupSiteParameter
	public WebElement SetUpSiteParameter() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("SetUp Site Parameter page should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("SetupSiteParameter")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("SetUp Site Parameter page not displayed -----"+e.getLocalizedMessage());
			System.out.println("SetUp Site Parameter page not displayed-----");
		}
		return null;
	}
	//EfectiveDateA	
	public WebElement Efective_Date() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Efective Date field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("EfectiveDateA")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Efective Date field not displayed -----"+e.getLocalizedMessage());
			System.out.println("Efective Date field not displayed-----");
		}
		return null;
	}	

	public WebElement ParameterAdd() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Paramter field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("ParameterSelc")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Paramter field not displayed -----"+e.getLocalizedMessage());
			System.out.println("Paramter field not displayed-----");
		}
		return null;
	}	
	//siteplans	
	public WebElement Siteplan11() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Site Plans Button should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("siteplans")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Site Plans Button not displayed -----"+e.getLocalizedMessage());
			System.out.println("Site Plans Button not displayed-----");
		}
		return null;
	}	

	//assertionRatePlanSeq	

	public WebElement Assert_RateplanSquence() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Site Plans page should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("assertionRatePlanSeq")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Site Plans page not displayed -----"+e.getLocalizedMessage());
			System.out.println("Site Plans page not displayed-----");
		}
		return null;
	}	
	//AddbtnClick
	public WebElement Add_plan1() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Add Plan button should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("AddbtnClick")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Add Plan button not displayed -----"+e.getLocalizedMessage());
			System.out.println("Add Plan button not displayed-----");
		}
		return null;
	}	

	//AddbtnClick 	
	public WebElement PlanOpt() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Plan option field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("plan_s")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Plan option field not displayed -----"+e.getLocalizedMessage());
			System.out.println("Plan option field not displayed-----");
		}
		return null;
	}
	//	  SelecPlan
	public WebElement Opt_SelctPlan() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Plan option should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("SelecPlan")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Plan option not displayed -----"+e.getLocalizedMessage());
			System.out.println("Plan option not displayed-----");
		}
		return null;
	}
	//srtDate  
	public WebElement Start_Dateq() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Start date field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("srtDate")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Start date field not displayed -----"+e.getLocalizedMessage());
			System.out.println("Start date field not displayed-----");
		}
		return null;
	}	
	//endDate 

	public WebElement End_Date() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Start date field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("endDate")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Start date field not displayed -----"+e.getLocalizedMessage());
			System.out.println("Start date field not displayed-----");
		}
		return null;
	}	
	//AddplanBtn2 	
	public WebElement AddPlan_Btn() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Add Plan Button field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("AddplanBtn2")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Add Plan Button not displayed -----"+e.getLocalizedMessage());
			System.out.println("Add Plan Button not displayed-----");
		}
		return null;
	}		
	//SavePlanf 	
	public WebElement Save_plan12() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Save Plan Button field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("SavePlanf")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Save Plan Button not displayed -----"+e.getLocalizedMessage());
			System.out.println("Save Plan Button not displayed-----");
		}
		return null;
	}		

	//Okbtn	
	public WebElement OkButton1() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Save Plan Button field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("Okbtn")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Save Plan Button not displayed -----"+e.getLocalizedMessage());
			System.out.println("Save Plan Button not displayed-----");
		}
		return null;
	}	
	//confOk 	
	public WebElement ConfirmOK() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Confirm Ok Button field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("confOk")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Confirm OK Button not displayed -----"+e.getLocalizedMessage());
			System.out.println("Confirm OK Button not displayed-----");
		}
		return null;
	}	

	//BIllRunCylce 
	public WebElement BillRunCycle1() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Bill Run cycle Button field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("BIllRunCylce")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Bill Run cycle Button not displayed -----"+e.getLocalizedMessage());
			System.out.println("Bill Run cycle Button not displayed-----");
		}
		return null;
	}	
	//  CreateBillRun	
	public WebElement CreateBillRun() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Create Bill Run cycle Button field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("CreateBillRun")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Create Bill Run cycle Button not displayed -----"+e.getLocalizedMessage());
			System.out.println("Create Bill Run cycle Button not displayed-----");
		}
		return null;
	}	

	//cyclename
	public WebElement cycleName() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Create Bill Run cycle Button field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("cyclenm")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Create Bill Run cycle Button not displayed -----"+e.getLocalizedMessage());
			System.out.println("Create Bill Run cycle Button not displayed-----");
		}
		return null;
	}		

	//cycleDropDown 
	public WebElement cycleDropDown1() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Create Bill Run cycle Button field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("cycleDropDown")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Create Bill Run cycle Button not displayed -----"+e.getLocalizedMessage());
			System.out.println("Create Bill Run cycle Button not displayed-----");
		}
		return null;
	}	
	//valuePlan
	public WebElement ValuePlan() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Create Bill Run cycle Button field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("valuePlan")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Create Bill Run cycle Button not displayed -----"+e.getLocalizedMessage());
			System.out.println("Create Bill Run cycle Button not displayed-----");
		}
		return null;
	}

	//AdDbtN
	public WebElement Add_Buttono() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Create Bill Run cycle Button field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("AdDbtN")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Create Bill Run cycle Button not displayed -----"+e.getLocalizedMessage());
			System.out.println("Create Bill Run cycle Button not displayed-----");
		}
		return null;
	}	
	//SaveBTN
	public WebElement SAavEBtn() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Save Button field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("Savesiteparameter")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Create Bill Run cycle Button not displayed -----"+e.getLocalizedMessage());
			System.out.println("Create Bill Run cycle Button not displayed-----");
		}
		return null;
	}		

	// BIllRunCylce

	public WebElement Assertion_Billrunpage() 
	{
		try { 
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Bill Run Cycle Page should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("BIllRunCylce")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Bill Run Cycle Page not displayed-----"+e.getLocalizedMessage());
			System.out.println("Bill Run Cycle Page not displayed-----");
		}
		return null;	
	}			
	//	  billrun_search

	public WebElement Bill_Search() 
	{
		try { 
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Bill Run Cycle search field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("billrun_search")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Bill Run Cycle search field  not displayed-----"+e.getLocalizedMessage());
			System.out.println("Bill Run Cycle search field  not displayed-----");
		}
		return null;	
	}		
	//Select_editBIll 

	public WebElement SelectBillforEdit() 
	{
		try { 
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Edit icon should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("Select_editBIll")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Edit icon  not displayed-----"+e.getLocalizedMessage());
			System.out.println("Edit icon  not displayed-----");
		}
		return null;	
	}		

	//AddBillRUnCycle
	public WebElement AddBillRUnCycle1() 
	{
		try { 
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Add Bill Run Cycle page should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("AddBillRUnCycle")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Add Bill Run Cycle page not displayed-----"+e.getLocalizedMessage());
			System.out.println("Add Bill Run Cycle page not displayed-----");
		}
		return null;	
	}	

	//SaveCycl
	public WebElement SaveCycleq() 
	{
		try { 
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Add Bill Run Cycle page should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("SaveCycl")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Add Bill Run Cycle page not displayed-----"+e.getLocalizedMessage());
			System.out.println("Add Bill Run Cycle page not displayed-----");
		}
		return null;	
	}	

	//AssertSaveCycle
	public WebElement Assertion_SaveCycle() 
	{
		try { 
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Successfully save message should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("AssertSaveCycle")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("uccessfully save message not displayed-----"+e.getLocalizedMessage());
			System.out.println("uccessfully save message not displayed-----");
		}
		return null;	
	}	
      
	//Search Cycle Name
		public WebElement Search_Cycle_Name() 
		{
			try { 
				WebDriverWait wait= new WebDriverWait(driver,60);
				System.out.println("Cycle Name should be displayed should be displayed");
				WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("Searchcycname")));
				return ele;	
			} catch (Exception e) {
				Reporter.log("Cycle Name not displayed-----"+e.getLocalizedMessage());
				System.out.println("Cycle Name not displayed-----");
			}
			return null;	
		}	
	//FilterCustomer
	public WebElement Filtercust() 
	{
		try { 
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Filter field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("Filter")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Filter field not displayed-----"+e.getLocalizedMessage());
			System.out.println("Filter field not displayed-----");
		}
		return null;	
	}	
	
	//Customer_List_Filter
		public WebElement Customer_List_Filter() 
		{
			try { 
				WebDriverWait wait= new WebDriverWait(driver,60);
				System.out.println("Customer List Filter field should be displayed");
				WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("customer_List_Filter")));
				return ele;	
			} catch (Exception e) {
				Reporter.log("Customer List Filter field not displayed-----"+e.getLocalizedMessage());
				System.out.println("Customer List Filter field not displayed-----");
			}
			return null;	
		}

	//MoveButton
	public WebElement MoveBtn() 
	{
		try { 
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Move Button field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("Movebtn")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Move Button field not displayed-----"+e.getLocalizedMessage());
			System.out.println("Move Button field not displayed-----");
		}
		return null;	
	}		

	//SelectCustomer
	public WebElement SelectCust() 
	{
		try { 
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Required customer should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("select_customer")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Required customer not displayed-----"+e.getLocalizedMessage());
			System.out.println("Required customer not displayed-----");
		}
		return null;	
	}		

//Updated Test Scenario------------------------------------------------------------>
	
	//Search All Customer
	public WebElement Search_all_Customer() 
	{
		try { 
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Search icon should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("search_all_Customer")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Search icon not displayed-----"+e.getLocalizedMessage());
			System.out.println("Search icon not displayed-----");
		}
		return null;	
	}		
	
	//AddMeter
		public WebElement Add_Meter() 
		{
			try { 
				WebDriverWait wait= new WebDriverWait(driver,60);
				System.out.println("Add meter icon should be displayed");
				WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("addMeter")));
				return ele;	
			} catch (Exception e) {
				Reporter.log("Add meter icon not displayed-----"+e.getLocalizedMessage());
				System.out.println("Add meter not displayed-----");
			}
			return null;	
		}	

		//AssertCreateMeter
				public WebElement Assert_Create_Meter() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Create Meter title should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("AssertCreateMeter")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Create meter title not displayed-----"+e.getLocalizedMessage());
						System.out.println("Create meter title not displayed-----");
					}
					return null;	
				}	
	


		//MeterSerialNumber
				public WebElement Meter_Serial_Number() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Meter Serial Number field should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("meterSerialNumber")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Meter Serial Number field not displayed-----"+e.getLocalizedMessage());
						System.out.println("Meter Serial Number field not displayed-----");
					}
					return null;	
				}	
		
		
				//ConsumptionType
				public WebElement Consumption_Type() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Consumption Type field should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("consumptionType")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Consumption Type field not displayed-----"+e.getLocalizedMessage());
						System.out.println("Consumption Type field not displayed-----");
					}
					return null;	
				}	
		
		
				//ConfigurationType
				public WebElement Configuration_Type() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Configuration Type field should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("configurationType")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Configuration Type field not displayed-----"+e.getLocalizedMessage());
						System.out.println("Configuration Type field not displayed-----");
					}
					return null;	
				}	
		
				//LastTestDate
				public WebElement Last_Test_Date() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Last Test Date field should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("lastTestDate")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Last Test Date field not displayed-----"+e.getLocalizedMessage());
						System.out.println("Last Test Date field not displayed-----");
					}
					return null;	
				}	
		
		
				/*//SelectLastTestDate
				public WebElement Select_Last_Test_Date() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Datepicker should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("selectLastTestDate")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Datepicker not displayed-----"+e.getLocalizedMessage());
						System.out.println("Datepicker not displayed-----");
					}
					return null;	
				}*/	
		
				//DateConnected
				public WebElement Date_Connected() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Date Connected field should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("dateConnected")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Date Connected field not displayed-----"+e.getLocalizedMessage());
						System.out.println("Date Connected field not displayed-----");
					}
					return null;	
				}	
		
				/*//SelectDateConnected
				public WebElement Select_Date_Connected() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Datepicker should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("selectDateConnected")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Datepicker not displayed-----"+e.getLocalizedMessage());
						System.out.println("Datepicker not displayed-----");
					}
					return null;	
				}*/
		
				//CreateMeter
				public WebElement Create_Meter() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Create Meter button should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("createMeter")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Create Meter button not displayed-----"+e.getLocalizedMessage());
						System.out.println("Create Meter button not displayed-----");
					}
					return null;	
				}
		
				
				//SuccessMessageMeter
				public WebElement Success_Message_Meter() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Success Message should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("successMessageMeter")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Success Message not displayed-----"+e.getLocalizedMessage());
						System.out.println("Success Message not displayed-----");
					}
					return null;	
				}
				
				
				
				
				//EditMeter
				public WebElement Edit_Meter() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Edit Meter button should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("editMeter")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Edit Meter button not displayed-----"+e.getLocalizedMessage());
						System.out.println("Edit Meter button not displayed-----");
					}
					return null;	
				}
		
				
				//AssertMetering
				public WebElement Assert_Metering() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Retail Electricity meter details page should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("AssertMetering")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Retail Electricity meter details page not displayed-----"+e.getLocalizedMessage());
						System.out.println("Retail Electricity meter details page not displayed-----");
					}
					return null;	
				}	
				
				
				
				//MeterRegister
				public WebElement Meter_Register() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Add Meter Register icon should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("meterRegister")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Add Edit Meter icon not displayed-----"+e.getLocalizedMessage());
						System.out.println("Add Edit Meter icon not displayed-----");
					}
					return null;	
				}
		


				//AssertMeterRegister
				public WebElement Assert_Meter_Register() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Create Meter title should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("AssertMeterRegister")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Create Meter title not displayed-----"+e.getLocalizedMessage());
						System.out.println("Create Meter title not displayed-----");
					}
					return null;	
				}
		

				//RegisterId
				public WebElement Register_Id() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Register Id field should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("registerId")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Register Id field not displayed-----"+e.getLocalizedMessage());
						System.out.println("Register Id field not displayed-----");
					}
					return null;	
				}	


				//NetworkTariffCode
				public WebElement Network_Tariff_Code() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Network Tariff Code field should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("networkTariffCode")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Network Tariff Code field not displayed-----"+e.getLocalizedMessage());
						System.out.println("Network Tariff Code field not displayed-----");
					}
					return null;	
				}	

				//UnitOfMeasure
				public WebElement Unit_Of_Measure() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Unit Of Measure field should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("unitOfMeasure")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Unit Of Measure field not displayed-----"+e.getLocalizedMessage());
						System.out.println("Unit Of Measure field not displayed-----");
					}
					return null;	
				}
				
				//TimeOfDay
				public WebElement Time_Of_Day() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Time Of Day field should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("timeOfDay")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Time Of Day field not displayed-----"+e.getLocalizedMessage());
						System.out.println("Time Of Day field not displayed-----");
					}
					return null;	
				}
				
				
				//DailFormat
				public WebElement Dail_Format() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Dail Format field should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("dailFormat")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Dail Format field not displayed-----"+e.getLocalizedMessage());
						System.out.println("Dail Format field not displayed-----");
					}
					return null;	
				}
				
				
				//ControlledLoad
				public WebElement Controlled_Load() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Controlled Load field should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("controlledLoad")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Controlled Load field not displayed-----"+e.getLocalizedMessage());
						System.out.println("Controlled Load field not displayed-----");
					}
					return null;	
				}
				
				
				
				
				//Demand1
				public WebElement Demand_1() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Demand1 field should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("demand1")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Demand1 field not displayed-----"+e.getLocalizedMessage());
						System.out.println("Demand1 field not displayed-----");
					}
					return null;	
				}
				
				
				//Demand2
				public WebElement Demand_2() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Demand2 field should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("demand2")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Demand2 field not displayed-----"+e.getLocalizedMessage());
						System.out.println("Demand2 field not displayed-----");
					}
					return null;	
				}
				
				//NmiSuffix
				public WebElement NMI_Suffix() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("NMI Suffix field should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("nmiSuffix")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("NMI Suffix field not displayed-----"+e.getLocalizedMessage());
						System.out.println("NMI Suffix field not displayed-----");
					}
					return null;	
				}
				
				//RegisterDateConnected
				public WebElement Register_date_Connected() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Date Connected field should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("registerdateConnected")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Date Connected field not displayed-----"+e.getLocalizedMessage());
						System.out.println("Date Connected field not displayed-----");
					}
					return null;	
				}	
				
				//CreateRegister
				public WebElement Create_Register() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Create Register button should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("createRegister")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Create Register button not displayed-----"+e.getLocalizedMessage());
						System.out.println("Create Register button not displayed-----");
					}
					return null;	
				}
				
				
				//SuccessMessageMeterRegister
				public WebElement Success_Message_Meter_Register() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Success Message should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("successMessageMeterRegister")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Success Message not displayed-----"+e.getLocalizedMessage());
						System.out.println("Success Message not displayed-----");
					}
					return null;	
				}
				
								
				//MeterReads
				public WebElement Meter_Reads() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Meter Reads tab should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("meterReads")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Meter Reads tab not displayed-----"+e.getLocalizedMessage());
						System.out.println("Meter Reads tab not displayed-----");
					}
					return null;	
				}
	

				//AssertMeterInformation
				public WebElement Assert_Meter_Information() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Meter Information title should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("AssertMeterInformation")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Meter Information title not displayed-----"+e.getLocalizedMessage());
						System.out.println("Meter Information title not displayed-----");
					}
					return null;	
				}
				
			
				
				//MeterNumber
				public WebElement Meter_Number() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Meter number dropdown should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("meterNumber")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Meter number dropdown not displayed-----"+e.getLocalizedMessage());
						System.out.println("Meter number dropdown not displayed-----");
					}
					return null;	
				}
				
				

				//viewMeterReads
				public WebElement View_Meter_Reads() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Meter Reads button should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("viewMeterReads")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Meter Reads button not displayed-----"+e.getLocalizedMessage());
						System.out.println("Meter Reads button not displayed-----");
					}
					return null;	
				}
				
				//AddRead
				public WebElement Add_Read() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Add Read button should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("addRead")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Add Read button not displayed-----"+e.getLocalizedMessage());
						System.out.println("Add Read button not displayed-----");
					}
					return null;	
				}
				
				
				//MeterNo
				public WebElement Meter_No() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Meter No dropdown should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("meterNo")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Meter No dropdown not displayed-----"+e.getLocalizedMessage());
						System.out.println("Meter No dropdown not displayed-----");
					}
					return null;	
				}
				
				
				//ReadType
				public WebElement readType() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Read type field should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("readType")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Read type field not displayed-----"+e.getLocalizedMessage());
						System.out.println("Read type field not displayed-----");
					}
					return null;	
				}
				
				
				//ReadDate
				public WebElement Read_Date() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Read Date datepicker should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("readDate")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Read Date datepicker not displayed-----"+e.getLocalizedMessage());
						System.out.println("Read Date datepicker not displayed-----");
					}
					return null;	
				}
				
				//MeterReadP
				public WebElement Meter_Read_P() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Meter Read(Peak) field should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("meterReadP")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Meter Read(Peak) field not displayed-----"+e.getLocalizedMessage());
						System.out.println("Read Date(Peak) field not displayed-----");
					}
					return null;	
				}
				
				//MeterReadO
				public WebElement Meter_Read_O() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Meter Read(Off Peak) field should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("meterReadO")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Meter Read(Off Peak) field not displayed-----"+e.getLocalizedMessage());
						System.out.println("Read Date(Off Peak) field not displayed-----");
					}
					return null;	
				}
				

				
				//MeterReadS
				public WebElement Meter_Read_S() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Meter Read(Shoulder) field should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("meterReadS")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Meter Read(Shoulder) field not displayed-----"+e.getLocalizedMessage());
						System.out.println("Read Date(Shoulder) field not displayed-----");
					}
					return null;	
				}
				
				//save Button
				public WebElement Save() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Save button should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("save")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Save button not displayed-----"+e.getLocalizedMessage());
						System.out.println("Save button not displayed-----");
					}
					return null;	
				}
				
				
				
				//BillRun
				public WebElement Bill_Run() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Bill Run tab should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("billRun")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Bill Run tab not displayed-----"+e.getLocalizedMessage());
						System.out.println("Bill Run tab not displayed-----");
					}
					return null;	
				}		
				
				//runTheBills
				public WebElement Run_The_Bills() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Run the bill button should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("runTheBills")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Run the bill button not displayed-----"+e.getLocalizedMessage());
						System.out.println("Run the bill button not displayed-----");
					}
					return null;	
				}		
				
				//startDate
				public WebElement Start_Date() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Start Date field should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("startDate")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Start Date field not displayed-----"+e.getLocalizedMessage());
						System.out.println("Start Date field not displayed-----");
					}
					return null;	
				}	
				
				
				//LastDay
				public WebElement Last_Day() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Last Day should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("lastDay")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Last Day not displayed-----"+e.getLocalizedMessage());
						System.out.println("Last Day not displayed-----");
					}
					return null;	
				}	
				
				//NewDay
				public WebElement New_Day() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("New Day should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("newDay")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("New Day not displayed-----"+e.getLocalizedMessage());
						System.out.println("New Day not displayed-----");
					}
					return null;	
				}	

				//endDate
				public WebElement End_DateB() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("End Date field should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("endDate")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("End Date field not displayed-----"+e.getLocalizedMessage());
						System.out.println("End Date field not displayed-----");
					}
					return null;	
				}	
				
				
				//issueDate
				public WebElement Issue_Date() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Issue Date field should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("issueDate")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Issue Date field not displayed-----"+e.getLocalizedMessage());
						System.out.println("Issue Date field not displayed-----");
					}
					return null;	
				}	
				
				//issueDate
				public WebElement Due_Date() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Due Date field should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("dueDate")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Due Date field not displayed-----"+e.getLocalizedMessage());
						System.out.println("Due Date field not displayed-----");
					}
					return null;	
				}	
				
				//SelectBillRunCycle
				public WebElement Bill_Run_Cycle() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Bill Run Cycle dropdown should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("billRunCycle")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Bill Run Cycle dropdown not displayed-----"+e.getLocalizedMessage());
						System.out.println("Bill Run Cycle dropdown not displayed-----");
					}
					return null;	
				}	
				
				//runBill
				public WebElement Run_Bill() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Run Bill Button should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("runBill")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Run Bill Button not displayed-----"+e.getLocalizedMessage());
						System.out.println("Run Bill Button not displayed-----");
					}
					return null;	
				}	
				
				//SuccessBillRun
				public WebElement Success_Bill_Run() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Success Message should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("successBillRun")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Success Message not displayed-----"+e.getLocalizedMessage());
						System.out.println("Success Message not displayed-----");
					}
					return null;	
				}	
				
				//processAllCustomers
				public WebElement Process_All_Customers() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Process all Customers popup should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("processAllCustomers")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Process all Customers popup not displayed-----"+e.getLocalizedMessage());
						System.out.println("Process all Customers popup not displayed-----");
					}
					return null;	
				}	
				
				
				
				
				
				
				//custManage
				public WebElement Cust_manage() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Issue Date field should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("custmanage")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Issue Date field not displayed-----"+e.getLocalizedMessage());
						System.out.println("Issue Date field not displayed-----");
					}
					return null;	
				}
				
				//ViewBillRunStatement
				public WebElement View_Bill_Run_Statement() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("View button should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("viewBillRunStatement")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("View Button not displayed-----"+e.getLocalizedMessage());
						System.out.println("View button not displayed-----");
					}
					return null;	
				}
		
				//rollbackAndFixButton
				public WebElement Rollback_And_Fix_Button() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Rollback and fix button should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("rollbackAndFixButton")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Rollback and fix Button not displayed-----"+e.getLocalizedMessage());
						System.out.println("Rollback and fix button not displayed-----");
					}
					return null;	
				}
		
				
				//continueRollback
				public WebElement Continue_Rollback() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Rollback and fix button should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("continueRollback")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Rollback and fix Button not displayed-----"+e.getLocalizedMessage());
						System.out.println("Rollback and fix button not displayed-----");
					}
					return null;	
				}
				
				
				
				//SuccesssRollback
				public WebElement Successs_Rollback() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Success message should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("successsRollback")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Success message not displayed-----"+e.getLocalizedMessage());
						System.out.println("Success message not displayed-----");
					}
					return null;	
				}
				
				

				//CloseIcon
				public WebElement Close_Icon() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Close icon should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("closeIcon")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Close icon not displayed-----"+e.getLocalizedMessage());
						System.out.println("Close icon not displayed-----");
					}
					return null;	
				}
				

				//CloseIcon2
				public WebElement Close_Icon2() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Close icon 2 should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("closeIcon2")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Close icon 2 not displayed-----"+e.getLocalizedMessage());
						System.out.println("Close icon 2 not displayed-----");
					} 
					return null;	
				}
				
				

				//CloseIconB
				public WebElement Close_IconB() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Close icon 2 should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("closeIconB")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Close icon 2 not displayed-----"+e.getLocalizedMessage());
						System.out.println("Close icon 2 not displayed-----");
					} 
					return null;	
				}
				
				//YesButton
				public WebElement Yes_Button() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Yes Button should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("yesButton")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Yes Button not displayed-----"+e.getLocalizedMessage());
						System.out.println("Yes Button not displayed-----");
					} 
					return null;	
				}
				
				
				//StatementTab
				public WebElement Statement_Tab() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Statement tab should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("statementTab")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Statement tab not displayed-----"+e.getLocalizedMessage());
						System.out.println("Statement tab not displayed-----");
					} 
					return null;	
				}
				
				//ViewDetails
				public WebElement View_Details() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Statement tab should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("viewDetails")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Statement tab not displayed-----"+e.getLocalizedMessage());
						System.out.println("Statement tab not displayed-----");
					} 
					return null;	
				}
				
				
				//RollbackButton
				public WebElement Rollback_Button() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Rollback Button should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("rollbackButton")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Rollback Button not displayed-----"+e.getLocalizedMessage());
						System.out.println("Rollback Button not displayed-----");
					} 
					return null;	
				}
				
				
				
				//RollbackReason
				public WebElement Rollback_Reason() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Rollback reason popup should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("rollbackReason")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Rollback reason popup not displayed-----"+e.getLocalizedMessage());
						System.out.println("Rollback reason popup not displayed-----");
					} 
					return null;	
				}
				
				//OkButton
				public WebElement Ok_Button() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Ok button should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("okButton")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Ok button not displayed-----"+e.getLocalizedMessage());
						System.out.println("Ok button not displayed-----");
					} 
					return null;	
				}
				
				
				//InformationPopup
				public WebElement Information_Popup() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Information Popup should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("informationPopup")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Information Popup not displayed-----"+e.getLocalizedMessage());
						System.out.println("Information Popup not displayed-----");
					} 
					return null;	
				}
				
				//viewRollbackHistory
				public WebElement View_Rollback_History() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("View Rollback History button should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("viewRollbackHistory")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("View Rollback History button not displayed-----"+e.getLocalizedMessage());
						System.out.println("View Rollback History button not displayed-----");
					} 
					return null;	
				}
				
				//RebillButton
				public WebElement Rebill_Button() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Rebill button should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("rebillButton")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Rebill button not displayed-----"+e.getLocalizedMessage());
						System.out.println("Rebill button not displayed-----");
					} 
					return null;	
				}
					
				//runBill
				public WebElement Run_Bill_2() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Run Bill button should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("runBill2")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Run Bill button not displayed-----"+e.getLocalizedMessage());
						System.out.println("Run Bill button not displayed-----");
					} 
					return null;	
				}
				
				//ResultPopup
				public WebElement Result_Popup() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Success Popup should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("resultPopup")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Success Popup not displayed-----"+e.getLocalizedMessage());
						System.out.println("Success Popup not displayed-----");
					} 
					return null;	
				}
				
				//BillRunSearch
				public WebElement Bill_Run_Search() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Bill Run Search button should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("billRunSearch")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Bill Run Search button not displayed-----"+e.getLocalizedMessage());
						System.out.println("Bill Run Search button not displayed-----");
					} 
					return null;	
				}
				
				//StatementToggle
				public WebElement Statement_Toggle() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Statement toggle should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("statementToggle")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Statement toggle not displayed-----"+e.getLocalizedMessage());
						System.out.println("Statement toggle not displayed-----");
					} 
					return null;	
				}
				
				//EditGroup
				public WebElement Edit_Group() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Edit Group button should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("editGroup")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Edit Group button not displayed-----"+e.getLocalizedMessage());
						System.out.println("Edit Group button not displayed-----");
					} 
					return null;	
				}
				
				//DueDatePaymentTerms
				public WebElement Due_Date_Payment_Terms() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Due Date Payment Terms toggle should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("dueDatePaymentTerms")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Due Date Payment Terms toggle not displayed-----"+e.getLocalizedMessage());
						System.out.println("Due Date Payment Terms toggle not displayed-----");
					} 
					return null;	
				}
			
				//commercialCheckbox
				public WebElement Commercial_Checkbox() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Commercial Checkbox should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("commercialCheckbox")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Due Date Payment Terms toggle not displayed-----"+e.getLocalizedMessage());
						System.out.println("Due Date Payment Terms toggle not displayed-----");
					} 
					return null;	
				}
				
				//ResidentialCheckbox
				public WebElement Residential_Checkbox() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Residential Checkbox should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("residentialCheckbox")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Due Date Payment Terms toggle not displayed-----"+e.getLocalizedMessage());
						System.out.println("Due Date Payment Terms toggle not displayed-----");
					} 
					return null;	
				}
				
				//BusinessCheckbox
				public WebElement Business_Checkbox() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Business Checkbox should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("businessCheckbox")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Due Date Payment Terms toggle not displayed-----"+e.getLocalizedMessage());
						System.out.println("Due Date Payment Terms toggle not displayed-----");
					} 
					return null;	
				}
				
				//PaymentTermMethodG
				public WebElement Payment_Term_Method_G() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Payment Term Method Group should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("paymentTermMethodG")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Payment Term Method Group not displayed-----"+e.getLocalizedMessage());
						System.out.println("Payment Term Method Group not displayed-----");
					} 
					return null;	
				}
				
				//PaymentDays
				public WebElement Payment_Days() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Payment Days Field should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("paymentDays")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Payment Days Field not displayed-----"+e.getLocalizedMessage());
						System.out.println("Payment Days Field not displayed-----");
					} 
					return null;	
				}
				
				//SaveChangesButton
				public WebElement Save_Changes_Button() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Save changes button should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("saveChangesButton")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Save changes button not displayed-----"+e.getLocalizedMessage());
						System.out.println("Save changes button not displayed-----");
					} 
					return null;	
				}
				
				
				//AssertSuccessMessage
				public WebElement Assert_Success_Message() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Success message should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("assertSuccessMessage")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Success message not displayed-----"+e.getLocalizedMessage());
						System.out.println("Success message not displayed-----");
					} 
					return null;	
				}
				
				//PaymentTermMethod
				public WebElement Payment_Term_Method() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Payment Term Method dropdown should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("paymentTermMethod")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Payment Term Method dropdown not displayed-----"+e.getLocalizedMessage());
						System.out.println("Payment Term Method dropdown not displayed-----");
					} 
					return null;	
				}
				
				
				//PaymentDaysC
				public WebElement Payment_Days_C() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Payment Days field should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("paymentDaysC")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Payment Days field not displayed-----"+e.getLocalizedMessage());
						System.out.println("Payment Days field not displayed-----");
					} 
					return null;	
				}
				
				//DetailsTab
				public WebElement Details() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Details Tab should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("detailsTab")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Details Tab not displayed-----"+e.getLocalizedMessage());
						System.out.println("Details Tab not displayed-----");
					} 
					return null;	
				}
				
				//WorkdaySchedule
				public WebElement Workday_Schedule() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Workday Schedule Tab should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("workdaySchedule")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Workday Schedule Tab not displayed-----"+e.getLocalizedMessage());
						System.out.println("Workday Schedule Tab not displayed-----");
					} 
					return null;	
				}
				
				//SelectCalender
				public WebElement Select_Calender() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Select Calender dropdown should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("selectCalender")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Select Calender dropdown not displayed-----"+e.getLocalizedMessage());
						System.out.println("Select Calender dropdown not displayed-----");
					} 
					return null;	
				}
				
				
				//StartDateH
				public WebElement Start_Date_H() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Select Date Datepicker should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("startDateH")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Select Date Datepicker not displayed-----"+e.getLocalizedMessage());
						System.out.println("Select Date Datepicker not displayed-----");
					} 
					return null;	
				}
				
				//EndDateH
				public WebElement End_Date_H() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("End Date Datepicker should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("endDateH")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("End Date Datepicker not displayed-----"+e.getLocalizedMessage());
						System.out.println("End Date Datepicker not displayed-----");
					} 
					return null;	
				}
				
				
				//viewHoliday
				public WebElement View_Holiday() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("View Button should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("viewHoliday")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("View Button not displayed-----"+e.getLocalizedMessage());
						System.out.println("View Button not displayed-----");
					} 
					return null;	
				}
				
				//Meter Numbers
				public WebElement Meter_Numbers_Import() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Meter Numbers Import tab should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("meterNumbers")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Meter Numbers Import tab not displayed-----"+e.getLocalizedMessage());
						System.out.println("Meter Numbers Import tab not displayed-----");
					} 
					return null;	
				}
				
		
				//Meter Registers
				public WebElement Meter_Registers_Import() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Meter Registers Import tab should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("meterRegisters")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Meter Registers Import tab not displayed-----"+e.getLocalizedMessage());
						System.out.println("Meter Registers Import tab not displayed-----");
					} 
					return null;	
				}
				
				
				
				//PIT_Front
				public WebElement PIT_Front() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Primary Invoice Template Front dropdown should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("PIT_Front")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Primary Invoice Template Front dropdown not displayed-----"+e.getLocalizedMessage());
						System.out.println("Primary Invoice Template Front dropdown not displayed-----");
					} 
					return null;	
				}
					
				
				
				//PIT_Back
				public WebElement PIT_Back() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Primary Invoice Template Back dropdown should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("PIT_Back")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Primary Invoice Template Back dropdown not displayed-----"+e.getLocalizedMessage());
						System.out.println("Primary Invoice Template Back dropdown not displayed-----");
					} 
					return null;	
				}
					
				
				//SIT_Front
				public WebElement SIT_Front() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Secondary Invoice Template Front dropdown should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("SIT_Front")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Secondary Invoice Template Front dropdown not displayed-----"+e.getLocalizedMessage());
						System.out.println("Secondary Invoice Template Front dropdown not displayed-----");
					} 
					return null;	
				}
				
				//SIT_Back
				public WebElement SIT_Back() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Secondary Invoice Template Back dropdown should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("SIT_Back")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Secondary Invoice Template Back dropdown not displayed-----"+e.getLocalizedMessage());
						System.out.println("Secondary Invoice Template Back dropdown not displayed-----");
					} 
					return null;	
				}
				
				//Templates
				public WebElement Templates() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Templates tab should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("templates")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Templates tab not displayed-----"+e.getLocalizedMessage());
						System.out.println("Templates tab not displayed-----");
					} 
					return null;	
				}
				
				//Message Type
				public WebElement Message_Type() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Message type dropdown should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("messageType")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Message type dropdown not displayed-----"+e.getLocalizedMessage());
						System.out.println("Message type dropdown not displayed-----");
					} 
					return null;	
				}
				
				//Email From
				public WebElement Email_From() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Email from field should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("emailFrom")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Email from field not displayed-----"+e.getLocalizedMessage());
						System.out.println("Email from field not displayed-----");
					} 
					return null;	
				}
				
				//Email Bcc
				public WebElement Email_Bcc() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Email Bcc field should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("emailBcc")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Email Bcc field not displayed-----"+e.getLocalizedMessage());
						System.out.println("Email from field not displayed-----");
					} 
					return null;	
				}
				
				//Email Subject
				public WebElement Email_Subject() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Email Subject field should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("emailSubject")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Email Subject field not displayed-----"+e.getLocalizedMessage());
						System.out.println("Email Subject field not displayed-----");
					} 
					return null;	
				}
				
				//Email Messgae
				public WebElement Email_Messgae() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Email Message field should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("emailMessgae")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Email Message field not displayed-----"+e.getLocalizedMessage());
						System.out.println("Email Message field not displayed-----");
					} 
					return null;	
				}
				
				//Save Button
				public WebElement Save_button() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Save Button should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("savebutton")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Save Button not displayed-----"+e.getLocalizedMessage());
						System.out.println("Save Button not displayed-----");
					} 
					return null;	
				}
				
				//Save Button
				public WebElement Success_Message() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Success Message should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("successMessage")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Success Messsage not displayed-----"+e.getLocalizedMessage());
						System.out.println("Success Message not displayed-----");
					} 
					return null;	
				}
				
				//Save Button
				public WebElement Email_Results_Popup() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Send Email Results popup should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("emailResultPopup")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Send Email Results popup not displayed-----"+e.getLocalizedMessage());
						System.out.println("Send Email Results popup not displayed-----");
					} 
					return null;	
				}
				
				
				
				//Update Statement Dates
				public WebElement Update_Statement_Dates() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Update Statement Dates button should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("updateStatementDates")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Update Statement Dates button not displayed-----"+e.getLocalizedMessage());
						System.out.println("Update Statement Dates button not displayed-----");
					} 
					return null;	
				}
				
				
				//Select Checkbox
				public WebElement Select_Checkbox() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Checkbox icon should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("selectCheckbox")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Checkbox icon not displayed-----"+e.getLocalizedMessage());
						System.out.println("Checkbox icon not displayed-----");
					} 
					return null;	
				}
				
				
				//New Issue Date
				public WebElement New_Issue_Date() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("New Issue Date field should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("newIssueDate")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("New Issue Date field not displayed-----"+e.getLocalizedMessage());
						System.out.println("New Issue Date field not displayed-----");
					} 
					return null;	
				}
				
				
				//New Due Date
				public WebElement New_Due_Date() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("New Due Date field should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("newDueDate")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("New Due Date field not displayed-----"+e.getLocalizedMessage());
						System.out.println("New Issue Date field not displayed-----");
					} 
					return null;	
				}
				
			
				//Update Button
				public WebElement Update_Button() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Update Button should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("updateButton")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Update Button not displayed-----"+e.getLocalizedMessage());
						System.out.println("Update Button  not displayed-----");
					} 
					return null;	
				}
				

				//Success Info Message
				public WebElement Success_Info_Message() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Success Message should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("successInfoMessage")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Success Message not displayed-----"+e.getLocalizedMessage());
						System.out.println("Success Message not displayed-----");
					} 
					return null;	
				}
				
				//Download_Pdf_Icon
				public WebElement Download_Pdf_Icon() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Download PDF Icon should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("downloadPdfIcon")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Download PDF Icon not displayed-----"+e.getLocalizedMessage());
						System.out.println("Download PDF Icon  not displayed-----");
					} 
					return null;	
				}
				
				//Selected_Customers_D
				public WebElement Selected_Customers_D() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Selected Customers Download option should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("selectedCustomersD")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Selected Customers Download option not displayed-----"+e.getLocalizedMessage());
						System.out.println("Selected Customers Download option not displayed-----");
					} 
					return null;
				}
				
				//Download Button
				public WebElement Download_Button() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Selected Customers Download option should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("downloadButton")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Selected Customers Download option not displayed-----"+e.getLocalizedMessage());
						System.out.println("Selected Customers Download option not displayed-----");
					} 
					return null;
				}
			

				//Email_Bills_Icon
				public WebElement Email_Bills_Icon() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Email Bills icon should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("emailBillsIcon")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Email Bills icon not displayed-----"+e.getLocalizedMessage());
						System.out.println("Email Bills icon not displayed-----");
					} 
					return null;
				}
				
				
				
				//All_Customer_Email
				public WebElement All_Customer_Email() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Selected Customers Download option should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("allCustEmail")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Selected Customers Download option not displayed-----"+e.getLocalizedMessage());
						System.out.println("Selected Customers Download option not displayed-----");
					} 
					return null;
				}
				

				//Continue Email
				public WebElement Continue_Email() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Continue Email button should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("continueEmail")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Continue Email button not displayed-----"+e.getLocalizedMessage());
						System.out.println("Continue Email button not displayed-----");
					} 
					return null;
				}
				

				//Send Email Results Popup
				public WebElement Send_Email_Results() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Send Email Results Popup should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("sendEmailResults")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Send Email Results Popup not displayed-----"+e.getLocalizedMessage());
						System.out.println("Send Email Results Popup not displayed-----");
					} 
					return null;
				}
				
				//FirstDay
				public WebElement First_Day() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Select first day from datepicker should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("firstDay")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Select first day from datepicker not displayed-----"+e.getLocalizedMessage());
						System.out.println("Select first day from datepicker not displayed-----");
					} 
					return null;
				}
				
				//ContinueButton
				public WebElement Continue_Button() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Continue button should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("continueButton")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Continue button not displayed-----"+e.getLocalizedMessage());
						System.out.println("Continue button not displayed-----");
					} 
					return null;
				}
				
				//TransactionTab
				public WebElement Transaction_Button() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Transaction button should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("transactionsTab")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Transaction button not displayed-----"+e.getLocalizedMessage());
						System.out.println("Transaction button not displayed-----");
					} 
					return null;
				}
				
				//TransactionType
				public WebElement Transaction_Type() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Transaction type dropdown field should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("transactionType")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Transaction type dropdown field not displayed-----"+e.getLocalizedMessage());
						System.out.println("Transaction type dropdown field not displayed-----");
					} 
					return null;
				}
				
				//PaymentMethod
				public WebElement Payment_Method() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Payment method dropdown field should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("paymentMethod")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Payment method dropdown field not displayed-----"+e.getLocalizedMessage());
						System.out.println("Payment method dropdown field not displayed-----");
					} 
					return null;
				}
				
				//PaymentAmount
				public WebElement Payment_Amount() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Amount field should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("amount")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Amount field not displayed-----"+e.getLocalizedMessage());
						System.out.println("Amount field not displayed-----");
					} 
					return null;
				}
				
				//Transaction Date
				public WebElement Transaction_Date() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Transaction date field should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("transactionDate")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Transaction date field not displayed-----"+e.getLocalizedMessage());
						System.out.println("Transaction date field  not displayed-----");
					} 
					return null;
				}
				
				//Make Payment
				public WebElement Make_Payment() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Make Payment button should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("makePayment")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Make Payment button not displayed-----"+e.getLocalizedMessage());
						System.out.println("Make Payment button not displayed-----");
					} 
					return null;
				}
				
				//Pay Method
				public WebElement Pay_Method() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Payment method should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("paymethod")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Payment method not displayed-----"+e.getLocalizedMessage());
						System.out.println("Payment method not displayed-----");
					} 
					return null;
				}
				
				//Make New Payment
				public WebElement Make_New_Payment() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Make New Payment button should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("makeNewPayment")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Make New Payment button not displayed-----"+e.getLocalizedMessage());
						System.out.println("Make New Payment button not displayed-----");
					} 
					return null;
				}
				
				public WebElement Click_on_COK() 
				{
					try { 
						WebDriverWait wait= new WebDriverWait(driver,60);
						System.out.println("Make New Payment button should be displayed");
						WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("clickOnCOK")));
						return ele;	
					} catch (Exception e) {
						Reporter.log("Make New Payment button not displayed-----"+e.getLocalizedMessage());
						System.out.println("confirmation clicked-----");
					} 
					return null;
				}
				
				
}



