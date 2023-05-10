package org.example;

import org.openqa.selenium.By;

public class ShippingMethod extends Utils{

    public void selectShippingMethod() {

        clickOnElement(By.xpath("(//input[@name='shippingoption'])[2]"));
        clickOnElement(By.xpath("//button[@class='button-1 shipping-method-next-step-button']"));
    }
}
