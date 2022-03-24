import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ContextMenu extends BaseTest {

    @Test
    public void contextMenu() {
        driver.get("http://the-internet.herokuapp.com/context_menu");
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.id("hot-spot"))).contextClick().perform();
        String message = driver.switchTo().alert().getText();
        assertEquals(message, "You selected a context menu", "Context menu wasn't selected");
    }
}
