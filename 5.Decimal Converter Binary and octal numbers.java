import java.util.Scanner;
public class DecimalConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Decimal Number: ");
        String input = scanner.next();
        try {
            double decimalNumber = Double.parseDouble(input);
            int integerPart = (int) decimalNumber;
            String binaryNumber = Integer.toBinaryString(integerPart);
            String octalNumber = Integer.toOctalString(integerPart);
            System.out.println("Binary Number = " + binaryNumber);
            System.out.println("Octal Number = " + octalNumber);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid decimal number.");
        }
    }
}
