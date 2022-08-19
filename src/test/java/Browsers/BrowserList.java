package Browsers;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserList {

		public static WebDriver driver;
		public Properties prop;
		
		public void initialize() throws IOException {
			
			prop = new Properties();
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\TestData\\data.properties");
			prop.load(fis);
			
		//  The below 'Browser' is defined in 'Data.Properties' file, do changes or update for Browser over there.
		//  For Browsers:	
			String browserName = prop.getProperty("browser"); 
			if(browserName.equalsIgnoreCase("chrome"))
			{
				WebDriverManager.chromedriver().setup();
				this.driver = new ChromeDriver();
			}
			else if(browserName.equalsIgnoreCase("firefox"))
			{
				WebDriverManager.firefoxdriver().setup();
				this.driver = new FirefoxDriver();
			}
			else if(browserName.equalsIgnoreCase("Edge"))
			{
				WebDriverManager.edgedriver().setup();
				this.driver = new EdgeDriver();		
			}
			else
			{
				WebDriverManager.iedriver().setup();
				this.driver = new InternetExplorerDriver();	
			}
		}

	//  The below URL is defined in 'Data.Properties' file, just change or update URL from there.
		public void urlStack()
		{
		     //  For Urls:	
			     driver.get(prop.getProperty("url"));
		 
		}	
		
		public void simpleWait() {
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
	}



