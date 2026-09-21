import java.util.Scanner;

public class RecursiveBinaryConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        if (!scanner.hasNextLong()) System.out.println("Invalid input. Please enter an integer.");
        else {
            long number = scanner.nextLong();
            if (number < 0) System.out.println("Please enter a non-negative number.");
            else System.out.println("Binary: " + toBinary(number));
        }
        scanner.close();
    }

    public static String toBinary(long number) {
        if (number < 2) return String.valueOf(number);
        return "";
    }
}
