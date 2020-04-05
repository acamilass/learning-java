package fundamentos;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        System.out.print("What's your name? ");
        String name = entry.nextLine();

        System.out.print("What's your last name? ");
        String lastName = entry.nextLine();

        System.out.printf("%s %s", name, lastName);

        entry.close();
    }
}
