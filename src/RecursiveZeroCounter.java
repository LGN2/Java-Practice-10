import java.util.Scanner;

public class RecursiveZeroCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        if (!scanner.hasNextLong()) System.out.println("Invalid input. Please enter an integer.");
        else {
            long number = scanner.nextLong();
            if (number < 0) System.out.println("Please enter a non-negative number.");
            else System.out.println("Number of zeros: " + countZeros(number));
        }
        scanner.close();
    }

    public static int countZeros(long number) {
        return 0;
    }

    private static int countZerosRecursive(long number) {
        if (number == 0) return 0;
        int currentZero = number % 10 == 0 ? 1 : 0;
        return currentZero + countZerosRecursive(number / 10);
    }
}
