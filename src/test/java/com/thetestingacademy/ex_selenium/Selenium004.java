package com.thetestingacademy.ex_selenium;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class Selenium004 {
    public static void main(String[] args) {


        WebDriver driver = new EdgeDriver();
        driver.get("https://sdet.live");

    }
}
