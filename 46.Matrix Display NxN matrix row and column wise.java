import java.util.Scanner;
public class MatrixDisplay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the matrix (N): ");
        int N = scanner.nextInt();
        int[][] matrix = new int[N][N];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print("Enter element at position [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        scanner.close();
        System.out.println("\nMatrix displayed row-wise:");
        displayRowWise(matrix);
        System.out.println("\nMatrix displayed column-wise:");
        displayColumnWise(matrix);
    }
    public static void displayRowWise(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
    public static void displayColumnWise(int[][] matrix) {
        for (int j = 0; j < matrix.length; j++) {
            for (int i = 0; i < matrix.length; i++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
