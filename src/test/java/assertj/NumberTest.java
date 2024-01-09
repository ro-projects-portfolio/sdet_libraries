package assertj;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

// AssertJ provides a variety of numeric assertions for different types of numerical values.

public class NumberTest {
    @Test
    public void numberTest() {
        int number = 100;
        assertThat(number)
                .isPositive()
                .isGreaterThanOrEqualTo(99)
                .isGreaterThan(99)
                .isLessThanOrEqualTo(101)
                .isLessThan(101)
                .isBetween(50, 150);

    }



}
