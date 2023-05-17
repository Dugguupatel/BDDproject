package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class Email_A_Friend_ResultPage extends Utils{
    LoadProp loadProp = new LoadProp();

    public void verifyUserEmailAFriendSuccessfully(){
        String expectedEmailAFriendCompleteMsg = "Only registered customers can use email a friend feature";
        String actualMessage = getTextFromElement(By.xpath("//div[@class='message-error validation-summary-errors']"));
        //show error
        System.out.println("My massage:" + actualMessage);
        Assert.assertEquals(actualMessage,loadProp.getProperty("expectedEmailAFriendCompleteMsg"));
    }
}
