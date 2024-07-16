import java.util.Scanner;

public class QuotientAndRemainderCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the dividend and divisor
        System.out.print("Enter the dividend: ");
        int dividend = scanner.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = scanner.nextInt();

        // Calculate quotient and remainder
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        // Display the quotient and remainder
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}