package PageObject;

public enum LoginEnum {

    enter_username("//input[@id='user-name']"),
    enter_password("//input[@id='password']"),
    click_loginbutton("login-button"),
    verify_after_login_expectedtext("Swag Labs"),
    verify_after_login("//div[@class='app_logo']"),
    click_sidemenu("//button[@id='react-burger-menu-btn']"),
    click_logoutbutton("//a[@id='logout_sidebar_link']"),
    verify_logout_successfully("login-button");

    public String label;

    LoginEnum(String label)
    {
        this.label = label;
    }

    public String getDummy() {
        return label;
    }


}
