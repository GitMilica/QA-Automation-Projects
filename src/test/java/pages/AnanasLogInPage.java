package pages;

import helpers.BaseHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AnanasLogInPage extends BaseHelper

{
    @FindBy(id="username")
    WebElement usernameField;

    @FindBy(id="password")
    WebElement passwordField;

    @FindBy(id="login-submit")
    WebElement logInButton;



    WebDriver driver;
    public AnanasLogInPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    private void enterUsername(String username)
    {
        wdWait.until(ExpectedConditions.elementToBeClickable(By.id("username")));
        usernameField.sendKeys(username);
    }

    private void enterPassword(String password)
    {
        passwordField.sendKeys(password);
    }

    private void clickLogInButton()
    {
        logInButton.click();
    }

    public void logIn(String username, String password)
    {
        enterUsername(username);
        enterPassword(password);
        clickLogInButton();
    }
}
