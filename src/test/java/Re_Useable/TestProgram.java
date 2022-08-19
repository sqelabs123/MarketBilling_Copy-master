package Re_Useable;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class TestProgram {

	// TODO Auto-generated constructor stub

	protected WebDriver driver;

	public static DesiredCapabilities capability;

	public Repo_testing action_obj;
	public Assertion_Test Assertion_obj;
	// public String Url="https://test.waterworkslms.com/waterworks";

	public static void main(String[] args) {
		try {
			WebDriver driver;
			String downloadFilepath = "D:";
			HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
			chromePrefs.put("profile.default_content_settings.popups", 0);
			chromePrefs.put("download.default_directory", downloadFilepath);
			ChromeOptions options = new ChromeOptions();

			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			cap.setCapability(ChromeOptions.CAPABILITY, options);

			String exePath = System.getProperty("user.dir") + "\\TestData\\chromedriver1.exe"; // chrome driver address
			System.setProperty("webdriver.chrome.driver", exePath);

			/*
			 * String exePath = System.getProperty("user.dir") +
			 * "D:\\A_Projects\\M_Utility\\TestData\\chromedriver1.exe";
			 */

			/* System.setProperty("webdriver.chrome.driver", exePath); */

			driver = new ChromeDriver(cap);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@BeforeClass
	@Parameters({ "userId", "password", "url" })
	public void Login(String userId, String password, String url) throws IOException {

		action_obj = new Repo_testing(driver);

		/*
		 * if(browser.equalsIgnoreCase("chrome")) { String exePath =
		 * System.getProperty("user.dir") + "\\TestData\\chromedriver.exe"; //chrome
		 * driver address System.setProperty("webdriver.chrome.driver", exePath);
		 * driver= new ChromeDriver(); //execute in chrome driver
		 * 
		 * } else if (browser.equalsIgnoreCase("firefox")) { String exePath =
		 * System.getProperty("user.dir") + "\\TestData\\geckodriver.exe"; //firefox
		 * driver address System.setProperty("webdriver.gecko.driver", exePath); driver=
		 * new FirefoxDriver(); //firefox code
		 * 
		 * } else if (browser.equalsIgnoreCase("IE")) { // IE code String exePath =
		 * System.getProperty("user.dir") + "\\TestData\\iedriver.exe"; //ie driver
		 * address System.setProperty("webdriver.ie.driver", exePath); driver= new
		 * InternetExplorerDriver();
		 * 
		 * 
		 * } else if (browser.equalsIgnoreCase("edge")) { // IE code String exePath =
		 * System.getProperty("user.dir") + "\\TestData\\msedgedriver.exe"; //edge
		 * driver address System.setProperty("webdriver.edge.driver", exePath); driver=
		 * new EdgeDriver();
		 * 
		 * 
		 * }
		 */

		String downloadFilepath = "D:";
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("profile.default_content_settings.popups", 0);
		chromePrefs.put("download.default_directory", downloadFilepath);
		ChromeOptions options = new ChromeOptions();

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		cap.setCapability(ChromeOptions.CAPABILITY, options);

		String exePath = System.getProperty("user.dir") + "\\TestData\\chromedriver1.exe"; // chrome driver address
		System.setProperty("webdriver.chrome.driver", exePath);

		/*
		 * String exePath = System.getProperty("user.dir") +
		 * "D:\\A_Projects\\M_Utility\\TestData\\chromedriver1.exe";
		 */

		/* System.setProperty("webdriver.chrome.driver", exePath); */

		driver = new ChromeDriver(cap);
		// driver = new FirefoxDriver();
		action_obj = new Repo_testing(driver);
		Assertion_obj = new Assertion_Test(driver);

		System.out.println(
				"---------------------------------------------------------------------------------------------------------------");
		// Open URL
		System.out.println("@URL Opening......." + url);
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		action_obj.useranme().sendKeys(userId);
		action_obj.Password().sendKeys(password);
		action_obj.loginbutton().click();

		/*
		 * //add new functionalily Select NewGroup=new
		 * Select(action_obj.Select_newGroup());
		 * NewGroup.selectByVisibleText("Stanwell");
		 * action_obj.Select_newGroup().click(); action_obj.Login_button().click();
		 */
	}
	/*
	 * @AfterClass public void logout() throws InterruptedException,
	 * MalformedURLException {
	 * 
	 * Thread.sleep(3000); List<WebElement> lout=(List<WebElement>)
	 * driver.findElements(By.xpath(".//*[@title='User'] ")); if(lout.size()==1) {
	 * System.out.println(
	 * "---------------------------------------------------------------------------------------------------------------"
	 * ); System.out.println(
	 * "@#############################################################");
	 * JavascriptExecutor executor=(JavascriptExecutor) driver;
	 * executor.executeScript("scrollBy(0,-2000)", "");
	 * action_obj.user_icon_logout().click(); action_obj.logout().click();
	 * 
	 * 
	 * 
	 * 
	 * }
	 * 
	 * 
	 * }
	 */

}