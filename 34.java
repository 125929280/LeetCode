class Solution {
    public int[] searchRange(int[] nums, int target) {
        int l = 0, r = nums.length - 1, ans1 = nums.length, ans2 = nums.length;
        while(l <= r) {
            int m = (l+r)/2;
            if(nums[m] >= target) {
                r = m-1;
                ans1 = m;
            } else l = m+1;
        }
        l = 0;
        r = nums.length - 1;
        while(l <= r) {
            int m = (l+r)/2;
            if(nums[m] > target) {
                r = m-1;
                ans2 = m;
            } else l = m+1;
        }
        // System.out.println(ans1 + " " + ans2);
        if(ans1 <= ans2-1 && nums[ans1] == target && nums[ans2-1] == target) return new int[]{ans1, ans2-1};
        return new int[]{-1, -1};
    }
}