import java.util.HashMap;
import java.util.Map;

class WordFilter {
    private Map<String, Integer> map;

    public WordFilter(String[] words) {
        map = new HashMap<>();
        for (int index = 0; index < words.length; index++) {
            String word = words[index];
            int wordLength = word.length();
            for (int i = 0; i <= wordLength; i++) {
                String prefix = word.substring(0, i);
                for (int j = 0; j <= wordLength; j++) {
                    String suffix = word.substring(j);
                    map.put(prefix + "#" + suffix, index);
                }
            }
        }
    }

    public int f(String pref, String suff) {
        String key = pref + "#" + suff;
        return map.getOrDefault(key, -1);
    }

    public static void main(String[] args) {
        String[] words = {"apple", "apply", "applet", "appl"};
        WordFilter wordFilter = new WordFilter(words);

        System.out.println(wordFilter.f("app", "e")); // Output: 0 (apple)
        System.out.println(wordFilter.f("ap", "ly")); // Output: 1 (apply)
        System.out.println(wordFilter.f("app", "t")); // Output: 2 (applet)
        System.out.println(wordFilter.f("appl", "l")); // Output: 3 (appl)
        System.out.println(wordFilter.f("a", "z")); // Output: -1 (no match)
    }
}
