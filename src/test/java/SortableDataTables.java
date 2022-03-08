import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SortableDataTables extends BaseTest{

    @Test
    public void sortableDataTables() {
        driver.get("http://the-internet.herokuapp.com/tables");
        String text1 = driver.findElement(By.xpath("//table//tr[2]//td[2]")).getText();
        assertEquals(text1, "Frank", "text doesn't match");
        String text2 = driver.findElement(By.xpath("//table//tr[4]//td[5]")).getText();
        assertEquals(text2, "http://www.timconway.com", "text doesn't match");
        String text3 = driver.findElement(By.xpath("//table[@id='table2']//tr[1]//td[1]")).getText();
        assertEquals(text3, "Smith", "text doesn't match");
        String text4 = driver.findElement(By.xpath("//table[@id='table2']//tr[2]//td[4]")).getText();
        assertEquals(text4, "$51.00", "text doesn't match");
    }
}
