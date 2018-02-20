package product_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.TestException;

import amazon.BaseScreen;

public class BookDetails_SearchPage extends BaseScreen {

	public BookDetails_SearchPage(WebDriver inputDriver) {
		super(inputDriver);
	}

	@FindBy(xpath="//*[@id='result_0']//a[@class='a-link-normal s-access-detail-page  s-color-twister-title-link a-text-normal']")
	public WebElement bookName_SearchPage;

	@FindBy(xpath="//*[@id='result_0']/div/div/div/div[2]/div[1]/div[2]/span[2]/a")
	public WebElement author_SearchPage;

	@FindBy(xpath="//*[@id='result_0']//a[@title='Paperback']")
	public WebElement paperback_SearchPage;

	@FindBy(xpath="//*[@id='result_0']/div/div/div/div[2]/div[2]/div[1]/div[2]//span[@class='sx-price sx-price-large'] ")
	public WebElement priceOfPaperBack_SearchPage;

	@FindBy(xpath="//*[@id='result_0']//a[@title='Kindle Edition']")
	public WebElement kindleEdition_SearchPage;

	@FindBy(xpath="//*[@id='result_0']/div/div/div/div[2]/div[2]/div[1]/div[7]//span[@class='sx-price sx-price-large']")
	public WebElement priceOfKindleEdition_SearchPage;

	@FindBy(xpath="//*[@id='result_0']//span[@class='a-size-small']")
	public WebElement priceUsingAmazonCard_SearchPage;

	/*
	 *The below method is used to get the book name from the search page
	 */

	public void getBookName_SearchPage(){

		try{
			if(bookName_SearchPage.isDisplayed()){
				System.out.println("BookName: "+bookName_SearchPage.getText()); 
			}
		}
		catch(Exception e){
			throw new TestException("ERROR: Bookname is not displayed");
		}
	}

	/*
	 *The below method is used to get the author name from the search page
	 */

	public void getAuthorName_SearchPage(){

		try{
			if(author_SearchPage.isDisplayed()){
				System.out.print("Author: "+author_SearchPage.getText());
			}
		}
		catch(Exception e){
			throw new TestException("ERROR: Authorname is not displayed");
		}
	}

	/*
	 *The below method is used to get whether Paperback is displayed in the search page
	 */

	public void getPaperBack_SearchPage(){

		try{
			if(paperback_SearchPage.isDisplayed()){
				System.out.println("Paperback: "+paperback_SearchPage.getText());
			}
		}
		catch(Exception e){
			throw new TestException("ERROR: Paperback is not available");
		}
	}

	/*
	 *The below method is used to get the price of paperback from the search page
	 */

	public void getPriceOfPaperBack_SearchPage(){

		try{
			if(priceOfPaperBack_SearchPage.isDisplayed()){
				System.out.println("PriceOfPaperBack: "+priceOfPaperBack_SearchPage.getText());
			}
		}
		catch(Exception e){
			throw new TestException("ERROR: Price of Paperback is not displayed");
		}
	}

	/*
	 *The below method is used to get whether Kindle is displayed in the search page
	 */

	public void getKindleEdition_SearchPage(){

		try{
			if(kindleEdition_SearchPage.isDisplayed()){
				System.out.println("kindleEdition: "+kindleEdition_SearchPage.getText());
			}
		}
		catch(Exception e){
			throw new TestException("ERROR: Kindle edition is not available");
		}
	}

	/*
	 *The below method is used to get the price of Kindle from the search page
	 */

	public void getPriceOfKindleEdition_SearchPage(){

		try{
			if(priceOfKindleEdition_SearchPage.isDisplayed()){
				System.out.println("PriceOfKindleEdition: "+priceOfKindleEdition_SearchPage.getText());
			}
		}
		catch(Exception e){
			throw new TestException("ERROR: priceOfKindleEdition is not available");
		}
	}

	/*
	 *The below method is used to get the price using AmazonCard from the search page
	 */

	public void getpriceUsingAmazonCard_SearchPage(){

		try{
			if(priceUsingAmazonCard_SearchPage.isDisplayed()){
				System.out.println("PriceUsingAmazonCard: "+priceUsingAmazonCard_SearchPage.getText());
			}
		}
		catch(Exception e){
			throw new TestException("ERROR: priceUsingAmazonCard is not provided");
		}
	}

	/*
	 *The below method is used to enter into the product page
	 */

	public void getIntoProduct(){

		try{
			if(bookName_SearchPage.isDisplayed()){
				bookName_SearchPage.click();
			}
		}
		catch(Exception e){
			throw new TestException("ERROR: BookName is not displayed");
		}
	}
}

