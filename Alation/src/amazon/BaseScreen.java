package amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BaseScreen {

	public WebDriver driver;

	/*
	 *This method is used to initiate the elements using page factory
	 */

	public BaseScreen(WebDriver inputDriver)
	{
		this.driver = inputDriver;
		PageFactory.initElements(driver, this);
	}
}
