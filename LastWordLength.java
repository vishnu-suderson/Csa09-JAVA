import java.util.Scanner;
public class LastWordLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        int lengthOfLastWord = lengthOfLastWord(inputString);
        System.out.println("The length of the last word is: " + lengthOfLastWord);
        scanner.close();
    }
    public static int lengthOfLastWord(String s) {
        s = s.trim();
        int lastSpaceIndex = s.lastIndexOf(' ');
        return s.length() - lastSpaceIndex - 1;
    }
}
