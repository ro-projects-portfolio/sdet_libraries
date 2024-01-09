package assertj;

import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatCode;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class ExceptionTest {
    // AssertJ provides convenient ways to assert and verify exceptions in your tests.
    // These assertions can help you precisely verify the type, message, cause, and other properties of exceptions in your tests.
    // Adapt them based on the specific requirements of your exception handling logic.
    @Test
    public void throwExceptionTest() {
        // AssertJ provides convenient ways to assert exceptions thrown by a piece of code in your tests. This can be useful for verifying that your code behaves as expected under exceptional circumstances.
        assertThatThrownBy(() -> {
            int result = 10 / 0; // Perform some action with possibilities to get exception
        })
                .isInstanceOf(ArithmeticException.class)
                .hasMessageContaining("/ by zero");
    }

    @Test
    public void doesNotThrowExceptionTest() {
        assertThatCode(() -> {
            int result = 10 / 2;
        })
                .doesNotThrowAnyException();
    }


}
