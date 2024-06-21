package pages;

import helpers.BaseHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NovostiHomePage extends BaseHelper

{
    @FindBy(className="search-icon")
    WebElement blackMagnifier;

    WebDriver driver;
    public NovostiHomePage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    private void navigateToNovosti()
    {
        driver.get("https://www.novosti.rs/");
    }

    private void clickOnBlackMagnifier()
    {
        blackMagnifier.click();
    }

    public void novostiHome()
    {
        navigateToNovosti();
        clickOnBlackMagnifier();
    }

}
