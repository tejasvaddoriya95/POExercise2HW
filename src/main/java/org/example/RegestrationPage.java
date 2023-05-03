package org.example;

import org.openqa.selenium.By;

public class RegestrationPage extends Utils {

    public void enterRegistrationDetails(){

        Utils.clickOnElement(By.className("ico-register"));
        // driver.findElement(By.id("FirstName")).sendKeys("Tejas");
        Utils.typeText(By.id("FirstName"), "Tejas");
        // driver.findElement(By.id("LastName")).sendKeys("Vaddoriya");
        Utils.typeText(By.id("LastName"), "Vaddoriya");
        //driver.findElement(By.name("Email")).sendKeys("Tejasvadoriya+"+timestamp.getTime()+"@vmail.com");
        Utils.typeText(By.name("Email"), "Tejasvadoriya" + Utils.timestamp.getTime() + "@vmail.com");
        // driver.findElement(By.id("Password")).sendKeys("tejas1234");
        Utils.typeText(By.id("Password"), "tejas1234");
        //driver.findElement(By.id("ConfirmPassword")).sendKeys("tejas1234");
        Utils.typeText(By.id("ConfirmPassword"), "tejas1234");
        // driver.findElement(By.id("register-button")).click();
        Utils.clickOnElement(By.id("register-button"));
    }
}
