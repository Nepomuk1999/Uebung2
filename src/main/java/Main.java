import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String [] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean inputOk = false;
        boolean resultOk = false;
        float a = 0;
        float b = 0;
        float c = 0;
        Float[] result = new Float[2];

        while (!resultOk){
            inputOk = false;
            while (!inputOk) {
                System.out.print("Please enter your 'a' > 0:");
                try {
                    a = readNumericLine(reader);
                    if (a > 0) {
                        inputOk = true;
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            inputOk = false;
            while (!inputOk) {
                System.out.print("Please enter your 'b':");
                try {
                    b = readNumericLine(reader);
                    inputOk = true;
                } catch (IOException e) {
                    System.out.println();
                }
            }
            inputOk = false;
            while (!inputOk) {
                System.out.print("Please enter your 'c':");
                try {
                    c = readNumericLine(reader);
                    inputOk = true;
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            System.out.println("Calculating...");
            try {
                result = Calculator.calculateQuadraticEquation(a, b, c);
                resultOk = true;
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
            }
        }
        for (float f : result){
            System.out.println(String.format("%.10f", f));
            System.out.println(f);


        }
    }


    private static Float readNumericLine(BufferedReader reader) throws IOException {
        Float input;
        input = Float.parseFloat(reader.readLine());
        return input;
    }
}
