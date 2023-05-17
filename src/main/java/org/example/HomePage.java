package org.example;

import org.openqa.selenium.By;

public class HomePage extends Utils{
    By _registerButton = By.xpath("//a[text()='Register']");
    By _electronics = By.xpath("(//a[text()='Electronics '])[1]");
    public void clickOnRegisterButton() {
        clickOnElements(_registerButton);
    }
    public void clickOnProductButton() {
        clickOnElements(_electronics);
    }
}
