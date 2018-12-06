public class Calculator {
    public double[] calculateQuadraticEquation (double a, double b, double c) {
        double [] result = new double[2];
        if (a == 0){
            result = pqFormula(b, c);
        }else {
            double discriminante = b*b-4*a*c;
            if (discriminante > 0){
                result [0] = (-b + Math.sqrt(discriminante))/2*a;
                result [1] = (-b - Math.sqrt(discriminante))/2*a;
            }else if (discriminante == 0){
                result[0] = (-b + Math.sqrt(discriminante))/2*a;
            } else {
                result = null;
            }
        }
        return result;
    }

    private double[] pqFormula(double p, double q) {
        double[] result = new double[2];
        double discriminante = (p / 2) * (p / 2) - q;
        if (discriminante > 0) {
            result[0] = -(p / 2) + Math.sqrt(discriminante);
            result[1] = -(p / 2) - Math.sqrt(discriminante);
        } else if (discriminante == 0) {
            result[0] = -(p / 2) + Math.sqrt(discriminante);
        } else {
            result = null;
        }
        return result;
    }
}
