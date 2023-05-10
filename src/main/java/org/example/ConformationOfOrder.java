package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ConformationOfOrder extends Utils{

    public void verifyOrderConformation() {

        String s1 = getTextFormElement(By.cssSelector("div.page-title h1"));
        System.out.println(s1);
        //print order number
        String s2 = getTextFormElement(By.cssSelector("div.order-number strong"));
        System.out.println(s2);
        //verify if order is submitted and print message
        Assert.assertEquals(getTextFormElement(By.xpath("//div[@class='section order-completed']/div/strong")),"Order submitted");
    }

}
