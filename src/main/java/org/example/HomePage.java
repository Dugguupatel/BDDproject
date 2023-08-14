package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class HomePage extends Utils{
    By _registerButton = By.xpath("//a[text()='Register']");
    By _electronics = By.xpath("(//a[text()='Electronics '])[1]");
    By _buildYourProduct = By.xpath("//a[text()='Build your own computer']");

    public void clickOnRegisterButton() {
        clickOnElements(_registerButton);
    }
    public void clickOnProductButton() {
        clickOnElements(_electronics);
    }
    public void clickOnBuildYourOwnComputer(){
        clickOnElements(_buildYourProduct);
    }


    public void hoverOverCategoryButton(String categoryName ){
        WebElement element = driver.findElement(By.linkText(categoryName));

        System.out.println("before hover color of category-- "+ element.getCssValue("color"));
        //creating object of an Actions class
        Actions actions = new Actions(driver);
        //performing the mouse hover action on the target element.
        actions.moveToElement(element).perform();

        System.out.println("After hover color of category--"+ element.getCssValue("color"));

        actions.moveToElement(driver.findElement(By.linkText("Notebooks"))).click().perform();
        Assert.assertTrue(getCurrentURL().contains("Notebooks"));
    }

}
