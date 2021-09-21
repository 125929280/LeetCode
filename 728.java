class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<>();
        for(int i = left; i <= right;i ++) {
            if(helper(i)) ans.add(i);
        }
        return ans;
    }

    public boolean helper(int n) {
        int cur = n;
        while(cur != 0) {
            if(cur%10 == 0 || n%(cur%10) != 0) return false;
            else cur /= 10;
        }
        return true;
    }
}