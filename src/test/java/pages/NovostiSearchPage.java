package pages;

import helpers.BaseHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class NovostiSearchPage extends BaseHelper

{


    @FindBy(id="gsc-i-id1")
    WebElement searchField;

    @FindBy(className="gsc-search-button-v2")
    WebElement redMagnifier;


    WebDriver driver;
    public NovostiSearchPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }


    private void typeTermInSearchField(String Term)
    {
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("gsc-i-id1")));
        searchField.sendKeys(Term);

    }

    private void clickOnRedMagnifier()
    {
        redMagnifier.click();
    }

    public void novostiSearch(String Term)
    {

        typeTermInSearchField(Term);
        clickOnRedMagnifier();
    }



}
