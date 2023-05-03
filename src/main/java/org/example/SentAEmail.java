package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class SentAEmail extends Utils{

    private By _printMessage = By.xpath("//div[@class='result']");
    public void printEmailSentMessage(){

        String expected = "Your Email has been  not sent.";
        String actualmessage = getTextFormElement(_printMessage);
        System.out.println("My message:" + actualmessage);
        //check if actual result is same as expected
        Assert.assertEquals(expected, actualmessage, "Email has been sent successfully");
    }
}
