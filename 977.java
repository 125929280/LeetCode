class Solution {
    public int[] sortedSquares(int[] nums) {
        // for(int i = 0;i < nums.length;i ++) {
        //     nums[i] = nums[i] * nums[i];
        // }
        // Arrays.sort(nums);
        // return nums;
        int[] ans = new int[nums.length];
        int l = 0, r = nums.length - 1, cur = nums.length - 1;
        while(l <= r) {
            int ll = nums[l]*nums[l], rr = nums[r]*nums[r];
            if(ll <= rr) {
                ans[cur--] = rr;
                r --;
            }else {
                ans[cur--] = ll;
                l ++;
            }
        }
        return ans;
    }
}