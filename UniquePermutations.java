import java.util.HashSet;
import java.util.Scanner;

public class UniquePermutations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input given number
        System.out.print("Given Number: ");
        int givenNumber = scanner.nextInt();

        System.out.println("Permutations are:");
        printUniquePermutations(givenNumber);
    }

    public static void printUniquePermutations(int number) {
        HashSet<Integer> set = new HashSet<>();
        permutationHelper(set, number, "");
        for (int perm : set) {
            System.out.println(perm);
        }
    }

    public static void permutationHelper(HashSet<Integer> set, int number, String permutation) {
        if (permutation.length() == String.valueOf(number).length()) {
            int perm = Integer.parseInt(permutation);
            if (!set.contains(perm)) {
                set.add(perm);
            }
        } else {
            for (int i = 0; i < String.valueOf(number).length(); i++) {
                if (!permutation.contains(String.valueOf(String.valueOf(number).charAt(i)))) {
                    permutationHelper(set, number, permutation + String.valueOf(number).charAt(i));
                }
            }
        }
    }
}
