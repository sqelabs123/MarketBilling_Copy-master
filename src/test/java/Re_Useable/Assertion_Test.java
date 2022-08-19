package Re_Useable;

import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Re_Useable.Repo_testing;

public class Assertion_Test {
	public Repo_testing Robj;
	public WebDriver driver;
	
   public String Statements;
   public String Statements1;
   public String Statements2;
 
  
   
//      public String stno;
 	public Assertion_Test(WebDriver driver) throws IOException {
		this.driver=driver;
 		Robj = new Repo_testing(driver);
		
	}
	Properties prop;
	//Create Customer Saved 
		public static  String Ex_Bill_customersave;
		public static  String Act_Bill_customersave;
		public  void Assertion_Custoemrsave()  throws Exception 
		{ 
			//System.out.println(Ex_home=td.get_string_CellData("Assertion", 0, 0));
			Act_Bill_customersave=Robj.Assertion_Custoemrsave().getText();
			Ex_Bill_customersave="Successfully saved customer.";
			Assert.assertEquals(Act_Bill_customersave,Ex_Bill_customersave);
			System.out.println("	# Validation == PASS :: Customer Successfully Create with Validation Message");
			
		}
		public static  String Ex_Bill_changestatus;
		public static  String Act_Bill_changestatus;
		public  void Assertion_changestatuspopup()  throws Exception 
		{ 
			//System.out.println(Ex_home=td.get_string_CellData("Assertion", 0, 0));
			Act_Bill_changestatus=Robj.Assertion_chngstsbtn().getText();
			Ex_Bill_changestatus="Change Status";
			Assert.assertEquals(Act_Bill_changestatus,Ex_Bill_changestatus);
			System.out.println("	# Validation == PASS :: Change Status Popup Displayed");
			
		}
	//Assertion_chngStatus()	
		public static  String Ex_Bill_Asschangestatus;
		public static  String Act_Bill_Asschangestatus;
		public  void Assertion_chngStatusmesg()  throws Exception 
		{ 
			//System.out.println(Ex_home=td.get_string_CellData("Assertion", 0, 0));
			Act_Bill_Asschangestatus=Robj.Assertion_chngStatus().getText();
			Ex_Bill_Asschangestatus="Status change successful.";
			Assert.assertEquals(Act_Bill_Asschangestatus,Ex_Bill_Asschangestatus);
			System.out.println("	# Validation == PASS :: Status Change is displayed");
			
		}
		
		//successmsgservice()
		public static  String Ex_Bill_successmsg;
		public static  String Act_Bill_successmsg;
		public  void Assertion_successmsgservice()  throws Exception 
		{ 
			//System.out.println(Ex_home=td.get_string_CellData("Assertion", 0, 0));
			Act_Bill_successmsg=Robj.successmsgservice().getText();
			Ex_Bill_successmsg="Success! The Service has been created successfully.";
			//Ex_Bill_successmsg="Success!";
			Assert.assertEquals(Act_Bill_successmsg,Ex_Bill_successmsg);
			System.out.println("	# Validation == PASS :: Status Change is displayed");
			
		}
	//Survice ID
		//successmsgservice()
				public static  String Ex_Bill_SurviceID;
				public static  String Act_Bill_SurviceIDg;
				public  void Assertion_serviceId()  throws Exception 
				{ 
										
					//System.out.println(Ex_home=td.get_string_CellData("Assertion", 0, 0));
					Act_Bill_SurviceIDg=Robj.SurviceID1().getText();
					Ex_Bill_SurviceID="Connected";
					Assert.assertEquals(Act_Bill_SurviceIDg,Ex_Bill_SurviceID);
					System.out.println("	# Validation == PASS :: Status Change is displayed");
					
				}
		
				//Survice ID
				//successmsgservice()
						public static  String Ex_Bill_SurviceID1;
						public static  String Act_Bill_SurviceIDg1;
						public  void Assertion_serviceId1()  throws Exception 
						{ 
												
							//System.out.println(Ex_home=td.get_string_CellData("Assertion", 0, 0));
							Act_Bill_SurviceIDg1=Robj.SurviceID().getText();
							Ex_Bill_SurviceID1="Electricity";
						//	Ex_Bill_SurviceID1="EL";
							Assert.assertEquals(Act_Bill_SurviceIDg1,Ex_Bill_SurviceID1);
							System.out.println("	# Validation == PASS :: Status Change is displayed");
							
						}
			//	Retail electricity Service Details
		
