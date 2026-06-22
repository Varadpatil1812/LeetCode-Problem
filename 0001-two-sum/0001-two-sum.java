class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> num = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            num.put(nums[i], i);
        }
        for (int i = 0; i < n; i++) {
            int rem = target - nums[i];
            if (num.containsKey(rem) && num.get(rem) != i) {
                return new int[]{i, num.get(rem)};
            }
        }

        return new int[]{};
    }
}