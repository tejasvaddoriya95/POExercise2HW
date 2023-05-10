package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Nike extends Utils{

    public void verifyNikeProductAreDisplayed() {

        List<WebElement> productList = driver.findElements(By.cssSelector("h2.product-title"));
        String actualResult = null;
        int i = 0;
        //run a loop to confirm all products are from nike
        for (WebElement e : productList) {
            System.out.println(e.getText());
            if(e.getText().contains("Nike")){
                i++;
                actualResult = "Nike";
            }
        }System.out.println("Total Elements Checked "+ i);
        if(productList.size()==i)
            System.out.println("All Products Are Of "+actualResult);
    }

}
