import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

public class Hovers extends BaseTest{

    @Test
    public void hoversUser1() {
        driver.get("http://the-internet.herokuapp.com/hovers");
        Actions action = new Actions(driver);
        WebElement user1 = driver.findElements(By.cssSelector("[class=figure]")).get(0);
        action.moveToElement(user1).build().perform();
        String user1text = driver.findElements(By.tagName("h5")).get(0).getText();
        assertEquals(user1text, "name: user1", "user1 was not found on the page");
        driver.findElement(By.cssSelector("[href='/users/1']")).click();
        String error1 = driver.findElement(By.tagName("h1")).getText();
        assertNotEquals(error1, "Not Found", "Error 404 was found");
    }
    @Test
    public void hoversUser2() {
        driver.get("http://the-internet.herokuapp.com/hovers");
        Actions action = new Actions(driver);
        WebElement user2 = driver.findElements(By.cssSelector("[class=figure]")).get(1);
        action.moveToElement(user2).build().perform();
        String user2text = driver.findElements(By.tagName("h5")).get(1).getText();
        assertEquals(user2text, "name: user2", "user2 was not found on the page");
        driver.findElement(By.cssSelector("[href='/users/2']")).click();
        String error2 = driver.findElement(By.tagName("h1")).getText();
        assertNotEquals(error2, "Not Found", "Error 404 was found");
    }
    @Test
    public void hoversUser3() {
        driver.get("http://the-internet.herokuapp.com/hovers");
        Actions action = new Actions(driver);
        WebElement user3 = driver.findElements(By.cssSelector("[class=figure]")).get(2);
        action.moveToElement(user3).build().perform();
        String user3text = driver.findElements(By.tagName("h5")).get(2).getText();
        assertEquals(user3text, "name: user3", "user3 was not found on the page");
        driver.findElement(By.cssSelector("[href='/users/3']")).click();
        String error3 = driver.findElement(By.tagName("h1")).getText();
        assertNotEquals(error3, "Not Found", "Error 404 was found");
    }
}
