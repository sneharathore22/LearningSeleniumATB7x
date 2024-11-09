package com.thetestingacademy.ex_selenium;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Selenium011 {

    @Test
    public void vwoLogin(){
        EdgeDriver driver = new EdgeDriver();
        driver.get("https://sdet.live");
        driver.quit();
    }
}
