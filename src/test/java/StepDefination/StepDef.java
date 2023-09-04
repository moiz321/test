package StepDefination;

import PageObject.*;
import io.cucumber.java.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Allure;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
//import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class StepDef extends BaseClass{


    @Before
    public void browser_setup()
    {
        //Initialize Logger
        log = LogManager.getLogger(StepDef.class);
        System.out.println("Sanity Before method executed");
        driver = new ChromeDriver();

    }

    @Given("User launch the Chrome Browser")
    public void user_launch_the_chrome_browser() {

        logpage = new LoginPage(driver);
        cartpage = new ProductListing(driver);
        pdp = new ProductDetailPage(driver);
        cop = new CheckoutPage(driver);
        cp = new CartPage(driver);

        log.info("User launch chrome browser");

    }

    @When("user open URL {string}")
    public void user_open_url(String url) {

        try {
            driver.navigate().to(url);
            driver.manage().window().maximize();

            log.info("User Open the URL");
        }catch (Exception ex)
        {
            log.info("Error in assertion");
        }

    }

    @When("User enters Username as {string}")
    public void user_enters_username_as(String username) {

        try {
            logpage.enter_username(username);
            log.info("User enters the username");
        }catch (Exception ex)
        {
            log.info("Error in assertion");
        }


    }

    @When("User enters Password as {string}")
    public void user_enters_password_as(String pwd) {
        try{
            logpage.enter_password(pwd);
            log.info("User enters the password");

        }catch (Exception ex)
        {
            log.info("Error in assertion");
        }


    }

    @When("Click on login")
    public void click_on_login() {
        try {
            logpage.click_lgnbtn();
            log.info("User click on login button");

        }catch (Exception ex)
        {
            log.info("Error in assertion");
        }


    }

    @Then("User should login successfully")
    public void user_should_login_successfully() {

        try {
            logpage.verify_login_successfully();
            log.info("User logged in successfully");

        }catch (Exception ex)
        {
            log.info("Error in assertion");
        }

    }

    @And("Click on side menu")
    public void click_on_sidemenu() throws InterruptedException {

        try {
            logpage.click_on_sidemenu();
            log.info("User click on side menu");

        }catch (Exception ex)
        {
            log.info("Error in assertion");
        }

    }

    @When("User clicks on log out link")
    public void user_clicks_on_log_out_link() {

        try {
            logpage.click_on_logout_button();
            log.info("User clicks on logout button");

        }catch (Exception ex)
        {
            log.info("Error in assertion");
        }

    }

    @Then("User should logout successfully")
    public void user_should_logout_successfully() {

        try {
            logpage.verify_logout_successfully();
            log.info("User should logout successfully");

        }catch (Exception ex)
        {
            log.info("Error in assertion");
        }

    }

    @And("Close the browser")
    public void close_the_browser() {

        try {
            driver.close();
            log.info("driver closed");

        }catch (Exception ex)
        {
            log.info("Error in assertion");
        }

    }

    //Scenario: Successfull login with valid credentials with DTT

    @When("User click on short add to cart")
    public void user_click_on_short_add_to_cart() throws InterruptedException {
        try {
            cartpage.click_short_addtocart();
            log.info("User click on short add to cart");

        }catch (Exception ex)
        {
            log.info("Error in assertion");
        }

    }

    @Then("Verify item should be add in the cart from short add to cart")
    public void verify_item_should_be_add_in_the_cart_from_short_add_to_cart() {
        try {
            cartpage.verify_item_added_after_click_short_addtocart();
            log.info("Verify item should be add in the cart from short add to cart");

        }catch (Exception ex)
        {
            log.info("Error in assertion");
        }

    }

    @When("User click on product from listning page")
    public void user_click_on_product_from_listing_page() {
        try {
            pdp.click_on_product_from_listing_page();
            log.info("User click on product from listning page");

        }catch (Exception ex)
        {
            log.info("Error in assertion");
        }

    }

    @Then("Verify pdp should open successfully")
    public void user_verify_pdp_should_open_successfully() {
        try {
            pdp.Verify_pdp_should_open_successfully();
            log.info("Verify pdp should open successfully");

        }catch (Exception ex)
        {
            log.info("Error in assertion");
        }

    }


    @When("User click on add to cart from PDP")
    public void user_click_on_add_to_cart_from_pdp() {
        try {
            pdp.click_on_add_to_cart_from_pdp();
            log.info("User click on add to cart from PDP");

        }catch (Exception ex)
        {
            log.info("Error in assertion");
        }

    }

    @Then("Verify add to cart successfully from PDP")
    public void verify_add_to_cart_successfully_from_pdp() {
        try {
            pdp.user_verify_add_to_cart_successfully_from_pdp();
            log.info("Verify add to cart successfully from PDP");

        }catch (Exception ex)
        {
            log.info("Error in assertion");
        }

    }

    @Then("User click on cart page")
    public void user_click_on_cart_page() {
        try {
            cp.click_on_cart_icon();
            log.info("User click on cart page");

        }catch (Exception ex)
        {
            log.info("Error in assertion");
        }
    }

    @Then("Verify two items should be add in the cart")
    public void verify_two_items_should_be_add_in_the_cart() {
        try {
            cp.user_verify_two_items_should_be_add_in_the_cart();
            log.info("Verify two items should be add in the cart");

        }catch (Exception ex)
        {
            log.info("Error in assertion");
        }

    }

    @When("User remove one item from the item")
    public void user_remove_one_item_from_the_item() {
        try {
            cp.user_remove_one_item_from_the_item();
            log.info("User remove one item from the item");

        }catch (Exception ex)
        {
            log.info("Error in assertion");
        }


    }

    @Then("Verify one item should be in cart")
    public void verify_one_item_should_be_in_cart() {
        try {
            cp.user_verify_one_item_should_be_in_cart();
            log.info("Verify one item should be in cart");

        }catch (Exception ex)
        {
            log.info("Error in assertion");
        }

    }

    @Then("User click on Checkout button")
    public void user_click_on_checkout_button() {
        try {
            cop.User_click_on_Checkout_button();
            log.info("User click on Checkout button");

        }catch (Exception ex)
        {
            log.info("Error in assertion");
        }

    }

    @Then("Verify customer information page should be open")
    public void verify_customer_information_page_should_be_open() {
        try {
            cop.user_verify_customer_information_page_should_be_open();
            log.info("Verify customer information page should be open");

        }catch (Exception ex)
        {
            log.info("Error in assertion");
        }

    }

    @And("User fill the customer information")
    public void user_fill_the_customer_information() {
        try {
            cop.fill_the_customer_information();
            log.info("User fill the customer information");

        }catch (Exception ex)
        {
            log.info("Error in assertion");
        }

    }



    @When("User click on Continue button")
    public void user_click_on_continue_button() {
        try {
            cop.user_click_on_continue_button();
            log.info("User click on Continue button");

        }catch (Exception ex)
        {
            log.info("Error in assertion");
        }

    }

    @Then("Verify final checkout page should be open")
    public void verify_final_checkout_page_should_be_open() {
        try {
            cop.user_verify_checkout_open();
            log.info("Verify final checkout page should be open");

        }catch (Exception ex)
        {
            log.info("Error in assertion");
        }


    }

    @When("User click on Finish button")
    public void user_click_on_finish_button() {
        try {
            cop.User_click_on_Finish_button();
            log.info("User click on Finish button");

        }catch (Exception ex)
        {
            log.info("Error in assertion");
        }


    }

    @Then("Verify order should be placed successfully")
    public void verify_order_should_be_placed_successfully() {
        try {
            cop.Verify_order_should_be_placed_successfully();
            log.info("Verify order should be placed successfully");

        }catch (Exception ex)
        {
            log.info("Error in assertion");
        }


    }

    @After
    public void TearDown(Scenario sc) throws IOException {

        System.out.println("Sanity After method executed");

        if (sc.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            Allure.addAttachment("Failed Screenshot", new ByteArrayInputStream(screenshot));
        }

        driver.quit();
    }

}
