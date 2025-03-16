package TestExamples;

import org.junit.Test;
import static org.junit.Assert.*;

public class SimpleCalculatorTest { // JUnit 4 test classes should be public

    @Test
    public void twoPlusTwoEqualFour(){ // JUnit 4 test methods should be public
        SimpleCalculator simpleCalculator = new SimpleCalculator();

        assertEquals(4, simpleCalculator.add(2,2)); // test pass if expected equals actual

        assertNotEquals(4, simpleCalculator.add(1,1)); // test pass if actual is Not equal to 4

        assertTrue(simpleCalculator.add(2,2) == 4); // test pass if the boolean expression equals true
    }

    @Test
    public void threePlusSevenShouldBeTen(){
        SimpleCalculator simpleCalculator = new SimpleCalculator();

        assertEquals(4, simpleCalculator.add(3,5)); // test pass if expected equals actual

        assertNotEquals(4, simpleCalculator.add(1,1)); // test pass if actual is Not equal to 4

        assertTrue(simpleCalculator.add(2,2) == 4); // test pass if the boolean expression equals true
    }
}