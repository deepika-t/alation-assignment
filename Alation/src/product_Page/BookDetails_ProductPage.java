package product_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.TestException;

import amazon.BaseScreen;

public class BookDetails_ProductPage extends BaseScreen {

	public BookDetails_ProductPage(WebDriver inputDriver) {
		super(inputDriver);
	}

	@FindBy(css="#productTitle")
	public WebElement bookName_ProductPage;

	@FindBy(css=".a-link-normal.contributorNameID")
	public WebElement author_ProductPage;

	@FindBy(id="bookEdition")
	public WebElement bookEdition_ProductPage;

	@FindBy(xpath="//*[@id='mediaTab_heading_1']//span[@class='a-size-large mediaTab_title']")
	public WebElement paperback_ProductPage;

	@FindBy(xpath="//*[@id='mediaTab_heading_1']//span[@class='a-size-base mediaTab_subtitle']")
	public WebElement priceOfPaperBack_ProductPage;

	@FindBy(xpath="//*[@id='mediaTab_heading_0']//span[@class='a-size-large mediaTab_title']")
	public WebElement kindleEdition_ProductPage;

	@FindBy(xpath="//*[@id='mediaTab_heading_0']//span[@class='a-size-base mediaTab_subtitle']")
	public WebElement priceOfKindleEdition_ProductPage;

	@FindBy(xpath="//*[@id='acrPopover']")
	public WebElement ratings_ProductPage;

	/*
	 *The below method is used to get the book name from the product page
	 */

	public void getBookName_ProductPage(){

		try{
			if(bookName_ProductPage.isDisplayed()){
				System.out.println("BookName: "+bookName_ProductPage.getText()); 
			}
		}
		catch(Exception e){
			throw new TestException("ERROR: Bookname is not displayed");
		}
	}

	/*
	 *The below method is used to get the author name from the product page
	 */

	public void getAuthorName_ProductPage(){

		try{
			if(author_ProductPage.isDisplayed()){
				System.out.println("Author: "+author_ProductPage.getText());
			}
		}
		catch(Exception e){
			throw new TestException("ERROR: Authorname is not displayed");
		}
	}

	/*
	 *The below method is used to get whether Paperback is displayed in the product page
	 */

	public void getPaperBack_ProductPage(){

		try{
			if(paperback_ProductPage.isDisplayed()){
				System.out.println("Paperback: "+paperback_ProductPage.getText());
			}
		}
		catch(Exception e){
			throw new TestException("ERROR: Paperback is not available");
		}
	}

	/*
	 *The below method is used to get the price of Paperback from the product page
	 */

	public void getPriceOfPaperBack_ProductPage(){

		try{
			if(priceOfPaperBack_ProductPage.isDisplayed()){
				System.out.println("PriceOfPaperBack: "+priceOfPaperBack_ProductPage.getText());
			}
		}
		catch(Exception e){
			throw new TestException("ERROR: Price of Paperback is not displayed");
		}
	}

	/*
	 *The below method is used to get whether Kindle is displayed in the product page
	 */

	public void getKindleEdition_ProductPage(){

		try{
			if(kindleEdition_ProductPage.isDisplayed()){
				System.out.println("kindleEdition: "+kindleEdition_ProductPage.getText());
			}
		}
		catch(Exception e){
			throw new TestException("ERROR: Kindle edition is not available");
		}
	}

	/*
	 *The below method is used to get the price of Kindle from the product page
	 */

	public void getPriceOfKindleEdition_ProductPage(){

		try{
			if(priceOfKindleEdition_ProductPage.isDisplayed()){
				System.out.println("PriceOfKindleEdition: "+priceOfKindleEdition_ProductPage.getText());
			}
		}
		catch(Exception e){
			throw new TestException("ERROR: priceOfKindleEdition is not available");
		}
	}


	/*
	 *The below method is used to get the ratings of the book from the product page
	 */

	public void getRatings_ProductPage(){

		try{
			if(ratings_ProductPage.isDisplayed()){
				System.out.println("Ratings: "+ratings_ProductPage.getAttribute("title"));
			}
		}
		catch(Exception e){
			throw new TestException("ERROR: Ratings is not provided");
		}
	}


	/*
	 *The below method is used to get the Edition of Book from the product page
	 */

	public void getEdition_ProductPage(){

		try{
			if(bookEdition_ProductPage.isDisplayed()){
				System.out.println("Edition: "+bookEdition_ProductPage.getText());
			}
		}
		catch(Exception e){
			throw new TestException("ERROR: Edition is not provided");
		}
	}

}

