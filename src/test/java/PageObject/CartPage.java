package PageObject;

import StepDefination.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CartPage extends BaseClass {

    public CartPage(WebDriver rDriver) {

        driver = rDriver;
        PageFactory.initElements(rDriver, this);
    }

    public void click_on_cart_icon() {

        driver.findElement(By.xpath(CartPageEnum.click_on_cart_icon.getDummy())).click();
    }

    public void user_verify_two_items_should_be_add_in_the_cart() {

        Assert.assertEquals(true, driver.findElement(By.xpath(CartPageEnum.verify_two_items_should_be_add_in_the_cart.getDummy())).isDisplayed());
    }

    public void user_remove_one_item_from_the_item() {

        driver.findElement(By.xpath(CartPageEnum.remove_one_item_from_the_item.getDummy())).click();
    }

    public void user_verify_one_item_should_be_in_cart() {

        Assert.assertEquals(true, driver.findElement(By.xpath(CartPageEnum.Verify_one_item_should_be_in_cart.getDummy())).isDisplayed());
    }
}
