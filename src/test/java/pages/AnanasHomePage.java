package pages;

import helpers.BaseHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AnanasHomePage extends BaseHelper

{
    @FindBy(xpath = "//*[@id=\"__next\"]/div[4]/header/div[2]/div/ul/li[2]/a/div")
    WebElement logInIcon;

    @FindBy(className="sc-1rhklln-0")
    WebElement cookie;

    WebDriver driver;
    public AnanasHomePage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    private void navigate()
    {
        driver.get("https://ananas.rs/");
    }

    private void cookies()
    {
        wdWait.until(ExpectedConditions.elementToBeClickable(By.className("sc-1rhklln-0")));
        cookie.click();
    }

    private void clickLogInIcon()
    {
        wdWait.until(ExpectedConditions.elementToBeClickable(logInIcon));
        logInIcon.click();
    }

    public void openAnanasLogIn()
    {
        navigate();
        cookies();
        clickLogInIcon();
    }
}
