import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ReverseAlphabeticalOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word:");
        String input = scanner.nextLine();
        Character[] charArray = new Character[input.length()];
        for (int i = 0; i < input.length(); i++) {
            charArray[i] = input.charAt(i);
        }
        Arrays.sort(charArray, Collections.reverseOrder());
        StringBuilder sortedWord = new StringBuilder(charArray.length);
        for (char c : charArray) {
            sortedWord.append(c);
        }
        System.out.println("Word with letters in reverse alphabetical order: " + sortedWord.toString());
        scanner.close();
    }
}
