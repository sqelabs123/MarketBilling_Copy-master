package Marketing_Project;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelDataDriven {

	public static void excel() throws Exception, IOException,FileNotFoundException
	{
	
	HSSFWorkbook workbook = new HSSFWorkbook();
	HSSFSheet a =workbook.getSheetAt(0);
	
	
	try {
		FileInputStream fis = new FileInputStream("G:\\Market_Billing\\TestData\\Electricity - Meter Import Template.csv");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}
