import java.util.Scanner;
public class VowelConsonantSeparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word:");
        String input = scanner.nextLine();
        StringBuilder vowels = new StringBuilder();
        StringBuilder consonants = new StringBuilder();
        input = input.toLowerCase();
        for (char c : input.toCharArray()) {
            if (isVowel(c)) {
                vowels.append(c).append(" ");
            } else if (isConsonant(c)) {
                consonants.append(c).append(" ");
            }
        }
        System.out.println("Vowels: " + vowels.toString().trim());
        System.out.println("Consonants: " + consonants.toString().trim());
        scanner.close();
    }
    public static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
    public static boolean isConsonant(char c) {
        return Character.isLetter(c) && !isVowel(c);
    }
}
