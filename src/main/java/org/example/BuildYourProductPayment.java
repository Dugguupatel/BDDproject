package org.example;

import org.openqa.selenium.By;

public class BuildYourProductPayment extends Utils{
    //select credit card
    By _creditCard = By.xpath("//input[@id='paymentmethod_1']");
    //click on continue button
    By _continue2 = By.xpath("(//button[@type='button'])[11]");
    //enter credit card details
    By _cardHolderName = By.xpath("(//input[@type='text'])[10]");
    By _cardNumber = By.xpath("(//input[@type='text'])[11]");
    By _expiredMonth = By.xpath("//select[@id='ExpireMonth']");
    By _expiredYear = By.xpath("//select[@id='ExpireYear']");
    By _cardCode = By.xpath("(//input[@type='text'])[12]");
    //Click on continue button
    By _continue3 = By.xpath("//button[@class='button-1 payment-info-next-step-button']");
    //Confirm order & get
    By _confirmOrder = By.xpath("//div[@id='checkout-step-confirm-order']");
    By _confirm  = By.xpath("//button[@class='button-1 confirm-order-next-step-button']");
    //Assert - Your order has been successfully processed!
    By _orderConfirmation = By.xpath("(//div[@class='title'])[1]");
    By _orderDetails = By.xpath("(//div[@class='details'])[1]");
    By _continue4 = By.xpath("(//div[@class='buttons'])[1]");
    LoadProp loadProp = new LoadProp();

    public void enterPaymentDetails() {
        clickOnElements(_creditCard);
        clickOnElements(_continue2);
        typetext(_cardHolderName, loadProp.getProperty("cardHolderName"));//H Potter
        typetext(_cardNumber,loadProp.getProperty("cardNumber"));//"4899705546323270"
        selectElementByValue(_expiredMonth, loadProp.getProperty("expiredMonth"));//"07"
        selectElementByValue(_expiredYear, loadProp.getProperty("expiredYear"));//;"2029"
        typetext(_cardCode,loadProp.getProperty("cardCode"));//"679"
        clickOnElements(_continue3);
        getTextFromElement(_confirmOrder);
        clickOnElements(_confirm);
        getTextFromElement(_orderConfirmation);
        getTextFromElement(_orderDetails);
        clickOnElements(_continue4);






    }
}