				public static  String Ex_Bill_EditServicepage;
				public static  String Act_Bill_EditServicepage;
				public  void Assertion_SavServicepage()  throws Exception 
				{ 
					
					//System.out.println(Ex_home=td.get_string_CellData("Assertion", 0, 0));
					Act_Bill_EditServicepage=Robj.Service_Edit().getText();
					Ex_Bill_EditServicepage="Retail electricity Service Details";
					Assert.assertEquals(Act_Bill_EditServicepage,Ex_Bill_EditServicepage);
					System.out.println("	# Validation == PASS :: Status Change is displayed");
					
				}
			//	Serviceedit

				public static  String Ex_EditServicepage;
				public static  String Act_EditServicepage;
				public  void Assertion_pageEditService()  throws Exception 
				{ 
					
					//System.out.println(Ex_home=td.get_string_CellData("Assertion", 0, 0));
					Act_EditServicepage=Robj.Serviceedit().getText();
					Ex_EditServicepage="Retail Electricity Service Details";
					Assert.assertEquals(Act_EditServicepage,Ex_EditServicepage);
					System.out.println("	# Validation == PASS :: Status Change is displayed");
					
				}
				//Assertion_Plans
				public static  String Ex_RatePlan;
				public static  String Act_RatePlan;
				public  void Assert_RatePlan()  throws Exception 
				{ 
					
					//System.out.println(Ex_home=td.get_string_CellData("Assertion", 0, 0));
					Act_RatePlan=Robj.Assertion_Plans().getText();
					Ex_RatePlan="Rate Plans";
					Assert.assertEquals(Act_RatePlan,Ex_RatePlan);
					System.out.println("	# Validation == PASS :: Status Change is displayed ");
					
				}
		
		//AssertPlanpage
				public static  String Ex_CreateRatePlan;
				public static  String Act_createRatePlan;
				public  void AssertCreatePlan()  throws Exception 
				{ 
					
					//System.out.println(Ex_home=td.get_string_CellData("Assertion", 0, 0));
					Act_createRatePlan=Robj.Assertion_Plans().getText();
					Ex_CreateRatePlan="Rate Plans";
					Assert.assertEquals(Act_createRatePlan,Ex_CreateRatePlan);
					System.out.println("	# Validation == PASS :: Status Change is displayed ");
					
				}
		//TariffButton
				public static  String Ex_tariffPlans;
				public static  String Act_tariffPlans;
				public  void AssertTariffButton()  throws Exception 
				{ 
					
					//System.out.println(Ex_home=td.get_string_CellData("Assertion", 0, 0));
					Act_tariffPlans=Robj.Tariff_PlanPage().getText();
					Ex_tariffPlans="Add Tariff";
					Assert.assertEquals(Act_tariffPlans,Ex_tariffPlans);
					System.out.println("	# Validation == PASS :: Status Change is displayed ");
					
				}
				
				//Success_Plan
				public static  String Ex_successPlan;
				public static  String Act_successPlan;
				public  void Assertion_Success_Plan()  throws Exception 
				{ 
					
					//System.out.println(Ex_home=td.get_string_CellData("Assertion", 0, 0));
					Act_successPlan=Robj.Success_Plan().getText();
					Ex_successPlan="successfully  updated";
					Assert.assertEquals(Act_successPlan,Ex_successPlan);
					System.out.println("	# Validation == PASS :: Status Change is displayed ");
					
				}
				
			//		
				
				public static  String Ex_PlanNumber;
				public static  String Act_PlanNumber;
				public  void Assertplanno()  throws Exception 
				{ 
					
					//System.out.println(Ex_home=td.get_string_CellData("Assertion", 0, 0));
					Act_PlanNumber=Robj.Assert_planno().getText();
					Ex_PlanNumber="Retail Electricity";
					Assert.assertEquals(Act_PlanNumber,Ex_PlanNumber);
					System.out.println("	# Validation == PASS :: Status Change is displayed ");
					
				}
				
			//
				
