package io.yayPay.UI;

import io.yayPay.UI.Steps.WorkflowActions;
import io.yayPay.utils.AbstractSerenityTest;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Value;

public class AutorizationUserTest extends AbstractSerenityTest {

    //Given
    //1. Login in application https://www.demo.yaypay.com/app/ using credentials (testtask@email.com; Password: Abc12345!).

    //When
    //2. Navigate to  Collection Workflows tab
    //3. Press +NEW WORKFLOW button
    //4. Create new workflow with next actions: Add Call to Customer; Send email

    //Then
    //5. Verify that new collection workflow successfully saved.
    @Value("${io.yaypay.login}")
    private String login;

    @Value("${io.yaypay.password}")
    private String password;

    @Steps
    WorkflowActions workFlowActions;

    @Test
    public void ShouldBeAbleToCreateNewWorkflowWithActions() throws InterruptedException {

        //Given
        workFlowActions.isOnTheHomePage();
        workFlowActions.loginApplication(login, password);
        workFlowActions.windowMaximize();

        //When
        workFlowActions.navigateToCollectionWorkflowsTab();
        workFlowActions.pressNewWorkFlowButton();
        workFlowActions.clickTimeLineTab();
        workFlowActions.addCallToCustomer();
        workFlowActions.sendEmail();
        workFlowActions.clickSaveWorkflow();

        //Then
        workFlowActions.verifyThatNewCollectionWorkflowSuccessfullySaved();
    }
}
