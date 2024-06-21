package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.HKappLoginPage;

public class HKappLoginTest extends BaseTest


{
    @Test
    public void LogInWithValidCredentials() throws InterruptedException
    {

        HKappLoginPage loginPage = new HKappLoginPage(driver);
        loginPage.login("tomsmith", "SuperSecretPassword!");

        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("flash")));
        WebElement flashMessage = driver.findElement(By.id("flash"));
        Assert.assertTrue(flashMessage.getText().contains("You logged into a secure area!"));
        WebElement logOutButton = driver.findElement(By.className("icon-signout"));
        Assert.assertTrue(logOutButton.getText().contains("Logout"));

        Thread.sleep(3000);
    }

    @Test
    public void LogInWithInvalidCredentials()

    {
        HKappLoginPage loginPage = new HKappLoginPage(driver);
        loginPage.login("badusername", "SuperSecretPassword!");

        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("flash")));
        WebElement flashMessage = driver.findElement(By.id("flash"));
        Assert.assertTrue(flashMessage.getText().contains("Your username is invalid!"));
        WebElement logInButton = driver.findElement(By.className("fa-sign-in"));
        Assert.assertTrue(logInButton.getText().contains("Login"));

    }


}
