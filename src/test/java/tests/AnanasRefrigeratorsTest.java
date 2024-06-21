package tests;

import org.codehaus.groovy.transform.SourceURIASTTransformation;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.AnanasCategoriesHomePage;
import pages.AnanasRefrigeratorsPage;

import java.util.List;

public class AnanasRefrigeratorsTest extends BaseTest

{
    @Test
    public void refrigeratorsTest() throws InterruptedException {
        AnanasCategoriesHomePage navRefrigerators = new AnanasCategoriesHomePage(driver);
        navRefrigerators.homePage();

        AnanasRefrigeratorsPage kombinovaniFrizideri = new AnanasRefrigeratorsPage(driver);
        kombinovaniFrizideri.gorenjeKombinovaniFrizideri();

        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.className("ais-Hits-list")));
        WebElement gorenjeFrizideri = driver.findElement(By.className("ais-Hits-list"));
        List<WebElement> listOfGorenjeFrizideri = gorenjeFrizideri.findElements(By.className("ais-Hits-item"));
        System.out.println(listOfGorenjeFrizideri.size());

        for(WebElement gorenjeFrizider:listOfGorenjeFrizideri)
        {
            Assert.assertTrue(gorenjeFrizider.getText().toLowerCase().contains("gorenje"));
        }

        Thread.sleep(5000);

    }
}
