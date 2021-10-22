class Solution {
    public int missingNumber(int[] nums) {
        int l = 0, r = nums.length-1, ans = nums.length;
        while(l <= r) {
            int m = r + (l-r)/2;
            if(nums[m] != m) {
                r = m-1;
                ans = m;
            } else l = m+1;
        }
        return ans;
    }
}