import java.util.Scanner;

public class RecursiveUppercaseCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        System.out.println("Uppercase letters: " + countUpper(text));
        scanner.close();
    }

    public static int countUpper(String text) {
        if (text.isEmpty()) return 0;
        return 0;
    }
}
