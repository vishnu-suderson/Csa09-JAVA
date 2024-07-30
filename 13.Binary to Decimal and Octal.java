import java.util.Scanner;
public class BinaryConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the binary number: ");
        String binaryNumber = scanner.next();
        int decimal = binaryToDecimal(binaryNumber);
        System.out.println("Decimal Number: " + decimal);
        String octal = decimalToOctal(decimal);
        System.out.println("Octal: " + octal);
    }
    public static int binaryToDecimal(String binaryNumber) {
        int decimal = Integer.parseInt(binaryNumber, 2);
        return decimal;
    }
    public static String decimalToOctal(int decimal) {
        String octal = Integer.toOctalString(decimal);
        return octal;
    }
}
