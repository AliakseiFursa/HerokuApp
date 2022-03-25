import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import java.io.File;

import static org.testng.Assert.assertEquals;

public class FileUpload extends BaseTest {

    @Test
    public void fileUpload() {
        By FILE_UPLOADED_MESSAGE = By.xpath("//h3[text()='File Uploaded!']");
        driver.get("http://the-internet.herokuapp.com/upload");
        String path = new File("src/test/resources/1.txt").getAbsolutePath();
        driver.findElement(By.cssSelector("input[id='file-upload']")).sendKeys(path);
        driver.findElement(By.id("file-submit")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(FILE_UPLOADED_MESSAGE));
        assertEquals(driver.findElement(By.id("uploaded-files")).getText(), "1.txt", "File wasn't uploaded");
    }
}
