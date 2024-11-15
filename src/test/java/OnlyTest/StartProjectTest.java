package OnlyTest;

import SetUp.Settings;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class StartProjectTest extends Settings {

    @Test
    public void testStartProjectElement() {
        WebElement startButtonFooter = driver.findElement(By.xpath("//*[text()='Start a project']"));
        Assert.assertNotNull("Element 'Start a project' is not found!", startButtonFooter);

        WebElement emailFooter = driver.findElement(By.xpath("//*[text()='hello@only.com.ru']"));
        Assert.assertNotNull("Element 'hello@only.com.ru' is not found!", emailFooter);
    }
}