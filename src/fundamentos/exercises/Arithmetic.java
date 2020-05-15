package fundamentos.exercises;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);

        System.out.print("Type a number: ");
        double num = enter.nextDouble();

        double num2 = Math.pow(num, 2);
        double num3 = Math.pow(num, 3);

        System.out.printf("%.2f elevated to 2 is equal to %.2f and to 3 is %.2f", num, num2, num3);

        enter.close();
    }
}
