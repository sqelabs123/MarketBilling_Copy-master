package Marketing_Project;



import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import Re_Useable.Assertion_Test;
import Re_Useable.Login_site;
import Re_Useable.Repo_testing;
import bsh.ParseException;

public class bussinesstest extends Login_site {
	Set <String> as;
	String holidayDate;
	JavascriptExecutor executor;
	List<String> values;
	Repo_testing action_obj;
	Assertion_Test Assertion_obj;
	public String MeterNumber;
	public String Resi, Comm, Busi, issueDate, dueDate, issueDate1, dueDate1, issueDate2 ;
	public String dueDate2, LastDate, month, result, Result1, day1,month1, year1;
	public int Result, Result2;
	//final int[][] matrix;
	public long difference_In_Days;
	String success;
	LocalDate date;
	int days;

	public int random = (new Random()).nextInt(9000000) + 1000000;
	Random rand;
	public int random2 = (new Random()).nextInt(900) + 100;
	Random rand2;
	




/*
	@Test(priority=0)
	public void Add_Residential_Customer() throws Exception{

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
		action_obj.entr_firstName().sendKeys("Sandy");
		action_obj.enter_surname().sendKeys("sam");
		// adding scripts for Version 7.0.37...............
		// Add Phone (BH)
		action_obj.PhoneBH().sendKeys("42" + random);
		// Add Phone (AH)
		action_obj.PhoneAH().sendKeys("40" + random);

		action_obj.Mobilenumber().sendKeys("43" + random);
		action_obj.Cemail().sendKeys("test_Resdnt9@yopmail.com");
		action_obj.Address1().sendKeys("Madirma R-Town");
		action_obj.City_Suburb().sendKeys("Mills NY");
		Select St = new Select(action_obj.Custmr_State());
		St.selectByValue("NSW");

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
		executor.executeScript("window,scrollBy(0,400)", "");
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
		Resi = driver.findElement(By.xpath("//label[@class='col-sm-12 control-label']/a")).getText();


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
		action_obj.NMISelct().sendKeys("N" + random+"66");

		//	NMI = driver.findElement(By.cssSelector("input#NMI")).getText();
		//Thread.sleep(4000);
		Select planno = new Select(action_obj.Service_plan());
		//planno.selectByVisibleText("MktPlan_NetworkRate100");
		planno.selectByIndex(2);
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
		action_obj.SearchID1().sendKeys("N" + random+"66");
		Assertion_obj.Assertion_serviceId1();
		Thread.sleep(3000);

		//Click on Edit button
		action_obj.Service_Edit().click();
		Thread.sleep(1000);

		executor.executeScript("window,scrollBy(0,1800)", "");

		//Click on Add Metering
		action_obj.Add_Meter().click();

		//Assertion on title
		Assertion_obj.Assertion_Create_Meter();

		//Add Meter Number
		action_obj.Meter_Serial_Number().sendKeys("METER9" + random2);

		MeterNumber = action_obj.Meter_Serial_Number().getText();

		//Select Consumption Type
		Select consumptionType = new Select(action_obj.Consumption_Type());
		consumptionType.selectByValue("C");
		Thread.sleep(1000);

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
		Thread.sleep(1000);


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
		Select consumptionType8 = new Select(action_obj.Consumption_Type());
		consumptionType8.selectByValue("C");
		Thread.sleep(1000);

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
		meternumber.selectByVisibleText("METER9" + random2);
		Thread.sleep(6000);

		executor.executeScript("window,scrollBy(0,1800)", "");
		Thread.sleep(1000);

		//Click on View Meter Reads
		action_obj.View_Meter_Reads().click();

		//Click on Add Reads
		action_obj.Add_Read().click();

		//Select Meter No
		Select meterno = new Select(action_obj.Meter_No());
		meterno.selectByVisibleText("METER9" + random2);
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
		meterno2.selectByVisibleText("METER9" + random2);
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

	

	@Test(priority=1)
	public void Add_BillRun_Cycle() throws Exception
	{   
		action_obj =new Repo_testing(driver);
		Assertion_obj = new Assertion_Test(driver);  
		executor = (JavascriptExecutor) driver;
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
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

		action_obj.cycleName().sendKeys("DueDate"+ random2);
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


		Thread.sleep(3000);
		//Select the customer
		action_obj.SelectCust().click();

		Thread.sleep(3000);
		//Click on Move Button
		action_obj.MoveBtn().click();
		Thread.sleep(3000);

		//Thread.sleep(3000);
		//Select the customer
		action_obj.SelectCust().click();

		Thread.sleep(3000);
		//Click on Move Button
		action_obj.MoveBtn().click();
		Thread.sleep(3000);

		//Thread.sleep(3000);
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
	}

*/
	
	
	
	
	@Test(priority=0)
	public void Business_Days_Due_Date() throws Exception{

		action_obj = new Repo_testing(driver);
		Assertion_obj = new Assertion_Test(driver);
		executor = (JavascriptExecutor) driver;
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	/*	//Click on Admin Tab
		action_obj.Admin().click();

		//Click on Edit Group button
		action_obj.Edit_Group().click();

		executor.executeScript("window,scrollBy(0,2400)", "");

		//Select Bussiness Payment Method
		Select BPM = new Select(action_obj.Payment_Term_Method_G());
		BPM.selectByVisibleText("Business days");

		//Clear Payment days
		action_obj.Payment_Days().clear();
		Thread.sleep(1000);

		//Enter number of days
		action_obj.Payment_Days().sendKeys("15");

		executor.executeScript("window,scrollBy(0,2500)", "");
		Thread.sleep(1000);

		action_obj.Save_Changes_Button().click();

		//Click on ok button
		action_obj.OKbtn().click();
		Thread.sleep(2000);*/

	/*	Thread.sleep(3000);
		//Click on Bill Run tab
		action_obj.Bill_Run().click();

		//Click on Run the Bills
		action_obj.Run_The_Bills().click();
		Thread.sleep(1000);

		//Click on Start Date
		action_obj.Start_Date().click();
		Thread.sleep(1000);

		//Select Today Date
		action_obj.TodayDate().click();
		Thread.sleep(1000);

		//Click on End Date
		action_obj.End_Date().click();
		Thread.sleep(1000);

		//Select Today Date
		action_obj.TodayDate().click();
		Thread.sleep(1000);

		//Click on Issue Date
		action_obj.Issue_Date().click();
		Thread.sleep(1000);

		//Select Today Date
		action_obj.TodayDate().click();
		Thread.sleep(1000);

		//Select Today Date
		//action_obj.Due_Date().click();
		//Thread.sleep(1000);

		//Select Today Date
		//action_obj.TodayDate().click();
		//Thread.sleep(1000);

		//Select Bill Run Cycle
		Select billruncycle = new Select(action_obj.Bill_Run_Cycle());
		//billruncycle.selectByVisibleText("DueDate"+ random2);
		billruncycle.selectByVisibleText("DueDate301");
		Thread.sleep(5000);


		//Click on Run Bill button
		action_obj.Run_Bill().click();
		Thread.sleep(5000);

		//Click on View Button
		action_obj.View_Bill_Run_Statement().click();
		Thread.sleep(5000);

		issueDate1 = driver.findElement(By.xpath("//tr[@class='odd']/td[3]")).getText();

		dueDate1 = driver.findElement(By.xpath("//tr[@class='odd']/td[4]")).getText();
		
		//Click on rollback and fix button
		action_obj.Rollback_And_Fix_Button().click();
		Thread.sleep(1000);

		//Click on Continue Rollback button
		action_obj.Continue_Rollback().click();
		Thread.sleep(1000);

		//Assert Success Message
		Assertion_obj.Assertion_Successs_Rollback();
		Thread.sleep(1000);

		//Close the popup
		action_obj.Close_Icon().click();
		Thread.sleep(1000);
		*/
		
		
		
		
		
		

		Thread.sleep(5000);
		//Click on Admin Tab
		action_obj.Admin().click();
		Thread.sleep(2000);
		//Click on Workday Schedule
		action_obj.Workday_Schedule().click();
		Thread.sleep(2000);
		executor.executeScript("window,scrollBy(0,1500)", "");
		
		//Select Calender
		Select calender = new Select(action_obj.Select_Calender());
		calender.selectByVisibleText("2 - NSW District Holidays");
		Thread.sleep(2000);
		//Enter Start Date
		action_obj.Start_Date_H().sendKeys("23/09/2021"+Keys.ESCAPE);
		Thread.sleep(3000);
		//Enter End Date
		action_obj.End_Date_H().sendKeys("14/10/2021"+Keys.ESCAPE);
		Thread.sleep(3000);
		//Click on View Button
		action_obj.View_Holiday().click();
		Thread.sleep(2000);
		
		
		executor.executeScript("window,scrollBy(0,2500)", "");
		
		List<WebElement> day =driver.findElements(By.cssSelector("#holiTable td:nth-child(5)"));
		List<WebElement> month =driver.findElements(By.cssSelector("#holiTable td:nth-child(4)"));
		List<WebElement> year =driver.findElements(By.cssSelector("#holiTable td:nth-child(6)"));
		
	
		  Iterator<WebElement> iterator = day.iterator();
		  Iterator<WebElement> iterator1 = month.iterator();
		  Iterator<WebElement> iterator2 = year.iterator();
		  
		    values = new ArrayList<String>();
		    while (iterator.hasNext()&&iterator1.hasNext()&&iterator2.hasNext()){
		        WebElement element = iterator.next();
		        WebElement element1 =iterator1.next();
		        WebElement element2 =iterator2.next();
		        values.add(element.getText()+" "+ element1.getText()+" "+ element2.getText());
		       
	
		           }
		    
		    
		      StringBuilder sb = new StringBuilder();

		      boolean firstTime = false;
		      int count=0;

		      for (String str : values) {

		          if (firstTime) {
		              firstTime = false;
		          } else {
		        	  
		        	  SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy"); 
						Date d1 = sdf.parse(str); 
						
									 
						 String result2 =d1.toString();
							String input = result2;
						
							DateTimeFormatter f = DateTimeFormatter.ofPattern( "E MMM dd HH:mm:ss z uuuu" )
							                                       .withLocale( Locale.US );
							ZonedDateTime zdt = ZonedDateTime.parse( input , f );
							LocalDate ld = zdt.toLocalDate();
							DateTimeFormatter fLocalDate = DateTimeFormatter.ofPattern( "EEE" );
							String output = ld.format( fLocalDate) ;
							if (output.equals("Sun")||output.equals("Sat"))
						     continue;
							else 
								count++;
							
							
						 
							   System.out.println(output); 
							 //  System.out.println(output.length()); 
						//	int result =  output.length();
							   
							
							    }	
		         
						
		              sb.append(",");
		          
		          sb.append(str);
		         
				//	System.out.println(result);
		         // System.out.println(str);
		          
		      } 
		      System.out.println(count);
		          
		          
		      
		
		
	SimpleDateFormat sdf9 = new SimpleDateFormat("dd/MM/yyyy"); 
	Date d2 = sdf9.parse("23/09/2021"); 
	Date d3 = sdf9.parse("14/10/2021"); 


	   Calendar c1 = Calendar.getInstance();
	    c1.setTime(d2);
	   // int w1 = c1.get(Calendar.DAY_OF_WEEK);
	    //c1.add(Calendar.DAY_OF_WEEK, -w1);
        
	    
	    
	    Calendar c2 = Calendar.getInstance();
	    c2.setTime(d3);
	    //int w2 = c2.get(Calendar.DAY_OF_WEEK);
	    //c2.add(Calendar.DAY_OF_WEEK,-w2);
	    
	    
	    
	    
	    
	    int workDays = 0;
	    //If working dates are same,then checking what is the day on that date.
	    if (c1.getTimeInMillis() == c2.getTimeInMillis()) {
	        if (c1.get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY && c1.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY)
	        {
	            ++workDays;
	        }
	        }
	    /*If start date is coming after end date, Then shuffling Dates and storing dates 
	by incrementing upto end date in do-while part.*/
	    if (c1.getTimeInMillis() > c2.getTimeInMillis()) {
	            c1.setTime(d3);
	            c2.setTime(d2);
	    }

	    do {
	        
	        if (c1.get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY && c1.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
	            ++workDays;
	            }
	    c1.add(Calendar.DAY_OF_MONTH, 1);
	        } while (c1.getTimeInMillis() <= c2.getTimeInMillis());

	    //   return workDays; 
	       System.out.println(workDays - count);
	       
	   	long expresult2= workDays - count;
		long actresult1= 15;
		Assert.assertEquals(actresult1,expresult2);
	}
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    

	  /*  //end Saturday to start Saturday 
	    long days = (c2.getTimeInMillis()-c1.getTimeInMillis())/(1000*60*60*24);
	    long daysWithoutWeekendDays = days-(days*2/7);

	    // Adjust days to add on (w2) and days to subtract (w1) so that Saturday
	    // and Sunday are not included
	    if (w1 == Calendar.SUNDAY && w2 != Calendar.SATURDAY) {
	        w1 = Calendar.MONDAY;
	    } else if (w1 == Calendar.SATURDAY && w2 != Calendar.SUNDAY) {
	        w1 = Calendar.FRIDAY;
	    } 

	    if (w2 == Calendar.SUNDAY) {
	        w2 = Calendar.MONDAY;
	    } else if (w2 == Calendar.SATURDAY) {
	        w2 = Calendar.FRIDAY;
	    }

	   // return daysWithoutWeekendDays-w1+w2;
	
	System.out.println(daysWithoutWeekendDays-w1+w2 - count);
	Thread.sleep(3000);
	*/
	
	
	
	
	
	//long expresult2= daysWithoutWeekendDays-w1+w2 - count;
	//long expresult2= workDays - count;
//	long actresult1= 15;
	//Assert.assertEquals(actresult1,expresult2);
	
	}

	



