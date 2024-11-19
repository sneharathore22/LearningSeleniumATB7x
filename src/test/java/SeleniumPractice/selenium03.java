package SeleniumPractice;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class selenium03 {
    @Test
    public void testQuitVsClose(){
        EdgeDriver driver = new EdgeDriver();
        driver.get("https://sdet.live");
        driver.close();
        driver.quit();

    }
}
