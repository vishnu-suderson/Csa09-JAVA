import java.util.Scanner;
public class PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        printPascalTriangle(rows);

        scanner.close();
    }
    public static void printPascalTriangle(int rows) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print("   ");
            }
            int num = 1;
            for (int j = 0; j <= i; j++) {
                System.out.printf("%6d", num);
                num = num * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
} 
