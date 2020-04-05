package fundamentos;

public class StringType {
    public static void main(String[] args) {
        System.out.println("Hello".charAt(1));

        String s = "Good afternoon";
        System.out.println(s.concat("!!!!"));
        System.out.println(s.startsWith("Good"));
        System.out.println(s.length());

        var name = "Ana";
        var lastName = "Sousa";

        System.out.printf("My name is %s %s", name, lastName);
    }
}
