package com.thetestingacademy.ex_selenium;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;



public class Selenium015 {
    public static void main(String[] args) {

        EdgeOptions options = new EdgeOptions();
        Proxy proxy = new Proxy();
        proxy.setHttpProxy("188.255.245.205:1080");
        options.setCapability("proxy",proxy);

        WebDriver driver = new EdgeDriver(options);
        driver.get("https://whatismyipaddress.com/");
        driver.manage().window().maximize();

    }
}
