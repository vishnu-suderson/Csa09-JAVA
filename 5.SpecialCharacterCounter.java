import java.util.Scanner;
public class SpecialCharacterCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a line of text:");
        String input = scanner.nextLine();
        StringBuilder specialCharacters = new StringBuilder();
        int specialCharCount = 0;
        for (char c : input.toCharArray()) {
            if (!Character.isLetterOrDigit(c) && !Character.isWhitespace(c)) {
                specialCharacters.append(c).append(" ");
                specialCharCount++;
            }
        }
        System.out.println("Special characters: " + specialCharacters.toString().trim());
        System.out.println("Number of special characters: " + specialCharCount);
        scanner.close();
    }
}
