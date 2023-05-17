package org.example;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class Utils  extends BasePage{
    public static void clickOnElements(By by) {
        driver.findElement(by).click();
    }

    public static void typetext(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }
    public static String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }

    public static long timestamp() {
        Timestamp timestamp1 = new Timestamp(System.currentTimeMillis());
        return timestamp1.getTime();
    }
    public static void selectElementByValue(By by, String value) {
        Select select = new Select(driver.findElement(by));
        select.selectByValue(value);
    }
    public static void selectElementByText(By by, String text) {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);
    }
    public static void selectElementByIndex(By by, int index) {
        Select select = new Select(driver.findElement(by));
        select.selectByIndex(index);
    }
    public static void waitForClickable(By by, int timeInSec){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeInSec));
        wait.until(ExpectedConditions.elementToBeClickable(by));}
//    public static void getAlert(){
//        Alert alert = driver.switchTo().alert();
//    }
//    public static void popUpWindow(){
//        driver.switchTo().alert().dismiss();
//        driver.switchTo().alert().accept();
//        driver.switchTo().alert().getText();
//
//    }
    public static String currentTimeStamp() {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyhhmmss");
        return sdf.format(date);
    }
    public static void captureScreenshot( String fileName)
    {
        //Convert web driver object to TakeScreenshot
        TakesScreenshot scrShot
                =((TakesScreenshot)driver);
        //Call getScreenshotAs method to create image file
        File
                SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
        //Move image file to new destination
        File destFile=new
                File("src\\test\\Screenshots\\"+fileName+""+currentTimeStamp()+".png");
        //Copy file at destination
        try {
            FileUtils.copyFile(SrcFile, destFile );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
