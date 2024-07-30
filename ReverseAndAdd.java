import java.util.Scanner;
public class ReverseAndAdd {
    public static boolean isPalindrome(long number) {
        return number == reverseNumber(number);
    } 
    public static long reverseNumber(long number) {
        long reverse = 0;
        while (number != 0) {
            reverse = reverse * 10 + number % 10;
            number /= 10;
        }
        return reverse;
    }
    public static long reverseAndAdd(long number) {
        while (!isPalindrome(number)) {
            long reverse = reverseNumber(number);
            System.out.println(number + " + " + reverse + " = " + (number + reverse));
            number += reverse;
        }
        return number;
    }   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String input = scanner.nextLine();
        long number;
        try {
            number = Long.parseLong(input);
            if (number < 0) {
                System.out.println("Please enter a positive integer.");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid positive integer.");
            return;
        }
        long palindrome = reverseAndAdd(number);
        System.out.println("Palindrome: " + palindrome);
    }
}
