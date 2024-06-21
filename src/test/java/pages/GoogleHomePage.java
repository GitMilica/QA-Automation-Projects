package pages;

import helpers.BaseHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class GoogleHomePage extends BaseHelper

{

    @FindBy(name="q")
    WebElement searchField;

    @FindBy(name="btnK")
    WebElement searchButton;


    WebDriver driver;
    public GoogleHomePage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    private void navigateToHomePage()
    {
        driver.get("https://www.google.com/");
    }

    private void enterTermInSearchField(String searchTerm)
    {
        searchField.sendKeys(searchTerm);
    }

    private void clickOnSearchButton()
    {
        wdWait.until(ExpectedConditions.elementToBeClickable(searchButton));
        searchButton.click();
    }

    public void googleSearch(String searchTerm)
    {
        navigateToHomePage();
        enterTermInSearchField(searchTerm);
        clickOnSearchButton();
    }



}
