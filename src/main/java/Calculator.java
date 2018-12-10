import Exceprions.InputAIsZeroException;
import Exceprions.PlausabilityException;

import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.PriorityQueue;

public class Calculator {

    public static Float[] calculateQuadraticEquation (float a, float b, float c) throws InputAIsZeroException, PlausabilityException {
        Float [] result = new Float[2];
        double result1 = 0;
        double result2 = 0;
        if (a == 0){
            throw new InputAIsZeroException("Given a is zero!!");
//            result = pqFormula(b, c);
        }else {
            float discriminante = b*b-4*a*c;
            if (discriminante < 0){
                throw new PlausabilityException("Discriminante smaller than zero, b^2-4ac < 0");
            }else if (discriminante > 0){
                result1 = (-b + Math.sqrt(discriminante))/(2*a);
                result2 = (-b - Math.sqrt(discriminante))/(2*a);
                result[0] = new Float(result1);
                result[1] = new Float(result2);
            }else if (discriminante == 0){
                result1 = (-b + Math.sqrt(discriminante))/(2*a);
                result[0] = new Float(result1);
            }
        }
        return result;
    }





//    private double[] pqFormula(double p, double q) {
//        double[] result = new double[2];
//        double discriminante = (p / 2) * (p / 2) - q;
//        if (discriminante > 0) {
//            result[0] = -(p / 2) + Math.sqrt(discriminante);
//            result[1] = -(p / 2) - Math.sqrt(discriminante);
//        } else if (discriminante == 0) {
//            result[0] = -(p / 2) + Math.sqrt(discriminante);
//        } else {
//            result = null;
//        }
//        return result;
//    }
}
