package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ShoppingCart extends Utils{

    private By _printName = By.className("product-name");
    public void addProductInShoppingCart(){

        String expectedaresult = "Leics T Mirrorless Digital Camera";
        //print product name
        String actualResult = getTextFormElement(_printName);
        System.out.println("product add in cart is:" + actualResult);
        Assert.assertEquals(actualResult, expectedaresult, "Same Product in cart");
    }
}
