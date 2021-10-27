class Solution {
    public int[] twoSum(int[] nums, int target) {
        int l = 0, r = nums.length-1;
        while(l < r) {
            int sum = nums[l] + nums[r];
            if(sum == target) return new int[]{nums[l], nums[r]};
            else if(sum < target) l++;
            else r --;
        }
        return new int[]{0, 0};
    }
}