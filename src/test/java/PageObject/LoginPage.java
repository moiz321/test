package PageObject;

import StepDefination.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage extends BaseClass {

    public LoginPage (WebDriver rDriver)
    {
        driver = rDriver;

        PageFactory.initElements(rDriver, this);
    }

  /*  @FindBy(id = "user-name")
    WebElement username;*/

  /*  @FindBy(id = "password")
    WebElement password;*/

   /* @FindBy(xpath = "//input[@id='login-button']")
    WebElement lgnbtn;*/

    public void enter_username(String usrname)
    {
        driver.findElement(By.xpath(LoginEnum.enter_username.getDummy())).sendKeys(usrname);
    }

    public void enter_password(String pwd)
    {
        driver.findElement(By.xpath(LoginEnum.enter_password.getDummy())).sendKeys(pwd);
    }

    public void click_lgnbtn()
    {
        driver.findElement(By.id(LoginEnum.click_loginbutton.getDummy())).click();
    }

    public void verify_login_successfully()
    {
        Assert.assertEquals(LoginEnum.verify_after_login_expectedtext.getDummy(), driver.findElement(By.xpath(LoginEnum.verify_after_login.getDummy())).getText());
    }

    public void click_on_sidemenu() throws InterruptedException {

        driver.findElement(By.xpath(LoginEnum.click_sidemenu.getDummy())).click();
        Thread.sleep(3000);
    }

    public void click_on_logout_button()
    {
        driver.findElement(By.xpath(LoginEnum.click_logoutbutton.getDummy())).click();
    }

    public void verify_logout_successfully()
    {
        Assert.assertEquals(true, driver.findElement(By.id(LoginEnum.verify_logout_successfully.getDummy())).isDisplayed());
    }


}
