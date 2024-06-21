package pages;

import helpers.BaseHelper;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class AnanasCategoriesHomePage extends BaseHelper

{
    @FindBy(xpath="//*[@id=\"__next\"]/div[7]/div/div/button[2]")
    WebElement cookie;


    WebDriver driver;
    public AnanasCategoriesHomePage(WebDriver driver)
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
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"__next\"]/div[7]/div/div/button[2]")));
        wdWait.until(ExpectedConditions.elementToBeClickable(cookie));
        cookie.click();
    }

    private void clickOnFrizideri()
    {
        wdWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"__next\"]/div[4]/header/div[4]/div/section/div/nav/ul/li[4]")));
        WebElement navigationBar= driver.findElement(By.tagName("nav"));
        List<WebElement> categories = navigationBar.findElements(By.tagName("li"));
        Assert.assertEquals(13, categories.size());

//
//        int n=0;
//        for(WebElement category:categories)
//        {
//            n ++;
//            System.out.println(n);
//            System.out.println(category.getText());
//        }

        WebElement fourthElement = categories.get(3);
        WebElement elementFrizider = fourthElement.findElement(By.tagName("a"));
        elementFrizider.click();

    }

    public void homePage()
    {
        navigate();
        cookies();
        clickOnFrizideri();
    }
}
