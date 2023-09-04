package PageObject;

import StepDefination.BaseClass;

public enum CartPageEnum {

    click_on_cart_icon("//a[@class='shopping_cart_link']"),
    verify_two_items_should_be_add_in_the_cart("//div[@class='cart_item'][2]"),
    remove_one_item_from_the_item("//div[@class='cart_item'][2]//button"),
    Verify_one_item_should_be_in_cart("//div[@class='cart_item']");



    public String label;

    CartPageEnum(String label)
    {
        this.label = label;
    }

    public String getDummy() {
        return label;
    }
}
