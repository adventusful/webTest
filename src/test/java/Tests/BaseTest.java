package Tests;

import Context.DriverFactory;
import Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

/**
 * Created by Daniil Kornienko on 24.07.2016.
 */
public class BaseTest {
    protected WebDriver driver;
    String url = "https://accounts.google.com/";

    @BeforeSuite
    public void setSuite() throws Exception {
        driver = new DriverFactory().getDriver();
        driver.get(url);
    }

    @AfterSuite
    public void tearDown() throws Exception {
        driver.quit();
    }
}
