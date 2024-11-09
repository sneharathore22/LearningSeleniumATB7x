package com.thetestingacademy.ex_selenium;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Selenium003 {

    @Test
    public void test001(){
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://sdet.live");
        driver.quit();
    }
}
