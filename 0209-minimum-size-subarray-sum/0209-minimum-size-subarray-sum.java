class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int sum = 0;
        int left = 0;
        int right = 0;
        int minlen = n + 1;
        while(right < n){
            sum += nums[right];
            while(sum >= target){
                minlen = Math.min(minlen, right - left + 1);
                sum -= nums[left];
                left++;
            }
            right++;
        }

        return minlen == n+1 ? 0 : minlen;

        
    }
}