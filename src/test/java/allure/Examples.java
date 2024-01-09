package allure;

import io.qameta.allure.*;
import org.testng.annotations.Test;

@Epic("Epic name")
@Feature("Feature name")
public class Examples {

    @Test(description = "Allure Test") // this description provide more readable name fore test case in report
    @Story("Story name")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Test description")
    @TmsLink("Link to the test case")
    @Issue("Link to the bug report")
    public void allureTest () {
        // Look official docs to check all features
    }
}
