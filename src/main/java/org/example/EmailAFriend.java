package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class EmailAFriend extends Utils{

    private By _typefriendsEmail = By.className("friend-email");
    private By _typeYourEmail = By.className("your-email");
    private By _clickonSend = By.name("send-email");
    private By _errorMessage = By.xpath("//div[@class='message-error validation-summary-errors']/ul/li");
    private By _printMessage = By.xpath("/div[@class='result']");

    public void emailAFriend(){
        //type friends email
        typeText(_typefriendsEmail,"friends123@gmail.com");
        //clear field
        WebElement email = driver.findElement(_typeYourEmail);
        email.clear();
        //type your mail
        typeText(_typeYourEmail, "myemail"+datestamp()+"@gmail.com");
        clickOnElement(_clickonSend);
    }
    public void printerrorMessage(){
        String expected = "Only Registered user can refer a Friend";
        String actualmessage = getTextFormElement(_errorMessage);
        System.out.println("My message:" + actualmessage);
        Assert.assertEquals(expected, actualmessage, "Email has been sent to a friend");

    }

}
