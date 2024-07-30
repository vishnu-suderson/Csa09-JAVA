import java.util.Scanner;
public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose an option:");
        System.out.println("1: Check if a given string is a palindrome");
        System.out.println("2: Check if a given number is a palindrome");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Enter the string: ");
                String inputString = scanner.next();
                if (isPalindrome(inputString)) {
                    System.out.println("Palindrome");
                } else {
                    System.out.println("Not a Palindrome");
                }
                break;
            case 2:
                System.out.print("Enter the number: ");
                int inputNumber = scanner.nextInt();
                if (isPalindrome(inputNumber)) {
                    System.out.println("Palindrome");
                } else {
                    System.out.println("Not a Palindrome");
                }
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static boolean isPalindrome(int num) {
        String str = Integer.toString(num);
        return isPalindrome(str);
    }
}
