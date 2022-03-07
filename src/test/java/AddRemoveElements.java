import org.openqa.selenium.By;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class AddRemoveElements extends BaseTest{
    @Test
    public void addRemoveElements() {
        driver.get("http://the-internet.herokuapp.com/add_remove_elements/");
        driver.findElement(By.xpath("//button[text()='Add Element']")).click();
        driver.findElement(By.xpath("//button[text()='Add Element']")).click();
        driver.findElement(By.xpath("//button[text()='Delete']")).click();
        int buttonCount = driver.findElements(By.xpath("//button[text()='Delete']")).size();
        assertEquals(buttonCount, 1, "Number of 'Delete' buttons do not match");
    }
}
