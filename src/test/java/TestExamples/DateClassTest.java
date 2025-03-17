package TestExamples;

import org.junit.Test;
import static org.junit.Assert.*;

import java.time.LocalDate;

public class DateClassTest {

    @Test
    public void testNoInvalidState() {
        DateClass[] dates = {
                new DateClass(2025, 1, 31),    // Month end
                new DateClass(2024, 2, 29),    // Leap year february
                new DateClass(2025, 12, 31)    // Year end
        };

        for (DateClass date : dates) {
            //  initial state
            assertValidDate(date);


            date.addDays(1);
            assertValidDate(date);

            date.addDays(-1);
            assertValidDate(date);

            date.addDays(100);
            assertValidDate(date);

        }
    }


    private void assertValidDate(DateClass date) {

        assertTrue("month should be between 1 and 12",
                date.getMonth() >= 1 && date.getMonth() <= 12);

        LocalDate localDate = LocalDate.of(date.getYear(), date.getMonth(), 1);
        int maxDays = localDate.lengthOfMonth();
        assertTrue("Day should be between 1 and " + maxDays,
                date.getDay() >= 1 && date.getDay() <= maxDays);
    }

    @Test
    public void testAddDaysFunction() {
        DateClass date = new DateClass(2025, 3, 15);
        date.addDays(20);  // should be 4/4/2025

        assertEquals("Year should be 2025", 2025, date.getYear());
        assertEquals("Month should be 4", 4, date.getMonth());
        assertEquals("Day should be 4", 4, date.getDay());


        date = new DateClass(2025, 3, 15);

        LocalDate expected = LocalDate.of(2025, 3, 15).plusDays(1000000);
        assertEquals("year after adding 1000000 days",
                expected.getYear(), date.getYear());

        assertEquals("Month after adding 1,000,000 days",
                expected.getMonthValue(), date.getMonth());

        assertEquals("Day after adding 1,000,000 days",
                expected.getDayOfMonth(), date.getDay());
    }
}