package Context;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Daniil Kornienko on 23.07.2016.
 */
public class DriverFactory {
    private WebDriver driver;
    public WebDriver getDriver() {
        String name = System.getProperty("driver");
        if(name.equals("firefox"))
            return new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        return driver;
    }
}
