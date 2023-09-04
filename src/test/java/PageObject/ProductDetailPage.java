package PageObject;

import StepDefination.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ProductDetailPage extends BaseClass {

    public ProductDetailPage (WebDriver rDriver)
    {
        driver = rDriver;

        PageFactory.initElements(rDriver, this);
    }

    public void click_on_product_from_listing_page() {

        driver.findElement(By.xpath(ProductDetailPageEnum.click_on_product_from_listing_page.getDummy())).click();

    }

    public void Verify_pdp_should_open_successfully() {

        String actualtext = driver.findElement(By.xpath(ProductDetailPageEnum.Verify_pdp_should_open_successfully.getDummy())).getText();
        String expectedtext = ProductDetailPageEnum.pdp_expected_text.getDummy();
        Assert.assertEquals(actualtext, expectedtext);

    }

    public void click_on_add_to_cart_from_pdp() {

        driver.findElement(By.xpath(ProductDetailPageEnum.Verify_pdp_should_open_successfully.getDummy())).click();

    }

    public void user_verify_add_to_cart_successfully_from_pdp() {

        Assert.assertEquals(true, driver.findElement(By.xpath(ProductListingEnum.verify_click_on_short_addtocart.getDummy())).isDisplayed());

    }
}
