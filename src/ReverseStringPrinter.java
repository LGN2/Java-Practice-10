import java.util.Scanner;

public class ReverseStringPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        printReverse(text);
        scanner.close();
    }

    public static void printReverse(String text) {
        if (text.isEmpty()) return;
        printReverse(text.substring(1));
        System.out.println(text.charAt(0));
    }
}
