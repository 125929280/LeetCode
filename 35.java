class Solution {
    public int searchInsert(int[] nums, int target) {
        // int len = nums.length;
        // if(len == 0 || target <= nums[0]) return 0;
        // for(int i = 0;i < len; i++) {
        //     if(target <= nums[i]) return i;
        // }
        // return len;

        //二分
        int l = 0, r = nums.length-1, ans = nums.length;
        while(l <= r) {
            int m = l + (r-l)/2;
            if(target <= nums[m]) {
                ans = m;
                r = m-1;
            } else {
                l = m+1;
            }
        }
        return ans;
    }
}