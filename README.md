# Project Title

Amazon Product Automation

## Objective

1. Go to amazon.com
2. In the search dropdown list, choose ‘Books’ option.
3. Enter search text ‘data catalog’.
4. Choose the first test result and display its details from Search Page.
5. Click the first test result and display its details form Product Page.

### Prerequisites

1. Eclipse IDE for Java Developers
Version: Neon Release (4.6.0)
Build id: 20160613-1800
2. JRE
3. selenium-server-standalone-3.9.1.jar.
4. selenium-java-3.9.1.jar.
5. Download TestNG from Help->Eclipse
6. Download geckodriver for Firefox.
6. Download chromedriver for chrome(if needed)

### Installing

1. Install Eclipse IDE and JRE(if needed)
2. Download the jars and point it in the Build Path
3. In Build path of the project Add Library as TestNG.

## Running the tests

1. Execute Aliation.xml using Testng

### Break down into end to end tests

Explain what these tests test and why

1. When 'Aliation.xml' is executed it calls "amazon_Test.BookDetailsTest" which is mentioned in class by taking
browser  as parameter.
2. Sending browser as parameter eases the user to select different browsers..In my code have used Firefox and Chrome browser.
3. When 'BookDetailsTest' is executed it extends WebDriverBaseTest which in turn extends BaseTest where the parameter sent is used and use the function accordingly.
4. Once the driver is initiated the annotations marked as @Test will start execution.
5. navigateToSite() method navigates to the URL "https://www.amazon.com/".
6. searchBooks() method selects the "Book" from the drop down box and search for "data catalog".
7. getDetailsFromSearchPage() method gets the details about the book say.,Book name,author name,verifying whether it has
    paperback,Kindle editions and the prices of repectives,Price while using Amazon card.
8. getDetailsFromProductPage() method selects the first test result from the search page and get the details about the book
    say.,Book name,author name,verifying whether it has paperback,Kindle editions and the prices of repectives,Price while using
    Amazon card,rating given to the book and Edition of the book.
9. Once all the testscripts are executed a snapshot is taken at the end of each test script and stored in local for reference.
    while executing change the path mentioned in filepath in BaseTest class.
10. Snapshots are saved in the folder name Screenshots in the Alation folder
11. Change the path of geckodriver and chrome driver to the user's download path while executing in BaseTest class.


## Built With

* Framework: POM and Page factory
   The above framework is used for the benefits of reusable code and test maintanence, if there is any locator changes then it can be easily changed in the respective class files.
    
* Test Framework: TestNG
   TestNG framework is used because there are more choices in annotations when compared with Junit.
   say.,A test script can be executed or skipped by sending 'enabled' parameter in @Test annotation if "true" is passed then it  executes else if "false" is passed then it will skip.
   
* Browser: Firefox

* Language: Java

