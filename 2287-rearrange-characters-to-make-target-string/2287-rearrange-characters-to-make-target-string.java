class Solution {
    public int rearrangeCharacters(String s, String target) {
        int[] countS = new int[26];
        int[] countTarget = new int[26];

        for (char c : s.toCharArray()) {
            countS[c - 'a']++;
        }

        for (char c : target.toCharArray()) {
            countTarget[c - 'a']++;
        }

        int answer = Integer.MAX_VALUE;

        for (int i = 0; i < 26; i++) {
            if (countTarget[i] > 0) {
                answer = Math.min(answer, countS[i] / countTarget[i]);
            }
        }

        return answer;
    }
}