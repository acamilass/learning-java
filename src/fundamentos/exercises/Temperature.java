package fundamentos.exercises;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        final int ADJUST = 32;
        final double FACTOR = 5/9.0;

        System.out.print("Temperature in Fahrenheit: ");
        double f = enter.nextInt();

        double c = (f - ADJUST) * FACTOR;

        System.out.printf("The temperature %.0fºF is equal to %.0fºC", f, c);

        enter.close();
    }
}
