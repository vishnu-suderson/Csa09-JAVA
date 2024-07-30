import java.util.Scanner;
public class VowelCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a statement:");
        String input = scanner.nextLine();
        int vowelCount = 0;
        input = input.toLowerCase();
        for (char c : input.toCharArray()) {
            if (isVowel(c)) {
                vowelCount++;
            }
        }
        System.out.println("Number of vowels: " + vowelCount);        
        scanner.close();
    }
    public static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
