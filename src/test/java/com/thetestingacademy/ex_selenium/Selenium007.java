package com.thetestingacademy.ex_selenium;

import org.openqa.selenium.edge.EdgeDriver;

public class Selenium007 {
    public static void main(String[] args) {
        EdgeDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://sdet.live");
    }
}
