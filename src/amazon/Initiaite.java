package amazon;

import org.openqa.selenium.WebDriver;

import product_Page.BookDetails;
import product_Page.BookDetails_ProductPage;
import product_Page.BookDetails_SearchPage;
import product_Page.VerificationPage;

public class Initiaite {

	public  WebDriver driver;
	/*
	 *This method is used to initiate the driver
	 */
	public Initiaite(WebDriver appDriver) {
		System.out.println("WebDriver being set");
		this.driver = appDriver;
	}

	/*
	 *The below methods are used to initiate the driver for page factory methods
	 */

	public BookDetails bookDetails() {
		if (this.driver == null)
			System.out.println("Driver is null");  //TODO
		return new BookDetails(driver);
	}

	public VerificationPage verify() {
		if (this.driver == null)
			System.out.println("Driver is null");  //TODO
		return new VerificationPage(driver);
	}

	public BookDetails_SearchPage searchPageDetails() {
		if (this.driver == null)
			System.out.println("Driver is null");  //TODO
		return new BookDetails_SearchPage(driver);
	}

	public BookDetails_ProductPage productPageDetails() {
		if (this.driver == null)
			System.out.println("Driver is null");  //TODO
		return new BookDetails_ProductPage(driver);
	}

}
