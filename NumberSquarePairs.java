import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class NumberSquarePairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the lower range: ");
        int lowerRange = scanner.nextInt();
        System.out.print("Enter the upper range: ");
        int upperRange = scanner.nextInt();
        List<int[]> numberSquarePairs = createNumberSquarePairs(lowerRange, upperRange);
        System.out.println(numberSquarePairs);
    }
    public static List<int[]> createNumberSquarePairs(int lower, int upper) {
        List<int[]> result = new ArrayList<>();
        if (lower <= upper) {
            for (int i = lower; i <= upper; i++) {
                result.add(new int[]{i, i * i});
            }
        } else {
            System.out.println("Invalid range. The lower range should be less than or equal to the upper range.");
        }

        return result;
    }
}
