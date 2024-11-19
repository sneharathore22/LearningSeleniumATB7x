package com.thetestingacademy.ex_selenium.Project01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class Selenium013 {
    private static String pageSource;

    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com");

        Assert.assertEquals(driver.getTitle(), "CURA Healthcare Service");
        Assert.assertEquals(driver.getCurrentUrl(), "https://katalon-demo-cura.herokuapp.com");

        String pageSource =driver.getPageSource();
        Assert.assertEquals(pageSource.contains("CURA Healthcare Service"),true);

        driver.quit();
    }
}
