class Solution {
    public int search(int[] nums, int target) {
        int pos1 = bisearch(nums, target, true);
        int pos2 = bisearch(nums, target, false);
        return pos2 - pos1;
    }

    public int bisearch(int[] nums, int target, boolean flag) {
        int l = 0, r = nums.length-1, pos = nums.length;
        while(l <= r) {
            int m = r + (l-r)/2;
            if(nums[m] > target || (flag && nums[m] >= target)) {
                r = m-1;
                pos = m;
            } else l = m+1;
        }
        return pos;
    }
}