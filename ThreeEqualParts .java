import java.util.Arrays;

public class ThreeEqualParts {
    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 0, 1};
        System.out.println(Arrays.toString(threeEqualParts(arr)));
    }

    public static int[] threeEqualParts(int[] arr) {
        int numOfOnes = 0;
        for (int num : arr) {
            if (num == 1) numOfOnes++;
        }

        // If the number of 1s is not divisible by 3, it's impossible
        if (numOfOnes % 3 != 0) return new int[]{-1, -1};

        // If the array has no 1s, any partition is valid
        if (numOfOnes == 0) return new int[]{0, arr.length - 1};

        int k = numOfOnes / 3;
        int first = -1, second = -1, third = -1;
        int count = 0;

        // Find the starting index of each part
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                if (count == 0) first = i;
                else if (count == k) second = i;
                else if (count == 2 * k) third = i;
                count++;
            }
        }

        // Compare the three parts
        while (third < arr.length && arr[first] == arr[second] && arr[second] == arr[third]) {
            first++;
            second++;
            third++;
        }

        if (third == arr.length) {
            return new int[]{first - 1, second};
        }

        return new int[]{-1, -1};
    }
}
