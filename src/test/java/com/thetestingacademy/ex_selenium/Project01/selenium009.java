package com.thetestingacademy.ex_selenium.Project01;


 import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

    public class selenium009 {

    /*Create a Selenium Script to verify the title for

        Open the Page - https://katalon-demo-cura.herokuapp.com/

        Verify the current URL, current title

        In the page source add a assertion that “CURA Healthcare Service” exist in the page. driver.pageSource() - String
        */

        @Test
        public void katalonCuraTC() {
            WebDriver driver = new ChromeDriver();
            driver.get("https://katalon-demo-cura.herokuapp.com");
            Assert.assertEquals(driver.getCurrentUrl(), "https://katalon-demo-cura.herokuapp.com/");
            Assert.assertEquals(driver.getTitle(), "CURA Healthcare Service");
            String pagesource = driver.getPageSource();
            Assert.assertEquals(pagesource.contains("CURA Healthcare Service"), true);
            driver.close();
        }

    }

