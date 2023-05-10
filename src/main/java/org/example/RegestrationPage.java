package org.example;

import org.openqa.selenium.By;

public class RegestrationPage extends Utils {

    private By _typeFirstName = By.id("FirstName");
    private By _typeLastName = By.id("LastName");
    private By _dayofbirth = By.id("DateOfBirth");
    private By _monthofbirth = By.id("MonthOfBirth");
    private By _yearofbirth = By.id("YearOfBirth");
    private By _typeEmail = By.name("Email");
    private By _typePassword = By.name("Password");
    private By _confirmPassword = By.id("ConfirmPassword");
    private By _clickonRegister = By.id("register-button");
    private By _clickOnLogin = By.className("ico-login");



    public void enterRegistrationDetails(){

       // Utils.clickOnElement(By.className("ico-register"));
        // driver.findElement(By.id("FirstName")).sendKeys("Tejas");
        typeText(_typeFirstName, "Tejas");
       // Utils.typeText(By.id("FirstName"), "Tejas");
        // driver.findElement(By.id("LastName")).sendKeys("Vaddoriya");
        typeText(_typeLastName, "Vaddoriya");
       // Utils.typeText(By.id("LastName"), "Vaddoriya");
        //driver.findElement(By.name("Email")).sendKeys("Tejasvadoriya+"+timestamp.getTime()+"@vmail.com");
        selectElementsByValue(_dayofbirth, "26");
     //   slectElementByIndex(_monthofbirth, 2);
      //  slectElementByText(_yearofbirth, "1996");
        typeText(_typeEmail, "tejasvaddoriya" + datestamp() + "@vmail.com");
       // Utils.typeText(By.name("Email"), "Tejasvadoriya" + Utils.timestamp.getTime() + "@vmail.com");
        // driver.findElement(By.id("Password")).sendKeys("tejas1234");
        typeText(_typePassword, "tej12345");
       // Utils.typeText(By.id("Password"), "tejas1234");
        //driver.findElement(By.id("ConfirmPassword")).sendKeys("tejas1234");
        typeText(_confirmPassword, "tej1234");
      //  Utils.typeText(By.id("ConfirmPassword"), "tejas1234");
        // driver.findElement(By.id("register-button")).click();
       // Utils.clickOnElement(By.id("register-button"));
        clickOnElement(_clickonRegister);
    }
}
