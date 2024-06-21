package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BlicHomePage;

import java.util.List;

public class BlicHomeTest extends BaseTest

{
    @Test
    public void BlicTest() throws InterruptedException

    {
        String searchTerm = "Comtrade";
        BlicHomePage homePage = new BlicHomePage(driver);
        homePage.blicSearch(searchTerm);

//      System.out.println("Tekst sa navigacije: " + homePage.tekstKojiHocuDaZapamtim);

        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.className("news-box")));
        WebElement newsBox = driver.findElement(By.className("news-box"));

        List<WebElement> articles = newsBox.findElements(By.tagName("article"));
        Assert.assertEquals(25, articles.size());
        System.out.println("Number of articles " + articles.size());

        int n = 0;
        for(WebElement article:articles)
        {
            n ++;
            System.out.println(n);
            System.out.println(article.getText());

        }

        WebElement fifthElement = articles.get(4);
        //js.executeScript("arguments[0].scrollIntoView();",fifthElement);
        WebElement fifthElementTitle = fifthElement.findElement(By.tagName("a"));
        fifthElementTitle.click();
        //articles.get(4).findElement(By.tagName("a")).click();



        Thread.sleep(5000);
    }
}
