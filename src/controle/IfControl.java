package controle;

import java.util.Scanner;

public class IfControl {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);

        System.out.print("Type the value: ");
        double media = enter.nextDouble();

        if(media >= 7.0) {
            System.out.println("Approved");
        }
        else {
            System.out.println("Not approved");
        }

        enter.close();
    }
}
