package assertj;

import org.testng.annotations.Test;

import java.time.LocalDate;
import java.util.Date;

import static org.assertj.core.api.Assertions.assertThat;
// These assertions can be used to verify various conditions related to dates and times in tests.
public class DateTest {

    @Test
    public void dateTest() {
        Date today = new Date();
        System.out.println("Date format: " + today);
        assertThat(today)
                .hasMonth(12)
                .hasDayOfMonth(22)
                .hasHourOfDay(13)
                .hasMinute(44)
                .hasYear(2023);

    }

    @Test
    public void localDateTest() {
        LocalDate today = LocalDate.now();
        LocalDate yesterday = LocalDate.now().minusDays(1);
        LocalDate tomorrow = LocalDate.now().plusDays(1);

        System.out.println("LocalDate format: " + today);

        assertThat(today)
                .isAfter(yesterday)
                .isBefore(tomorrow);

    }

    @Test
    public void localDateUsingStringTest() {
        LocalDate today = LocalDate.now();

        System.out.println("LocalDate format: " + today);

        assertThat(today)
                .isAfter("2023-11-11")
                .isBefore("2043-11-11");

    }


}
