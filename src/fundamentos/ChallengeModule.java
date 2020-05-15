package fundamentos;

import java.util.Scanner;

public class ChallengeModule {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);

        System.out.print("First number: ");
        double num1 = enter.nextDouble();

        System.out.print("Second number: ");
        double num2 = enter.nextDouble();

        System.out.print("Operation: ");
        String operation = enter.next();

        double result = "+".equals(operation) ? num1 + num2 : 0;
        result = "-".equals(operation) ? num1 - num2 : result;
        result = "*".equals(operation) ? num1 * num2 : result;
        result = "/".equals(operation) ? num1 / num2 : result;
        result = "%".equals(operation) ? num1 % num2 : result;

        System.out.printf("%.2f %s %.2f = %.2f", num1, operation, num2, result);

        enter.close();
    }
}
