package code;

import TheCalculator.Calculator;
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

    @Test
    public void testPlausability(){
        float  a = 1;
        float b = 2;
        float c = 40;

        boolean exceptionThrown = false;

        try {
            Calculator.calculateQuadraticEquation(a,b,c);
        } catch (InputAIsZeroException e) {
            exceptionThrown = false;
        } catch (PlausabilityException e) {
            exceptionThrown = true;
        }

        assertEquals("Result",true, exceptionThrown);
    }

    @Test
    public void testDiscriminantZero(){
        float  a = 1;
        float b = 2;
        float c = 1;

        boolean exceptionThrown = false;
        Float[] result = null;

        try {
            result = Calculator.calculateQuadraticEquation(a,b,c);
        } catch (InputAIsZeroException e) {
            exceptionThrown = true;
        } catch (PlausabilityException e) {
            exceptionThrown = true;
        }


        assertEquals("Returned Float Array should not be null",false, result == null);
        assertEquals("Unexpected exception",false, exceptionThrown);
        assertEquals("If the discriminant is 0 the 2nd entry of the array is null", null, result[1]);
    }

//    Test fails after 500 Millis.
    @Test(timeout = 500)
    public void testExecutionTime(){
        float  a = 1;
        float b = 2;
        float c = 1;
        Float[] result = null;
        long start = System.currentTimeMillis();
        try {
            result = Calculator.calculateQuadraticEquation(a,b,c);
        } catch (InputAIsZeroException e) {
            e.printStackTrace();
        } catch (PlausabilityException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("DEBUG: Methode took " + (end - start) + " MilliSeconds to execute");
    }



}
