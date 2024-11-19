package SeleniumPractice;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class selenium02 {
    @Test
    public void testMethod01(){
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start maximum");
        edgeOptions.addArguments("--window size = 1000, 5000");

        EdgeDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://google.com");
        driver.close();
    }

}
