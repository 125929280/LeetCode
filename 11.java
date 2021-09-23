class Solution {
    public int maxArea(int[] height) {
        int len = height.length, l = 0, r = len-1, ans = 0;
        while(l < r) {
            ans = Math.max(ans, Math.min(height[l], height[r])*(r-l));
            if(height[l] < height[r]) l ++;
            else r --;
        }
        return ans;
    }
}