package fundamentos;

public class PrimitiveTypes {
    public static void main(String[] args) {
        byte companyYears = 23;
        short numberOfFlights = 542;
        int id = 56789;
        long points = 3_234_845_223L;

        float salary = 11_445.44F;
        double amountOfSales = 2_991_797_103.01;

        boolean isInVacation = false;

        char status = 'A';

        System.out.println("Days in the company " + companyYears * 365);
        System.out.println("Number of flights "+ numberOfFlights);
        System.out.println("Employee ID "+ id);
        System.out.println("Number of points "+ points);
        System.out.println("Salary "+ salary);
        System.out.println("Amount of sales "+ amountOfSales);
        System.out.println("Is in vacation? "+ isInVacation);
        System.out.println("Status "+ status);
    }
}
