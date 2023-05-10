package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeOptions;

public class BillingDetails extends Utils {

    public void submitBillingDetails() {
        //type firstname
        typeText(By.xpath("//input[@id='BillingNewAddress_FirstName']"), "Tejas");

        typeText(By.xpath("//input[@id='BillingNewAddress_LastName']"), "Patel");

        typeText(By.xpath("//input[@id='BillingNewAddress_Email']"), "tejaspatel@gmail.com");

        slectElementByText(By.xpath("//select[@id='BillingNewAddress_CountryId']"), "United Kingdom");

        typeText(By.xpath("//input[@id='BillingNewAddress_City']"), "Southend-On-Sea");

        typeText(By.xpath("//input[@id='BillingNewAddress_Address1']"), "10 Churchil Road");

        typeText(By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']"), "SS2 2RF");

        typeText(By.xpath("//input[@id='BillingNewAddress_PhoneNumber']"), "00447777822555");

        clickOnElement(By.xpath("(//button[@name='save'])[1]"));

    }

    public void handlePopUp() {
        //import ChromOptions to handle popup window
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("test-type");
        options.addArguments("disable-notifications");
    }

    public void confirmCheckout() {
        //click on confirm order
        clickOnElement(By.xpath("//button[@onclick='ConfirmOrder.save()']"));
    }
}
