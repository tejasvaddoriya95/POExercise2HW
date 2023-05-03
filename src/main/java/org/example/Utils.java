package org.example;

import org.example.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class Utils extends BasePage {

    protected static WebDriver driver;


    static Timestamp timestamp = new Timestamp(System.currentTimeMillis());

    public static void clickOnElement(By by) {
        driver.findElement(by).click();
    }

    public static void typeText(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    public static String getTextFormElement(By by) {
        return driver.findElement(by).getText();
    }


    public static long timestamp() {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        return timestamp.getTime();
    }

    public static long datestamp() {
        SimpleDateFormat sd = new SimpleDateFormat("dd-MM-YYYY-hh:mm");
        return sd.hashCode();
    }

}
