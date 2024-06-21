package pages;

import helpers.BaseHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class yahooHomePage extends BaseHelper

{

    @FindBy(id="ybar-sbq")
    WebElement searchField;

    @FindBy(id="ybar-search")
    WebElement searchButton;



    WebDriver driver;
    public yahooHomePage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    private void navigateHomePage()
    {
        driver.get("https://www.yahoo.com/");
    }

    private void enterTerm(String term)
    {
        searchField.sendKeys(term);
    }

    private void clickButton()
    {
        searchButton.click();
    }

    public void yahooSearch(String term)
    {
        navigateHomePage();
        enterTerm(term);
        clickButton();

    }

}
