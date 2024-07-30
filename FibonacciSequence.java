import java.util.ArrayList;
import java.util.List;

public class FibonacciSequence {
    public static void main(String[] args) {
        String num1 = "1101111";
        System.out.println(splitIntoFibonacci(num1));  // Output: [11, 0, 11, 11]

        String num2 = "112358130";
        System.out.println(splitIntoFibonacci(num2));  // Output: []

        String num3 = "0123";
        System.out.println(splitIntoFibonacci(num3));  // Output: []
    }

    public static List<Integer> splitIntoFibonacci(String num) {
        List<Integer> result = new ArrayList<>();
        if (backtrack(num, result, 0)) {
            return result;
        }
        return new ArrayList<>();
    }

    private static boolean backtrack(String num, List<Integer> result, int index) {
        if (index == num.length() && result.size() >= 3) {
            return true;
        }

        for (int i = index; i < num.length(); i++) {
            if (num.charAt(index) == '0' && i > index) {
                break;
            }

            long numLong = Long.parseLong(num.substring(index, i + 1));
            if (numLong > Integer.MAX_VALUE) {
                break;
            }

            int size = result.size();
            if (size >= 2 && numLong > result.get(size - 1) + result.get(size - 2)) {
                break;
            }

            if (size <= 1 || numLong == result.get(size - 1) + result.get(size - 2)) {
                result.add((int) numLong);
                if (backtrack(num, result, i + 1)) {
                    return true;
                }
                result.remove(result.size() - 1);
            }
        }
        return false;
    }
}
