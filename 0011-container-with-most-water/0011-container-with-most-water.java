class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int left = 0;
        int right = height.length -1;
        while(left < right){
            int minHeight = left;
           if(height[left] > height[right]){
                minHeight = right;
           }
           int currContain = (right - left) * height[minHeight];
           if(max < currContain){
            max = currContain;
           }
           if(minHeight == left){
            left++;
           }
           else{
            right--;
           }
        }
    return max;
        
    }
}