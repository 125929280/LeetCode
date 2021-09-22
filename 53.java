class Solution {
    public int maxSubArray(int[] nums) {
        int ans = nums[0], len = nums.length;
        for(int i = 1;i < len; i ++) {
            if(nums[i-1] + nums[i] > nums[i]) {
                nums[i] = nums[i-1] + nums[i];
            }
            if(nums[i] > ans) {
                ans = nums[i];
            }
        }
        return ans;
    }
}