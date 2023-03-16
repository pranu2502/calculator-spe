import org.example.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorTest {

    private static final double DELTA = 1e-15;
    Calculator calculator = new Calculator();

    @Test
    public void testSquareRoot()
    {
        assertEquals(9, calculator.squareRoot(81), DELTA);
        assertEquals(3, calculator.squareRoot(9), DELTA);
        assertEquals(0, calculator.squareRoot(0), DELTA);
        assertEquals(1, calculator.squareRoot(1), DELTA);
    }

    @Test
    public void testFactorial()
    {
        assertEquals(6, calculator.factorial(3), DELTA);
        assertEquals(40320, calculator.factorial(8), DELTA);
        assertEquals(120, calculator.factorial(5), DELTA);
        assertEquals(5040, calculator.factorial(7), DELTA);
    }

    @Test
    public void testLogarithm()
    {
        assertEquals(6.894670039433482, calculator.logarithm(987), DELTA);
        assertEquals(3.8066624897703196, calculator.logarithm(45), DELTA);
        assertEquals(0.6931471805599453, calculator.logarithm(2), DELTA);
        assertEquals(1.9459101490553132, calculator.logarithm(7), DELTA);
    }

    @Test
    public void testPower()
    {
        assertEquals(8, calculator.power(2, 3), DELTA);
        assertEquals(262144, calculator.power(4, 9), DELTA);
        assertEquals(100, calculator.power(10, 2), DELTA);
        assertEquals(4.747561509943E12, calculator.power(7, 15), DELTA);
    }

}
