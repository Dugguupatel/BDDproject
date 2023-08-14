package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class BuildYourProductResultPage extends Utils{

    String expectedBuildYourProductAddToCartCompleteMsg = "The product has been added to your shopping cart";
    //String expectedBuildYourProductSuccessfullyProcessedMsg = "Your order has been successfully processed!";

    LoadProp loadProp = new LoadProp();
    public void verifyUserBuildYourProductSuccessfully() {
        String actualMessage = getTextFromElement(By.xpath("//div[@class='bar-notification success']"));
        //String actualMessage = getTextFromElement(By.xpath("(//div[@class='title'])[1]"));
        System.out.println("My massage:"+actualMessage);
        //Assert - The product has been added to your shopping cart
        Assert.assertEquals(actualMessage,loadProp.getProperty("expectedBuildYourProductSuccessfullyProcessedMsg"));
    }
}
