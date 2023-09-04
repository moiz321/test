package PageObject;

public enum CheckoutPageEnum {

    User_click_on_Checkout_button("checkout"),
    verify_customer_information_page_should_be_open("//button[contains(text(), 'Cancel')]"),
    expectedtext("Cancel"),
    click_on_continue_button("continue"),
    firstname("first-name"),
    lastname("last-name"),
    zipcode("postal-code"),
    verify_checkout_ope("finish"),
    order_placed("//h2[contains(text(), 'Thank you for your order!')]"),
    order_placed_expected_text("Thank you for your order!");


    public String label;

    CheckoutPageEnum(String label)
    {
        this.label = label;
    }

    public String getDummy() {
        return label;
    }
}
