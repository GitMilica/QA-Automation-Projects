package tests;

import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import pages.GoogleHomePage;

public class GoogleTest extends BaseTest

{


    @Test
    public void googleSearchTest() throws InterruptedException {
        String term = "QA Revealed";
        GoogleHomePage homePage = new GoogleHomePage(driver);
        homePage.googleSearch(term);

        Thread.sleep(3000);
    }
}
