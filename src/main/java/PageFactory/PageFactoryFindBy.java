package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

/**
 * Created by Neeraj on 10-02-2018.
 */
public class PageFactoryFindBy
{
    public static WebDriver driver;
    WebDriverWait wait;
    public PageFactoryFindBy(WebDriver ldriver)
    {
        this.driver=ldriver;
        wait =new WebDriverWait(driver,10);

    }


    @FindBy(how = How.ID,using = "lst-ib") public static WebElement txtSearch;
    @FindBy(how=How.NAME,using = "btnK") public static WebElement searchBtn;

    @Test
    public  void gSearch()
    {
        txtSearch.sendKeys("Xframium");
        searchBtn.click();
    }
}
