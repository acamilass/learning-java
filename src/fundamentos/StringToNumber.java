package fundamentos;

import javax.swing.*;

public class StringToNumber {
    public static void main(String[] args) {
        String value1 = JOptionPane.showInputDialog("Type the first number");
        String value2 = JOptionPane.showInputDialog("Type the second number");

        System.out.println(value1 + value2);

        double num1 = Double.parseDouble(value1);
        double num2 = Double.parseDouble(value2);
        double sum = num1 + num2;

        System.out.println("The sum is: "  + sum);
    }
}
