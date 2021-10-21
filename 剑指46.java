class Solution {
    public int translateNum(int num) {
        char[] nums = String.valueOf(num).toCharArray();
        int p = 1, q = 1, r = 1;
        for(int i = 1;i < nums.length;i ++) {
            p = q;
            q = r;
            int pre = (nums[i-1]-'0')*10 + (nums[i]-'0');
            if(pre >= 10 && pre <= 25) r += p;
        }
        return r;
    }
}