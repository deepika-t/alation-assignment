package amazon;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class WebDriverBaseTest extends BaseTest {

	protected Initiaite app = null;

	/*
	 *In the below  method BeforeClass annotation has been used to make this method execute before class
	 *Browser has been sent as parameter so that the coice of browser can be decided from XML file
	 */

	@BeforeClass
	@Parameters("browser")
	public void setup(String browser) {
		if(browser.equalsIgnoreCase("firefox")){      
			System.out.println("Firefox driver is initiated..");
			startExecutionForFirefox();
			app = new Initiaite(driver);
		}
		else if(browser.equalsIgnoreCase("chrome")){
			System.out.println("Chrome driver is initiated..");
			startExecutionForChrome();
			app = new Initiaite(driver);
		}
		else{
			System.out.println("Browser selected doesn't match");
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	/*
	 *The below method quits the driver once the execution is done
	 */

	@AfterClass
	public void close()
	{
		driver.quit();
	}
}


