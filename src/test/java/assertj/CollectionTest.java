package assertj;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.assertj.core.api.Assertions.*;

// AssertJ provides a rich set of assertions for working with collections and collection items in Java.
// Here are some common assertions related to collections in AssertJ:
// Equality, Containment, Size, Order etc.
public class CollectionTest {

    @Test
    public void listTest() {
        List<String> elements = Arrays.asList("Element 1", "Element 2", "Element 3");
        assertThat(elements)
                .isNotNull()
                .hasSize(3)
                .contains("Element 1")
                .containsExactlyInAnyOrder("Element 1", "Element 2", "Element 3")
                .doesNotContain("Element 4")
                .doesNotHaveDuplicates();
    }

    @Test
    public void setTest() {
        Set<String> windows = new HashSet<>();
        // Set values
        windows.add("Window 1");
        windows.add("Window 2");
        windows.add("Window 3");

        assertThat(windows)
                .isNotNull()
                .hasSize(3)
                .contains("Window 1")
                .doesNotContain("Window 4")
                .doesNotHaveDuplicates();
    }

    @Test
    public void listItemsTest() {
        // To Assert items using Consumer is required
        List<String> elements = Arrays.asList("Element 1", "Element 2", "Element 3");
        assertThat(elements)
                .allSatisfy(element -> {
                    assertThat(element.length()).isGreaterThanOrEqualTo(9);
                    assertThat(element)
                            .isNotNull()
                            .contains("Element");
                });

    }
}
