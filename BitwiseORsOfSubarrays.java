import java.util.HashSet;
import java.util.Set;

public class BitwiseORsOfSubarrays {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2};
        System.out.println(subarrayBitwiseORs(arr));  // Output: 3
    }

    public static int subarrayBitwiseORs(int[] arr) {
        Set<Integer> resultSet = new HashSet<>();
        Set<Integer> current = new HashSet<>();
        
        for (int num : arr) {
            Set<Integer> newSet = new HashSet<>();
            newSet.add(num);
            for (int prefix : current) {
                newSet.add(prefix | num);
            }
            resultSet.addAll(newSet);
            current = newSet;
        }
        
        return resultSet.size();
    }
}
