package Re_Useable;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;

public class ObjMap_test {
	
	 Properties prop;
	//  Properties prop = new Properties(); 
	    public ObjMap_test (String strPath) {
	         
	    prop = new Properties();
	        
	    try {
            FileInputStream fis = new FileInputStream(strPath);
            prop.load(fis);
            fis.close();
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
/*private String getMessage(String strPath) {
			// TODO Auto-generated method stub
			return null;
		}*/
	    public By getLocator(String strElement) throws Exception {
	        
	        // retrieve the specified object from the object list
	    	 String locator = prop.getProperty(strElement);
	        // System.out.println(locator);
	        // extract the locator type and value from the object
	        String locatorType = locator.split(":")[0];
	        String locatorValue = locator.split(":")[1];
	         
	       
	        // this By can be used by the browser object in the actual test
	         if(locatorType.toLowerCase().equals("id"))
	            return By.id(locatorValue);
	          if(locatorType.toLowerCase().equals("name"))
	            return By.name(locatorValue);
	          if((locatorType.toLowerCase().equals("classname")) || (locatorType.toLowerCase().equals("class")))
	            return By.className(locatorValue);
	          if((locatorType.toLowerCase().equals("tagname")) || (locatorType.toLowerCase().equals("tag")))
	            return By.className(locatorValue);
	          if((locatorType.toLowerCase().equals("linktext")) || (locatorType.toLowerCase().equals("link")))
	            return By.linkText(locatorValue);
	          if(locatorType.toLowerCase().equals("partiallinktext"))
	            return By.partialLinkText(locatorValue);
	          if((locatorType.toLowerCase().equals("cssselector")) || (locatorType.toLowerCase().equals("css")))
	            return By.cssSelector(locatorValue);
	          if(locatorType.toLowerCase().equals("xpath"))
	            return By.xpath(locatorValue);
	        else
	            throw new Exception("Unknown locator type '" + locatorType + "'");
	    }
	}