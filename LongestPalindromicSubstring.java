public class LongestPalindromicSubstring {

    public static String longestPalindrome(String s) {

        int n = s.length();

        if (n < 2) {
            return s;
        }

        // Create transformed string
        char[] t = new char[2 * n + 1];

        for (int i = 0; i < t.length; i++) {
            t[i] = '#';
        }

        for (int i = 0; i < n; i++) {
            t[2 * i + 1] = s.charAt(i);
        }

        int[] p = new int[t.length];

        int center = 0;
        int right = 0;

        int maxLen = 0;
        int maxCenter = 0;

        for (int i = 0; i < t.length; i++) {

            int mirror = 2 * center - i;

            if (i < right) {
                p[i] = Math.min(right - i, p[mirror]);
            }

            while (i + p[i] + 1 < t.length
                    && i - p[i] - 1 >= 0
                    && t[i + p[i] + 1] == t[i - p[i] - 1]) {

                p[i]++;
            }

            if (i + p[i] > right) {
                center = i;
                right = i + p[i];
            }

            if (p[i] > maxLen) {
                maxLen = p[i];
                maxCenter = i;
            }
        }

        int start = (maxCenter - maxLen) / 2;

        return s.substring(start, start + maxLen);
    }

    public static void main(String[] args) {

        String s = "babad";

        String result = longestPalindrome(s);

        System.out.println("Input: " + s);
        System.out.println("Longest Palindromic Substring: " + result);
    }
}