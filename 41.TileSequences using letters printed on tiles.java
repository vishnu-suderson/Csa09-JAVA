import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class TileSequences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the tiles string: ");
        String tiles = scanner.nextLine();
        scanner.close();
        System.out.println("Number of possible non-empty sequences: " + numTilePossibilities(tiles));
    }
    public static int numTilePossibilities(String tiles) {
        char[] chars = tiles.toCharArray();
        Set<String> result = new HashSet<>();
        boolean[] used = new boolean[chars.length];
        Arrays.sort(chars);
        backtrack(chars, used, new StringBuilder(), result);
        return result.size();
    }
    private static void backtrack(char[] chars, boolean[] used, StringBuilder sb, Set<String> result) {
        for (int i = 0; i < chars.length; i++) {
            if (used[i] || (i > 0 && chars[i] == chars[i - 1] && !used[i - 1])) {
                continue;
            }
            sb.append(chars[i]);
            result.add(sb.toString());
            used[i] = true;
            backtrack(chars, used, sb, result);
            used[i] = false;
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
