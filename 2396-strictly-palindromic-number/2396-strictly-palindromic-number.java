class Solution {
    public boolean isStrictlyPalindromic(int n) {
        boolean ans = true;
        for (int i = 2; i <= n - 2; i++){
            if(!isPalindrome(Integer.toString(n,i))){
                ans = false;
                break;
            }
        }
        return ans; 
        
    }

    public boolean isPalindrome(String s){
        int left = 0;
        int right = s.length() - 1;
        while(left <= right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}