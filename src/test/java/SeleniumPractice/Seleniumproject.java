package SeleniumPractice;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Seleniumproject {

    @Description("Verified the email and password invalid shown the error message")
    @Test
    public void testVWOLoginNegative(){

        EdgeOptions edgeOptions = new EdgeOptions();

        edgeOptions.addArguments("--guest");
        edgeOptions.addArguments("--start maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);

        driver.navigate().to("https://app.vwo.com");
        System.out.println(driver.getTitle());

        Assert.assertEquals(driver.getTitle(),"Login - VWO");
        Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/login");
        //Find the email input and enter the email
        WebElement emailInputBox= driver.findElement(By.id("Login-username"));
        emailInputBox.sendKeys("admin@admin.com");
        WebElement passwordInputBox= driver.findElement(By.name("password"));
        passwordInputBox.sendKeys("password@321");

        WebElement buttonSubmit = driver.findElement(By.id("js-login-button"));
        buttonSubmit.click();

        WebElement error_message = driver.findElement(By.className("notification-box-description"));
        Assert.assertEquals(error_message.getText(),"Your email, password, IP address or location did not match");

    }
}
