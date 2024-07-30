import java.util.Scanner;
public class CharacterFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();
        System.out.println("Enter a character to find:");
        char searchChar = scanner.next().charAt(0);
        int index = -1;
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == searchChar) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            System.out.println("Character '" + searchChar + "' is present at index: " + index);
        } else {
            System.out.println("Character '" + searchChar + "' is not present in the string.");
        }
        scanner.close();
    }
}
