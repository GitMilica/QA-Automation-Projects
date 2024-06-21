package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BrowserTest extends BaseTest
{
    @Test
    public void googleSearchTest() throws InterruptedException {
        driver.get("https://www.google.com/");
        WebElement searchField = driver.findElement(By.name("q"));
        searchField.sendKeys("Comtrade");
        WebElement searchButton = driver.findElement(By.name("btnK"));
        wdWait.until(ExpectedConditions.elementToBeClickable(searchButton));
        searchButton.click();
        WebElement results = driver.findElement(By.id("rcnt"));
        Assert.assertTrue(results.getText().toLowerCase().contains("comtrade"));

        Thread.sleep(3000);
    }
    @Test
    public void yahooSearchTest() throws InterruptedException {
        driver.get("https://www.yahoo.com/");
        WebElement searchField = driver.findElement(By.id("ybar-sbq"));
        searchField.sendKeys("Comtrade");
        WebElement searchButton = driver.findElement(By.id("ybar-search"));
        searchButton.click();


        Thread.sleep(3000);
    }


}