				public static  String Ex_Checkstatus;
				public static  String Act_Checkstatus;
				public  void Assertion_Statuscheck()  throws Exception 
				{ 					
					//System.out.println(Ex_home=td.get_string_CellData("Assertion", 0, 0));
					Act_Checkstatus=Robj.Assert_Stauts().getText();
					Ex_Checkstatus="Active";
					Assert.assertEquals(Act_Checkstatus,Ex_Checkstatus);
					System.out.println("Validation == PASS :: Status Change is displayed ");
					
				}	
			//Asssert_Siteparamneterpage	
				public static  String Ex_Siteparameter;
				public static  String Act_SIteparameter;
				public  void Assertion_Site_parameterPage()  throws Exception 
				{ 
					
					//System.out.println(Ex_home=td.get_string_CellData("Assertion", 0, 0));
					Act_SIteparameter=Robj.Asssert_Siteparamneterpage().getText();
					Ex_Siteparameter="Network Site Specific Parameters";
					Assert.assertEquals(Act_SIteparameter,Ex_Siteparameter);
					System.out.println("Validation == PASS :: Status Change is displayed ");
					
				}	
			//SetUpSiteParameter	
				public static  String Ex_SetupSiteparameter;
				public static  String Act_SetupSIteparameter;
				public  void Assertion_SetupSIteparameterP()  throws Exception 
				{ 
					
					//System.out.println(Ex_home=td.get_string_CellData("Assertion", 0, 0));
					Act_SetupSIteparameter=Robj.SetUpSiteParameter().getText();
					Ex_SetupSiteparameter="Set Up Site Parameter";
					Assert.assertEquals(Act_SetupSIteparameter,Ex_SetupSiteparameter);
					System.out.println("Validation == PASS :: Status Change is displayed ");
					
				}		
				
			//Assert_RateplanSquence() 	
			
				public static  String Ex_RatePlanSquenc;
				public static  String Act_RatePlanSquenc;
				public  void Assertion_RatePlanSquenc()  throws Exception 
				{ 
					
					//System.out.println(Ex_home=td.get_string_CellData("Assertion", 0, 0));
					Act_RatePlanSquenc=Robj.Assert_RateplanSquence().getText();
					Ex_RatePlanSquenc="Rate Plan Sequence";
					Assert.assertEquals(Act_RatePlanSquenc,Ex_RatePlanSquenc);
					System.out.println("Validation == PASS :: Status Change is displayed ");
					
				}		
				
		//Assertion_Billrunpage 		
				public static  String Ex_Assert_BillRunPage;
				public static  String Act_Assert_BillRunPage;
				public  void Assertion_BillRunPage()  throws Exception 
				{ 
					
					//System.out.println(Ex_home=td.get_string_CellData("Assertion", 0, 0));
					Act_Assert_BillRunPage=Robj.Assertion_Billrunpage().getText();
					Ex_Assert_BillRunPage="Bill Run Cycles";
					Assert.assertEquals(Act_Assert_BillRunPage,Ex_Assert_BillRunPage);
					System.out.println("Validation == PASS :: Status Change is displayed ");
					
				}	
		//AddBillRUnCycle 
				public static  String Ex_AddBillRunCycle;
				public static  String Act_AddBillRunCycle;
				public  void Assertion_cycpepages()  throws Exception 
				{ 
					
					//System.out.println(Ex_home=td.get_string_CellData("Assertion", 0, 0));
					Act_AddBillRunCycle=Robj.AddBillRUnCycle1().getText();
					Ex_AddBillRunCycle="Add Bill Run Cycle";
					Assert.assertEquals(Act_AddBillRunCycle,Ex_AddBillRunCycle);
					System.out.println("Validation == PASS :: Status Change is displayed ");
					
				}		
			//Assertion_SaveCycle	
				public static  String Ex_SaveCycle;
				public static  String Act_Save_Cycle;
				public  void Assertion_SaveCycless()  throws Exception 
				{ 
					
					//System.out.println(Ex_home=td.get_string_CellData("Assertion", 0, 0));
					Act_Save_Cycle=Robj.Assertion_SaveCycle().getText();
					Ex_SaveCycle="Successfully added new bill run cycle.";
					Assert.assertEquals(Act_Save_Cycle,Ex_SaveCycle);
					System.out.println("Validation == PASS :: Status Change is displayed ");
					
				}	
				
