package com.thetestingacademy.ex_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class selenium16 {

    @Test
public void testVWOLoginNegative(){
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--guest");
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver();
        driver.navigate().to("https://app.vwo.com");
        System.out.println(driver.getTitle());

        Assert.assertEquals(driver.getTitle(),"Login-VWO");
        Assert.assertEquals(driver.getCurrentUrl(),"https://a[[.vwo.com/#/login");


       WebElement emailInputBox = driver.findElement(By.id("login-username"));
       emailInputBox.sendKeys("admin@admin.com");

       WebElement passwordInputBox = driver.findElement(By.name("password"));
       passwordInputBox.sendKeys("password@321");

       WebElement buttonSubmit = driver.findElement(By.id("js-Login-btn"));
       buttonSubmit.click();

       WebElement error_message = driver.findElement(By.className("notification-box-description"));
       Assert.assertEquals(error_message.getText(),"Your email,Password,IP address or location didn't match");
    }
}
