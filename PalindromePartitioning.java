public class PalindromePartitioning {
    public static void main(String[] args) {
        String s = "aabbc";
        System.out.println("Minimum cuts needed for palindrome partitioning: " + minCut(s));
    }

    public static int minCut(String s) {
        int n = s.length();
        if (n == 0) return 0;

        // dp[i] will be the minimum number of cuts needed for a palindrome partitioning of s[0:i]
        int[] dp = new int[n];
        // palindrome[i][j] will be true if the substring s[i:j] is a palindrome
        boolean[][] palindrome = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            dp[i] = i;  // Max cuts needed would be (i cuts) for a string of length i+1
            for (int j = 0; j <= i; j++) {
                if (s.charAt(i) == s.charAt(j) && (i - j <= 2 || palindrome[j + 1][i - 1])) {
                    palindrome[j][i] = true;
                    if (j == 0) {
                        dp[i] = 0;
                    } else {
                        dp[i] = Math.min(dp[i], dp[j - 1] + 1);
                    }
                }
            }
        }

        return dp[n - 1];
    }
}
