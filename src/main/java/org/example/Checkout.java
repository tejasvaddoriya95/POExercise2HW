package org.example;

import org.openqa.selenium.By;

public class Checkout extends Utils{
    public void clickonCheckoutAsGuest() {
        //click on checkout
        clickOnElement(By.xpath("//button[@class='button-1 checkout-as-guest-button']"));
    }
}
