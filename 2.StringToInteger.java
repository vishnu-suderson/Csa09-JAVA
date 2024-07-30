import java.util.Scanner;
public class StringToInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to convert to an integer: ");
        String numberString = scanner.nextLine();
        try {
            int number = Integer.parseInt(numberString);
            System.out.println("The string \"" + numberString + "\" converted to integer is: " + number);
        } catch (NumberFormatException e) {
            System.out.println("The string \"" + numberString + "\" is not a valid integer.");
        }
        scanner.close();
    }
}
