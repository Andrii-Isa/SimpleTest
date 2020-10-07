package io.yayPay.UI.PageObjects;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class CurrentPage extends PageObject {

    @FindBy(how = How.XPATH, using = "//p[text() = 'Collection Workflows']/preceding-sibling::span")
    private WebElement workflowButton;

    public void selectCollectionWorkflows() {
      workflowButton.click();
    }
}
