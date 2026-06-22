class Solution {
    public int trap(int[] height) {
        int total = 0;
        int leftMax = 0;
        int rightMax = 0;
        int preLeft[] = new int[height.length];
        int preRight[] = new int[height.length];
        for(int j = 0; j < height.length; j++){
            leftMax = Math.max(leftMax,height[j]);
            preLeft[j] = leftMax;
        }
        for(int j = height.length - 1; j >= 0; j--){
            rightMax = Math.max(rightMax,height[j]);
            preRight[j] = rightMax;
        }
        for(int i = 1; i < height.length; i++){
            int level = Math.min(preRight[i],preLeft[i]);
            int curTotal = (level - height[i]) < 0 ? 0 : (level - height[i]);
            total = total + curTotal;
        }
        return total;
    }
}