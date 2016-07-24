package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by Daniil Kornienko on 16.07.2016.
 */
public class AfterPage extends BasePage {


    @FindBy(xpath="//h1[contains(.,'Мой аккаунт')]")
    private WebElement assertionElement;

    public AfterPage(WebDriver driver) {
        super(driver);
    }


    public String getAssertElementText() {
       return assertionElement.getText();
   }
}
