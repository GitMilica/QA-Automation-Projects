package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.AnanasHomePage;
import pages.AnanasLogInPage;

public class AnanasLogInTest extends BaseTest

{
    @Test
    public void invalidLogInTest() throws InterruptedException
    {
        String username = "tomsmith";
        String password = "badpassword";
        AnanasHomePage HomePage = new AnanasHomePage(driver);
        HomePage.openAnanasLogIn();

        AnanasLogInPage logInPage = new AnanasLogInPage(driver);
        logInPage.logIn(username, password);

        WebElement popUpMessage = driver.findElement(By.xpath("//*[@id=\"login-form-card\"]/form/div[1]/p"));
        Assert.assertTrue(popUpMessage.getText().contains("Email adresa nije ispravna."));

        Thread.sleep(8000);
    }
}
