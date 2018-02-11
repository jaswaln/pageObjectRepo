package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Neeraj on 06-02-2018.
 */
public class HomePage {

    private static WebElement element=null;

    public static WebElement myAccount_Click(WebDriver driver)
    {
        element =driver.findElement(By.xpath("//span[@class='_1vp5']"));
        return element;
    }
    public static WebElement logOut_Account1(WebDriver driver)
    {
       element=driver.findElement(By.id("userNavigationLabel"));

        return element;
    }
    public static WebElement logOut_Account2(WebDriver driver)
    {

        element=driver.findElement(By.xpath(".//*[text()='Log out']"));
        return element;
    }
}
