package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Daniil Kornienko on 16.07.2016.
 */
public class LoginPage extends BasePage{

    @FindBy(id="Email")
	private WebElement loginField;


	@FindBy(id="next")
	private WebElement nextMail;


    @FindBy(id="Passwd")
    private WebElement passField;

    @FindBy(id="signIn")
    private WebElement loginButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }


    public AfterPage login(String login, String password) throws InterruptedException {
        loginField.sendKeys(login);
        nextMail.click();
        passField.sendKeys(password);
        loginButton.click();


        return new AfterPage(driver);
    }
}


