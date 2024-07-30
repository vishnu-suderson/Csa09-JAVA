import java.util.Scanner;
public class StringOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String inputString = scanner.nextLine();
        System.out.println("Enter the word to replace: ");
        String oldWord = scanner.next();
        System.out.println("Enter the new word: ");
        String newWord = scanner.next();
        String replacedString = inputString.replace(oldWord, newWord);
        System.out.println("String after replacement: " + replacedString);
        int length = inputString.length();
        System.out.println("Length of the string: " + length);
        String uppercaseString = inputString.toUpperCase();
        System.out.println("String in uppercase: " + uppercaseString);
        scanner.close();
    }
}
