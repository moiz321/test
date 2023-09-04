package PageObject;

import StepDefination.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ProductListing extends BaseClass {

    public ProductListing(WebDriver rDriver)
    {
        driver = rDriver;

        PageFactory.initElements(rDriver, this);
    }

    public void click_short_addtocart()
    {
        driver.findElement(By.xpath(ProductListingEnum.click_on_short_addtocart.getDummy())).click();

    }

    public void verify_item_added_after_click_short_addtocart()
    {
        Assert.assertEquals(true, driver.findElement(By.xpath(ProductListingEnum.verify_click_on_short_addtocart.getDummy())).isDisplayed());

    }




}
