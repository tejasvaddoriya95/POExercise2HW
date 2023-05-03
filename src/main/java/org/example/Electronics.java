package org.example;

import org.openqa.selenium.By;

public class Electronics extends Utils{

    private By _clickonCamera = By.xpath("(//a[@title='Show products in category Camera & photo'])[1]");
    private By _clickonAddToCart = By.xpath("(//button[@class='button-2 product-box-add-to-cart-button'])[2]");
    private By _gettextFromCamera = By.partialLinkText("Leica T Mirrorless Digital Camera");
    private By _clickonShoppingCart = By.partialLinkText("cart-label");

    public void addProductToCart(){
        //click on camera
        clickOnElement(_clickonCamera);
        //click on add to cart
        clickOnElement(_clickonAddToCart);
        //print the name of product

        String name1 = getTextFormElement(_gettextFromCamera);
        System.out.println("product add in cart:" + name1);

        clickOnElement(_clickonShoppingCart);
    }
}
