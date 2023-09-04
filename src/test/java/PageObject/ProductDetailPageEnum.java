package PageObject;

import StepDefination.BaseClass;

public enum ProductDetailPageEnum {

    click_on_product_from_listing_page("(//div[@class='inventory_item_img'])[" + BaseClass.clickproduct + "]"),
    Verify_pdp_should_open_successfully("//button[contains(text(), 'Add to cart')]"),
    pdp_expected_text("Add to cart");

    public String label;

    ProductDetailPageEnum(String label)
    {
        this.label = label;
    }

    public String getDummy() {
        return label;
    }
}

