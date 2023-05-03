package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegisterResultPage extends Utils {
     String expectedRegistrationCompleteMsg = "Thanks for registration";

    public void verifyUserRegisteredSuccessfullyOrNot(){


        String expectedRegistrationCompleteMsg = "Thanks for registration";
        String actualmessage = Utils.getTextFormElement(By.xpath("//div[@class='result']"));
        System.out.println("My message:" + actualmessage);
        Assert.assertEquals(actualmessage, expectedRegistrationCompleteMsg, "Registration is not working");




    }
}
