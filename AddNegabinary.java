import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddNegabinary {
    public static void main(String[] args) {
        int[] arr1 = {1, 1, 1, 1, 1};
        int[] arr2 = {1, 0, 1};
        int[] result = addNegabinary(arr1, arr2);
        for (int num : result) {
            System.out.print(num);
        }
        System.out.println();  // Expected output: [1,0,0,0,0]
    }

    public static int[] addNegabinary(int[] arr1, int[] arr2) {
        List<Integer> result = new ArrayList<>();
        int carry = 0;
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        
        while (i >= 0 || j >= 0 || carry != 0) {
            int x = (i >= 0) ? arr1[i] : 0;
            int y = (j >= 0) ? arr2[j] : 0;
            int sum = x + y + carry;
            
            result.add(sum & 1);  // Get the bit to be added to the result
            carry = -(sum >> 1);  // Calculate the new carry for base -2
            
            i--;
            j--;
        }
        
        // Remove leading zeros from the result
        while (result.size() > 1 && result.get(result.size() - 1) == 0) {
            result.remove(result.size() - 1);
        }
        
        Collections.reverse(result);
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
