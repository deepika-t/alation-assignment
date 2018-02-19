package amazon_Test;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import amazon.WebDriverBaseTest;

public class BookDetailsTest extends WebDriverBaseTest{

	/*
	This method navigates to the URL sent through the parameter
	 */

	@Test(priority=1)
	@Parameters("url")
	public void navigateToSite(String url) throws Exception {	
		app.bookDetails().getUrl(url);
		// Thread.sleep(2000);
		app.verify().verifyURL(url);
		takeSnapShot("navigateToSite") ;
	}

	/*
	This method selects the option from drop down and select the back which is sent through the parameters
	 */

	@Test(priority=2)
	public void searchBooks() throws Exception{		
		app.bookDetails().selectOptionsFromDropDown("Books");
		app.bookDetails().search("data catalog");
		takeSnapShot("searchBooks()") ;
	}

	/*
	This method displays the book details from the Search_Page
	 */

	@Test(priority=3)
	public void getDetailsFromSearchPage() throws Exception{
		app.searchPageDetails().getBookName_SearchPage();
		app.searchPageDetails().getAuthorName_SearchPage();
		app.searchPageDetails().getPaperBack_SearchPage();
		app.verify().verifykindleEdition_SearchPage();
		app.searchPageDetails().getPriceOfPaperBack_SearchPage();
		app.searchPageDetails().getKindleEdition_SearchPage();
		app.searchPageDetails().getPriceOfKindleEdition_SearchPage();
		app.searchPageDetails().getpriceUsingAmazonCard_SearchPage();
		takeSnapShot("getDetailsFromSearchPage()") ;

	}

	/*
	This method displays the book details from the Product_Page
	 */

	@Test(priority=4)
	public void getDetailsFromProductPage() throws Exception{
		app.searchPageDetails().getIntoProduct();
		app.productPageDetails().getBookName_ProductPage();
		app.productPageDetails().getAuthorName_ProductPage();
		app.productPageDetails().getPaperBack_ProductPage();
		app.verify().verifykindleEdition_ProductPage();
		app.productPageDetails().getPriceOfPaperBack_ProductPage();
		app.productPageDetails().getKindleEdition_ProductPage();
		app.productPageDetails().getPriceOfKindleEdition_ProductPage();
		app.productPageDetails().getRatings_ProductPage();
		app.productPageDetails().getEdition_ProductPage();
		takeSnapShot("getDetailsFromProductPage()") ;
	}

}

