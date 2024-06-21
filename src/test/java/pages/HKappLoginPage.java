package pages;

import helpers.BaseHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HKappLoginPage extends BaseHelper

{

    @FindBy(id="username")
    WebElement usernameField;

    @FindBy(id="password")
    WebElement passwordField;

    @FindBy(className = "fa-sign-in")
    WebElement loginButton;

    WebDriver driver;
    public HKappLoginPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    private void navigateToLoginPage()
    {
        driver.get("https://the-internet.herokuapp.com/login");
    }

    private void enterUsernameInUsernameField(String username)
    {
        usernameField.sendKeys(username);
    }

    private void enterPasswordInPasswordField(String password)

    {
        passwordField.sendKeys(password);
    }

    private void clickOnLoginButton()
    {
        loginButton.click();
    }

    public void login(String username, String password)
    {
        navigateToLoginPage();
        enterUsernameInUsernameField(username);
        enterPasswordInPasswordField(password);
        clickOnLoginButton();

    }




}
