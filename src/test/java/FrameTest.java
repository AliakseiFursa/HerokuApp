import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FrameTest extends BaseTest {

    @Test
    public void iframe() {
        driver.get("http://the-internet.herokuapp.com/iframe");
        driver.switchTo().frame(0);
        String message = driver.findElement(By.tagName("p")).getText();
        assertEquals(message, "Your content goes here.", "Message didn't match");
    }
}
