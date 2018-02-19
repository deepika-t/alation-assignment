package product_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.TestException;

import amazon.BaseScreen;

public class verificationPage extends BaseScreen{

	public verificationPage(WebDriver inputDriver) {
		super(inputDriver);
	}

	@FindBy(xpath="//*[@id='result_0']//a[@title='Paperback']")
	public WebElement paperback_SearchPage;

	@FindBy(xpath="//*[@id='mediaTab_heading_1']//span[@class='a-size-large mediaTab_title']")
	public WebElement paperback_ProductPage;

	@FindBy(xpath="//*[@id='result_0']//a[@title='Kindle Edition']")
	public WebElement kindleEdition_SearchPage;

	@FindBy(xpath="//*[@id='mediaTab_heading_0']//span[@class='a-size-large mediaTab_title']")
	public WebElement kindleEdition_ProductPage;

	/*
	 *The below method will get the URL of the current page and return to the calling function
	 */

	public String getCurrentURL() {
		try {
			return driver.getCurrentUrl();
		} catch (Exception e) {
			throw new TestException(String.format("Current URL is: %s", driver.getCurrentUrl()));
		}
	}

	/*
	 *The below method will verify whether the URL sent and the URL opened are same
	 */

	public void verifyURL(String expectedURL){
		String actualURL = getCurrentURL();    
		System.out.println(actualURL);
		System.out.println("PRODUCT_PAGE: Verifying that the URL is '" + actualURL + "'");
		Assert.assertEquals(actualURL, expectedURL, "Test has navigated to current URL");
		if (!expectedURL.equals(actualURL)){
			throw new TestException("ERROR: PRODUCT_PAGE: Product URL is ['" + actualURL + "']. Expected ['" + expectedURL + "'].");
		}
	}

	/*
	 *The below method will verify whether the book has paperback option or not in the search page
	 */

	public void verifyPaperBack_SearchPage(){
		Assert.assertEquals(paperback_SearchPage.isDisplayed(), true);
	}

	/*
	 *The below method will verify whether the book has paperback option or not in the product page
	 */

	public void verifyPaperBack_ProductPage(){
		Assert.assertEquals(paperback_ProductPage.isDisplayed(), true);
	}

	/*
	 *The below method will verify whether the book has Kindle option or not in the search page
	 */

	public void verifykindleEdition_SearchPage(){
		Assert.assertEquals(kindleEdition_SearchPage.isDisplayed(), true);
	}

	/*
	 *The below method will verify whether the book has Kindle option or not in the product page
	 */

	public void verifykindleEdition_ProductPage(){
		Assert.assertEquals(kindleEdition_ProductPage.isDisplayed(), true);
	}

}
