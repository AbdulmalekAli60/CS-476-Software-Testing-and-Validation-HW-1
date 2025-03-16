package TestExamples;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class DataDrivenCalcTest {

    int a, b, expectedSum, expectedSubtract, expectedMultiply, expectedDivide;
    private DataDrivenCalc dataDrivenCalc = new DataDrivenCalc();

    public DataDrivenCalcTest(int a, int b, int sum, int subtract, int multiply, int divide) {
        this.a = a;
        this.b = b;
        this.expectedSum = sum;
        this.expectedSubtract = subtract;
        this.expectedMultiply = multiply;
        this.expectedDivide = divide;
    }

    @Parameters
    public static Collection<Object[]> parameters() {
        return Arrays.asList(new Object[][] {
                {10, 5, 15, 5, 50, 2}, // test 1
                {20, 10, 30, 10, 200, 2}, // test 2
                {7, 3, 10, 4, 21, 2}, // test 3
                {-5, 2, -3, -7, -10, -2} // test 4
        });
    }

    @Test
    public void sumTest() {
        assertEquals("Addition Test", expectedSum, dataDrivenCalc.sum(a, b));
    }

    @Test
    public void subtractTest() {
        assertEquals("Subtraction Test", expectedSubtract, dataDrivenCalc.subtract(a, b));
    }

    @Test
    public void multiplyTest() {
        assertEquals("Multiplication Test", expectedMultiply, dataDrivenCalc.multiply(a, b));
    }

    @Test
    public void divideTest() {
        assertEquals("Division Test", expectedDivide, dataDrivenCalc.divide(a, b));
    }
}