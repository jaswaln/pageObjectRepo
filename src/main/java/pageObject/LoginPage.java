package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Neeraj on 06-02-2018.
 */
public class LoginPage {
    private static WebElement element=null;

    public static WebElement userName(WebDriver driver) {
        element = driver.findElement(By.id("email"));
        return element;
    }

    public static  WebElement userPass(WebDriver driver)
    {
        element=driver.findElement(By.id("pass"));
        return element;
    }
    public static  WebElement loginBtn(WebDriver driver)
    {
        element=driver.findElement(By.xpath("//input[@value='Log In']"));
        return element;
    }
}
