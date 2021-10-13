class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> tmp = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        Map<Integer, Boolean> visit = new HashMap<>();
        helper(nums, ans, tmp, visit, 0);
        return ans;
    }

    public void helper(int[] nums, List<List<Integer>> ans, List<Integer> tmp, Map<Integer, Boolean> visit, int cur) {
        if(cur == nums.length) {
            ans.add(new ArrayList<>(tmp));
            return ;
        }
        for(int i = 0;i < nums.length;i ++) {
            if(!visit.getOrDefault(nums[i], false)) {
                visit.put(nums[i], true);
                tmp.add(nums[i]);
                helper(nums, ans, tmp, visit, cur+1);
                tmp.remove(tmp.size()-1);
                visit.put(nums[i], false);
            }
        }
    }
}