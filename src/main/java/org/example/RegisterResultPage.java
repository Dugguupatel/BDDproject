package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegisterResultPage extends Utils{
    LoadProp loadProp = new LoadProp();

    public void verifyUserRegisteredSuccessfully(){
       // String expectedRegistrationCompleteMsg = loadProp.getProperty("Your Registration Completed");
        String actualMessage = getTextFromElement(By.xpath("//div[@class='result']"));

        System.out.println("My massage:"+actualMessage);
        //Close URL
        Assert.assertEquals(actualMessage,loadProp.getProperty("expectedRegistrationCompleteMsg"));
    }

}
