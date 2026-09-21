import java.util.Scanner;

public class RecursiveEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        if (!scanner.hasNextInt()) System.out.println("Invalid input. Please enter an integer.");
        else {
            int number = scanner.nextInt();
            if (number < 1) System.out.println("Please enter a number greater than zero.");
            else System.out.println("Sum of even numbers: " + sumEven(number));
        }
        scanner.close();
    }

    public static int sumEven(int number) {
        if (number <= 0) return 0;
        return 0;
    }
}
