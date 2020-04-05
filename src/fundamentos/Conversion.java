package fundamentos;

import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        System.out.print("Type the first number: ");
        String info1 = entry.nextLine();

        System.out.print("Type the second number: ");
        String info2 = entry.nextLine();

        double num1 = Double.parseDouble(info1);
        double num2 = Double.parseDouble(info2);
        double sum = num1 + num2;

        System.out.print("The sum is " + sum);
    }
}
