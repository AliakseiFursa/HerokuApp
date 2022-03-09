import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Typos extends BaseTest{

    @Test
    public void typos() {
        driver.get("http://the-internet.herokuapp.com/typos");
        String text = driver.findElements(By.tagName("p")).get(1).getText();
        assertEquals(text, "Sometimes you'll see a typo, other times you won't.", "text doesn't match");
        driver.navigate().refresh();
        text = driver.findElements(By.tagName("p")).get(1).getText();
        assertEquals(text, "Sometimes you'll see a typo, other times you won't.", "text doesn't match");
    }
}
