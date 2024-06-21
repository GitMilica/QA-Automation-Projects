package pages;

import helpers.BaseHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class AnanasRefrigeratorsPage extends BaseHelper

{
    @FindBy(xpath="//*[@id=\"__next\"]/div[4]/div[2]/div/div[3]/div/div/div[2]")
    WebElement subcategoriesOfRefrigerators;

    @FindBy(className = "MuiCheckbox-root")
    WebElement checkBox;

    WebDriver driver;
    public AnanasRefrigeratorsPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    private void clickOnKombinovaniFrizideri()
    {
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"__next\"]/div[4]/div[2]/div/div[3]/div/div/div[2]")));
        List<WebElement> listOfRefrigerators = subcategoriesOfRefrigerators.findElements(By.className("slick-slide"));
        System.out.println("Number of elements: " + listOfRefrigerators.size());

        String nameOfSubcategory = "Kombinovani frižideri";

        for (WebElement subcategory : listOfRefrigerators)
        {
            List<WebElement> links = subcategory.findElements(By.tagName("a"));

            for (WebElement link : links)
            {
                if (link.getText().equals(nameOfSubcategory))
                {
                    wdWait.until(ExpectedConditions.elementToBeClickable(link));

                    link.click();

                    return;
                }
            }
        }
    }

    private void clickOnGorenje()
    {
        wdWait.until(ExpectedConditions.elementToBeClickable(checkBox));
        checkBox.click();
//        System.out.println("Klikuo je na:" + checkBox.get);
    }

    public void gorenjeKombinovaniFrizideri()
    {
        clickOnKombinovaniFrizideri();
        clickOnGorenje();
    }
}

