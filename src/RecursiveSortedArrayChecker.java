import java.util.Scanner;

public class RecursiveSortedArrayChecker {
    public static void main(String[] args) {
        System.out.println("Task 391 class structure is ready.");
    }

    public static boolean isSorted(int[] numbers, int index) {
        return false;
    }

    private static int[] readArray(Scanner scanner) {
        System.out.print("Enter array size: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid array size.");
            return null;
        }
        int size = scanner.nextInt();
        if (size < 0) {
            System.out.println("Array size cannot be negative.");
            return null;
        }
        int[] numbers = new int[size];
        for (int index = 0; index < size; index++) {
            System.out.print("Enter number " + (index + 1) + ": ");
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid array value.");
                return null;
            }
            numbers[index] = scanner.nextInt();
        }
        return numbers;
    }
}
