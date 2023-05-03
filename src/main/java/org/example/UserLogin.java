package org.example;

import org.openqa.selenium.By;

public class UserLogin extends Utils{

    private By _typeAEmail = By.xpath("//input[@name='Email']");
    private By _typePassword = By.xpath("//input[@class='password']");
    private By _clockOnLogin = By.xpath("//button[@class='button-1 login-button']");
    private By _clickOnHomepage = By.xpath("//img[@alt='nopCommerce demo store']");

    public void Logindetails(){
        //type email
        typeText(_typeAEmail, "tejas"+datestamp()+"@gmail.com");
        //type password
        typeText(_typePassword, "tejas1234");
        //go to homepage
        clickOnElement(_clockOnLogin);

    }
}
