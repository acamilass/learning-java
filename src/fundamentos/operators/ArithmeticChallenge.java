package fundamentos.operators;

public class ArithmeticChallenge {
    public static void main(String[] args) {
        double x = Math.pow(6 * (3 + 2), 2);
        double y = 3 * 2;
        double z = (1 - 5) * (2 -7);
        double w = 2;
        double k = Math.pow(10, 3);
        double total = Math.pow(x / y - Math.pow(z / w, 2), 3) / k;

        System.out.println((int) total);
    }
}
