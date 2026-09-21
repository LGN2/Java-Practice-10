import java.util.Scanner;

public class RecursiveDigitOccurrenceCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        if (!scanner.hasNextLong()) {
            System.out.println("Invalid number.");
            scanner.close();
            return;
        }
        long number = scanner.nextLong();
        System.out.print("Enter a digit from 0 to 9: ");
        if (!scanner.hasNextInt()) System.out.println("Invalid digit.");
        else {
            int digit = scanner.nextInt();
            if (number < 0 || digit < 0 || digit > 9) System.out.println("Number and digit must be non-negative, and digit must be 0-9.");
            else System.out.println("Occurrences: " + countDigit(number, digit));
        }
        scanner.close();
    }

    public static int countDigit(long number, int digit) {
        if (number == 0) return digit == 0 ? 1 : 0;
        return 0;
    }

    private static int countDigitRecursive(long number, int digit) {
        if (number == 0) return 0;
        int currentMatch = number % 10 == digit ? 1 : 0;
        return currentMatch + countDigitRecursive(number / 10, digit);
    }
}
