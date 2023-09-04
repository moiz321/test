package PageObject;

import StepDefination.BaseClass;

public enum ProductListingEnum {

    click_on_short_addtocart("(//div[@class='inventory_item']//button[@class='btn btn_primary btn_small btn_inventory'])[" + BaseClass.shortaddtocart + "]"),
    verify_click_on_short_addtocart("//button[contains(text(), 'Remove')]");


    public String label;

    ProductListingEnum(String label)
    {
        this.label = label;
    }

    public String getDummy() {
        return label;
    }
}
