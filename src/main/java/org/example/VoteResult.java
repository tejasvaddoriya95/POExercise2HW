package org.example;

import org.example.Utils;
import org.openqa.selenium.By;
import org.testng.Assert;

public class VoteResult extends Utils {


    public void verifyNonRegisteredUserShouldAblToVoteSuccessfully(){


        //click on good button
        clickOnElement(By.id("pollanswers-2"));
        //click on votr
        clickOnElement(By.xpath("//button[@id='vote-poll-1']"));

        String expected = "Your vote has been successfull";


        String actualmessage = driver.findElement(By.xpath("//div[@class='poll-vote-error']")).getText();
        System.out.println("My message:" + actualmessage);
        Assert.assertEquals(expected, actualmessage, "only registered user can vote");

    }
}
