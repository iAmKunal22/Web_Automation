package amazon.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;

    LoginPage(WebDriver rdriver)
    {
        driver = rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(id = "ap_email")
    @CacheLookup
    WebElement userEmail;

    @FindBy(id = "continue")
    @CacheLookup
    WebElement btnContinue;

    @FindBy(id = "ap_password")
    @CacheLookup
    WebElement userPassword;

    @FindBy(id = "signInSubmit")
    @CacheLookup
    WebElement btnLogin;

    publiv void setUserEmail(String uEmail)
    {
        userEmail.sendKeys(uEmail);
    }

    publiv void setBtnContinue() throws InterruptedException {
         btnContinue.click();
         Thread.sleep(5000);
    }

    publiv void setUserPassword(String uPswd)
    {
        userPassword.sendKeys(uPswd);
    }

    publiv void setBtnLogin()
    {
        btnLogin.click();
    }

}
