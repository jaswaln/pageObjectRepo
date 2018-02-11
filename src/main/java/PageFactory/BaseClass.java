package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

/**
 * Created by Neeraj on 10-02-2018.
 */
public class BaseClass {

    public static WebDriver driver;
    public static WebDriver initializeBrowser()
   {

       driver=new FirefoxDriver();
       driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       driver.get("https://www.google.com");
        return driver;
   }
}
