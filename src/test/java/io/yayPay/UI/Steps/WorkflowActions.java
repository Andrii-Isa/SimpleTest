package io.yayPay.UI.Steps;

import io.yayPay.UI.PageObjects.CurrentPage;
import io.yayPay.UI.PageObjects.CustomWorkFlow;
import io.yayPay.UI.PageObjects.LoginPage;
import io.yayPay.UI.PageObjects.WorkFlowPage;
import net.thucydides.core.annotations.Step;

import static org.junit.Assert.assertTrue;

public class WorkflowActions {


    LoginPage loginPage;
    CurrentPage currentPage;
    WorkFlowPage workFlowPage;
    CustomWorkFlow customWorkFlow;

    @Step("Go in YayPay start login page")
    public void isOnTheHomePage() {
        loginPage.open();
        loginPage.windowSize();
    }

    public void windowMaximize() {

    }

    @Step("Log in application using specified credentials")
    public void loginApplication(String login, String password) {
        loginPage.enterLogin(login);
        loginPage.enterPassword(password);
        loginPage.clickSignInButton();
    }

    @Step("Navigate to Collection Workflows")
    public void navigateToCollectionWorkflowsTab() {
        currentPage.selectCollectionWorkflows();
    }

    @Step("Select new workflow button")
    public void pressNewWorkFlowButton() {
        workFlowPage.selectNewWorkFlowButton();
    }

    @Step("Click 'TIMELINE' tab")
    public void clickTimeLineTab() {
        customWorkFlow.selectTimelineTab();
    }

    @Step("Add call to customer")
    public void addCallToCustomer() throws InterruptedException {
         customWorkFlow.moveToElement();
         customWorkFlow.addCall();
    }

    @Step("Send email")
    public void sendEmail() throws InterruptedException {
        customWorkFlow.moveToElement();
        customWorkFlow.sendEmail();

    }

    @Step("Click 'Save' workflow button")
    public void clickSaveWorkflow() {
        customWorkFlow.selectSaveButton();
    }

    @Step("Verifying that new collection workflow successfully saved")
    public void verifyThatNewCollectionWorkflowSuccessfullySaved() throws InterruptedException {
        loginPage.refreshThePage();
        Thread.sleep(2000);
        customWorkFlow.selectTimelineTab();

        boolean actualEmailResult = customWorkFlow.emailCardIsDisplayed();
         assertTrue(actualEmailResult);

        boolean actualPhoneResult = customWorkFlow.phoneCardIsDisplayed();
        assertTrue(actualPhoneResult);
    }
}
