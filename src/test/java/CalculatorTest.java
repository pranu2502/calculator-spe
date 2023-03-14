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

}
