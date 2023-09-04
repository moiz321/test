package StepDefination;

import PageObject.*;
import org.openqa.selenium.WebDriver;

import java.util.Properties;
import java.util.logging.LogManager;

import org.apache.logging.log4j.*;

public class BaseClass {

    public WebDriver driver;
    public LoginPage logpage;
    public ProductListing cartpage;
    public ProductDetailPage pdp;
    public CheckoutPage cop;
    public CartPage cp;
    public static int shortaddtocart = 1;
    public static int clickproduct = 3;
    public static Logger log;

}
