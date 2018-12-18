package TheCalculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String [] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean inputOk = false;
        boolean resultOk = false;
        Float a = null;
        Float b = null;
        Float c = null;
        Float[] result = new Float[2];

        while (!resultOk){
            inputOk = false;
            while (!inputOk) {
                System.out.print("Please enter your 'a' > 0:");
                a = readNumericLine(reader);
                if (a != null) {
                    if (a > 0) {
                        inputOk = true;
                    }
                }

            }
            inputOk = false;
            while (!inputOk) {
                System.out.print("Please enter your 'b':");
                b = readNumericLine(reader);
                if (b != null) {
                    inputOk = true;
                }            }
            inputOk = false;

            while (!inputOk) {
                System.out.print("Please enter your 'c':");

                c = readNumericLine(reader);
                if (c != null) {
                    inputOk = true;
                }
            }

            System.out.println("Calculating...");
            try {
                result = Calculator.calculateQuadraticEquation(a, b, c);
                resultOk = true;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        for (float f : result){
            System.out.println(String.format("%.10f", f));
        }
    }


    private static Float readNumericLine(BufferedReader reader){
        Float fl;
        String input = "";

        try {
            input =reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //Replace ',' with '.'
        input = input.replace(",", ".");
        //Check if input is real
        if (input.matches("[+-]?([0-9]*[.])?[0-9]+")){
            fl = Float.parseFloat(input);
        } else {
            System.out.println("Pleas enter real number!!");
            fl = null;
        }
        return fl;
    }
}