				//Success_Bill_Run	
				public static  String Ex_successBillCycle;
				public static  String Act_successBillCycle;
				public  void Assert_Success_Bill_Run()  throws Exception 
				{ 
					
					//System.out.println(Ex_home=td.get_string_CellData("Assertion", 0, 0));
					Act_successBillCycle=Robj.Success_Bill_Run().getText();
					Ex_successBillCycle="Bill Run Complete!";
					Assert.assertEquals(Act_successBillCycle,Ex_successBillCycle);
					System.out.println("Validation == PASS :: Status Change is displayed ");
					
				}	
				
				
				//Success_Bill_Run	
				public static  String Ex_processAllCustomers;
				public static  String Act_processAllCustomers;
				public  void Assertion_Process_All_Customers()  throws Exception 
				{ 
					
					//System.out.println(Ex_home=td.get_string_CellData("Assertion", 0, 0));
					Act_processAllCustomers=Robj.Process_All_Customers().getText();
					Ex_processAllCustomers="Processing All Customers";
					Assert.assertEquals(Act_processAllCustomers,Ex_processAllCustomers);
					System.out.println("Validation == PASS :: Status Change is displayed ");
					
				}	
				
	//Updated--------------------------------------------------------------------------------------------------->			
				
				
				//AssertCreateMeter
				public static  String Ex_CreateMeter;
				public static  String Act_CreateMeter;
				public  void Assertion_Create_Meter()  throws Exception 
				{ 
					
					//System.out.println(Ex_home=td.get_string_CellData("Assertion", 0, 0));
					Act_CreateMeter=Robj.Assert_Create_Meter().getText();
					Ex_CreateMeter="Create Meter";
					Assert.assertEquals(Act_CreateMeter,Ex_CreateMeter);
					System.out.println("	# Validation == PASS :: Status Change is displayed ");
					
				}
				
				
				

				
				//AssertMetering
				public static  String Ex_Metering;
				public static  String Act_Metering;
				public  void Assertion_Metering()  throws Exception 
				{ 
					
					//System.out.println(Ex_home=td.get_string_CellData("Assertion", 0, 0));
					Act_Metering=Robj.Assert_Metering().getText();
					Ex_Metering="Retail Electricity Meter Details";
					Assert.assertEquals(Act_Metering,Ex_Metering);
					System.out.println("	# Validation == PASS :: Status Change is displayed ");
					
				}
				

				//SuccessMessageMeter
				public static  String Ex_SuccessMessageMeter;
				public static  String Act_SuccessMessageMeter;
				public  void Assert_Success_Message_Meter()  throws Exception 
				{ 
					
					//System.out.println(Ex_home=td.get_string_CellData("Assertion", 0, 0));
					Act_SuccessMessageMeter=Robj.Success_Message_Meter().getText();
					Ex_SuccessMessageMeter="Successfully registered meter.";
					Assert.assertEquals(Act_SuccessMessageMeter,Ex_SuccessMessageMeter);
					System.out.println("	# Validation == PASS :: Success Message is displayed ");
					
				}
				
				
			
				
				//AssertMeterRegister
				public static  String Ex_MeterRegister;
				public static  String Act_MeterRegister;
				public  void Assertion_Meter_Register()  throws Exception 
				{ 
					
					//System.out.println(Ex_home=td.get_string_CellData("Assertion", 0, 0));
					Act_MeterRegister=Robj.Assert_Meter_Register().getText();
					Ex_MeterRegister="Create Register";
					Assert.assertEquals(Act_MeterRegister,Ex_MeterRegister);
					System.out.println("	# Validation == PASS :: Status Change is displayed ");
					
				}
				
