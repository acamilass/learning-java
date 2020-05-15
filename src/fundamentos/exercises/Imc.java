package fundamentos.exercises;

import java.util.Scanner;

public class Imc {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);

        System.out.print("Your height: ");
        double height = enter.nextDouble();

        System.out.print("Your weight: ");
        double weight = enter.nextDouble();

        double imc = weight / (Math.pow(height, 2));

        System.out.printf("Your IMC is: %.2f", imc);

        enter.close();
    }
}
