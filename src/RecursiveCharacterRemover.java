import java.util.Scanner;

public class RecursiveCharacterRemover {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        System.out.print("Enter one character to remove: ");
        String targetInput = scanner.nextLine();
        if (targetInput.isEmpty()) System.out.println("A target character is required.");
        else System.out.println("Result: " + removeChar(text, targetInput.charAt(0)));
        scanner.close();
    }

    public static String removeChar(String text, char target) {
        if (text.isEmpty()) return "";
        return text;
    }
}
