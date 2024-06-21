package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.NovostiHomePage;
import pages.NovostiSearchPage;

public class NovostiSearchTest extends BaseTest

{
    @Test
    public void novostiSearchTest() throws InterruptedException

    {
        String Term = "Comtrade";
        NovostiHomePage homepage = new NovostiHomePage(driver);
        homepage.novostiHome();
        NovostiSearchPage searchPage = new NovostiSearchPage(driver);
        searchPage.novostiSearch(Term);

        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.className("gsc-results-wrapper-visible")));
        WebElement results = driver.findElement(By.className("gsc-results-wrapper-visible"));
        Assert.assertTrue(results.getText().contains(Term));


        Thread.sleep(4000);
    }

}
