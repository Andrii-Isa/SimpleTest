package io.yayPay.UI.PageObjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;

@DefaultUrl("https://www.demo.yaypay.com/app/")
public class LoginPage extends PageObject {

    @FindBy(how = How.NAME, using = "username")
    private WebElement login;

    @FindBy(how = How.NAME, using = "password")
    private WebElement password;

    @FindBy(how = How.XPATH, using = "//button[contains(@class, 'a-button')]/..")
    private WebElement signInButton;

    public void enterLogin(String loginString) {
        login.sendKeys(loginString);
    }

    public void enterPassword(String passwordString) {
        password.sendKeys(passwordString);
    }

    public void clickSignInButton() {
        signInButton.click();
    }

    public void windowSize(){
        getDriver().manage().window().maximize();
    }

    public void refreshThePage() {
        getDriver().navigate().refresh();
    }
}
