package tests;

import helpers.BaseHelper;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.yahooHomePage;

public class yahooHomeTest extends BaseTest
{
    @Test
    public void yahooSearchTest() throws InterruptedException
    {

        String term = "QA Revealed";
        yahooHomePage homePage = new yahooHomePage(driver);
        homePage.yahooSearch(term);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("main")));
        WebElement results = driver.findElement(By.id("main"));
        Assert.assertTrue(results.getText().toLowerCase().contains("QA Revealed"));

        Thread.sleep(3000);
    }

}
