class Solution {
    List<List<Integer>> ans;
    List<Integer> cur;
    boolean[] visit;
    public List<List<Integer>> permuteUnique(int[] nums) {
        ans = new ArrayList<>();
        cur = new ArrayList<>();
        visit = new boolean[10];
        Arrays.sort(nums);
        helper(nums, 0);
        return ans;
    }

    public void helper(int[] nums, int pos) {
        if(pos == nums.length) {
            ans.add(new ArrayList<Integer>(cur));
            return ;
        }
        for(int i = 0;i < nums.length;i ++) {
            if(visit[i] || (i > 0 && nums[i-1] == nums[i] && !visit[i-1])) continue;
            visit[i] = true;
            cur.add(nums[i]);
            helper(nums, pos+1);
            cur.remove(cur.size()-1);
            visit[i] = false;
        }
    }
}