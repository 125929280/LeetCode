class Solution {
    // boolean[] visit;
    // char[] nums;

    // public boolean reorderedPowerOf2(int n) {
    //     nums = Integer.toString(n).toCharArray();
    //     visit = new boolean[nums.length];
    //     Arrays.sort(nums);
    //     return dfs(0, 0);
    // }

    // public boolean dfs(int len, int cur) {
    //     if(len == nums.length) return (cur & (cur-1)) == 0;
    //     for(int i = 0;i < nums.length;i ++) {
    //         if(visit[i] || (i > 0 && nums[i-1] == nums[i] && !visit[i-1]) || (cur == 0 && nums[i] == '0')) continue;
    //         visit[i] = true;
    //         if(dfs(len+1, cur*10 + nums[i] - '0')) return true;
    //         visit[i] = false;
    //     }
    //     return false;
    // }

    int[] bits;
    int len;

    public boolean reorderedPowerOf2(int n) {
        bits = new int[10];
        while(n != 0) {
            bits[n%10] ++;
            n /= 10;
            len ++;
        }
        return dfs(0, 0);
    }

    public boolean dfs(int l, int cur) {
        if(len == l) return (cur & (cur-1)) == 0;
        for(int i = 0;i < 10;i ++) {
            if(bits[i] == 0 || (cur == 0 && i == 0)) continue;
            bits[i] --;
            if(dfs(l+1, cur*10 + i)) return true;
            bits[i] ++;
        }
        return false;
    }
}