				//SuccessMeterRegister
				public static  String Ex_SuccessMessageRegister;
				public static  String Act_SuccessMessageRegister;
				public  void Assert_Success_Meter_Register()  throws Exception 
				{ 
					
					//System.out.println(Ex_home=td.get_string_CellData("Assertion", 0, 0));
					Act_SuccessMessageRegister=Robj.Success_Message_Meter_Register().getText();
					Ex_SuccessMessageRegister="Successfully created meter register.";
					Assert.assertEquals(Act_SuccessMessageRegister,Ex_SuccessMessageRegister);
					System.out.println("	# Validation == PASS :: Success Message is displayed ");
					
				}
				
				
				
			
				//AssertMeterInformation
				public static  String Ex_MeterInformation;
				public static  String Act_MeterInformation;
				public  void Assertion_Meter_Information()  throws Exception 
				{ 
					
					//System.out.println(Ex_home=td.get_string_CellData("Assertion", 0, 0));
					Act_MeterInformation=Robj.Assert_Meter_Information().getText();
					Ex_MeterInformation="Meter Information";
					Assert.assertEquals(Act_MeterInformation,Ex_MeterInformation);
					System.out.println("	# Validation == PASS :: Status Change is displayed ");
					
				}
				
				
				//AssertMeterInformation
				public static  String Ex_SuccessRollback;
				public static  String Act_SuccessRollback;
				public  void Assertion_Successs_Rollback()  throws Exception 
				{ 
					
					//System.out.println(Ex_home=td.get_string_CellData("Assertion", 0, 0));
					Act_SuccessRollback=Robj.Successs_Rollback().getText();
					Ex_SuccessRollback="Rollback complete.";
					Assert.assertEquals(Act_SuccessRollback,Ex_SuccessRollback);
					System.out.println("	# Validation == PASS :: Status Change is displayed ");
					
				}
				
				
				//AssertMeterInformation
				public static  String Ex_InformationPopup;
				public static  String Act_InformationPopup;
				public  void Assertion_Information_Popup()  throws Exception 
				{ 
					
					//System.out.println(Ex_home=td.get_string_CellData("Assertion", 0, 0));
					Act_InformationPopup=Robj.Information_Popup().getText();
					Ex_InformationPopup="Information";
					Assert.assertEquals(Act_InformationPopup,Ex_InformationPopup);
					System.out.println("	# Validation == PASS :: Status Change is displayed ");
					
				}
				
				//AssertMeterInformation
				public static  String Ex_ResultPopup;
				public static  String Act_ResultPopup;
				public  void Assert_Result_Popup()  throws Exception 
				{ 
					
					//System.out.println(Ex_home=td.get_string_CellData("Assertion", 0, 0));
					Act_ResultPopup=Robj.Result_Popup().getText();
					Ex_ResultPopup="Re-bill for Statement";
					Assert.assertEquals(Act_InformationPopup,Ex_InformationPopup);
					System.out.println("	# Validation == PASS :: Status Change is displayed ");
					
				}
				
				//AssertSuccessMessage
				public static  String Ex_AssertSuccessMessage;
				public static  String Act_AssertSuccessMessage;
				public  void Assertion_Success_Message()  throws Exception 
				{ 
					
					//System.out.println(Ex_home=td.get_string_CellData("Assertion", 0, 0));
					Act_AssertSuccessMessage=Robj.Assert_Success_Message().getText();
					Ex_AssertSuccessMessage="Success!";
					Assert.assertEquals(Act_AssertSuccessMessage,Ex_AssertSuccessMessage);
					System.out.println("	# Validation == PASS :: Success message is displayed ");
					
				}
				
				
				//AssertSuccessMessage
				public static  String Ex_AssertInfoMessage;
				public static  String Act_AssertInfoMessage;
				public  void Assertion_Success_Info_Message()  throws Exception 
				{ 
					
					//System.out.println(Ex_home=td.get_string_CellData("Assertion", 0, 0));
					Act_AssertInfoMessage=Robj.Success_Info_Message().getText();
					Ex_AssertInfoMessage="Issue date and Due date has been updated.";
					Assert.assertEquals(Act_AssertInfoMessage,Ex_AssertInfoMessage);
					System.out.println("	# Validation == PASS :: Success message is displayed ");
					
				}
				
				//AssertSuccessMessage
				public static  String Ex_SuccessMessage;
				public static  String Act_SuccessMessage;
				public  void Assertion_Success_Messages()  throws Exception 
				{ 
					Act_SuccessMessage=Robj.Success_Message().getText();
					Ex_SuccessMessage=" Successfully saved message. ";
					Assert.assertEquals(Ex_SuccessMessage,Ex_SuccessMessage);
					System.out.println("	# Validation == PASS :: Success message is displayed ");
					
				}
				
				//AssertSuccessMessage
				public static  String Ex_SendEmailResultsPopup;
				public static  String Act_SendEmailResultsPopup;
				public  void Assertion_Send_Email_Results_Popup()  throws Exception 
				{ 
					Act_SendEmailResultsPopup=Robj.Email_Results_Popup().getText();
					Ex_SendEmailResultsPopup="Send Email Results";
					Assert.assertEquals(Act_SendEmailResultsPopup,Ex_SendEmailResultsPopup);
					System.out.println("	# Validation == PASS :: Success message is displayed ");
					
				}
				
				
				
				
				
			//Assertion_MeterRegister	
				//Successfully created meter register.	
				
		
}

