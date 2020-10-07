package io.yayPay.UI.PageObjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class WorkFlowPage extends PageObject {


    @FindBy(how = How.XPATH, using = "//span[text() = 'New Workflow']/..")
    private WebElement workflowButton;

    public void selectNewWorkFlowButton() {
        workflowButton.click();
    }
}
