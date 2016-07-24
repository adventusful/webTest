package Tests;

import Pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * Created by Daniil Kornienko on 16.07.2016.
 */
public class LoginTest extends BaseTest{

    LoginPage loginPage;


    @BeforeClass
    public void setUp() throws Exception {
        loginPage = new LoginPage(driver);



    }


    @Test
    public void testRunFromNonstandart() throws Exception {
       loginPage.login("adventus0@gmail.com","Adventus1490").getAssertElementText();


    }

    @AfterClass
    public void tearDown() throws Exception {
        driver.quit();

    }
}
