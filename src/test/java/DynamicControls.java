import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public class DynamicControls extends BaseTest {

    @Test
    public void dynamicControlsCheckBox() {
        By DISAPPEAR_MESSAGE = By.xpath("//p[@id='message']");
        driver.get("http://the-internet.herokuapp.com/dynamic_controls");
        int checkBox = driver.findElements(By.id("checkbox")).size();
        assertEquals(checkBox, 1, "Checkbox wasn't found");
        driver.findElement(By.xpath("//button[text()='Remove']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(DISAPPEAR_MESSAGE));
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        checkBox = driver.findElements(By.id("checkbox")).size();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        assertEquals(checkBox, 0, "Checkbox was found");
    }

    @Test
    public void dynamicControlsInput() {
        By ENABLE_MESSAGE = By.xpath("//p[@id='message']");
        driver.get("http://the-internet.herokuapp.com/dynamic_controls");
        boolean input = driver.findElement(By.cssSelector("input[type='text']")).isEnabled();
        assertEquals(input, false, "Input is enabled");
        driver.findElement(By.xpath("//button[text()='Enable']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(ENABLE_MESSAGE));
        assertEquals(driver.findElement(ENABLE_MESSAGE).getText(), "It's enabled!", "Message didn't match");
        input = driver.findElement(By.cssSelector("input[type='text']")).isEnabled();
        assertEquals(input, true, "Input is disabled");
    }
}
