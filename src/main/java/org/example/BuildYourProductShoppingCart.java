package org.example;

import org.openqa.selenium.By;

public class BuildYourProductShoppingCart extends Utils{
    //Click on Shopping Cart
    By _shoppingCart = By.xpath("//a[text()='shopping cart']");
    //Go to cart
    //By _goToCart = By.xpath("//button[@class='button-1 cart-button']");
    //Check Order Summery
    By _orderSummery = By.xpath("//div[@class='order-summary-content']");

    //Click on Term of service CHECKBOX
    By _checkBox = By.xpath("(//input[@type='checkbox'])[2]");
    //click on check out
    By _checkOut = By.xpath("//button[@id='checkout']");
    //Check Order Summery
    By _signInPage = By.xpath("//div[@class='page-body']");
    //Click on CHECKOUT AS GUEST
    By _checkOutAsGuest = By.xpath("(//button[@type='button'])[2]");
    //Add billing details
    By _firstName = By.xpath("(//input[@type='text'])[2]");
    By _lastName = By.xpath("(//input[@type='text'])[3]");
    By _email = By.xpath("(//input[@type='email'])[1]");
    By _country = By.xpath("//select[@data-trigger=\"country-select\"]/option[228]");
    By _city = By.xpath("(//input[@type='text'])[5]");
    By _address1 = By.xpath("(//input[@type='text'])[6]");
    By _postCode = By.xpath("(//input[@type='text'])[8]");
    By _phoneNumber = By.xpath("//input[@type='tel']");
    //Click on Continue
    By _continue = By.xpath("(//button[@type='button'])[5]");
    //next day air
    By _nextDayAir = By.xpath("//input[@id='shippingoption_1']");
    //Click on Continue
    By _continue1 = By.xpath("(//button[@type='button'])[10]");//
    LoadProp loadProp = new LoadProp();


    public void enterShoppingCartDetails(){
        clickOnElements(_shoppingCart);
        //clickOnElements(_goToCart);
        getTextFromElement(_orderSummery);
        clickOnElements(_checkBox);
        clickOnElements(_checkOut);
        getTextFromElement(_signInPage);
        clickOnElements(_checkOutAsGuest);
        typetext(_firstName, loadProp.getProperty("firstName"));//"Harry"
        typetext(_lastName, loadProp.getProperty("lastName"));//"Potter"
        typetext(_email,loadProp.getProperty("email") + timestamp() + loadProp.getProperty("EmailDomain"));//"harry007" "@gmail.com"
        clickOnElements(_country);
        typetext(_city, loadProp.getProperty("city"));//"london"
        typetext(_address1, loadProp.getProperty("address1"));// i'm everyWhere if you find
        typetext(_postCode, loadProp.getProperty("postCode"));//;"AB1 2CD"
        typetext(_phoneNumber, loadProp.getProperty("phoneNumber"));//"01234567899"
        clickOnElements(_continue);
        clickOnElements(_nextDayAir);
        clickOnElements(_continue1);

    }
}
