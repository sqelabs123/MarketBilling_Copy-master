package MultiBrowserTestingwith_grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GridTesting1x
{
@Test
public void testgrid() throws MalformedURLException
{
	DesiredCapabilities capy=DesiredCapabilities.chrome();
			capy.setPlatform(Platform.WINDOWS);
	URL url=new URL("http://localhost:4444/wb/hub");
	WebDriver driver=new RemoteWebDriver(url, capy);
	driver.get("https://utbrxuat.utilibill.com.au/utbrx/");
	
}
}

