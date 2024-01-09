package assertj;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.SoftAssertions.assertSoftly;
// AssertJ provides a rich set of assertions for strings, allowing you to verify various conditions about
// Equality, Nullity, Empty and Blank Assertions, Length, Regex, Whitespace, Case etc.
public class StringTest {
    private final String str = "JavaSeleniumAssertJ";

    @Test
    public void stringTest() {
        assertThat(str) // Use static import instead of calling Assertion Class
                .doesNotContainAnyWhitespaces()
                .isNotNull()
                .isNotEmpty()
                .hasSize(19)
                .endsWith("J")
                .startsWith("J")
                .contains("Selenium")
                .isEqualTo("JavaSeleniumAssertJ")
                .matches("[a-zA-Z]+")
                .doesNotContain("Playwright")
                .isEqualToIgnoringCase("javaseleniumassertj");
        // isAlphabetic() update to the newest version

        // This type library provide a lots of different types of assertion (AssertJ supports conditions that allow you to create more complex assertions based on specific criteria.) that allows to design an interesting logic and powerful combination of assert methods
        // Also, AsserJ by default use method chaining (fluent interface) that provide flexibility and better code readability
    }

    @Test
    public void stringUsingSoftAssertionTest() {
        // Soft Assertions allow you to continue executing assertions even if some fail, collecting all failures before reporting.
        // Soft Assertions on the other hand execute all the assert statements and provide the result of all assertions.
        // For Soft using Consumer is required
        assertSoftly(softAssertions -> softAssertions.
                assertThat(str)
                .as("String contains white spaces").doesNotContainAnyWhitespaces()
                .isNotNull()
                .isNotEmpty()
                .hasSize(19)
                .endsWith("J")
                .startsWith("J")
                .contains("Selenium")
                .isEqualTo("JavaSeleniumAssertJ")
                .matches("[a-zA-Z]+")
                .doesNotContain("Playwright")
                .isEqualToIgnoringCase("javaseleniumassertj")
        );
        // With as(); when an assertion fails, AssertJ provides detailed and readable error messages that help identify the issue quickly.
    }


}

