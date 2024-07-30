import java.util.HashMap;
import java.util.Scanner;
public class RansomNote {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the ransom note: ");
        String ransomNote = scanner.nextLine();
        System.out.print("Enter the magazine: ");
        String magazine = scanner.nextLine();
        boolean canConstruct = canConstruct(ransomNote, magazine);
        System.out.println("Can the ransom note be constructed? " + canConstruct);
        scanner.close();
    }
    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> magazineMap = new HashMap<>();
        for (char c : magazine.toCharArray()) {
            magazineMap.put(c, magazineMap.getOrDefault(c, 0) + 1);
        }
        for (char c : ransomNote.toCharArray()) {
            if (!magazineMap.containsKey(c) || magazineMap.get(c) == 0) {
                return false;
            }
            magazineMap.put(c, magazineMap.get(c) - 1);
        }
        return true;
    }
}
