class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int len = nums.length, l, r, sum;
        if(len < 3 || nums[0] > 0) return ans;
        for(int i = 0;i < len-2;i++) {
            if(i > 0 && nums[i-1] == nums[i]) continue;
            l = i+1;
            r = len-1;
            while(l < r) {
                sum = nums[i] + nums[l] + nums[r];
                // System.out.println(sum);
                if(sum == 0) {
                    List<Integer> tmp = new ArrayList<>();
                    tmp.add(nums[i]);
                    tmp.add(nums[l]);
                    tmp.add(nums[r]);
                    ans.add(tmp);
                    while(l < r && nums[l] == nums[l+1]) l ++;
                    while(r > l && nums[r] == nums[r-1]) r --;
                    l++;
                    r--;
                }else if(sum < 0) {
                    l ++;
                }else r --;
            }
        }
        return ans;
    }
}