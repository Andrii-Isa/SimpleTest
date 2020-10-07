package io.yayPay.utils;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.junit.spring.integration.SpringIntegrationMethodRule;
import net.thucydides.core.annotations.Managed;
import org.junit.Rule;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.springframework.test.context.ContextConfiguration;

@RunWith(SerenityRunner.class)
@ContextConfiguration(classes = TestConfiguration.class)
public abstract class AbstractSerenityTest {

    @Rule
    public SpringIntegrationMethodRule springMethodIntegration
            = new SpringIntegrationMethodRule();

    @Managed
    public WebDriver driver;

}
