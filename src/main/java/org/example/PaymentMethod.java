package org.example;

import org.openqa.selenium.By;

public class PaymentMethod extends Utils{

    public void selectPaymentMethod() {

        clickOnElement(By.xpath("//input[@id='paymentmethod_1']"));
        clickOnElement(By.xpath("(//button[@name='save'])[2]"));
    }
}
