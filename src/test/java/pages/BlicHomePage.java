package pages;

import helpers.BaseHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BlicHomePage extends BaseHelper

{
    @FindBy(id="search-input")
    WebElement searchField;

//    public static String tekstKojiHocuDaZapamtim;

    WebDriver driver;

    public BlicHomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    private void navigateToBlicHP()
    {
        driver.get("https://www.blic.rs/");
        WebElement navElement = driver.findElement(By.tagName("nav"));
//      tekstKojiHocuDaZapamtim = navElement.getText();
    }

    private void enterTermInSearchBox(String searchTerm)
    {
    wdWait.until(ExpectedConditions.elementToBeClickable(searchField));
    searchField.sendKeys(searchTerm);

    }

    private void clickOnMagnifierIcon()
    {
       WebElement searchBox = driver.findElement(By.id("search"));
       WebElement magnifierIcon = searchBox.findElement(By.tagName("button"));
       magnifierIcon.click();
    }

    public void blicSearch(String searchTerm)

    {
        navigateToBlicHP();
        enterTermInSearchBox(searchTerm);
        clickOnMagnifierIcon();
    }



}
