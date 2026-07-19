class Solution {
    public String smallestSubsequence(String s) {

        int[] freq = new int[27];
        boolean[] seen = new boolean[27];
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            freq[s.charAt(i) - 'a']++;
        }
        
        for(int i = 0; i < s.length(); i++){
            freq[s.charAt(i) - 'a']--;

            if(seen[s.charAt(i) - 'a']){
                continue;
            }

            while(!stack.isEmpty()){
                if(stack.peek() <= s.charAt(i) || freq[stack.peek() - 'a'] == 0)
                    break;
                
                seen[stack.peek() - 'a'] = false;
                stack.pop();
                
            }
            stack.push(s.charAt(i));
            seen[s.charAt(i) - 'a'] = true;

        }

        StringBuilder res = new StringBuilder();

        for (char c : stack)
            res.append(c);

        return res.toString();
    }
}