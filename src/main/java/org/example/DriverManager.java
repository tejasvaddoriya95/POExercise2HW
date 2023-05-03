package org.example;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DriverManager extends Utils {
   // DriverManager driverManager = new DriverManager();

    public void openBrowser(){
        //open the browser
        Utils.driver = new ChromeDriver();
        //open the URL
        Utils.driver.get("https://demo.nopcommerce.com/");
        //maximize the window
        Utils.driver.manage().window().maximize();
        Utils.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void closeBrowser(){

        //close the browser
        Utils.driver.close();
    }

}
