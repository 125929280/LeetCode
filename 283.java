class Solution {
    public void moveZeroes(int[] nums) {
        int l = 0, r = 0, len = nums.length;
        // while(r < len) {
        //     if(nums[r] != 0) {
        //         int temp = nums[l];
        //         nums[l] = nums[r];
        //         nums[r] = temp;
        //         l ++;
        //     }
        //     r ++;
        // }

        // r的增加速度 >= l的增加速度, 将所有不等于0的nums[r]与nums[l]交换
        for(; r < len; r++) {
            if(nums[r] != 0) {
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
                l ++;
            }
        }
    }
}

// 0 1 0 3 12
// 1 0 0 3 12
// 1 3 0 0 12
// 1 3 12 0 0