import java.util.Scanner;

public class FastRecursivePower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base: ");
        if (!scanner.hasNextLong()) {
            System.out.println("Invalid base.");
            scanner.close();
            return;
        }
        long base = scanner.nextLong();
        System.out.print("Enter a non-negative exponent: ");
        if (!scanner.hasNextInt()) System.out.println("Invalid exponent.");
        else {
            int exponent = scanner.nextInt();
            if (exponent < 0) System.out.println("Exponent cannot be negative.");
            else System.out.println("Result: " + power(base, exponent));
        }
        scanner.close();
    }

    public static long power(long base, int exponent) {
        return 0;
    }
}
