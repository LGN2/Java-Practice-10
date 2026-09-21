import java.util.Scanner;

public class RecursiveDigitOccurrenceCounter {
    public static void main(String[] args) {
        System.out.println("Task 390 class structure is ready.");
    }

    public static int countDigit(long number, int digit) {
        return 0;
    }

    private static int countDigitRecursive(long number, int digit) {
        if (number == 0) return 0;
        int currentMatch = number % 10 == digit ? 1 : 0;
        return currentMatch + countDigitRecursive(number / 10, digit);
    }
}
