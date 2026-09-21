import java.util.Scanner;

public class RecursiveZeroCounter {
    public static void main(String[] args) {
        System.out.println("Task 394 class structure is ready.");
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
