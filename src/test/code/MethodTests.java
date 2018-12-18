package TheCalculator;

import TheCalculator.Exception.InputAIsZeroException;
import TheCalculator.Exception.PlausabilityException;
import org.junit.*;

import static org.junit.Assert.assertEquals;

public class MethodTests {

    @Test
    public void testAZero(){
        float  a = 0;
        float b = 10;
        float c = 1;

        boolean exceptionThrown = false;

        try {
            Calculator.calculateQuadraticEquation(a,b,c);
        } catch (InputAIsZeroException e) {
            exceptionThrown = true;
        } catch (PlausabilityException e) {
            exceptionThrown = false;
        }

        assertEquals("Result",true, exceptionThrown);
    }
}
