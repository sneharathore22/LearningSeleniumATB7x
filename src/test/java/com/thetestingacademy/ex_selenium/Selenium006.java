package com.thetestingacademy.ex_selenium;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class Selenium006 {

    @Test
    public void testMethod01(){
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");
        edgeOptions.addArguments("--window-size=600,900");


        EdgeDriver driver = new EdgeDriver();
        driver.get("https://google.com");

    }
}
