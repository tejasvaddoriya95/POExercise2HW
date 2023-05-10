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
    public void BuildYourOwnComputerIsAddedToCart() {

        if(driver.findElement(By.cssSelector("a.product-name")).isDisplayed()) {
            String text = getTextFormElement(By.cssSelector("a.product-name"));
            System.out.println(text);
        }else{
            System.out.println("Product is not in shopping cart");
        }
    }
    public void clickOnTermsAndConditionsAndCheckout(){
        //click on terms and conditions
        clickOnElement(By.xpath("//input[@id='termsofservice']"));
        //click on ckeckout
        clickOnElement(By.xpath("//button[@id='checkout']"));
    }

}
