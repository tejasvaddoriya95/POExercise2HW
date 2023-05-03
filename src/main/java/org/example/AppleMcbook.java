package org.example;

import org.openqa.selenium.By;

public class AppleMcbook extends Utils{

    private By _clickonEmail = By.xpath("//button[@class='button-2 email-a-friend-button']");
    public void clickonEmailAFriend(){
        clickOnElement(_clickonEmail);
    }
}
