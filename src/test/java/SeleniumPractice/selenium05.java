package SeleniumPractice;

import org.openqa.selenium.edge.EdgeDriver;

public class selenium05 {
    public static void main(String[]args){
        EdgeDriver driver = new EdgeDriver();
        driver.get("https://sdet.live");

        driver.navigate().to("https://google.com");
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.navigate().back();
        driver.navigate().to("https://google.com");
    }
}
