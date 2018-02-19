package product_Page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import amazon.BaseScreen;

import org.openqa.selenium.support.ui.Select;
public class BookDetails extends BaseScreen{

	public BookDetails(WebDriver inputDriver) {
		super(inputDriver);
	}

	@FindBy(xpath="//*[@id='nav-search']/form/div[1]")
	public WebElement searchDropDownBox;
	
	@FindBy(id="searchDropdownDescription")
	public WebElement searchDropdownDescription;
	
	@FindBy(id="searchDropdownBox")
	public WebElement dropDownValue;

	@FindBy(id="twotabsearchtextbox")
	public WebElement searchArea;

	@FindBy(xpath="//input[@value='Go']")
	public WebElement goNSearch;

	
	/*
	 * The below method gets the URL from the parameter and navigate to the respective page
	 * When the URL is not loaded properly it will be caught by exception
	 * */
	
	public void getUrl(String URL)
	{
		try{
			driver.get(URL);
			System.out.println("Navigating to Amazon.com: " + URL);
			//takeSnapShot();
			Assert.assertEquals(driver.getCurrentUrl(),URL, "Correct URl has been passed");
		}
		catch(Exception e){
			System.out.println("FAILURE: URL did not load properly: " + URL);
		}
	}

	/*
	 * The below method select the options sent form the parameter and choose accordingly
	 * Js executor has been used to choose "Book" from drop-down because it's ancestor span's style is none 
	 * Using JS Executor the span's style has been changed and then the option is changed 
	 * */
	
	public void selectOptionsFromDropDown(String Option)
	{
		try{

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'empty')",searchDropdownDescription);
            System.out.println("Selecting an option from the dropdown: "+Option);
			searchDropDownBox.click();
			Select s = new Select(dropDownValue);
			s.selectByVisibleText(Option);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

	/*
	 * The below method select the book sent form the parameter as the book name
	 * Once the search area has been typed then search icon is clicked
	 * */
	
	public void search(String bookName) {
		// TODO Auto-generated method stub
		searchArea.sendKeys(bookName);
		goNSearch.click();
	}
	
	
}
