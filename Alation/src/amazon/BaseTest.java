package amazon;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {

	public String firefox_driver_path="/Users/vijaygvb/Downloads/geckodriver";
	public String chrome_driver_path="/Users/vijaygvb/Downloads/chromedriver 2";
	public static WebDriver driver;
	public String fileWithPath = "/Users/vijaygvb/Desktop/";

	/*initiates the firefox driver by providing the path in where the geckodriver is placed.
	 * firefox_driver_path provides the path where the geckodriver is placed.
	 */

	public void startExecutionForFirefox()
	{	
		System.setProperty("webdriver.gecko.driver", firefox_driver_path);
		driver=new FirefoxDriver();
		//to maximize the browser
		driver.manage().window().maximize();
	}

	/*initiates the chrome driver by providing the path in where the chromedriver is placed.
	 * chrome_driver_path provides the path where the chromedriver is placed.
	 */

	public void startExecutionForChrome()
	{
		System.setProperty("webdriver.chrome.driver", chrome_driver_path);
		driver=new ChromeDriver();
		//to maximize the browser
		driver.manage().window().maximize();
	}	

	/*
	 *The below method gets the current time stamp to save the snapshots of result
	 */

	public String getTimeStamp() {
		DateFormat format = new SimpleDateFormat("yyyy_MM_dd hh:mm:ss");
		String timeStamp = format.format(new Date());
		return timeStamp;
	}

	/*
	 *The below method takes the snap shot of results 
	 *The file name has been provided by appending file path with method name as parameter along with time stamp
	 */

	public void takeSnapShot(String fileName) throws Exception{
		System.out.print("entered");
		System.out.println(fileName);
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile=new File(fileWithPath + fileName+getTimeStamp()+".png");
		FileUtils.copyFile(SrcFile, DestFile);
	}
}
