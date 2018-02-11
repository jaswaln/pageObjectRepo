package AutomationFrameworkTC;
import PageFactory.*;
import PageFactory.PageFactoryFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by Neeraj on 10-02-2018.
 */


public class pageFactoryTestRun   {
    public static WebDriver driver;
    PageFactoryFindBy pgF;

    @Test
    public  void EnterGSearch()
    {

        driver=BaseClass.initializeBrowser();
        PageFactoryFindBy pgF=new PageFactoryFindBy(driver);
        PageFactory.initElements(driver,pgF);

        pgF.gSearch();
        //driver.quit();
    }

}
