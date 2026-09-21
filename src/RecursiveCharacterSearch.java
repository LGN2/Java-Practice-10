import java.util.Scanner;

public class RecursiveCharacterSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        System.out.print("Enter one character to find: ");
        String targetInput = scanner.nextLine();
        if (targetInput.isEmpty()) System.out.println("A target character is required.");
        else System.out.println("Character found: " + contains(text, targetInput.charAt(0)));
        scanner.close();
    }

    public static boolean contains(String text, char target) {
        return false;
    }
}
