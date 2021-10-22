class Solution {
    public int[] searchRange(int[] nums, int target) {
        int pos1 = bisearch(nums, target, true);
        int pos2 = bisearch(nums, target, false) - 1;
        if(pos2-pos1 >= 0 && nums[pos1] == target && nums[pos2] == target) return new int[]{pos1, pos2};
        return new int[]{-1, -1};
    }

    public int bisearch(int[] nums, int target, boolean flag) {
        int l = 0, r = nums.length - 1, pos = nums.length;
        while(l <= r) {
            int m = l + (r-l)/2;
            if((flag && nums[m] >= target) || nums[m] > target ) {
                pos = m;
                r = m-1;
            } else {
                l = m+1;
            }
        }
        return pos;
    }
}