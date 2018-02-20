package amazon_Test;
import org.testng.annotations.Test;

import amazon.WebDriverBaseTest;

public class BookDetailsTest extends WebDriverBaseTest{

	/*
	 *This method navigates to the URL sent through the parameter
	 */

	@Test(priority=1, enabled=true)
	public void navigateToSite() throws Exception {	
		app.bookDetails().getUrl("https://www.amazon.com/");
		// Thread.sleep(2000);
		app.verify().verifyURL("https://www.amazon.com/");
		takeSnapShot("navigateToSite") ;
	}

	/*
	 *This method selects the option from drop down and select the back which is sent through the parameters
	 */

	@Test(priority=2, enabled=true)
	public void searchBooks() throws Exception{		
		app.bookDetails().selectOptionsFromDropDown("Books");		
		app.bookDetails().search("data catalog");
		takeSnapShot("searchBooks()") ;
	}

	/*
	 *This method displays the book details from the Search_Page
	 *Verifies whether paperback and kindle is displayed in the search page by assertion
	 */

	@Test(priority=3, enabled=true)
	public void getDetailsFromSearchPage() throws Exception{
		app.searchPageDetails().getBookName_SearchPage();
		app.searchPageDetails().getAuthorName_SearchPage();
		app.searchPageDetails().getPaperBack_SearchPage();
		app.verify().verifyPaperBack_SearchPage();
		app.searchPageDetails().getPriceOfPaperBack_SearchPage();
		app.searchPageDetails().getKindleEdition_SearchPage();
		app.verify().verifykindleEdition_SearchPage();
		app.searchPageDetails().getPriceOfKindleEdition_SearchPage();
		app.searchPageDetails().getpriceUsingAmazonCard_SearchPage();
		takeSnapShot("getDetailsFromSearchPage()") ;

	}

	/*
	 *This method displays the book details from the Product_Page
	 *Verifies whether paperback and kindle is displayed in the product page by assertion
	 */

	@Test(priority=4, enabled=true)
	public void getDetailsFromProductPage() throws Exception{
		app.searchPageDetails().getIntoProduct();
		app.productPageDetails().getBookName_ProductPage();
		app.productPageDetails().getAuthorName_ProductPage();
		app.productPageDetails().getPaperBack_ProductPage();
		app.verify().verifyPaperBack_ProductPage();
		app.productPageDetails().getPriceOfPaperBack_ProductPage();
		app.productPageDetails().getKindleEdition_ProductPage();
		app.verify().verifykindleEdition_ProductPage();
		app.productPageDetails().getPriceOfKindleEdition_ProductPage();
		app.productPageDetails().getRatings_ProductPage();
		app.productPageDetails().getEdition_ProductPage();
		takeSnapShot("getDetailsFromProductPage()") ;
	}

}

