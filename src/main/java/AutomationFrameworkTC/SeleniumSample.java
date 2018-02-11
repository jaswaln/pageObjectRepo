package AutomationFrameworkTC;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import pageObject.HomePage;
import pageObject.LoginPage;

import java.util.concurrent.TimeUnit;

/**
 * Created by Neeraj on 05-02-2018.
 */
public class SeleniumSample   {

    @Test
    public static void main(String args[]) throws InterruptedException
    {
        System.setProperty("webdriver.gecko.driver", "F:\\SeleniumExample\\geckodriver.exe");
        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        capabilities.setCapability("marionette", true);
        WebDriver driver;
        driver=new FirefoxDriver();


        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.facebook.com");
        LoginPage.userName(driver).sendKeys("9665287806");
        LoginPage.userPass(driver).sendKeys("Shubhu4ulove");
        LoginPage.loginBtn(driver).click();

        System.out.println("Login Successfully!!!!!");
        Thread.sleep(8000);

        HomePage.myAccount_Click(driver).click();
        Thread.sleep(3000);
        HomePage.logOut_Account1(driver).click();
        HomePage.logOut_Account2(driver).click();

        System.out.println("Log Out Successfully!!!!!");

        driver.quit();


    }
}
