import java.util.*;
public class WeakestRows {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows (m): ");
        int m = scanner.nextInt();
        System.out.print("Enter the number of columns (n): ");
        int n = scanner.nextInt();
        int[][] mat = new int[m][n];
        System.out.println("Enter the matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = scanner.nextInt();
            }
        }
        System.out.print("Enter the number of weakest rows to find (k): ");
        int k = scanner.nextInt();
        int[] weakestRows = kWeakestRows(mat, k);
        System.out.println("The indices of the " + k + " weakest rows are:");
        for (int index : weakestRows) {
            System.out.print(index + " ");
        }
        scanner.close();
    }
    public static int[] kWeakestRows(int[][] mat, int k) {
        List<int[]> soldierCount = new ArrayList<>();
        for (int i = 0; i < mat.length; i++) {
            int count = 0;
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) {
                    count++;
                } else {
                    break;
                }
            }
            soldierCount.add(new int[]{count, i});
        }
        Collections.sort(soldierCount, (a, b) -> {
            if (a[0] != b[0]) {
                return a[0] - b[0];
            } else {
                return a[1] - b[1];
            }
        });
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = soldierCount.get(i)[1];
        }
        return result;
    }
}
