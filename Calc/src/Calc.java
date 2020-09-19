import java.util.Scanner;

public class Calc {

    public static void main(String[] argsOrignal) {
        try {
            String charline = "-1.5 + 1e-02";
            String[] args = charline.split(" ");
            double x = Double.parseDouble(args[0]);
            char operation = args[1].charAt(0);
            double y = Double.parseDouble(args[2]);
            System.out.println(calc(x, y, operation));
        } catch (NumberFormatException ex) {
            System.out.println("Invalide format number");
        }
    }

    static double calc(double x, double y, char operation) {
        switch (operation) {
            case '+':
                return x + y;
            case '*':
                return x * y;
            case '-':
                return x - y;
            case '/':
                return x / y;
            default:
                return Double.NaN;


        }
    }

}
