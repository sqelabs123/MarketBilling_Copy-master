package Marketing_Project;

import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Re_Useable.Assertion_Test;
import Re_Useable.Login_site;
import Re_Useable.Repo_testing;

public class Add_Plans extends Login_site{
	JavascriptExecutor executor;
	 Repo_testing action_obj;
	 Assertion_Test Assertion_obj; 
	 public String planno;
	 public int random= (new Random()).nextInt(900)+100; 
		Random rand;
	@Test
  public void Add_Plan() throws Exception 
  {
		action_obj =new Repo_testing(driver);
		Assertion_obj = new Assertion_Test(driver);  
		executor = (JavascriptExecutor) driver;
	  //Select Rate Plan Tab
	  action_obj.Plans().click();
	  Assertion_obj.Assert_RatePlan();
	  
	  //Create A Plan
	  action_obj.CreatePlan().click();
	  
	  Assertion_obj.AssertCreatePlan();
	Select useagetype1=new Select(action_obj.Usages_Type());
	useagetype1.selectByVisibleText("Retail Electricity");
	action_obj.RatePlanname().sendKeys("Market_Electricity"+ random);  
	  
	Select  UsageTOU=new Select(action_obj.UsageTypeTOU());
	UsageTOU.selectByIndex(1);
	
	/*Select demandTou=new Select(action_obj.Demand_TOU());
	demandTou.selectByIndex(1);*/
	
	//Add Date From Valid
    action_obj.Datevalidfrom().click();
    action_obj.TodayDate().click();
    
    //Add Date To Valid
    action_obj.DateValidTo().click();
    action_obj.TodayDate().click();
    
    action_obj.TariffButton().click();
    // Tariff Page
  Assertion_obj.AssertTariffButton();
  
  // Add Tariff Page information 
  action_obj.Charge_Desc().sendKeys("Access Fee Per Bill");	
  action_obj.comptab().click();
  
  action_obj.Rollup_Desc().sendKeys("Access Fee Per Day");
   action_obj.comptab().click();

Select chrgtype=new Select(action_obj.charg_Type());
chrgtype.selectByVisibleText("Electricity Charges");
Thread.sleep(3000);
//Rating Method
Select RatMethod=new Select(action_obj.Rating_method());
RatMethod.selectByVisibleText("Ergon SAC Actual Demand");
Thread.sleep(3000);
action_obj.Demand_Threshold().sendKeys("10.45");
Thread.sleep(3000);
Select unit11=new Select(action_obj.Unit_Type_Plan());
unit11.selectByValue("EAC");
Thread.sleep(3000);

action_obj.Tariff_Rates().sendKeys("40");
Thread.sleep(1000);
//Add Dst Option
Select Dst_option=new Select(action_obj.DST());
Dst_option.selectByIndex(1);
Thread.sleep(1000);
action_obj.AddButton().click();

// Check Record
action_obj.Search_Tariff().sendKeys("40");

action_obj.Publish_Button().click();
Thread.sleep(1000);
action_obj.X().click();

action_obj.Search_Plan().sendKeys("Market_Electricity"+ random);

planno=action_obj.GetPlanNo().getText();










  }
}
