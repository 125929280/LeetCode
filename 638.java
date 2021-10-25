class Solution {
    int ans = Integer.MAX_VALUE;
    int n;
    public int shoppingOffers(List<Integer> price, List<List<Integer>> special, List<Integer> needs) {
        n = price.size();
        dfs(price, special, needs, 0);
        return ans;
    }

    public void dfs(List<Integer> price, List<List<Integer>> special, List<Integer> needs, int sum) {
        int tmp = sum;
        for(int i = 0;i < n;i ++) tmp += price.get(i) * needs.get(i);
        ans = Math.min(ans, tmp);

        for(List<Integer> l:special) {
            boolean flag = false;
            for(int i = 0;i < n;i ++) {
                if(l.get(i) > needs.get(i)) {
                    flag = true;
                    break;
                }
            }
            if(!flag) {
                for(int i = 0;i < n;i ++) needs.set(i, needs.get(i) - l.get(i));
                dfs(price, special, needs, sum + l.get(n));
                for(int i = 0;i < n;i ++) needs.set(i, needs.get(i) + l.get(i));
            }
        }
    }
}