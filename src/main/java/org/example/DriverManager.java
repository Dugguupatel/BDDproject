package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;

public class DriverManager extends Utils {
    LoadProp loadProp = new LoadProp();
    String browserName = loadProp.getProperty("browser");
    public void openBrowser() {
        driver = new ChromeDriver();
        if (browserName.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browserName.equalsIgnoreCase("Edge"))
        {
            driver = new EdgeDriver();
        }else
            {
                System.out.println("Your browser name is wrong or NOT implemented :" + browserName);
            }
            driver.get(loadProp.getProperty("url"));
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(By.cssSelector("div.product-grid h2"));
        }

//    public void closeBrowser() {
//        driver.close();}

}
