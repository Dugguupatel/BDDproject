package org.example;

import org.openqa.selenium.By;

public class RegisterPage extends Utils{
    By _FirstName = By.xpath("//input[@id='FirstName']");
    By _LastName = By.xpath("//input[@id='LastName']");
    By _day = By.xpath("//select[@name='DateOfBirthDay']");
    By _month = By.xpath("//select[@name='DateOfBirthMonth']");
    By _year = By.xpath("//select[@name='DateOfBirthYear']");
    By _Email = By.xpath("//input[@id='Email']");
    By _Password = By.xpath("//input[@id='Password']");
    By _ConfirmPassword = By.xpath("//input[@id='ConfirmPassword']");
    By _registerButton = By.xpath("//button[@id='register-button']");
    LoadProp loadProp = new LoadProp();
    public void enterRegistrationDetails() {
        //Type first name
        typetext(_FirstName,loadProp.getProperty("firstName"));
        //Type Last name
        typetext(_LastName,loadProp.getProperty("lastName"));
        //Select Day 15
        selectElementByValue(_day, loadProp.getProperty("day"));
        //Select month 5
        selectElementByValue(_month,loadProp.getProperty("month"));
        //Select Year 1999
        selectElementByText(_year, loadProp.getProperty("year"));
        //Type Email address
        typetext(_Email,loadProp.getProperty("Email")  + timestamp() +loadProp.getProperty("EmailDomain"));
        //type password
        typetext(_Password, loadProp.getProperty("password"));
        //Type confirm password
        typetext(_ConfirmPassword, loadProp.getProperty("ConfirmPassword"));
        //click on Register submit button
        clickOnElements(_registerButton);
    }


}

