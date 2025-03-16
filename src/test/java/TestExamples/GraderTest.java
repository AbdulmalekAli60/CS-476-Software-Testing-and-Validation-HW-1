package TestExamples;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class GraderTest {

    @Test
    public void fiftyNineShouldReturnF(){
        var grader = new Grader();
        assertEquals('F', grader.determineGradeLetter(59));
    }

    @Test
    public void sixtyNineShouldReturnD(){
        var grader = new Grader();
        assertEquals('D', grader.determineGradeLetter(69));
    }

    @Test
    public void seventyNineShouldReturnC(){
        var grader = new Grader();
        assertEquals('C', grader.determineGradeLetter(79));
    }

    @Test
    public void eightyNineShouldReturnB(){
        var grader = new Grader();
        assertEquals('B', grader.determineGradeLetter(89));
    }

    @Test
    public void hundredShouldReturnA(){
        var grader = new Grader();
        assertEquals('A', grader.determineGradeLetter(100));
    }

    @Test
    public void eightyShouldReturnB(){
        var grader = new Grader();
        assertEquals('B', grader.determineGradeLetter(80));
    }

    @Test
    public void ninetyShouldReturnA(){
        var grader = new Grader();
        assertEquals('A', grader.determineGradeLetter(90));
    }

    @Test
    public void seventyShouldReturnC(){
        var grader = new Grader();
        assertEquals('C', grader.determineGradeLetter(70));
    }

    @Test
    public void sixtyShouldReturnB(){
        var grader = new Grader();
        assertEquals('D', grader.determineGradeLetter(60));
    }

    @Test
    public void zeroShouldReturnF(){
        var grader = new Grader();
        assertEquals('F', grader.determineGradeLetter(0));
    }

    @Test
    public void greaterThenHundredShouldReturnIllegalArgumentException(){
        var grader = new Grader();
        try {
            grader.determineGradeLetter(101);
            fail("Expected IllegalArgumentException was not thrown");
        } catch (IllegalArgumentException e) {
            // test pass here
        }
    }
}