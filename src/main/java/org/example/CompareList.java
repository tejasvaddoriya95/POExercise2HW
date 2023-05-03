package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class CompareList extends Utils{

    private By _gettextfromGiftCard = By.partialLinkText("$25 Virtual Gift Card");
    private By _gettextfromHTC = By.partialLinkText("HTC One M8 Android L 5.0 Lollipop");
    private  By _clikonClearList =By.className("clear-list");
    private By _gettextfromMessage = By.className("no-data");
    public void checkProductsInCompareList() {

        String expectedResult = "no product for comparison";

        String name1 = getTextFormElement(_gettextfromGiftCard);
        System.out.println("First Product is: " + name1);
        String name2 = getTextFormElement(_gettextfromHTC);
        System.out.println("Second Product is: " + name2);
        //clear compare list
        clickOnElement(_clikonClearList);

        String actualResult = getTextFormElement(_gettextfromMessage);
        System.out.println("My message:" + actualResult);
        //check the actual result
        Assert.assertEquals(actualResult, expectedResult, "no product for comparison");








    }
}
