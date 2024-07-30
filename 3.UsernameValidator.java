import java.util.Scanner;
public class UsernameValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a username to validate:");
        String username = scanner.nextLine();
        if (isValidUsername(username)) {
            System.out.println("The username is valid.");
        } else {
            System.out.println("The username is not valid.");
        }
        scanner.close();
    }
    public static boolean isValidUsername(String username) {
        if (username.length() < 6 || username.length() > 15) {
            return false;
        }
        if (!Character.isLetter(username.charAt(0))) {
            return false;
        }
        for (char c : username.toCharArray()) {
            if (!Character.isLetterOrDigit(c) && c != '_') {
                return false;
            }
        }
        return true;
    }
}
