package io.yayPay.UI.PageObjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CustomWorkFlow extends PageObject {

    @FindBy(how = How.XPATH, using = "//a[text() = 'TIMELINE']//..")
    private WebElement timeLineTab;

    @FindBy(how = How.XPATH, using = "//i[text() = 'phone']/parent::span")
    private WebElement phone;

    @FindBy(how = How.XPATH, using = "//i[text() = 'email']/parent::span")
    private WebElement email;

    @FindBy(how = How.XPATH, using = "//a[contains(@Class, 'save') and text() = 'Save']")
    private WebElement save;

    @FindBy(how = How.XPATH, using = "//p[text() = 'Email']/..")
    private WebElement emailCard;

    @FindBy(how = How.XPATH, using = "//p[text() = 'Call']/..")
    private WebElement phoneCard;


    public void selectTimelineTab() {
        timeLineTab.click();
    }

    public void moveToElement() throws InterruptedException {
        WebElement webElement = getDriver().findElement(By.xpath("//i[@class = 'material-icons' and text() = 'add']"));
        Actions actions = new Actions(getDriver());
        actions.moveToElement(webElement).build().perform();
        Thread.sleep(2000);

    }

    public void addCall() {
        phone.click();
    }

    public void sendEmail() {
        email.click();
    }

    public void selectSaveButton() {
        save.click();
    }


    public boolean emailCardIsDisplayed() {
          return emailCard.isDisplayed();
    }

    public boolean phoneCardIsDisplayed() {
        return phoneCard.isDisplayed();
    }
}
