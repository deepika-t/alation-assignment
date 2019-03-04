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
		System.our.println("hi lets meake a sample test with no changes another test");
		System.out.println("last but not the least");