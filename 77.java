class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> tmp = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        helper(n, k, 1);
        return ans;
    }

    public void helper(int n, int k, int index) {
        if(tmp.size() == k) {
            ans.add(new ArrayList<>(tmp));
            return ;
        }
        // k-tmp.size() <= n-index+1 还需要的元素个数 <= 剩余元素个数
        for(int i = index;i <= n+tmp.size()-k+1;i ++) {
            tmp.add(i);
            helper(n, k, i+1);
            tmp.remove(tmp.size()-1);
        }
    }
}