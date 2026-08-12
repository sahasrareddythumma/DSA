public class LongestSubstring {

    public static int lengthOfLongestSubstring(String s) {
        int[] last = new int[128];
        int left = 0;
        int max = 0;

        for (int right = 0; right < s.length(); right++) {
            int c = s.charAt(right);

            if (last[c] > left) {
                left = last[c];
            }

            int len = right - left + 1;

            if (len > max) {
                max = len;
            }

            last[c] = right + 1;
        }

        return max;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";

        System.out.println(lengthOfLongestSubstring(s));
    }
}