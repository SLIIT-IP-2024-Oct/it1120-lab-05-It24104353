import java.util.Scanner;

public class IT24104353Lab5Q3 {
    // Constants
    private static final double ROOM_CHARGE_PER_DAY = 48000.00;
    private static final int DISCOUNT_NONE = 0;
    private static final int DISCOUNT_10 = 10;
    private static final int DISCOUNT_20 = 20;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Enter start and end dates
        System.out.print("Enter the start date (1-31): ");
        int startDate = scanner.nextInt();
        System.out.print("Enter the end date (1-31): ");
        int endDate = scanner.nextInt();

        // Validation
        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Error: Start date and end date must be between 1 and 31.");
            System.exit(0);
        }

        if (startDate >= endDate) {
            System.out.println("Error: Start date should be less than the end date.");
            System.exit(0);
        }

        // Calculate number of days reserved
        int daysReserved = endDate - startDate;

        // Determine discount rate
        int discountRate;
        if (daysReserved < 3) {
            discountRate = DISCOUNT_NONE;
        } else if (daysReserved <= 4) {
            discountRate = DISCOUNT_10;
        } else {
            discountRate = DISCOUNT_20;
        }

        // Calculate total amount to be paid
        double totalAmount = daysReserved * ROOM_CHARGE_PER_DAY * (1 - discountRate / 100.0);

        // Display results
        System.out.println("Number of days reserved: " + daysReserved);
        System.out.println("Total amount to be paid: Rs " + totalAmount);
    }
}
