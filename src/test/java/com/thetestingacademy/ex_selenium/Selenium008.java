package com.thetestingacademy.ex_selenium;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Selenium008 {

        @Test
        public void testQuitVsClose(){
            EdgeDriver driver = new EdgeDriver();
            driver.get("https://sdet.live");

            driver.close();
            driver.quit();
        }
    }

