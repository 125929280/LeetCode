class Solution {

    List<Integer> tmp = new ArrayList<>();
    List<List<Integer>> ans = new ArrayList<>();
    boolean[] visit = new boolean[10];
    public List<List<Integer>> permute(int[] nums) {
        helper(nums, 0);
        return ans;
    }

    public void helper(int[] nums, int cur) {
        if(cur == nums.length) {
            ans.add(new ArrayList<>(tmp));
            return ;
        }
        for(int i = 0;i < nums.length;i ++) {
            if(!visit[i]) {
                visit[i] = true;
                tmp.add(nums[i]);
                helper(nums, cur+1);
                tmp.remove(tmp.size()-1);
                visit[i] = false;
            }
        }
    }
}