package org.example;

import org.openqa.selenium.By;

public class Email_A_Friend extends Utils{
    By _products = By.xpath("//a[text()=' Camera & photo ']");
    By _productItem = By.xpath("(//h2[@class='product-title'])[3]");
    By _EmailButton = By.xpath("//button[@class='button-2 email-a-friend-button']");
    By _FriendEmail = By.xpath("//input[@class='friend-email']");
    By _YourEmail = By.xpath("//input[@class='your-email']");
    By _PersonalMsg = By.xpath("//textarea[@class='your-email']");
    By _SendEmail = By.xpath("//button[@name='send-email']");
    LoadProp loadProp = new LoadProp();
    public void enterProductsDetailForEmailAFriend(){
        //Click on Products
        clickOnElements(_products);
        //Click on Leica T Mirrorless Digital Camera
        clickOnElements(_productItem);
        //Click on Email a friend button
        clickOnElements(_EmailButton);
        //Type your email
        typetext(_FriendEmail,loadProp.getProperty("FriendEmail")+loadProp.getProperty("EmailDomain"));
        //Type friend's email
        typetext(_YourEmail,loadProp.getProperty("YourEmail")+loadProp.getProperty("EmailDomain"));
        //Type msg for friend
        typetext(_PersonalMsg,loadProp.getProperty("PersonalMsg"));
        //Click on Send email button
        clickOnElements(_SendEmail);

    }

}
