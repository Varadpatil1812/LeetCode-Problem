class Solution {
    public boolean isStrictlyPalindromic(int n) {

        for (int i = 2; i <= n - 2; i++) {
            String s = Integer.toString(n, i);

            int left = 0;
            int right = s.length() - 1;

            while (left < right) {
                if (s.charAt(left) != s.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }
        }

        return true;
    }
}