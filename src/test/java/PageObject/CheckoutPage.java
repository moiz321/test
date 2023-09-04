package PageObject;

import StepDefination.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CheckoutPage extends BaseClass {

    public CheckoutPage(WebDriver rDriver) {

        driver = rDriver;
        PageFactory.initElements(rDriver, this);
    }

    public void User_click_on_Checkout_button() {

        driver.findElement(By.id(CheckoutPageEnum.User_click_on_Checkout_button.getDummy())).click();
    }

    public void user_verify_customer_information_page_should_be_open() {

        String actualtext = driver.findElement(By.xpath(CheckoutPageEnum.verify_customer_information_page_should_be_open.getDummy())).getText();
        Assert.assertEquals(actualtext, CheckoutPageEnum.expectedtext.getDummy());
    }

    public void fill_the_customer_information() {

        driver.findElement(By.id(CheckoutPageEnum.firstname.getDummy())).sendKeys("Ahad");
        driver.findElement(By.id(CheckoutPageEnum.lastname.getDummy())).sendKeys("Jamshed");
        driver.findElement(By.id(CheckoutPageEnum.zipcode.getDummy())).sendKeys("123456");
    }

    public void user_click_on_continue_button() {

        driver.findElement(By.id(CheckoutPageEnum.click_on_continue_button.getDummy())).click();
    }

    public void user_verify_checkout_open() {

        Assert.assertEquals(true, driver.findElement(By.id(CheckoutPageEnum.verify_checkout_ope.getDummy())).isDisplayed());
    }

    public void User_click_on_Finish_button() {

        driver.findElement(By.id(CheckoutPageEnum.verify_checkout_ope.getDummy())).click();
    }

    public void Verify_order_should_be_placed_successfully() {

        String actualtext = driver.findElement(By.xpath(CheckoutPageEnum.order_placed.getDummy())).getText();
        Assert.assertEquals(actualtext, CheckoutPageEnum.order_placed_expected_text.getDummy());
    }
}
