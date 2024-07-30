import java.util.Scanner;
public class RemoveVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        StringBuilder result = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (!isVowel(c)) {
                result.append(c);
            }
        }
        System.out.println("String after removing vowels: " + result.toString());   
        scanner.close();
    }
    public static boolean isVowel(char c) {
        char lowerC = Character.toLowerCase(c);
        return lowerC == 'a' || lowerC == 'e' || lowerC == 'i' || lowerC == 'o' || lowerC == 'u';
    }
}
