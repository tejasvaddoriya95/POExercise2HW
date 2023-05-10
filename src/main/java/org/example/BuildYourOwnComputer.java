package org.example;

import org.openqa.selenium.By;

public class BuildYourOwnComputer extends Utils {

    public void selectConfiguration() {
        //select processor
        selectElementsByValue(By.id("product_attribute_1"), "1");

        //select ram
        slectElementByText(By.id("product_attribute_2"), "8GB [+$60.00]");
        //CLICK ON CHECKBOX
        clickOnElement(By.xpath("//input[@name='product_attribute_3'][1]"));
        clickOnElement(By.xpath("//input[@id='product_attribute_4_8']"));
        clickOnElement(By.xpath("//input[@id='product_attribute_5_10']"));
        clickOnElement(By.xpath("//input[@id='product_attribute_5_11']"));
        clickOnElement(By.xpath("//input[@id='product_attribute_5_12']"));

    }

    public void addProducttoCart() {
        //click on addtocart button
        clickOnElement(By.xpath("//button[@type='button']"));
    }

    public void ShoppingCart() {
        //click on shoppingcart
        clickOnElement(By.partialLinkText("Shopping cart"));
    }

}
