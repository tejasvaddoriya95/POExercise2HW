package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class HomePage extends Utils {
    private By _clickonGood = By.xpath("//label[@for='pollanswers-2']");
    public By _clickonVote = By.xpath("//button[@id='vote-poll-1']");
    private By _erroeMessage = By.xpath("//div[@class='poll-vote-error']");
    private By _product1 = By.xpath("//button[@class='button-2 add-to-compare-list-button'])[3]");
    private By _comparelist = By.xpath("//*[@id=\"bar-notification\"]/div/p/a");
    private By _product2 = By.xpath("//button[@class='button-2 add-to-compare-list-button'])[4]");
    private By _clickonProduct = By.xpath("//button[@class='button-2 product-box-add-to-cart-button'])[2]");
    private By _electronics = By.xpath("(//a[@title='Show products in category Electronics'])[1]");
    private By _registerButton = By.className("ico-register");
    private By _clickOnLogin = By.className("ico-login");
    private By _totalvote = By.className("poll-total-votes");

    public void communityPoll() {
        clickOnElement(_clickonGood);
        clickOnElement(_clickonVote);
    }

    public void communityPollErrorMessage() {
        String expectedResult = "Non Registered User Cannot Vote";
        //add wait time
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(_erroeMessage));
        String actualResult = getTextFormElement(_erroeMessage);
        System.out.println(actualResult);
        Assert.assertEquals(actualResult, expectedResult, "Test Fail");
    }

    public void communitypollVoteMessage() {
        String expectedResult = "18 vote(s)";
        String actualaresult = getTextFormElement(_totalvote);
        System.out.println(actualaresult);
        Assert.assertEquals(actualaresult, expectedResult, "Total Vote");
    }

    public void addProductInComparelist() {
        clickOnElement(_product1);
        //add wait time
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        //add another product
        clickOnElement(_product2);
        //go to comparelist
        clickOnElement(_comparelist);
    }

    public void clickOnProduct() {
        clickOnElement(_clickonProduct);
    }

    public void clickOnElectronics() {
        clickOnElement(_electronics);
    }

    public void clickOnRegisterButton() {

        Utils.clickOnElement(_registerButton);
    }

    public void clickOnLoginButton() {
        clickOnElement(_clickOnLogin);
    }


}
